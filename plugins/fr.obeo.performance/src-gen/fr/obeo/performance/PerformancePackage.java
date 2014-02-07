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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.performance.PerformanceFactory
 * @model kind="package"
 * @generated
 */
public interface PerformancePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "performance";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.obeo.fr/performance/1.0.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "performance";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PerformancePackage eINSTANCE = fr.obeo.performance.impl.PerformancePackageImpl.init();

    /**
     * The meta object id for the '{@link fr.obeo.performance.impl.PropertiesImpl <em>Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.performance.impl.PropertiesImpl
     * @see fr.obeo.performance.impl.PerformancePackageImpl#getProperties()
     * @generated
     */
    int PROPERTIES = 3;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES__PROPERTIES = 0;

    /**
     * The number of structural features of the '<em>Properties</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link fr.obeo.performance.impl.SystemUnderTestImpl <em>System Under Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.performance.impl.SystemUnderTestImpl
     * @see fr.obeo.performance.impl.PerformancePackageImpl#getSystemUnderTest()
     * @generated
     */
    int SYSTEM_UNDER_TEST = 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_UNDER_TEST__PROPERTIES = PROPERTIES__PROPERTIES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_UNDER_TEST__NAME = PROPERTIES_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>System Under Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_UNDER_TEST_FEATURE_COUNT = PROPERTIES_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link fr.obeo.performance.impl.EnvironmentImpl <em>Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.performance.impl.EnvironmentImpl
     * @see fr.obeo.performance.impl.PerformancePackageImpl#getEnvironment()
     * @generated
     */
    int ENVIRONMENT = 1;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIRONMENT__PROPERTIES = PROPERTIES__PROPERTIES;

    /**
     * The number of structural features of the '<em>Environment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIRONMENT_FEATURE_COUNT = PROPERTIES_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.obeo.performance.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.performance.impl.ScenarioImpl
     * @see fr.obeo.performance.impl.PerformancePackageImpl#getScenario()
     * @generated
     */
    int SCENARIO = 2;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__PROPERTIES = PROPERTIES__PROPERTIES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__NAME = PROPERTIES_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__DESCRIPTION = PROPERTIES_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Scenario</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO_FEATURE_COUNT = PROPERTIES_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link fr.obeo.performance.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.performance.impl.PropertyImpl
     * @see fr.obeo.performance.impl.PerformancePackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 4;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VALUE = 1;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link fr.obeo.performance.impl.PerformanceTestImpl <em>Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.performance.impl.PerformanceTestImpl
     * @see fr.obeo.performance.impl.PerformancePackageImpl#getPerformanceTest()
     * @generated
     */
    int PERFORMANCE_TEST = 5;

    /**
     * The feature id for the '<em><b>Sut</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMANCE_TEST__SUT = 0;

    /**
     * The feature id for the '<em><b>Environment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMANCE_TEST__ENVIRONMENT = 1;

    /**
     * The feature id for the '<em><b>Results</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMANCE_TEST__RESULTS = 2;

    /**
     * The number of structural features of the '<em>Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMANCE_TEST_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link fr.obeo.performance.impl.TestResultImpl <em>Test Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.performance.impl.TestResultImpl
     * @see fr.obeo.performance.impl.PerformancePackageImpl#getTestResult()
     * @generated
     */
    int TEST_RESULT = 6;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_RESULT__SCENARIO = 0;

    /**
     * The feature id for the '<em><b>Data Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_RESULT__DATA_POINTS = 1;

    /**
     * The number of structural features of the '<em>Test Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_RESULT_FEATURE_COUNT = 2;


    /**
     * The meta object id for the '{@link fr.obeo.performance.impl.DataPointImpl <em>Data Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.performance.impl.DataPointImpl
     * @see fr.obeo.performance.impl.PerformancePackageImpl#getDataPoint()
     * @generated
     */
    int DATA_POINT = 7;

    /**
     * The feature id for the '<em><b>Measures</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_POINT__MEASURES = 0;

    /**
     * The number of structural features of the '<em>Data Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_POINT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link fr.obeo.performance.impl.MeasureImpl <em>Measure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.performance.impl.MeasureImpl
     * @see fr.obeo.performance.impl.PerformancePackageImpl#getMeasure()
     * @generated
     */
    int MEASURE = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE__NAME = 0;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE__DIMENSION = 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE__VALUE = 2;

    /**
     * The number of structural features of the '<em>Measure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link fr.obeo.performance.Dimension <em>Dimension</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.performance.Dimension
     * @see fr.obeo.performance.impl.PerformancePackageImpl#getDimension()
     * @generated
     */
    int DIMENSION = 9;


    /**
     * Returns the meta object for class '{@link fr.obeo.performance.SystemUnderTest <em>System Under Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Under Test</em>'.
     * @see fr.obeo.performance.SystemUnderTest
     * @generated
     */
    EClass getSystemUnderTest();

    /**
     * Returns the meta object for the attribute '{@link fr.obeo.performance.SystemUnderTest#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.obeo.performance.SystemUnderTest#getName()
     * @see #getSystemUnderTest()
     * @generated
     */
    EAttribute getSystemUnderTest_Name();

    /**
     * Returns the meta object for class '{@link fr.obeo.performance.Environment <em>Environment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Environment</em>'.
     * @see fr.obeo.performance.Environment
     * @generated
     */
    EClass getEnvironment();

    /**
     * Returns the meta object for class '{@link fr.obeo.performance.Scenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scenario</em>'.
     * @see fr.obeo.performance.Scenario
     * @generated
     */
    EClass getScenario();

    /**
     * Returns the meta object for the attribute '{@link fr.obeo.performance.Scenario#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.obeo.performance.Scenario#getName()
     * @see #getScenario()
     * @generated
     */
    EAttribute getScenario_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.obeo.performance.Scenario#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see fr.obeo.performance.Scenario#getDescription()
     * @see #getScenario()
     * @generated
     */
    EAttribute getScenario_Description();

    /**
     * Returns the meta object for class '{@link fr.obeo.performance.Properties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Properties</em>'.
     * @see fr.obeo.performance.Properties
     * @generated
     */
    EClass getProperties();

    /**
     * Returns the meta object for the containment reference list '{@link fr.obeo.performance.Properties#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see fr.obeo.performance.Properties#getProperties()
     * @see #getProperties()
     * @generated
     */
    EReference getProperties_Properties();

    /**
     * Returns the meta object for class '{@link fr.obeo.performance.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see fr.obeo.performance.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link fr.obeo.performance.Property#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see fr.obeo.performance.Property#getKey()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Key();

    /**
     * Returns the meta object for the attribute '{@link fr.obeo.performance.Property#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.obeo.performance.Property#getValue()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Value();

    /**
     * Returns the meta object for class '{@link fr.obeo.performance.PerformanceTest <em>Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Test</em>'.
     * @see fr.obeo.performance.PerformanceTest
     * @generated
     */
    EClass getPerformanceTest();

    /**
     * Returns the meta object for the containment reference '{@link fr.obeo.performance.PerformanceTest#getSut <em>Sut</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sut</em>'.
     * @see fr.obeo.performance.PerformanceTest#getSut()
     * @see #getPerformanceTest()
     * @generated
     */
    EReference getPerformanceTest_Sut();

    /**
     * Returns the meta object for the containment reference '{@link fr.obeo.performance.PerformanceTest#getEnvironment <em>Environment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Environment</em>'.
     * @see fr.obeo.performance.PerformanceTest#getEnvironment()
     * @see #getPerformanceTest()
     * @generated
     */
    EReference getPerformanceTest_Environment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.obeo.performance.PerformanceTest#getResults <em>Results</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Results</em>'.
     * @see fr.obeo.performance.PerformanceTest#getResults()
     * @see #getPerformanceTest()
     * @generated
     */
    EReference getPerformanceTest_Results();

    /**
     * Returns the meta object for class '{@link fr.obeo.performance.TestResult <em>Test Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Test Result</em>'.
     * @see fr.obeo.performance.TestResult
     * @generated
     */
    EClass getTestResult();

    /**
     * Returns the meta object for the containment reference '{@link fr.obeo.performance.TestResult#getScenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Scenario</em>'.
     * @see fr.obeo.performance.TestResult#getScenario()
     * @see #getTestResult()
     * @generated
     */
    EReference getTestResult_Scenario();

    /**
     * Returns the meta object for the containment reference list '{@link fr.obeo.performance.TestResult#getDataPoints <em>Data Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Points</em>'.
     * @see fr.obeo.performance.TestResult#getDataPoints()
     * @see #getTestResult()
     * @generated
     */
    EReference getTestResult_DataPoints();

    /**
     * Returns the meta object for class '{@link fr.obeo.performance.DataPoint <em>Data Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Point</em>'.
     * @see fr.obeo.performance.DataPoint
     * @generated
     */
    EClass getDataPoint();

    /**
     * Returns the meta object for the containment reference list '{@link fr.obeo.performance.DataPoint#getMeasures <em>Measures</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Measures</em>'.
     * @see fr.obeo.performance.DataPoint#getMeasures()
     * @see #getDataPoint()
     * @generated
     */
    EReference getDataPoint_Measures();

    /**
     * Returns the meta object for class '{@link fr.obeo.performance.Measure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Measure</em>'.
     * @see fr.obeo.performance.Measure
     * @generated
     */
    EClass getMeasure();

    /**
     * Returns the meta object for the attribute '{@link fr.obeo.performance.Measure#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.obeo.performance.Measure#getName()
     * @see #getMeasure()
     * @generated
     */
    EAttribute getMeasure_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.obeo.performance.Measure#getDimension <em>Dimension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dimension</em>'.
     * @see fr.obeo.performance.Measure#getDimension()
     * @see #getMeasure()
     * @generated
     */
    EAttribute getMeasure_Dimension();

    /**
     * Returns the meta object for the attribute '{@link fr.obeo.performance.Measure#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.obeo.performance.Measure#getValue()
     * @see #getMeasure()
     * @generated
     */
    EAttribute getMeasure_Value();

    /**
     * Returns the meta object for enum '{@link fr.obeo.performance.Dimension <em>Dimension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Dimension</em>'.
     * @see fr.obeo.performance.Dimension
     * @generated
     */
    EEnum getDimension();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PerformanceFactory getPerformanceFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link fr.obeo.performance.impl.SystemUnderTestImpl <em>System Under Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.obeo.performance.impl.SystemUnderTestImpl
         * @see fr.obeo.performance.impl.PerformancePackageImpl#getSystemUnderTest()
         * @generated
         */
        EClass SYSTEM_UNDER_TEST = eINSTANCE.getSystemUnderTest();
        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM_UNDER_TEST__NAME = eINSTANCE.getSystemUnderTest_Name();
        /**
         * The meta object literal for the '{@link fr.obeo.performance.impl.EnvironmentImpl <em>Environment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.obeo.performance.impl.EnvironmentImpl
         * @see fr.obeo.performance.impl.PerformancePackageImpl#getEnvironment()
         * @generated
         */
        EClass ENVIRONMENT = eINSTANCE.getEnvironment();
        /**
         * The meta object literal for the '{@link fr.obeo.performance.impl.ScenarioImpl <em>Scenario</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.obeo.performance.impl.ScenarioImpl
         * @see fr.obeo.performance.impl.PerformancePackageImpl#getScenario()
         * @generated
         */
        EClass SCENARIO = eINSTANCE.getScenario();
        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();
        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCENARIO__DESCRIPTION = eINSTANCE.getScenario_Description();
        /**
         * The meta object literal for the '{@link fr.obeo.performance.impl.PropertiesImpl <em>Properties</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.obeo.performance.impl.PropertiesImpl
         * @see fr.obeo.performance.impl.PerformancePackageImpl#getProperties()
         * @generated
         */
        EClass PROPERTIES = eINSTANCE.getProperties();
        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTIES__PROPERTIES = eINSTANCE.getProperties_Properties();
        /**
         * The meta object literal for the '{@link fr.obeo.performance.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.obeo.performance.impl.PropertyImpl
         * @see fr.obeo.performance.impl.PerformancePackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();
        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();
        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();
        /**
         * The meta object literal for the '{@link fr.obeo.performance.impl.PerformanceTestImpl <em>Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.obeo.performance.impl.PerformanceTestImpl
         * @see fr.obeo.performance.impl.PerformancePackageImpl#getPerformanceTest()
         * @generated
         */
        EClass PERFORMANCE_TEST = eINSTANCE.getPerformanceTest();
        /**
         * The meta object literal for the '<em><b>Sut</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERFORMANCE_TEST__SUT = eINSTANCE.getPerformanceTest_Sut();
        /**
         * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERFORMANCE_TEST__ENVIRONMENT = eINSTANCE.getPerformanceTest_Environment();
        /**
         * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERFORMANCE_TEST__RESULTS = eINSTANCE.getPerformanceTest_Results();
        /**
         * The meta object literal for the '{@link fr.obeo.performance.impl.TestResultImpl <em>Test Result</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.obeo.performance.impl.TestResultImpl
         * @see fr.obeo.performance.impl.PerformancePackageImpl#getTestResult()
         * @generated
         */
        EClass TEST_RESULT = eINSTANCE.getTestResult();
        /**
         * The meta object literal for the '<em><b>Scenario</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEST_RESULT__SCENARIO = eINSTANCE.getTestResult_Scenario();
        /**
         * The meta object literal for the '<em><b>Data Points</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEST_RESULT__DATA_POINTS = eINSTANCE.getTestResult_DataPoints();
        /**
         * The meta object literal for the '{@link fr.obeo.performance.impl.DataPointImpl <em>Data Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.obeo.performance.impl.DataPointImpl
         * @see fr.obeo.performance.impl.PerformancePackageImpl#getDataPoint()
         * @generated
         */
        EClass DATA_POINT = eINSTANCE.getDataPoint();
        /**
         * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_POINT__MEASURES = eINSTANCE.getDataPoint_Measures();
        /**
         * The meta object literal for the '{@link fr.obeo.performance.impl.MeasureImpl <em>Measure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.obeo.performance.impl.MeasureImpl
         * @see fr.obeo.performance.impl.PerformancePackageImpl#getMeasure()
         * @generated
         */
        EClass MEASURE = eINSTANCE.getMeasure();
        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEASURE__NAME = eINSTANCE.getMeasure_Name();
        /**
         * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEASURE__DIMENSION = eINSTANCE.getMeasure_Dimension();
        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEASURE__VALUE = eINSTANCE.getMeasure_Value();
        /**
         * The meta object literal for the '{@link fr.obeo.performance.Dimension <em>Dimension</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.obeo.performance.Dimension
         * @see fr.obeo.performance.impl.PerformancePackageImpl#getDimension()
         * @generated
         */
        EEnum DIMENSION = eINSTANCE.getDimension();

    }

} //PerformancePackage
