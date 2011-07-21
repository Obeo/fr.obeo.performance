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
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.collect.Lists;

import fr.obeo.performance.PerformancePackage;
import fr.obeo.performance.api.PerformanceRunner;
import fr.obeo.performance.api.annotation.Scenario;

/**
 * A basic test which tests nothing but serves as an example of how to use the
 * API.
 * 
 * @author pierre-charles.david@obeo.fr
 */
@RunWith(PerformanceRunner.class)
public class BasicAPIUsageTest {
    private List<byte[]> blocks = Lists.newArrayList();

    private int blockSize;
    
    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] { {1024}, {2048}, {4096} });
    }
    
    public BasicAPIUsageTest(int blockSize) {
        this.blockSize = blockSize;
    }

    @BeforeClass
    public static void configure() {
        if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
            @SuppressWarnings("unused")
            EPackage perf = PerformancePackage.eINSTANCE;
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("performance", new XMIResourceFactoryImpl());
        }
    }

    @Scenario(value = "wait_and_allocate_some_memory", iterations = 3)
    public void wait_and_allocate_some_memory() throws IOException, InterruptedException {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // Ignore.
        }
        blocks.add(new byte[blockSize]);
    }
}
