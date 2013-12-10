/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pETRI1.impl;

import fr.enseeiht.pETRI1.PETRI1Package;
import fr.enseeiht.pETRI1.Place;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.enseeiht.pETRI1.impl.PlaceImpl#getMarking <em>Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends NodeImpl implements Place
{
  /**
   * The default value of the '{@link #getMarking() <em>Marking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarking()
   * @generated
   * @ordered
   */
  protected static final int MARKING_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMarking() <em>Marking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarking()
   * @generated
   * @ordered
   */
  protected int marking = MARKING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlaceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PETRI1Package.Literals.PLACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMarking()
  {
    return marking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarking(int newMarking)
  {
    int oldMarking = marking;
    marking = newMarking;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PETRI1Package.PLACE__MARKING, oldMarking, marking));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PETRI1Package.PLACE__MARKING:
        return getMarking();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PETRI1Package.PLACE__MARKING:
        setMarking((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PETRI1Package.PLACE__MARKING:
        setMarking(MARKING_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PETRI1Package.PLACE__MARKING:
        return marking != MARKING_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (marking: ");
    result.append(marking);
    result.append(')');
    return result.toString();
  }

} //PlaceImpl
