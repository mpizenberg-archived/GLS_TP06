/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDL2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.pDL2.PDL2Package
 * @generated
 */
public interface PDL2Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PDL2Factory eINSTANCE = fr.enseeiht.pDL2.impl.PDL2FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process</em>'.
   * @generated
   */
  Process createProcess();

  /**
   * Returns a new object of class '<em>Process Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Element</em>'.
   * @generated
   */
  ProcessElement createProcessElement();

  /**
   * Returns a new object of class '<em>Work Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Definition</em>'.
   * @generated
   */
  WorkDefinition createWorkDefinition();

  /**
   * Returns a new object of class '<em>Dependance Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependance Start</em>'.
   * @generated
   */
  DependanceStart createDependanceStart();

  /**
   * Returns a new object of class '<em>Work Sequence Kind Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Sequence Kind Start</em>'.
   * @generated
   */
  WorkSequenceKindStart createWorkSequenceKindStart();

  /**
   * Returns a new object of class '<em>Dependance Finish</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependance Finish</em>'.
   * @generated
   */
  DependanceFinish createDependanceFinish();

  /**
   * Returns a new object of class '<em>Work Sequence Kind Finish</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Sequence Kind Finish</em>'.
   * @generated
   */
  WorkSequenceKindFinish createWorkSequenceKindFinish();

  /**
   * Returns a new object of class '<em>Guidance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guidance</em>'.
   * @generated
   */
  Guidance createGuidance();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PDL2Package getPDL2Package();

} //PDL2Factory
