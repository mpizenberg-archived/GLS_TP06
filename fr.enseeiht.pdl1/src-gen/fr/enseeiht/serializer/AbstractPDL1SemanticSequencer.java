package fr.enseeiht.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.enseeiht.pDL1.Guidance;
import fr.enseeiht.pDL1.PDL1Package;
import fr.enseeiht.pDL1.WorkDefinition;
import fr.enseeiht.pDL1.WorkSequence;
import fr.enseeiht.services.PDL1GrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractPDL1SemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected PDL1GrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PDL1Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PDL1Package.GUIDANCE:
				if(context == grammarAccess.getGuidanceRule() ||
				   context == grammarAccess.getProcessElementRule()) {
					sequence_Guidance(context, (Guidance) semanticObject); 
					return; 
				}
				else break;
			case PDL1Package.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (fr.enseeiht.pDL1.Process) semanticObject); 
					return; 
				}
				else break;
			case PDL1Package.WORK_DEFINITION:
				if(context == grammarAccess.getProcessElementRule() ||
				   context == grammarAccess.getWorkDefinitionRule()) {
					sequence_WorkDefinition(context, (WorkDefinition) semanticObject); 
					return; 
				}
				else break;
			case PDL1Package.WORK_SEQUENCE:
				if(context == grammarAccess.getProcessElementRule() ||
				   context == grammarAccess.getWorkSequenceRule()) {
					sequence_WorkSequence(context, (WorkSequence) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     text=STRING
	 *
	 * Features:
	 *    text[1, 1]
	 */
	protected void sequence_Guidance(EObject context, Guidance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDL1Package.Literals.GUIDANCE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL1Package.Literals.GUIDANCE__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID processElements+=ProcessElement*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    processElements[0, *]
	 */
	protected void sequence_Process(EObject context, fr.enseeiht.pDL1.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_WorkDefinition(EObject context, WorkDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDL1Package.Literals.WORK_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL1Package.Literals.WORK_DEFINITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (linkType=WorkSequenceType predecessor=[WorkDefinition|ID] successor=[WorkDefinition|ID])
	 *
	 * Features:
	 *    linkType[1, 1]
	 *    predecessor[1, 1]
	 *    successor[1, 1]
	 */
	protected void sequence_WorkSequence(EObject context, WorkSequence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__LINK_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__LINK_TYPE));
			if(transientValues.isValueTransient(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__PREDECESSOR));
			if(transientValues.isValueTransient(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__SUCCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__SUCCESSOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0(), semanticObject.getLinkType());
		feeder.accept(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.getPredecessor());
		feeder.accept(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1(), semanticObject.getSuccessor());
		feeder.finish();
	}
}
