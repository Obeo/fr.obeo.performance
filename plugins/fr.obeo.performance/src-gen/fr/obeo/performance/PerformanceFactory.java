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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.performance.PerformancePackage
 * @generated
 */
public interface PerformanceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PerformanceFactory eINSTANCE = fr.obeo.performance.impl.PerformanceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>System Under Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System Under Test</em>'.
     * @generated
     */
    SystemUnderTest createSystemUnderTest();

    /**
     * Returns a new object of class '<em>Environment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Environment</em>'.
     * @generated
     */
    Environment createEnvironment();

    /**
     * Returns a new object of class '<em>Scenario</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scenario</em>'.
     * @generated
     */
    Scenario createScenario();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns a new object of class '<em>Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Test</em>'.
     * @generated
     */
    PerformanceTest createPerformanceTest();

    /**
     * Returns a new object of class '<em>Test Result</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Test Result</em>'.
     * @generated
     */
    TestResult createTestResult();

    /**
     * Returns a new object of class '<em>Data Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Point</em>'.
     * @generated
     */
    DataPoint createDataPoint();

    /**
     * Returns a new object of class '<em>Measure</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measure</em>'.
     * @generated
     */
    Measure createMeasure();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    PerformancePackage getPerformancePackage();

} //PerformanceFactory
