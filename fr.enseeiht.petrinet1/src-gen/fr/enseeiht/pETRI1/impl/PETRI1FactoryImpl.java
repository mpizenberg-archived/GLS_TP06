/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pETRI1.impl;

import fr.enseeiht.pETRI1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PETRI1FactoryImpl extends EFactoryImpl implements PETRI1Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PETRI1Factory init()
  {
    try
    {
      PETRI1Factory thePETRI1Factory = (PETRI1Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.enseeiht.fr/PETRI1"); 
      if (thePETRI1Factory != null)
      {
        return thePETRI1Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PETRI1FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PETRI1FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PETRI1Package.PETRI_NET: return createPetriNet();
      case PETRI1Package.PETRI_NET_ELEMENT: return createPetriNetElement();
      case PETRI1Package.NODE: return createNode();
      case PETRI1Package.PLACE: return createPlace();
      case PETRI1Package.TRANSITION: return createTransition();
      case PETRI1Package.ARC: return createArc();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PetriNet createPetriNet()
  {
    PetriNetImpl petriNet = new PetriNetImpl();
    return petriNet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PetriNetElement createPetriNetElement()
  {
    PetriNetElementImpl petriNetElement = new PetriNetElementImpl();
    return petriNetElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place createPlace()
  {
    PlaceImpl place = new PlaceImpl();
    return place;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arc createArc()
  {
    ArcImpl arc = new ArcImpl();
    return arc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PETRI1Package getPETRI1Package()
  {
    return (PETRI1Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PETRI1Package getPackage()
  {
    return PETRI1Package.eINSTANCE;
  }

} //PETRI1FactoryImpl
