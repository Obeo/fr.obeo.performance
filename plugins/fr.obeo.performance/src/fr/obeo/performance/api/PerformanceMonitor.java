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
    /**
     * The possible runtime states of a monitor.
     * 
     * @author pierre-charles.david@obeo.fr
     */
    private enum State {
        READY, RUNNING, CLOSED
    }

    private final TestResult testResult;

    private final Performance suite;

    private final List<PerformanceMeter> meters = new ArrayList<PerformanceMeter>();

    private State currentState;

    public PerformanceMonitor(String scenarioName, Performance performanceTestSuite) {
        this.testResult = PerformanceFactory.eINSTANCE.createTestResult();
        Scenario scenario = PerformanceFactory.eINSTANCE.createScenario();
        scenario.setName(scenarioName);
        this.testResult.setScenario(scenario);
        this.suite = performanceTestSuite;
        this.currentState = State.READY;
        configureMeters();
    }

    protected void configureMeters() {
        this.meters.add(new TimeMeter());
        this.meters.add(new MemoryMeter());
    }

    public Scenario getScenario() {
        return testResult.getScenario();
    }

    public void start() {
        if (currentState != State.READY) {
            throw new IllegalStateException();
        }
        for (PerformanceMeter meter : meters) {
            meter.start();
        }
        currentState = State.RUNNING;
    }

    public void stop() {
        if (currentState != State.RUNNING) {
            throw new IllegalStateException();
        }
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
        if (currentState != State.READY) {
            throw new IllegalStateException();
        }
        currentState = State.CLOSED;
        if (suite != null) {
            suite.collect(testResult);
        }
        return testResult;
    }
    
    public void measure(int steps, Runnable body) {
        measure(true, steps, body);
    }

    public void measure(boolean warmup, int steps, Runnable body) {
        if (steps <= 0 || body == null) {
            throw new IllegalArgumentException();
        }
        PropertiesHelper.add(getScenario(), "steps", String.valueOf(steps));
        if (warmup) {
            body.run();
        }
        for (int i = 0; i < steps; i++) {
            start();
            body.run();
            stop();
        }
        commit();
    }
}
