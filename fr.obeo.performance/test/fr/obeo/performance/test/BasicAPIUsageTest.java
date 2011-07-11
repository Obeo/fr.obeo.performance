/*
 * Copyright (c) 2011 Obeo. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Obeo - initial API and implementation
 */
package fr.obeo.performance.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import fr.obeo.performance.DataPoint;
import fr.obeo.performance.Dimension;
import fr.obeo.performance.Measure;
import fr.obeo.performance.TestResult;
import fr.obeo.performance.api.PerformanceMonitor;

/**
 * A basic test which tests nothing but serves as an example of how to use the
 * API.
 * 
 * @author pierre-charles.david@obeo.fr
 */
public class BasicAPIUsageTest {

    private static final int TIMES = 10;

    @Test
    public void some_performance_sensitive_work() {
        PerformanceMonitor monitor = new PerformanceMonitor("Basic test");
        for (int i = 0; i < TIMES; i++) {
            monitor.start();
            doSomeWork();
            monitor.stop();
        }
        TestResult result = monitor.commit();
        assertNotNull(result);
        assertEquals("Basic test", result.getScenario().getName());
        EList<DataPoint> data = result.getDataPoints();
        assertEquals(TIMES, data.size());
        for (DataPoint dataPoint : data) {
            assertEquals(4, dataPoint.getMeasures().size());
            Measure m = dataPoint.getMeasures().get(0);
            assertEquals("system_time", m.getName());
            assertEquals(Dimension.TIME, m.getDimension());
            assertTrue(m.getValue() > 500.0 * 1000);
        }
    }

    private void doSomeWork() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
