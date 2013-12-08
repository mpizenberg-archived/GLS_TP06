/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDL2.impl;

import fr.enseeiht.pDL2.DependanceFinish;
import fr.enseeiht.pDL2.DependanceStart;
import fr.enseeiht.pDL2.Guidance;
import fr.enseeiht.pDL2.PDL2Factory;
import fr.enseeiht.pDL2.PDL2Package;
import fr.enseeiht.pDL2.ProcessElement;
import fr.enseeiht.pDL2.WorkDefinition;
import fr.enseeiht.pDL2.WorkSequenceKindFinish;
import fr.enseeiht.pDL2.WorkSequenceKindStart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDL2PackageImpl extends EPackageImpl implements PDL2Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependanceStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workSequenceKindStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependanceFinishEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workSequenceKindFinishEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guidanceEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.enseeiht.pDL2.PDL2Package#eNS_URI
   * @see #init()
   * @generated
   */
  private PDL2PackageImpl()
  {
    super(eNS_URI, PDL2Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PDL2Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PDL2Package init()
  {
    if (isInited) return (PDL2Package)EPackage.Registry.INSTANCE.getEPackage(PDL2Package.eNS_URI);

    // Obtain or create and register package
    PDL2PackageImpl thePDL2Package = (PDL2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PDL2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PDL2PackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePDL2Package.createPackageContents();

    // Initialize created meta-data
    thePDL2Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePDL2Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PDL2Package.eNS_URI, thePDL2Package);
    return thePDL2Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcess()
  {
    return processEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcess_Name()
  {
    return (EAttribute)processEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_ProcessElements()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessElement()
  {
    return processElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkDefinition()
  {
    return workDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkDefinition_Name()
  {
    return (EAttribute)workDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkDefinition_LinksToPredecessors()
  {
    return (EReference)workDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkDefinition_LinksToSuccessors()
  {
    return (EReference)workDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependanceStart()
  {
    return dependanceStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependanceStart_Predecessor()
  {
    return (EReference)dependanceStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependanceStart_Link()
  {
    return (EReference)dependanceStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkSequenceKindStart()
  {
    return workSequenceKindStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkSequenceKindStart_Started2Start()
  {
    return (EAttribute)workSequenceKindStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkSequenceKindStart_Started2Finish()
  {
    return (EAttribute)workSequenceKindStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependanceFinish()
  {
    return dependanceFinishEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependanceFinish_Predecessor()
  {
    return (EReference)dependanceFinishEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependanceFinish_Link()
  {
    return (EReference)dependanceFinishEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkSequenceKindFinish()
  {
    return workSequenceKindFinishEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkSequenceKindFinish_Finished2Start()
  {
    return (EAttribute)workSequenceKindFinishEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkSequenceKindFinish_Finished2Finish()
  {
    return (EAttribute)workSequenceKindFinishEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuidance()
  {
    return guidanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGuidance_Text()
  {
    return (EAttribute)guidanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDL2Factory getPDL2Factory()
  {
    return (PDL2Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    processEClass = createEClass(PROCESS);
    createEAttribute(processEClass, PROCESS__NAME);
    createEReference(processEClass, PROCESS__PROCESS_ELEMENTS);

    processElementEClass = createEClass(PROCESS_ELEMENT);

    workDefinitionEClass = createEClass(WORK_DEFINITION);
    createEAttribute(workDefinitionEClass, WORK_DEFINITION__NAME);
    createEReference(workDefinitionEClass, WORK_DEFINITION__LINKS_TO_PREDECESSORS);
    createEReference(workDefinitionEClass, WORK_DEFINITION__LINKS_TO_SUCCESSORS);

    dependanceStartEClass = createEClass(DEPENDANCE_START);
    createEReference(dependanceStartEClass, DEPENDANCE_START__PREDECESSOR);
    createEReference(dependanceStartEClass, DEPENDANCE_START__LINK);

    workSequenceKindStartEClass = createEClass(WORK_SEQUENCE_KIND_START);
    createEAttribute(workSequenceKindStartEClass, WORK_SEQUENCE_KIND_START__STARTED2_START);
    createEAttribute(workSequenceKindStartEClass, WORK_SEQUENCE_KIND_START__STARTED2_FINISH);

    dependanceFinishEClass = createEClass(DEPENDANCE_FINISH);
    createEReference(dependanceFinishEClass, DEPENDANCE_FINISH__PREDECESSOR);
    createEReference(dependanceFinishEClass, DEPENDANCE_FINISH__LINK);

    workSequenceKindFinishEClass = createEClass(WORK_SEQUENCE_KIND_FINISH);
    createEAttribute(workSequenceKindFinishEClass, WORK_SEQUENCE_KIND_FINISH__FINISHED2_START);
    createEAttribute(workSequenceKindFinishEClass, WORK_SEQUENCE_KIND_FINISH__FINISHED2_FINISH);

    guidanceEClass = createEClass(GUIDANCE);
    createEAttribute(guidanceEClass, GUIDANCE__TEXT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    workDefinitionEClass.getESuperTypes().add(this.getProcessElement());
    guidanceEClass.getESuperTypes().add(this.getProcessElement());

    // Initialize classes and features; add operations and parameters
    initEClass(processEClass, fr.enseeiht.pDL2.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, fr.enseeiht.pDL2.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcess_ProcessElements(), this.getProcessElement(), null, "processElements", null, 0, -1, fr.enseeiht.pDL2.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processElementEClass, ProcessElement.class, "ProcessElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(workDefinitionEClass, WorkDefinition.class, "WorkDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkDefinition_LinksToPredecessors(), this.getDependanceStart(), null, "linksToPredecessors", null, 0, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkDefinition_LinksToSuccessors(), this.getDependanceFinish(), null, "linksToSuccessors", null, 0, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependanceStartEClass, DependanceStart.class, "DependanceStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependanceStart_Predecessor(), this.getWorkDefinition(), null, "predecessor", null, 0, 1, DependanceStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependanceStart_Link(), this.getWorkSequenceKindStart(), null, "link", null, 0, 1, DependanceStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workSequenceKindStartEClass, WorkSequenceKindStart.class, "WorkSequenceKindStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkSequenceKindStart_Started2Start(), ecorePackage.getEString(), "Started2Start", null, 0, 1, WorkSequenceKindStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkSequenceKindStart_Started2Finish(), ecorePackage.getEString(), "Started2Finish", null, 0, 1, WorkSequenceKindStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependanceFinishEClass, DependanceFinish.class, "DependanceFinish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependanceFinish_Predecessor(), this.getWorkDefinition(), null, "predecessor", null, 0, 1, DependanceFinish.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependanceFinish_Link(), this.getWorkSequenceKindFinish(), null, "link", null, 0, 1, DependanceFinish.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workSequenceKindFinishEClass, WorkSequenceKindFinish.class, "WorkSequenceKindFinish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkSequenceKindFinish_Finished2Start(), ecorePackage.getEString(), "Finished2Start", null, 0, 1, WorkSequenceKindFinish.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkSequenceKindFinish_Finished2Finish(), ecorePackage.getEString(), "Finished2Finish", null, 0, 1, WorkSequenceKindFinish.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guidanceEClass, Guidance.class, "Guidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGuidance_Text(), ecorePackage.getEString(), "text", null, 0, 1, Guidance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PDL2PackageImpl
