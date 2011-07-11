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
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.performance.Measure#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.performance.Measure#getDimension <em>Dimension</em>}</li>
 *   <li>{@link fr.obeo.performance.Measure#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.performance.PerformancePackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.obeo.performance.PerformancePackage#getMeasure_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.obeo.performance.Measure#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Dimension</b></em>' attribute.
     * The literals are from the enumeration {@link fr.obeo.performance.Dimension}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dimension</em>' attribute.
     * @see fr.obeo.performance.Dimension
     * @see #setDimension(Dimension)
     * @see fr.obeo.performance.PerformancePackage#getMeasure_Dimension()
     * @model required="true"
     * @generated
     */
    Dimension getDimension();

    /**
     * Sets the value of the '{@link fr.obeo.performance.Measure#getDimension <em>Dimension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dimension</em>' attribute.
     * @see fr.obeo.performance.Dimension
     * @see #getDimension()
     * @generated
     */
    void setDimension(Dimension value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(double)
     * @see fr.obeo.performance.PerformancePackage#getMeasure_Value()
     * @model required="true"
     * @generated
     */
    double getValue();

    /**
     * Sets the value of the '{@link fr.obeo.performance.Measure#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(double value);

} // Measure
