/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pETRI1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.pETRI1.PETRI1Package
 * @generated
 */
public interface PETRI1Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PETRI1Factory eINSTANCE = fr.enseeiht.pETRI1.impl.PETRI1FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Petri Net</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Petri Net</em>'.
   * @generated
   */
  PetriNet createPetriNet();

  /**
   * Returns a new object of class '<em>Petri Net Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Petri Net Element</em>'.
   * @generated
   */
  PetriNetElement createPetriNetElement();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Place</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Place</em>'.
   * @generated
   */
  Place createPlace();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Arc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arc</em>'.
   * @generated
   */
  Arc createArc();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PETRI1Package getPETRI1Package();

} //PETRI1Factory
