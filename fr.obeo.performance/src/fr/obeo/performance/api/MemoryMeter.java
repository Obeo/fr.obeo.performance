package fr.obeo.performance.api;

import java.util.Collection;

import com.google.common.collect.Lists;

import fr.obeo.performance.Dimension;
import fr.obeo.performance.Measure;

public class MemoryMeter extends PerformanceMeter {
    private long startTotal;
    private long startFree;
    private long stopTotal;
    private long stopFree;

    @Override
    public void start() {
        super.start();
        this.startTotal = Runtime.getRuntime().totalMemory();
        this.startFree = Runtime.getRuntime().freeMemory();
    }

    @Override
    public void stop() {
        super.stop();
        this.stopTotal = Runtime.getRuntime().totalMemory();
        this.stopFree = Runtime.getRuntime().freeMemory();
    }

    @Override
    public Collection<Measure> getResults() {
        Collection<Measure> result = Lists.newArrayList();
        double heapStart = (double) (startTotal - startFree);
        double heapStop = (double) (stopTotal - stopFree);
        double heapDelta = heapStop - heapStart;
        result.add(createMeasure("heap_start", Dimension.MEMORY, heapStart));
        result.add(createMeasure("heap_stop", Dimension.MEMORY, heapStop));
        result.add(createMeasure("heap_delta", Dimension.MEMORY, heapDelta));
        return result;
    }
}
