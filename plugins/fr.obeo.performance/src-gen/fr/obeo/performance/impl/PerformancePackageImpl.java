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
package fr.obeo.performance.impl;

import fr.obeo.performance.DataPoint;
import fr.obeo.performance.Dimension;
import fr.obeo.performance.Environment;
import fr.obeo.performance.Measure;
import fr.obeo.performance.PerformanceFactory;
import fr.obeo.performance.PerformancePackage;
import fr.obeo.performance.PerformanceTest;
import fr.obeo.performance.Properties;
import fr.obeo.performance.Property;
import fr.obeo.performance.Scenario;
import fr.obeo.performance.SystemUnderTest;
import fr.obeo.performance.TestResult;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformancePackageImpl extends EPackageImpl implements PerformancePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass systemUnderTestEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass environmentEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scenarioEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertiesEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass performanceTestEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass testResultEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataPointEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass measureEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dimensionEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see fr.obeo.performance.PerformancePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private PerformancePackageImpl() {
        super(eNS_URI, PerformanceFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link PerformancePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static PerformancePackage init() {
        if (isInited) return (PerformancePackage)EPackage.Registry.INSTANCE.getEPackage(PerformancePackage.eNS_URI);

        // Obtain or create and register package
        PerformancePackageImpl thePerformancePackage = (PerformancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PerformancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PerformancePackageImpl());

        isInited = true;

        // Create package meta-data objects
        thePerformancePackage.createPackageContents();

        // Initialize created meta-data
        thePerformancePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thePerformancePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PerformancePackage.eNS_URI, thePerformancePackage);
        return thePerformancePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSystemUnderTest() {
        return systemUnderTestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSystemUnderTest_Name() {
        return (EAttribute)systemUnderTestEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnvironment() {
        return environmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScenario() {
        return scenarioEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScenario_Name() {
        return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScenario_Description() {
        return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperties() {
        return propertiesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperties_Properties() {
        return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Key() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Value() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPerformanceTest() {
        return performanceTestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPerformanceTest_Sut() {
        return (EReference)performanceTestEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPerformanceTest_Environment() {
        return (EReference)performanceTestEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPerformanceTest_Results() {
        return (EReference)performanceTestEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTestResult() {
        return testResultEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTestResult_Scenario() {
        return (EReference)testResultEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTestResult_DataPoints() {
        return (EReference)testResultEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataPoint() {
        return dataPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataPoint_Measures() {
        return (EReference)dataPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMeasure() {
        return measureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMeasure_Name() {
        return (EAttribute)measureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMeasure_Dimension() {
        return (EAttribute)measureEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMeasure_Value() {
        return (EAttribute)measureEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDimension() {
        return dimensionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PerformanceFactory getPerformanceFactory() {
        return (PerformanceFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        systemUnderTestEClass = createEClass(SYSTEM_UNDER_TEST);
        createEAttribute(systemUnderTestEClass, SYSTEM_UNDER_TEST__NAME);

        environmentEClass = createEClass(ENVIRONMENT);

        scenarioEClass = createEClass(SCENARIO);
        createEAttribute(scenarioEClass, SCENARIO__NAME);
        createEAttribute(scenarioEClass, SCENARIO__DESCRIPTION);

        propertiesEClass = createEClass(PROPERTIES);
        createEReference(propertiesEClass, PROPERTIES__PROPERTIES);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__KEY);
        createEAttribute(propertyEClass, PROPERTY__VALUE);

        performanceTestEClass = createEClass(PERFORMANCE_TEST);
        createEReference(performanceTestEClass, PERFORMANCE_TEST__SUT);
        createEReference(performanceTestEClass, PERFORMANCE_TEST__ENVIRONMENT);
        createEReference(performanceTestEClass, PERFORMANCE_TEST__RESULTS);

        testResultEClass = createEClass(TEST_RESULT);
        createEReference(testResultEClass, TEST_RESULT__SCENARIO);
        createEReference(testResultEClass, TEST_RESULT__DATA_POINTS);

        dataPointEClass = createEClass(DATA_POINT);
        createEReference(dataPointEClass, DATA_POINT__MEASURES);

        measureEClass = createEClass(MEASURE);
        createEAttribute(measureEClass, MEASURE__NAME);
        createEAttribute(measureEClass, MEASURE__DIMENSION);
        createEAttribute(measureEClass, MEASURE__VALUE);

        // Create enums
        dimensionEEnum = createEEnum(DIMENSION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        systemUnderTestEClass.getESuperTypes().add(this.getProperties());
        environmentEClass.getESuperTypes().add(this.getProperties());
        scenarioEClass.getESuperTypes().add(this.getProperties());

        // Initialize classes and features; add operations and parameters
        initEClass(systemUnderTestEClass, SystemUnderTest.class, "SystemUnderTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSystemUnderTest_Name(), ecorePackage.getEString(), "name", null, 1, 1, SystemUnderTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScenario_Name(), ecorePackage.getEString(), "name", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScenario_Description(), ecorePackage.getEString(), "description", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertiesEClass, Properties.class, "Properties", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProperties_Properties(), this.getProperty(), null, "properties", null, 0, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_Key(), ecorePackage.getEString(), "key", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(performanceTestEClass, PerformanceTest.class, "PerformanceTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPerformanceTest_Sut(), this.getSystemUnderTest(), null, "sut", null, 1, 1, PerformanceTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPerformanceTest_Environment(), this.getEnvironment(), null, "environment", null, 1, 1, PerformanceTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPerformanceTest_Results(), this.getTestResult(), null, "results", null, 0, -1, PerformanceTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(testResultEClass, TestResult.class, "TestResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTestResult_Scenario(), this.getScenario(), null, "scenario", null, 1, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTestResult_DataPoints(), this.getDataPoint(), null, "dataPoints", null, 0, -1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataPointEClass, DataPoint.class, "DataPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataPoint_Measures(), this.getMeasure(), null, "measures", null, 0, -1, DataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMeasure_Name(), ecorePackage.getEString(), "name", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMeasure_Dimension(), this.getDimension(), "dimension", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMeasure_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(dimensionEEnum, Dimension.class, "Dimension");
        addEEnumLiteral(dimensionEEnum, Dimension.TIME);
        addEEnumLiteral(dimensionEEnum, Dimension.MEMORY);

        // Create resource
        createResource(eNS_URI);
    }

} //PerformancePackageImpl
