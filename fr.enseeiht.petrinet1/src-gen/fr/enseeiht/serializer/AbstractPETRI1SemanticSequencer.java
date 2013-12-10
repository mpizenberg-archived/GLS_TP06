package fr.enseeiht.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.enseeiht.pETRI1.Arc;
import fr.enseeiht.pETRI1.PETRI1Package;
import fr.enseeiht.pETRI1.PetriNet;
import fr.enseeiht.pETRI1.Place;
import fr.enseeiht.pETRI1.Transition;
import fr.enseeiht.services.PETRI1GrammarAccess;
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
public class AbstractPETRI1SemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected PETRI1GrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == PETRI1Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PETRI1Package.ARC:
				if(context == grammarAccess.getArcRule() ||
				   context == grammarAccess.getPetriNetElementRule()) {
					sequence_Arc(context, (Arc) semanticObject); 
					return; 
				}
				else break;
			case PETRI1Package.PETRI_NET:
				if(context == grammarAccess.getPetriNetRule()) {
					sequence_PetriNet(context, (PetriNet) semanticObject); 
					return; 
				}
				else break;
			case PETRI1Package.PLACE:
				if(context == grammarAccess.getNodeRule() ||
				   context == grammarAccess.getPetriNetElementRule() ||
				   context == grammarAccess.getPlaceRule()) {
					sequence_Place(context, (Place) semanticObject); 
					return; 
				}
				else break;
			case PETRI1Package.TRANSITION:
				if(context == grammarAccess.getNodeRule() ||
				   context == grammarAccess.getPetriNetElementRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (multiplicity=INT? readOnly?='r'? predecessor=[Node|ID] successor=[Node|ID])
	 *
	 * Features:
	 *    multiplicity[0, 1]
	 *    readOnly[0, 1]
	 *    predecessor[1, 1]
	 *    successor[1, 1]
	 */
	protected void sequence_Arc(EObject context, Arc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID petriNetElements+=PetriNetElement*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    petriNetElements[0, *]
	 */
	protected void sequence_PetriNet(EObject context, PetriNet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID marking=INT?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    marking[0, 1]
	 */
	protected void sequence_Place(EObject context, Place semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PETRI1Package.Literals.NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PETRI1Package.Literals.NODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
