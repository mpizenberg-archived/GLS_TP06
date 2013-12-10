/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pETRI1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pETRI1.PetriNet#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.pETRI1.PetriNet#getPetriNetElements <em>Petri Net Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pETRI1.PETRI1Package#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject
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
   * @see fr.enseeiht.pETRI1.PETRI1Package#getPetriNet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.pETRI1.PetriNet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Petri Net Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.pETRI1.PetriNetElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Petri Net Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Petri Net Elements</em>' containment reference list.
   * @see fr.enseeiht.pETRI1.PETRI1Package#getPetriNet_PetriNetElements()
   * @model containment="true"
   * @generated
   */
  EList<PetriNetElement> getPetriNetElements();

} // PetriNet
