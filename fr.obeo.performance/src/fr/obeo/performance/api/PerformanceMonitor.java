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

import java.util.List;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import fr.obeo.performance.DataPoint;
import fr.obeo.performance.PerformanceFactory;
import fr.obeo.performance.Scenario;
import fr.obeo.performance.TestResult;

/**
 * The main API used by clients to manage a single performance test.
 * 
 * @author pierre-charles.david@obeo.fr
 */
public class PerformanceMonitor {
    private enum State {
        READY, RUNNING, CLOSED
    }

    private final TestResult testResult;
    
    private final PerformanceTestSuite suite;

    private final List<PerformanceMeter> meters = Lists.newArrayList();

    private State currentState;

    public PerformanceMonitor(String scenarioName, PerformanceTestSuite performanceTestSuite) {
        this.testResult = PerformanceFactory.eINSTANCE.createTestResult();
        Scenario scenario = PerformanceFactory.eINSTANCE.createScenario();
        scenario.setName(scenarioName);
        this.testResult.setScenario(scenario);
        this.meters.add(new TimeMeter());
        this.meters.add(new MemoryMeter());
        this.suite = performanceTestSuite;
        this.currentState = State.READY;
    }

    public Scenario getScenario() {
        return testResult.getScenario();
    }

    public void start() {
        Preconditions.checkState(currentState == State.READY);
        for (PerformanceMeter meter : meters) {
            meter.start();
        }
        currentState = State.RUNNING;
    }

    public void stop() {
        Preconditions.checkState(currentState == State.RUNNING);
        for (PerformanceMeter meter : meters) {
            meter.stop();
        }
        DataPoint point = PerformanceFactory.eINSTANCE.createDataPoint();
        for (PerformanceMeter meter : meters) {
            point.getMeasures().addAll(meter.getResults());
        }
        testResult.getDataPoints().add(point);
        currentState = State.READY;
    }

    public TestResult commit() {
        Preconditions.checkState(currentState == State.READY);
        currentState = State.CLOSED;
        if (suite != null) {
            suite.collect(testResult);
        }
        return testResult;
    }
}
