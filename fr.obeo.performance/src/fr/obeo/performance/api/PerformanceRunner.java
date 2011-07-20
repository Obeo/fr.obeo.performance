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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.internal.runners.model.ReflectiveCallable;
import org.junit.internal.runners.statements.Fail;
import org.junit.internal.runners.statements.InvokeMethod;
import org.junit.rules.MethodRule;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

import fr.obeo.performance.api.annotation.Scenario;

public class PerformanceRunner extends BlockJUnit4ClassRunner {

    private final class ScenarioStatement extends Statement {
        private final Statement basicStatement;

        private final Scenario scenario;

        private Statement[] monitoredStatements;

        private PerformanceMonitor monitor;

        private ScenarioStatement(Statement basicStatement, Scenario scenario) {
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
        final Scenario scenario = method.getAnnotation(Scenario.class);
        final int testsNeeded = scenario == null ? 1 : ((scenario.warmup() ? 1 : 0) + scenario.iterations());

        Object[] tests = new Object[testsNeeded];
        for (int i = 0; i < tests.length; i++) {
            try {
                tests[i] = new ReflectiveCallable() {
                    @Override
                    protected Object runReflectiveCall() throws Throwable {
                        return createTest();
                    }
                }.run();
            } catch (Throwable e) {
                return new Fail(e);
            }
        }

        final Statement basicStatement = createBasicStatement(method, tests[0]);
        if (scenario == null) {
            return basicStatement;
        } else {
            ScenarioStatement ss = new ScenarioStatement(basicStatement, scenario);
            final Statement[] monitoredStatement = new Statement[scenario.iterations()];
            for (int i = 0; i < scenario.iterations(); i++) {
                monitoredStatement[i] = createMonitoredStatement(method, tests[i + (scenario.warmup() ? 1 : 0)], ss);
            }
            ss.setMonitoredStatements(monitoredStatement);
            return ss;
        }
    }

    private Statement createBasicStatement(FrameworkMethod method, Object test) {
        Statement basicStatement = methodInvoker(method, test);
        basicStatement = decorate(method, test, basicStatement);
        return basicStatement;
    }

    private Statement createMonitoredStatement(FrameworkMethod method, Object test, ScenarioStatement ss) {
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

    protected Statement monitoredMethodInvoker(FrameworkMethod method, Object test, final ScenarioStatement ss) {
        return new InvokeMethod(method, test) {
            @Override
            public void evaluate() throws Throwable {
                ss.getMonitor().start();
                super.evaluate();
                ss.getMonitor().stop();
            }
        };
    }
}
