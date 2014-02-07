/*
 * Copyright (c) 2011 Obeo. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Obeo - initial API and implementation
 */
package fr.obeo.performance.api;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.Collection;

import fr.obeo.performance.Dimension;
import fr.obeo.performance.Measure;

public class MemoryMeter extends PerformanceMeter {
	private long startUsage;
	private long stopUsage;
	private long peekUsage;

	@Override
	public void start() {
		super.start();
		startUsage = getMemUsage();
		resetPeek();
	}

	private void resetPeek() {
		for (MemoryPoolMXBean mpool : ManagementFactory.getMemoryPoolMXBeans()) {
			mpool.resetPeakUsage();
		}
	}

	private long getMemUsage() {
		long usageAmount = 0;
		for (MemoryPoolMXBean mpool : ManagementFactory.getMemoryPoolMXBeans()) {
			MemoryUsage usage = mpool.getUsage();
			usageAmount += usage.getUsed();
		}
		return usageAmount;
	}

	private long getPeekUsage() {
		long usageAmount = 0;
		for (MemoryPoolMXBean mpool : ManagementFactory.getMemoryPoolMXBeans()) {
			MemoryUsage usage = mpool.getPeakUsage();
			usageAmount += usage.getUsed();
		}
		return usageAmount;
	}

	@Override
	public void stop() {
		super.stop();
		stopUsage = getMemUsage();
		peekUsage = getPeekUsage();
	}

	@Override
	public Collection<Measure> getResults() {
		Collection<Measure> result = new ArrayList<Measure>();
		double heapDelta = stopUsage - startUsage;
		result.add(createMeasure("heap_peek", Dimension.MEMORY, peekUsage));
		result.add(createMeasure("heap_delta", Dimension.MEMORY, heapDelta));
		return result;
	}
}
