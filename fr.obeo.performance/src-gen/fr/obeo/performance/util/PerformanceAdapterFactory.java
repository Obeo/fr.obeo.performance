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
package fr.obeo.performance.util;

import fr.obeo.performance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.performance.PerformancePackage
 * @generated
 */
public class PerformanceAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PerformancePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PerformanceAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = PerformancePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PerformanceSwitch<Adapter> modelSwitch =
        new PerformanceSwitch<Adapter>() {
            @Override
            public Adapter caseSystemUnderTest(SystemUnderTest object) {
                return createSystemUnderTestAdapter();
            }
            @Override
            public Adapter caseEnvironment(Environment object) {
                return createEnvironmentAdapter();
            }
            @Override
            public Adapter caseScenario(Scenario object) {
                return createScenarioAdapter();
            }
            @Override
            public Adapter caseProperties(Properties object) {
                return createPropertiesAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter casePerformanceTest(PerformanceTest object) {
                return createPerformanceTestAdapter();
            }
            @Override
            public Adapter caseTestResult(TestResult object) {
                return createTestResultAdapter();
            }
            @Override
            public Adapter caseDataPoint(DataPoint object) {
                return createDataPointAdapter();
            }
            @Override
            public Adapter caseMeasure(Measure object) {
                return createMeasureAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link fr.obeo.performance.SystemUnderTest <em>System Under Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.performance.SystemUnderTest
     * @generated
     */
    public Adapter createSystemUnderTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.obeo.performance.Environment <em>Environment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.performance.Environment
     * @generated
     */
    public Adapter createEnvironmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.obeo.performance.Scenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.performance.Scenario
     * @generated
     */
    public Adapter createScenarioAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.obeo.performance.Properties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.performance.Properties
     * @generated
     */
    public Adapter createPropertiesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.obeo.performance.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.performance.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.obeo.performance.PerformanceTest <em>Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.performance.PerformanceTest
     * @generated
     */
    public Adapter createPerformanceTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.obeo.performance.TestResult <em>Test Result</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.performance.TestResult
     * @generated
     */
    public Adapter createTestResultAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.obeo.performance.DataPoint <em>Data Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.performance.DataPoint
     * @generated
     */
    public Adapter createDataPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.obeo.performance.Measure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.performance.Measure
     * @generated
     */
    public Adapter createMeasureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //PerformanceAdapterFactory
