/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDL2.impl;

import fr.enseeiht.pDL2.DependanceFinish;
import fr.enseeiht.pDL2.DependanceStart;
import fr.enseeiht.pDL2.PDL2Package;
import fr.enseeiht.pDL2.WorkDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.enseeiht.pDL2.impl.WorkDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.pDL2.impl.WorkDefinitionImpl#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link fr.enseeiht.pDL2.impl.WorkDefinitionImpl#getLinksToSuccessors <em>Links To Successors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkDefinitionImpl extends ProcessElementImpl implements WorkDefinition
{
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
   * The cached value of the '{@link #getLinksToPredecessors() <em>Links To Predecessors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinksToPredecessors()
   * @generated
   * @ordered
   */
  protected EList<DependanceStart> linksToPredecessors;

  /**
   * The cached value of the '{@link #getLinksToSuccessors() <em>Links To Successors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinksToSuccessors()
   * @generated
   * @ordered
   */
  protected EList<DependanceFinish> linksToSuccessors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkDefinitionImpl()
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
    return PDL2Package.Literals.WORK_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL2Package.WORK_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DependanceStart> getLinksToPredecessors()
  {
    if (linksToPredecessors == null)
    {
      linksToPredecessors = new EObjectContainmentEList<DependanceStart>(DependanceStart.class, this, PDL2Package.WORK_DEFINITION__LINKS_TO_PREDECESSORS);
    }
    return linksToPredecessors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DependanceFinish> getLinksToSuccessors()
  {
    if (linksToSuccessors == null)
    {
      linksToSuccessors = new EObjectContainmentEList<DependanceFinish>(DependanceFinish.class, this, PDL2Package.WORK_DEFINITION__LINKS_TO_SUCCESSORS);
    }
    return linksToSuccessors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PDL2Package.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        return ((InternalEList<?>)getLinksToPredecessors()).basicRemove(otherEnd, msgs);
      case PDL2Package.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        return ((InternalEList<?>)getLinksToSuccessors()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PDL2Package.WORK_DEFINITION__NAME:
        return getName();
      case PDL2Package.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        return getLinksToPredecessors();
      case PDL2Package.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        return getLinksToSuccessors();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PDL2Package.WORK_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case PDL2Package.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        getLinksToPredecessors().clear();
        getLinksToPredecessors().addAll((Collection<? extends DependanceStart>)newValue);
        return;
      case PDL2Package.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        getLinksToSuccessors().clear();
        getLinksToSuccessors().addAll((Collection<? extends DependanceFinish>)newValue);
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
      case PDL2Package.WORK_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PDL2Package.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        getLinksToPredecessors().clear();
        return;
      case PDL2Package.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        getLinksToSuccessors().clear();
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
      case PDL2Package.WORK_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PDL2Package.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        return linksToPredecessors != null && !linksToPredecessors.isEmpty();
      case PDL2Package.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        return linksToSuccessors != null && !linksToSuccessors.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //WorkDefinitionImpl
