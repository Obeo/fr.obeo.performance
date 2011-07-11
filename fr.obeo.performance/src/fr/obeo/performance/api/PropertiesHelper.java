/*
 * Copyright (c) 2011 Obeo. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Obeo - initial API and implementation
 */
package fr.obeo.performance.api;

import fr.obeo.performance.PerformanceFactory;
import fr.obeo.performance.Properties;
import fr.obeo.performance.Property;

/**
 * Helper class to facilitate the use of {@link Properties} instances.
 * 
 * @author pierre-charles.david@obeo.fr
 */
public class PropertiesHelper {
    public static void add(Properties prop, String key, String value) {
        Property p = PerformanceFactory.eINSTANCE.createProperty();
        p.setKey(key);
        p.setValue(value);
        prop.getProperties().add(p);
    }
    
    public static String getValue(Properties prop, String key) {
        Property p = find(prop, key);
        if (p != null) {
            return p.getValue();
        } else {
            return null;
        }
    }
    
    public static Property find(Properties prop, String key) {
        for (Property p : prop.getProperties()) {
            if (p.getKey().equals(key)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean remove(Properties prop, String key) {
        Property p = find(prop, key);
        if (p != null) {
            return prop.getProperties().remove(p);
        } else {
            return false;
        }
    }
}
