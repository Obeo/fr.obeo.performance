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

import fr.obeo.performance.Environment;
import fr.obeo.performance.PerformancePackage;
import fr.obeo.performance.PerformanceTest;
import fr.obeo.performance.SystemUnderTest;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.performance.impl.PerformanceTestImpl#getSut <em>Sut</em>}</li>
 *   <li>{@link fr.obeo.performance.impl.PerformanceTestImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link fr.obeo.performance.impl.PerformanceTestImpl#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformanceTestImpl extends EObjectImpl implements PerformanceTest {
    /**
     * The cached value of the '{@link #getSut() <em>Sut</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSut()
     * @generated
     * @ordered
     */
    protected SystemUnderTest sut;

    /**
     * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnvironment()
     * @generated
     * @ordered
     */
    protected Environment environment;

    /**
     * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResults()
     * @generated
     * @ordered
     */
    protected EList<TestResult> results;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PerformanceTestImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PerformancePackage.Literals.PERFORMANCE_TEST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemUnderTest getSut() {
        return sut;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSut(SystemUnderTest newSut, NotificationChain msgs) {
        SystemUnderTest oldSut = sut;
        sut = newSut;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PerformancePackage.PERFORMANCE_TEST__SUT, oldSut, newSut);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSut(SystemUnderTest newSut) {
        if (newSut != sut) {
            NotificationChain msgs = null;
            if (sut != null)
                msgs = ((InternalEObject)sut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PerformancePackage.PERFORMANCE_TEST__SUT, null, msgs);
            if (newSut != null)
                msgs = ((InternalEObject)newSut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PerformancePackage.PERFORMANCE_TEST__SUT, null, msgs);
            msgs = basicSetSut(newSut, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PERFORMANCE_TEST__SUT, newSut, newSut));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
        Environment oldEnvironment = environment;
        environment = newEnvironment;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PerformancePackage.PERFORMANCE_TEST__ENVIRONMENT, oldEnvironment, newEnvironment);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnvironment(Environment newEnvironment) {
        if (newEnvironment != environment) {
            NotificationChain msgs = null;
            if (environment != null)
                msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PerformancePackage.PERFORMANCE_TEST__ENVIRONMENT, null, msgs);
            if (newEnvironment != null)
                msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PerformancePackage.PERFORMANCE_TEST__ENVIRONMENT, null, msgs);
            msgs = basicSetEnvironment(newEnvironment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PERFORMANCE_TEST__ENVIRONMENT, newEnvironment, newEnvironment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TestResult> getResults() {
        if (results == null) {
            results = new EObjectContainmentEList<TestResult>(TestResult.class, this, PerformancePackage.PERFORMANCE_TEST__RESULTS);
        }
        return results;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PerformancePackage.PERFORMANCE_TEST__SUT:
                return basicSetSut(null, msgs);
            case PerformancePackage.PERFORMANCE_TEST__ENVIRONMENT:
                return basicSetEnvironment(null, msgs);
            case PerformancePackage.PERFORMANCE_TEST__RESULTS:
                return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
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
            case PerformancePackage.PERFORMANCE_TEST__SUT:
                return getSut();
            case PerformancePackage.PERFORMANCE_TEST__ENVIRONMENT:
                return getEnvironment();
            case PerformancePackage.PERFORMANCE_TEST__RESULTS:
                return getResults();
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
            case PerformancePackage.PERFORMANCE_TEST__SUT:
                setSut((SystemUnderTest)newValue);
                return;
            case PerformancePackage.PERFORMANCE_TEST__ENVIRONMENT:
                setEnvironment((Environment)newValue);
                return;
            case PerformancePackage.PERFORMANCE_TEST__RESULTS:
                getResults().clear();
                getResults().addAll((Collection<? extends TestResult>)newValue);
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
            case PerformancePackage.PERFORMANCE_TEST__SUT:
                setSut((SystemUnderTest)null);
                return;
            case PerformancePackage.PERFORMANCE_TEST__ENVIRONMENT:
                setEnvironment((Environment)null);
                return;
            case PerformancePackage.PERFORMANCE_TEST__RESULTS:
                getResults().clear();
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
            case PerformancePackage.PERFORMANCE_TEST__SUT:
                return sut != null;
            case PerformancePackage.PERFORMANCE_TEST__ENVIRONMENT:
                return environment != null;
            case PerformancePackage.PERFORMANCE_TEST__RESULTS:
                return results != null && !results.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PerformanceTestImpl
