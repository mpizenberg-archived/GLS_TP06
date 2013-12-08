/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDL2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Sequence Kind Finish</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pDL2.WorkSequenceKindFinish#getFinished2Start <em>Finished2 Start</em>}</li>
 *   <li>{@link fr.enseeiht.pDL2.WorkSequenceKindFinish#getFinished2Finish <em>Finished2 Finish</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pDL2.PDL2Package#getWorkSequenceKindFinish()
 * @model
 * @generated
 */
public interface WorkSequenceKindFinish extends EObject
{
  /**
   * Returns the value of the '<em><b>Finished2 Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finished2 Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finished2 Start</em>' attribute.
   * @see #setFinished2Start(String)
   * @see fr.enseeiht.pDL2.PDL2Package#getWorkSequenceKindFinish_Finished2Start()
   * @model
   * @generated
   */
  String getFinished2Start();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDL2.WorkSequenceKindFinish#getFinished2Start <em>Finished2 Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finished2 Start</em>' attribute.
   * @see #getFinished2Start()
   * @generated
   */
  void setFinished2Start(String value);

  /**
   * Returns the value of the '<em><b>Finished2 Finish</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finished2 Finish</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finished2 Finish</em>' attribute.
   * @see #setFinished2Finish(String)
   * @see fr.enseeiht.pDL2.PDL2Package#getWorkSequenceKindFinish_Finished2Finish()
   * @model
   * @generated
   */
  String getFinished2Finish();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDL2.WorkSequenceKindFinish#getFinished2Finish <em>Finished2 Finish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finished2 Finish</em>' attribute.
   * @see #getFinished2Finish()
   * @generated
   */
  void setFinished2Finish(String value);

} // WorkSequenceKindFinish
