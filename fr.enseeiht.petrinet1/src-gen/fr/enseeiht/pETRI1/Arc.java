/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pETRI1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pETRI1.Arc#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link fr.enseeiht.pETRI1.Arc#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link fr.enseeiht.pETRI1.Arc#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.enseeiht.pETRI1.Arc#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pETRI1.PETRI1Package#getArc()
 * @model
 * @generated
 */
public interface Arc extends PetriNetElement
{
  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see #setMultiplicity(int)
   * @see fr.enseeiht.pETRI1.PETRI1Package#getArc_Multiplicity()
   * @model
   * @generated
   */
  int getMultiplicity();

  /**
   * Sets the value of the '{@link fr.enseeiht.pETRI1.Arc#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(int value);

  /**
   * Returns the value of the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Only</em>' attribute.
   * @see #setReadOnly(boolean)
   * @see fr.enseeiht.pETRI1.PETRI1Package#getArc_ReadOnly()
   * @model
   * @generated
   */
  boolean isReadOnly();

  /**
   * Sets the value of the '{@link fr.enseeiht.pETRI1.Arc#isReadOnly <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Only</em>' attribute.
   * @see #isReadOnly()
   * @generated
   */
  void setReadOnly(boolean value);

  /**
   * Returns the value of the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predecessor</em>' reference.
   * @see #setPredecessor(Node)
   * @see fr.enseeiht.pETRI1.PETRI1Package#getArc_Predecessor()
   * @model
   * @generated
   */
  Node getPredecessor();

  /**
   * Sets the value of the '{@link fr.enseeiht.pETRI1.Arc#getPredecessor <em>Predecessor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predecessor</em>' reference.
   * @see #getPredecessor()
   * @generated
   */
  void setPredecessor(Node value);

  /**
   * Returns the value of the '<em><b>Successor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Successor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Successor</em>' reference.
   * @see #setSuccessor(Node)
   * @see fr.enseeiht.pETRI1.PETRI1Package#getArc_Successor()
   * @model
   * @generated
   */
  Node getSuccessor();

  /**
   * Sets the value of the '{@link fr.enseeiht.pETRI1.Arc#getSuccessor <em>Successor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Successor</em>' reference.
   * @see #getSuccessor()
   * @generated
   */
  void setSuccessor(Node value);

} // Arc
