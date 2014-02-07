/*
 * Copyright (c) 2011 Obeo. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Obeo - initial API and implementation
 */
package fr.obeo.performance.test;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.obeo.performance.api.Performance;

@RunWith(Suite.class)
@SuiteClasses(BasicAPIUsageTest.class)
public class PerformanceSuite {
    private static String timestamp;
    
    @BeforeClass
    public static void setUp() throws Exception {
        Performance.setCurrent(new Performance("Example Usage"));
        timestamp = new SimpleDateFormat("yyyyMMdd'T'HHmmss").format(new Date());
    }

    @AfterClass
    public static void tearDown() throws Exception {
        Performance current = Performance.getCurrent();
        current.save(URI.createFileURI(MessageFormat.format("{0}-{1}.performance", current.getSystemUnderTest().getName().replaceAll(" ", "_"), timestamp)));
        Performance.setCurrent(null);
    }
}
