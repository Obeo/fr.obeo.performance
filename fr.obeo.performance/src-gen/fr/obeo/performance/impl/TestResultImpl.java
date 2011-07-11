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
import fr.obeo.performance.Measure;
import fr.obeo.performance.PerformancePackage;
import fr.obeo.performance.Scenario;
import fr.obeo.performance.TestResult;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.performance.impl.TestResultImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link fr.obeo.performance.impl.TestResultImpl#getDataPoints <em>Data Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestResultImpl extends EObjectImpl implements TestResult {
    /**
     * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScenario()
     * @generated
     * @ordered
     */
    protected Scenario scenario;
    /**
     * The cached value of the '{@link #getDataPoints() <em>Data Points</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataPoints()
     * @generated
     * @ordered
     */
    protected EList<DataPoint> dataPoints;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TestResultImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PerformancePackage.Literals.TEST_RESULT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scenario getScenario() {
        return scenario;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
        Scenario oldScenario = scenario;
        scenario = newScenario;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PerformancePackage.TEST_RESULT__SCENARIO, oldScenario, newScenario);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScenario(Scenario newScenario) {
        if (newScenario != scenario) {
            NotificationChain msgs = null;
            if (scenario != null)
                msgs = ((InternalEObject)scenario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PerformancePackage.TEST_RESULT__SCENARIO, null, msgs);
            if (newScenario != null)
                msgs = ((InternalEObject)newScenario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PerformancePackage.TEST_RESULT__SCENARIO, null, msgs);
            msgs = basicSetScenario(newScenario, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.TEST_RESULT__SCENARIO, newScenario, newScenario));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataPoint> getDataPoints() {
        if (dataPoints == null) {
            dataPoints = new EObjectContainmentEList<DataPoint>(DataPoint.class, this, PerformancePackage.TEST_RESULT__DATA_POINTS);
        }
        return dataPoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PerformancePackage.TEST_RESULT__SCENARIO:
                return basicSetScenario(null, msgs);
            case PerformancePackage.TEST_RESULT__DATA_POINTS:
                return ((InternalEList<?>)getDataPoints()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PerformancePackage.TEST_RESULT__SCENARIO:
                return getScenario();
            case PerformancePackage.TEST_RESULT__DATA_POINTS:
                return getDataPoints();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PerformancePackage.TEST_RESULT__SCENARIO:
                setScenario((Scenario)newValue);
                return;
            case PerformancePackage.TEST_RESULT__DATA_POINTS:
                getDataPoints().clear();
                getDataPoints().addAll((Collection<? extends DataPoint>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PerformancePackage.TEST_RESULT__SCENARIO:
                setScenario((Scenario)null);
                return;
            case PerformancePackage.TEST_RESULT__DATA_POINTS:
                getDataPoints().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PerformancePackage.TEST_RESULT__SCENARIO:
                return scenario != null;
            case PerformancePackage.TEST_RESULT__DATA_POINTS:
                return dataPoints != null && !dataPoints.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TestResultImpl
