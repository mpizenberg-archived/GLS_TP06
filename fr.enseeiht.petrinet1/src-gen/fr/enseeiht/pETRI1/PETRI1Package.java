/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pETRI1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.enseeiht.pETRI1.PETRI1Factory
 * @model kind="package"
 * @generated
 */
public interface PETRI1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pETRI1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.enseeiht.fr/PETRI1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pETRI1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PETRI1Package eINSTANCE = fr.enseeiht.pETRI1.impl.PETRI1PackageImpl.init();

  /**
   * The meta object id for the '{@link fr.enseeiht.pETRI1.impl.PetriNetImpl <em>Petri Net</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pETRI1.impl.PetriNetImpl
   * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getPetriNet()
   * @generated
   */
  int PETRI_NET = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET__NAME = 0;

  /**
   * The feature id for the '<em><b>Petri Net Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET__PETRI_NET_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Petri Net</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.enseeiht.pETRI1.impl.PetriNetElementImpl <em>Petri Net Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pETRI1.impl.PetriNetElementImpl
   * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getPetriNetElement()
   * @generated
   */
  int PETRI_NET_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Petri Net Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.enseeiht.pETRI1.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pETRI1.impl.NodeImpl
   * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getNode()
   * @generated
   */
  int NODE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = PETRI_NET_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = PETRI_NET_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.enseeiht.pETRI1.impl.PlaceImpl <em>Place</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pETRI1.impl.PlaceImpl
   * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getPlace()
   * @generated
   */
  int PLACE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Marking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__MARKING = NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Place</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.enseeiht.pETRI1.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pETRI1.impl.TransitionImpl
   * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = NODE__NAME;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.enseeiht.pETRI1.impl.ArcImpl <em>Arc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pETRI1.impl.ArcImpl
   * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getArc()
   * @generated
   */
  int ARC = 5;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__MULTIPLICITY = PETRI_NET_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__READ_ONLY = PETRI_NET_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__PREDECESSOR = PETRI_NET_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Successor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__SUCCESSOR = PETRI_NET_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Arc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC_FEATURE_COUNT = PETRI_NET_ELEMENT_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link fr.enseeiht.pETRI1.PetriNet <em>Petri Net</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Petri Net</em>'.
   * @see fr.enseeiht.pETRI1.PetriNet
   * @generated
   */
  EClass getPetriNet();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pETRI1.PetriNet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.enseeiht.pETRI1.PetriNet#getName()
   * @see #getPetriNet()
   * @generated
   */
  EAttribute getPetriNet_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.enseeiht.pETRI1.PetriNet#getPetriNetElements <em>Petri Net Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Petri Net Elements</em>'.
   * @see fr.enseeiht.pETRI1.PetriNet#getPetriNetElements()
   * @see #getPetriNet()
   * @generated
   */
  EReference getPetriNet_PetriNetElements();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pETRI1.PetriNetElement <em>Petri Net Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Petri Net Element</em>'.
   * @see fr.enseeiht.pETRI1.PetriNetElement
   * @generated
   */
  EClass getPetriNetElement();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pETRI1.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see fr.enseeiht.pETRI1.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pETRI1.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.enseeiht.pETRI1.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pETRI1.Place <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Place</em>'.
   * @see fr.enseeiht.pETRI1.Place
   * @generated
   */
  EClass getPlace();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pETRI1.Place#getMarking <em>Marking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Marking</em>'.
   * @see fr.enseeiht.pETRI1.Place#getMarking()
   * @see #getPlace()
   * @generated
   */
  EAttribute getPlace_Marking();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pETRI1.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see fr.enseeiht.pETRI1.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pETRI1.Arc <em>Arc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arc</em>'.
   * @see fr.enseeiht.pETRI1.Arc
   * @generated
   */
  EClass getArc();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pETRI1.Arc#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see fr.enseeiht.pETRI1.Arc#getMultiplicity()
   * @see #getArc()
   * @generated
   */
  EAttribute getArc_Multiplicity();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pETRI1.Arc#isReadOnly <em>Read Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Read Only</em>'.
   * @see fr.enseeiht.pETRI1.Arc#isReadOnly()
   * @see #getArc()
   * @generated
   */
  EAttribute getArc_ReadOnly();

  /**
   * Returns the meta object for the reference '{@link fr.enseeiht.pETRI1.Arc#getPredecessor <em>Predecessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Predecessor</em>'.
   * @see fr.enseeiht.pETRI1.Arc#getPredecessor()
   * @see #getArc()
   * @generated
   */
  EReference getArc_Predecessor();

  /**
   * Returns the meta object for the reference '{@link fr.enseeiht.pETRI1.Arc#getSuccessor <em>Successor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Successor</em>'.
   * @see fr.enseeiht.pETRI1.Arc#getSuccessor()
   * @see #getArc()
   * @generated
   */
  EReference getArc_Successor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PETRI1Factory getPETRI1Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.enseeiht.pETRI1.impl.PetriNetImpl <em>Petri Net</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pETRI1.impl.PetriNetImpl
     * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getPetriNet()
     * @generated
     */
    EClass PETRI_NET = eINSTANCE.getPetriNet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PETRI_NET__NAME = eINSTANCE.getPetriNet_Name();

    /**
     * The meta object literal for the '<em><b>Petri Net Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PETRI_NET__PETRI_NET_ELEMENTS = eINSTANCE.getPetriNet_PetriNetElements();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pETRI1.impl.PetriNetElementImpl <em>Petri Net Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pETRI1.impl.PetriNetElementImpl
     * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getPetriNetElement()
     * @generated
     */
    EClass PETRI_NET_ELEMENT = eINSTANCE.getPetriNetElement();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pETRI1.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pETRI1.impl.NodeImpl
     * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pETRI1.impl.PlaceImpl <em>Place</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pETRI1.impl.PlaceImpl
     * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getPlace()
     * @generated
     */
    EClass PLACE = eINSTANCE.getPlace();

    /**
     * The meta object literal for the '<em><b>Marking</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLACE__MARKING = eINSTANCE.getPlace_Marking();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pETRI1.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pETRI1.impl.TransitionImpl
     * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pETRI1.impl.ArcImpl <em>Arc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pETRI1.impl.ArcImpl
     * @see fr.enseeiht.pETRI1.impl.PETRI1PackageImpl#getArc()
     * @generated
     */
    EClass ARC = eINSTANCE.getArc();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARC__MULTIPLICITY = eINSTANCE.getArc_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARC__READ_ONLY = eINSTANCE.getArc_ReadOnly();

    /**
     * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARC__PREDECESSOR = eINSTANCE.getArc_Predecessor();

    /**
     * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARC__SUCCESSOR = eINSTANCE.getArc_Successor();

  }

} //PETRI1Package
