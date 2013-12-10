/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pETRI1.impl;

import fr.enseeiht.pETRI1.Arc;
import fr.enseeiht.pETRI1.Node;
import fr.enseeiht.pETRI1.PETRI1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.enseeiht.pETRI1.impl.ArcImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link fr.enseeiht.pETRI1.impl.ArcImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link fr.enseeiht.pETRI1.impl.ArcImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.enseeiht.pETRI1.impl.ArcImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcImpl extends PetriNetElementImpl implements Arc
{
  /**
   * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected static final int MULTIPLICITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected int multiplicity = MULTIPLICITY_EDEFAULT;

  /**
   * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadOnly()
   * @generated
   * @ordered
   */
  protected static final boolean READ_ONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadOnly()
   * @generated
   * @ordered
   */
  protected boolean readOnly = READ_ONLY_EDEFAULT;

  /**
   * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredecessor()
   * @generated
   * @ordered
   */
  protected Node predecessor;

  /**
   * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuccessor()
   * @generated
   * @ordered
   */
  protected Node successor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArcImpl()
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
    return PETRI1Package.Literals.ARC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMultiplicity()
  {
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicity(int newMultiplicity)
  {
    int oldMultiplicity = multiplicity;
    multiplicity = newMultiplicity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PETRI1Package.ARC__MULTIPLICITY, oldMultiplicity, multiplicity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReadOnly()
  {
    return readOnly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadOnly(boolean newReadOnly)
  {
    boolean oldReadOnly = readOnly;
    readOnly = newReadOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PETRI1Package.ARC__READ_ONLY, oldReadOnly, readOnly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getPredecessor()
  {
    if (predecessor != null && predecessor.eIsProxy())
    {
      InternalEObject oldPredecessor = (InternalEObject)predecessor;
      predecessor = (Node)eResolveProxy(oldPredecessor);
      if (predecessor != oldPredecessor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PETRI1Package.ARC__PREDECESSOR, oldPredecessor, predecessor));
      }
    }
    return predecessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetPredecessor()
  {
    return predecessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredecessor(Node newPredecessor)
  {
    Node oldPredecessor = predecessor;
    predecessor = newPredecessor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PETRI1Package.ARC__PREDECESSOR, oldPredecessor, predecessor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getSuccessor()
  {
    if (successor != null && successor.eIsProxy())
    {
      InternalEObject oldSuccessor = (InternalEObject)successor;
      successor = (Node)eResolveProxy(oldSuccessor);
      if (successor != oldSuccessor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PETRI1Package.ARC__SUCCESSOR, oldSuccessor, successor));
      }
    }
    return successor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetSuccessor()
  {
    return successor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuccessor(Node newSuccessor)
  {
    Node oldSuccessor = successor;
    successor = newSuccessor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PETRI1Package.ARC__SUCCESSOR, oldSuccessor, successor));
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
      case PETRI1Package.ARC__MULTIPLICITY:
        return getMultiplicity();
      case PETRI1Package.ARC__READ_ONLY:
        return isReadOnly();
      case PETRI1Package.ARC__PREDECESSOR:
        if (resolve) return getPredecessor();
        return basicGetPredecessor();
      case PETRI1Package.ARC__SUCCESSOR:
        if (resolve) return getSuccessor();
        return basicGetSuccessor();
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
      case PETRI1Package.ARC__MULTIPLICITY:
        setMultiplicity((Integer)newValue);
        return;
      case PETRI1Package.ARC__READ_ONLY:
        setReadOnly((Boolean)newValue);
        return;
      case PETRI1Package.ARC__PREDECESSOR:
        setPredecessor((Node)newValue);
        return;
      case PETRI1Package.ARC__SUCCESSOR:
        setSuccessor((Node)newValue);
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
      case PETRI1Package.ARC__MULTIPLICITY:
        setMultiplicity(MULTIPLICITY_EDEFAULT);
        return;
      case PETRI1Package.ARC__READ_ONLY:
        setReadOnly(READ_ONLY_EDEFAULT);
        return;
      case PETRI1Package.ARC__PREDECESSOR:
        setPredecessor((Node)null);
        return;
      case PETRI1Package.ARC__SUCCESSOR:
        setSuccessor((Node)null);
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
      case PETRI1Package.ARC__MULTIPLICITY:
        return multiplicity != MULTIPLICITY_EDEFAULT;
      case PETRI1Package.ARC__READ_ONLY:
        return readOnly != READ_ONLY_EDEFAULT;
      case PETRI1Package.ARC__PREDECESSOR:
        return predecessor != null;
      case PETRI1Package.ARC__SUCCESSOR:
        return successor != null;
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
    result.append(" (multiplicity: ");
    result.append(multiplicity);
    result.append(", readOnly: ");
    result.append(readOnly);
    result.append(')');
    return result.toString();
  }

} //ArcImpl
