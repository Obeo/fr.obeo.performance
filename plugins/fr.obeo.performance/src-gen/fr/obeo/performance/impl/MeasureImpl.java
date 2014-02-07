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

import fr.obeo.performance.Dimension;
import fr.obeo.performance.Measure;
import fr.obeo.performance.PerformancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.performance.impl.MeasureImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.performance.impl.MeasureImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link fr.obeo.performance.impl.MeasureImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureImpl extends EObjectImpl implements Measure {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDimension()
     * @generated
     * @ordered
     */
    protected static final Dimension DIMENSION_EDEFAULT = Dimension.TIME;

    /**
     * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDimension()
     * @generated
     * @ordered
     */
    protected Dimension dimension = DIMENSION_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final double VALUE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected double value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PerformancePackage.Literals.MEASURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.MEASURE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dimension getDimension() {
        return dimension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDimension(Dimension newDimension) {
        Dimension oldDimension = dimension;
        dimension = newDimension == null ? DIMENSION_EDEFAULT : newDimension;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.MEASURE__DIMENSION, oldDimension, dimension));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(double newValue) {
        double oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.MEASURE__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PerformancePackage.MEASURE__NAME:
                return getName();
            case PerformancePackage.MEASURE__DIMENSION:
                return getDimension();
            case PerformancePackage.MEASURE__VALUE:
                return getValue();
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
            case PerformancePackage.MEASURE__NAME:
                setName((String)newValue);
                return;
            case PerformancePackage.MEASURE__DIMENSION:
                setDimension((Dimension)newValue);
                return;
            case PerformancePackage.MEASURE__VALUE:
                setValue((Double)newValue);
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
            case PerformancePackage.MEASURE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case PerformancePackage.MEASURE__DIMENSION:
                setDimension(DIMENSION_EDEFAULT);
                return;
            case PerformancePackage.MEASURE__VALUE:
                setValue(VALUE_EDEFAULT);
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
            case PerformancePackage.MEASURE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case PerformancePackage.MEASURE__DIMENSION:
                return dimension != DIMENSION_EDEFAULT;
            case PerformancePackage.MEASURE__VALUE:
                return value != VALUE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", dimension: ");
        result.append(dimension);
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //MeasureImpl
