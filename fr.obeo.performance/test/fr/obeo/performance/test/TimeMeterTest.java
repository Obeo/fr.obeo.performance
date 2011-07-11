package fr.obeo.performance.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import fr.obeo.performance.Dimension;
import fr.obeo.performance.Measure;
import fr.obeo.performance.api.TimeMeter;

public class TimeMeterTest {

    @Test
    public void sleep_1s() {
        TimeMeter meter = new TimeMeter();
        meter.start();
        try {
            Thread.sleep(1000);
            meter.stop();
            Measure time = meter.getResults().iterator().next();
            assertNotNull(time);
            assertEquals("system_time", time.getName());
            assertEquals(Dimension.TIME, time.getDimension());
            assertTrue(time.getValue() > 1000000.0);
        } catch (InterruptedException e) {
            fail(e.getMessage());
        }
    }
    
}
