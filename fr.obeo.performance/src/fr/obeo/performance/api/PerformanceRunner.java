/*
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Obeo - initial API and implementation
 */
package fr.obeo.performance.api;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.internal.runners.model.ReflectiveCallable;
import org.junit.internal.runners.statements.Fail;
import org.junit.internal.runners.statements.InvokeMethod;
import org.junit.rules.MethodRule;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

import com.google.common.collect.Lists;

import fr.obeo.performance.api.annotation.Monitor;
import fr.obeo.performance.api.annotation.Scenario;

public class PerformanceRunner extends BlockJUnit4ClassRunner {
    private static class CompositeStatement extends Statement {
        private final List<Statement> steps;

        public CompositeStatement(List<Statement> steps) {
            this.steps = steps;
        }

        @Override
        public void evaluate() throws Throwable {
            for (Statement s : steps) {
                s.evaluate();
            }
        }
    }

    private static final class PerformanceStatement extends Statement {
        /**
         * The non-monitored statement, used for the optional warm-up execution.
         */
        private Statement basicStatement;

        private Scenario scenario;

        private Statement[] monitoredStatements;

        private PerformanceMonitor monitor;

        private PerformanceStatement(Statement basicStatement, Scenario scenario) {
            this.basicStatement = basicStatement;
            this.scenario = scenario;
        }

        public void setMonitoredStatements(Statement[] monitoredStatements) {
            this.monitoredStatements = monitoredStatements;
        }

        public PerformanceMonitor getMonitor() {
            return monitor;
        }

        @Override
        public void evaluate() throws Throwable {
            if (scenario.warmup()) {
                basicStatement.evaluate();
            }
            monitor = Performance.getCurrent().createMonitor(scenario.value());
            for (int i = 0; i < scenario.iterations(); i++) {
                monitoredStatements[i].evaluate();
            }
            monitor.commit();
        }
    }

    public PerformanceRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    protected void validateConstructor(List<Throwable> errors) {
        validateOnlyOneConstructor(errors);
        if (getParametersMethod(getTestClass()) != null) {
            List<Object[]> params = getParametersList(getTestClass());
            if (params != null && !params.isEmpty()) {
                int nbParams = params.get(0).length;
                if (getTestClass().getJavaClass().getConstructors().length == 1 && !(getTestClass().getOnlyConstructor().getParameterTypes().length == nbParams)) {
                    String gripe = "Test class should have exactly one public constructor taking " + nbParams + " arguments";
                    errors.add(new Exception(gripe));
                }
            } else {
                validateZeroArgConstructor(errors);
            }

        } else {
            validateZeroArgConstructor(errors);
        }
    }

    @Override
    protected List<FrameworkMethod> computeTestMethods() {
        List<FrameworkMethod> result = new ArrayList<FrameworkMethod>();
        result.addAll(getTestClass().getAnnotatedMethods(Scenario.class));
        for (FrameworkMethod rawTest : getTestClass().getAnnotatedMethods(Test.class)) {
            if (!result.contains(rawTest)) {
                result.add(rawTest);
            }
        }
        return result;
    }

    @Override
    protected Statement methodBlock(FrameworkMethod method) {
        final List<Object[]> parameters = getParametersList(getTestClass());
        if (parameters == null) {
            return createStatement(method, null);
        } else {
            List<Statement> steps = Lists.newArrayList();
            for (Object[] params : parameters) {
                steps.add(createStatement(method, params));
            }
            return new CompositeStatement(steps);
        }
    }

    private Statement createStatement(FrameworkMethod method, Object[] params) {
        final Scenario scenario = method.getAnnotation(Scenario.class);
        final int testsNeeded = scenario == null ? 1 : ((scenario.warmup() ? 1 : 0) + scenario.iterations());
        Object[] tests = new Object[testsNeeded];
        for (int i = 0; i < tests.length; i++) {
            try {
                tests[i] = createTest(params);
            } catch (Throwable e) {
                return new Fail(e);
            }
        }

        final Statement basicStatement = createBasicStatement(method, tests[0]);
        if (scenario == null) {
            return basicStatement;
        } else {
            PerformanceStatement ss = new PerformanceStatement(basicStatement, scenario);
            final Statement[] monitoredStatement = new Statement[scenario.iterations()];
            for (int i = 0; i < scenario.iterations(); i++) {
                monitoredStatement[i] = createMonitoredStatement(method, tests[i + (scenario.warmup() ? 1 : 0)], ss);
            }
            ss.setMonitoredStatements(monitoredStatement);
            return ss;
        }
    }

    protected Object createTest(Object[] params) throws Exception {
        if (params == null) {
            return getTestClass().getOnlyConstructor().newInstance();
        } else {
            return getTestClass().getOnlyConstructor().newInstance(params);
        }
    }

    private Statement createBasicStatement(FrameworkMethod method, Object test) {
        Statement basicStatement = methodInvoker(method, test);
        basicStatement = decorate(method, test, basicStatement);
        return basicStatement;
    }

    private Statement createMonitoredStatement(FrameworkMethod method, Object test, PerformanceStatement ss) {
        Statement monitoredStatement = monitoredMethodInvoker(method, test, ss);
        monitoredStatement = decorate(method, test, monitoredStatement);
        return monitoredStatement;
    }

    private Statement decorate(FrameworkMethod method, Object test, Statement statement) {
        Statement result = possiblyExpectingExceptions(method, test, statement);
        result = withPotentialTimeout(method, test, result);
        result = withBefores(method, test, result);
        result = withAfters(method, test, result);
        result = withRules(method, test, result);
        return result;
    }

    private Statement withRules(FrameworkMethod method, Object target, Statement statement) {
        Statement result = statement;
        for (MethodRule each : rules(target))
            result = each.apply(result, method, target);
        return result;
    }

    protected Statement monitoredMethodInvoker(FrameworkMethod method, final Object test, final PerformanceStatement ss) {
        return new InvokeMethod(method, test) {
            @Override
            public void evaluate() throws Throwable {
                PerformanceMonitor monitor = ss.getMonitor();
                injectMonitor(test, monitor);
                monitor.start();
                super.evaluate();
                monitor.stop();
            }

            private void injectMonitor(final Object test, PerformanceMonitor monitor) throws IllegalAccessException {
                List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(Monitor.class);
                for (FrameworkMethod method : annotatedMethods) {
                    Class<?>[] params = method.getMethod().getParameterTypes();
                    if (params.length == 1 && params[0].isAssignableFrom(PerformanceMonitor.class)) {
                        try {
                            method.invokeExplosively(test, new Object[] { monitor });
                        } catch (Throwable e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
    }

    @SuppressWarnings("unchecked")
    private List<Object[]> getParametersList(TestClass klass) {
        try {
            FrameworkMethod parametersMethod = getParametersMethod(klass);
            if (parametersMethod != null) {
                return (List<Object[]>) parametersMethod.invokeExplosively(null);
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        } catch (Throwable e) {
            return null;
        }
    }

    private FrameworkMethod getParametersMethod(TestClass testClass) {
        for (FrameworkMethod method : testClass.getAnnotatedMethods(Parameters.class)) {
            int modifiers = method.getMethod().getModifiers();
            if (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers))
                return method;
        }
        return null;
    }
}
