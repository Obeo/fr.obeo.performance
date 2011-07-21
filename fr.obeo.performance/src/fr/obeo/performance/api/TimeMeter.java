/*
 * Copyright (c) 2011 Obeo. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Obeo - initial API and implementation
 */
package fr.obeo.performance.api;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import fr.obeo.performance.Dimension;
import fr.obeo.performance.Measure;

/**
 * Measures the system time, as reported by <code>System.nanoTime()</code>.
 * 
 * @author pierre-charles.david@obeo.fr
 */
public class TimeMeter extends PerformanceMeter {
    private long startTime;

    private long stopTime;

    @Override
    public void start() {
        super.start();
        this.startTime = now();
    }

    @Override
    public void stop() {
        super.stop();
        this.stopTime = now();
    }

    @Override
    public Collection<Measure> getResults() {
        long nanos = stopTime - startTime;
        return Collections.singleton(createMeasure("system_time", Dimension.TIME, (double) TimeUnit.NANOSECONDS.toMillis(nanos)));
    }

    private long now() {
        return System.nanoTime();
    }
}
