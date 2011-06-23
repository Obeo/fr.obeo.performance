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
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.performance.PerformanceTest#getSut <em>Sut</em>}</li>
 *   <li>{@link fr.obeo.performance.PerformanceTest#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link fr.obeo.performance.PerformanceTest#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.performance.PerformancePackage#getPerformanceTest()
 * @model
 * @generated
 */
public interface PerformanceTest extends EObject {
    /**
     * Returns the value of the '<em><b>Sut</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sut</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sut</em>' containment reference.
     * @see #setSut(SystemUnderTest)
     * @see fr.obeo.performance.PerformancePackage#getPerformanceTest_Sut()
     * @model containment="true" required="true"
     * @generated
     */
    SystemUnderTest getSut();

    /**
     * Sets the value of the '{@link fr.obeo.performance.PerformanceTest#getSut <em>Sut</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sut</em>' containment reference.
     * @see #getSut()
     * @generated
     */
    void setSut(SystemUnderTest value);

    /**
     * Returns the value of the '<em><b>Environment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Environment</em>' containment reference.
     * @see #setEnvironment(Environment)
     * @see fr.obeo.performance.PerformancePackage#getPerformanceTest_Environment()
     * @model containment="true" required="true"
     * @generated
     */
    Environment getEnvironment();

    /**
     * Sets the value of the '{@link fr.obeo.performance.PerformanceTest#getEnvironment <em>Environment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Environment</em>' containment reference.
     * @see #getEnvironment()
     * @generated
     */
    void setEnvironment(Environment value);

    /**
     * Returns the value of the '<em><b>Results</b></em>' containment reference list.
     * The list contents are of type {@link fr.obeo.performance.TestResult}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Results</em>' containment reference list.
     * @see fr.obeo.performance.PerformancePackage#getPerformanceTest_Results()
     * @model containment="true"
     * @generated
     */
    EList<TestResult> getResults();

} // PerformanceTest
