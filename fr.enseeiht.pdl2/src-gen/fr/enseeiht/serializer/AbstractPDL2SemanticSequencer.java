package fr.enseeiht.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.enseeiht.pDL2.DependanceFinish;
import fr.enseeiht.pDL2.DependanceStart;
import fr.enseeiht.pDL2.Guidance;
import fr.enseeiht.pDL2.PDL2Package;
import fr.enseeiht.pDL2.WorkDefinition;
import fr.enseeiht.pDL2.WorkSequenceKindFinish;
import fr.enseeiht.pDL2.WorkSequenceKindStart;
import fr.enseeiht.services.PDL2GrammarAccess;
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
public class AbstractPDL2SemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected PDL2GrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == PDL2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PDL2Package.DEPENDANCE_FINISH:
				if(context == grammarAccess.getDependanceFinishRule()) {
					sequence_DependanceFinish(context, (DependanceFinish) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.DEPENDANCE_START:
				if(context == grammarAccess.getDependanceStartRule()) {
					sequence_DependanceStart(context, (DependanceStart) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.GUIDANCE:
				if(context == grammarAccess.getGuidanceRule() ||
				   context == grammarAccess.getProcessElementRule()) {
					sequence_Guidance(context, (Guidance) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (fr.enseeiht.pDL2.Process) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.WORK_DEFINITION:
				if(context == grammarAccess.getProcessElementRule() ||
				   context == grammarAccess.getWorkDefinitionRule()) {
					sequence_WorkDefinition(context, (WorkDefinition) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.WORK_SEQUENCE_KIND_FINISH:
				if(context == grammarAccess.getWorkSequenceKindFinishRule()) {
					sequence_WorkSequenceKindFinish(context, (WorkSequenceKindFinish) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.WORK_SEQUENCE_KIND_START:
				if(context == grammarAccess.getWorkSequenceKindStartRule()) {
					sequence_WorkSequenceKindStart(context, (WorkSequenceKindStart) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (predecessor=[WorkDefinition|ID] link=WorkSequenceKindFinish)
	 *
	 * Features:
	 *    predecessor[1, 1]
	 *    link[1, 1]
	 */
	protected void sequence_DependanceFinish(EObject context, DependanceFinish semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__PREDECESSOR));
			if(transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__LINK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1(), semanticObject.getPredecessor());
		feeder.accept(grammarAccess.getDependanceFinishAccess().getLinkWorkSequenceKindFinishParserRuleCall_1_0(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (predecessor=[WorkDefinition|ID] link=WorkSequenceKindStart)
	 *
	 * Features:
	 *    predecessor[1, 1]
	 *    link[1, 1]
	 */
	protected void sequence_DependanceStart(EObject context, DependanceStart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_START__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_START__PREDECESSOR));
			if(transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_START__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_START__LINK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1(), semanticObject.getPredecessor());
		feeder.accept(grammarAccess.getDependanceStartAccess().getLinkWorkSequenceKindStartParserRuleCall_1_0(), semanticObject.getLink());
		feeder.finish();
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
			if(transientValues.isValueTransient(semanticObject, PDL2Package.Literals.GUIDANCE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.GUIDANCE__TEXT));
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
	protected void sequence_Process(EObject context, fr.enseeiht.pDL2.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID linksToPredecessors+=DependanceStart* linksToSuccessors+=DependanceFinish*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    linksToPredecessors[0, *]
	 *    linksToSuccessors[0, *]
	 */
	protected void sequence_WorkDefinition(EObject context, WorkDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Finished2Start='started' | Finished2Finish='finished')
	 *
	 * Features:
	 *    Finished2Start[0, 1]
	 *         EXCLUDE_IF_SET Finished2Finish
	 *    Finished2Finish[0, 1]
	 *         EXCLUDE_IF_SET Finished2Start
	 */
	protected void sequence_WorkSequenceKindFinish(EObject context, WorkSequenceKindFinish semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Started2Start='started' | Started2Finish='finished')
	 *
	 * Features:
	 *    Started2Start[0, 1]
	 *         EXCLUDE_IF_SET Started2Finish
	 *    Started2Finish[0, 1]
	 *         EXCLUDE_IF_SET Started2Start
	 */
	protected void sequence_WorkSequenceKindStart(EObject context, WorkSequenceKindStart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
