/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDL2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pDL2.WorkDefinition#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.pDL2.WorkDefinition#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link fr.enseeiht.pDL2.WorkDefinition#getLinksToSuccessors <em>Links To Successors</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pDL2.PDL2Package#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends ProcessElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.enseeiht.pDL2.PDL2Package#getWorkDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDL2.WorkDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Links To Predecessors</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.pDL2.DependanceStart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links To Predecessors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links To Predecessors</em>' containment reference list.
   * @see fr.enseeiht.pDL2.PDL2Package#getWorkDefinition_LinksToPredecessors()
   * @model containment="true"
   * @generated
   */
  EList<DependanceStart> getLinksToPredecessors();

  /**
   * Returns the value of the '<em><b>Links To Successors</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.pDL2.DependanceFinish}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links To Successors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links To Successors</em>' containment reference list.
   * @see fr.enseeiht.pDL2.PDL2Package#getWorkDefinition_LinksToSuccessors()
   * @model containment="true"
   * @generated
   */
  EList<DependanceFinish> getLinksToSuccessors();

} // WorkDefinition
