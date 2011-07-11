/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Obeo - initial API and implementation
 */
package fr.obeo.performance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.performance.DataPoint#getMeasures <em>Measures</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.performance.PerformancePackage#getDataPoint()
 * @model
 * @generated
 */
public interface DataPoint extends EObject {
    /**
     * Returns the value of the '<em><b>Measures</b></em>' containment reference list.
     * The list contents are of type {@link fr.obeo.performance.Measure}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measures</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measures</em>' containment reference list.
     * @see fr.obeo.performance.PerformancePackage#getDataPoint_Measures()
     * @model containment="true"
     * @generated
     */
    EList<Measure> getMeasures();

} // DataPoint
