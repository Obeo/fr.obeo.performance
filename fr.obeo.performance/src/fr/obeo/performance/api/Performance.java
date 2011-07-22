/*
 * Copyright (c) 2011 Obeo. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Obeo - initial API and implementation
 */

package fr.obeo.performance.api;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.obeo.performance.Environment;
import fr.obeo.performance.PerformanceFactory;
import fr.obeo.performance.PerformanceTest;
import fr.obeo.performance.SystemUnderTest;
import fr.obeo.performance.TestResult;

/**
 * The top-level API to use to manage performance test suites.
 * @author pierre-charles.david@obeo.fr
 */
public class Performance {
    private static Performance current;
    
    public static Performance getCurrent() {
        return current;
    }
    
    public static void setCurrent(Performance current) {
        Performance.current = current;
    }
    
    private final PerformanceTest test;
    
    public Performance(String sutName) {
        test = PerformanceFactory.eINSTANCE.createPerformanceTest();
        SystemUnderTest sut = PerformanceFactory.eINSTANCE.createSystemUnderTest();
        sut.setName(sutName);
        test.setSut(sut);
        setupEnvironment(test);
    }
    
    public SystemUnderTest getSystemUnderTest() {
        return test.getSut();
    }
    
    public Environment getEnvironment() {
        return test.getEnvironment();
    }
    
    public PerformanceTest getPerformanceTest() {
        return test;
    }
    
    public PerformanceMonitor createMonitor(String scenarioName) {
        return new PerformanceMonitor(scenarioName, this);
    }
    
    public void save(URI uri) throws IOException {
        ResourceSet rs = new ResourceSetImpl();
        Resource res = rs.createResource(uri);
        res.getContents().add(test);
        res.save(Collections.emptyMap());
    }
    
    protected void collect(TestResult result) {
        test.getResults().add(result);
    }

    private void setupEnvironment(PerformanceTest pt) {
        Environment env = PerformanceFactory.eINSTANCE.createEnvironment();
        for (Object key : System.getProperties().keySet()) {
            if (key instanceof String) {
                PropertiesHelper.add(env, "jvm." + key, System.getProperty((String) key));
            }
        }
        for (String key : System.getenv().keySet()) {
            PropertiesHelper.add(env, "env." + key, System.getenv(key));
        }
        pt.setEnvironment(env);
    }
}
