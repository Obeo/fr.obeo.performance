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

import fr.obeo.performance.Dimension;
import fr.obeo.performance.Measure;
import fr.obeo.performance.PerformanceFactory;

/**
 * Abstract base class for meters which can measure some aspect of a test's
 * performance.
 * 
 * @author pierre-charles.david@obeo.fr
 */
public abstract class PerformanceMeter {
    protected static final PerformanceFactory FACTORY = PerformanceFactory.eINSTANCE;

    protected boolean running = false;

    public void start() {
        if (running) {
            throw new IllegalStateException();
        }
        this.running = true;
    }

    public void stop() {
        if (!running) {
            throw new IllegalStateException();
        }
        this.running = false;
    }
    
    public abstract Collection<Measure> getResults();
    
    protected Measure createMeasure(String name, Dimension dim, double value) {
        Measure measure = FACTORY.createMeasure();
        measure.setName(name);
        measure.setDimension(dim);
        measure.setValue(value);
        return measure;
    }
}
