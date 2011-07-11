/*****************************************************************************************
 * Copyright (c) 2011 THALES CORPORATE SERVICE All rights reserved.
 * 
 * Contributors: Obeo - Initial API and implementation
 *****************************************************************************************/
package fr.obeo.performance.api;

import java.util.Collection;
import java.util.Collections;

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
        return Collections.singleton(createMeasure("system_time", Dimension.TIME, (double) (stopTime - startTime)));
    }

    private long now() {
        return System.nanoTime();
    }
}
