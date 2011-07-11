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
 * A representation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.performance.TestResult#getScenario <em>Scenario</em>}</li>
 *   <li>{@link fr.obeo.performance.TestResult#getDataPoints <em>Data Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.performance.PerformancePackage#getTestResult()
 * @model
 * @generated
 */
public interface TestResult extends EObject {

    /**
     * Returns the value of the '<em><b>Scenario</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scenario</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scenario</em>' containment reference.
     * @see #setScenario(Scenario)
     * @see fr.obeo.performance.PerformancePackage#getTestResult_Scenario()
     * @model containment="true" required="true"
     * @generated
     */
    Scenario getScenario();

    /**
     * Sets the value of the '{@link fr.obeo.performance.TestResult#getScenario <em>Scenario</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scenario</em>' containment reference.
     * @see #getScenario()
     * @generated
     */
    void setScenario(Scenario value);

    /**
     * Returns the value of the '<em><b>Data Points</b></em>' reference list.
     * The list contents are of type {@link fr.obeo.performance.DataPoint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Points</em>' reference list.
     * @see fr.obeo.performance.PerformancePackage#getTestResult_DataPoints()
     * @model
     * @generated
     */
    EList<DataPoint> getDataPoints();
} // TestResult
