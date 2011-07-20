/*
 * Copyright (c) 2011 Obeo. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Obeo - initial API and implementation
 */
package fr.obeo.performance.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.Lists;

import fr.obeo.performance.PerformancePackage;
import fr.obeo.performance.api.PerformanceMonitor;
import fr.obeo.performance.api.Performance;
import fr.obeo.performance.api.PropertiesHelper;

/**
 * A basic test which tests nothing but serves as an example of how to use the
 * API.
 * 
 * @author pierre-charles.david@obeo.fr
 */
public class BasicAPIUsageTest {
    private static final int ITERATIONS = 3;

    private static final int BLOCK_SIZE = 4096 * 1000;

    private static Performance suite;

    private static String timestamp;

    private List<byte[]> blocks = Lists.newArrayList();

    @BeforeClass
    public static void configure() {
        initializeEMF();
        suite = new Performance("Basic API");
        timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());
        PropertiesHelper.add(suite.getSystemUnderTest(), "timestamp", timestamp);
        PropertiesHelper.add(suite.getSystemUnderTest(), "version", "trunk@1234");
    }

    @AfterClass
    public static void saveResults() throws IOException {
        suite.save(URI.createFileURI("/tmp/test-" + timestamp + ".performance"));
    }

    private static void initializeEMF() {
        if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
            @SuppressWarnings("unused")
            EPackage perf = PerformancePackage.eINSTANCE;
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("performance", new XMIResourceFactoryImpl());
        }
    }

    @Test
    public void wait_and_allocate_some_memory() throws IOException, InterruptedException {
        PerformanceMonitor monitor = suite.createMonitor("wait_and_allocate_some_memory");
        PropertiesHelper.add(monitor.getScenario(), "block_size", String.valueOf(BLOCK_SIZE));
        monitor.measure(false, ITERATIONS, new Runnable() {
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    // Ignore.
                }
                blocks.add(new byte[BLOCK_SIZE]);
            }
        });
    }
}
