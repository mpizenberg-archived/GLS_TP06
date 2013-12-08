/*
* generated by Xtext
*/
grammar InternalPDL2;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package fr.enseeiht.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.enseeiht.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.enseeiht.services.PDL2GrammarAccess;

}

@parser::members {
 
 	private PDL2GrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PDL2GrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleProcess
entryRuleProcess 
:
{ before(grammarAccess.getProcessRule()); }
	 ruleProcess
{ after(grammarAccess.getProcessRule()); } 
	 EOF 
;

// Rule Process
ruleProcess
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getProcessAccess().getGroup()); }
(rule__Process__Group__0)
{ after(grammarAccess.getProcessAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProcessElement
entryRuleProcessElement 
:
{ before(grammarAccess.getProcessElementRule()); }
	 ruleProcessElement
{ after(grammarAccess.getProcessElementRule()); } 
	 EOF 
;

// Rule ProcessElement
ruleProcessElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getProcessElementAccess().getAlternatives()); }
(rule__ProcessElement__Alternatives)
{ after(grammarAccess.getProcessElementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleWorkDefinition
entryRuleWorkDefinition 
:
{ before(grammarAccess.getWorkDefinitionRule()); }
	 ruleWorkDefinition
{ after(grammarAccess.getWorkDefinitionRule()); } 
	 EOF 
;

// Rule WorkDefinition
ruleWorkDefinition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getWorkDefinitionAccess().getGroup()); }
(rule__WorkDefinition__Group__0)
{ after(grammarAccess.getWorkDefinitionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDependanceStart
entryRuleDependanceStart 
:
{ before(grammarAccess.getDependanceStartRule()); }
	 ruleDependanceStart
{ after(grammarAccess.getDependanceStartRule()); } 
	 EOF 
;

// Rule DependanceStart
ruleDependanceStart
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDependanceStartAccess().getGroup()); }
(rule__DependanceStart__Group__0)
{ after(grammarAccess.getDependanceStartAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleWorkSequenceKindStart
entryRuleWorkSequenceKindStart 
:
{ before(grammarAccess.getWorkSequenceKindStartRule()); }
	 ruleWorkSequenceKindStart
{ after(grammarAccess.getWorkSequenceKindStartRule()); } 
	 EOF 
;

// Rule WorkSequenceKindStart
ruleWorkSequenceKindStart
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getWorkSequenceKindStartAccess().getAlternatives()); }
(rule__WorkSequenceKindStart__Alternatives)
{ after(grammarAccess.getWorkSequenceKindStartAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDependanceFinish
entryRuleDependanceFinish 
:
{ before(grammarAccess.getDependanceFinishRule()); }
	 ruleDependanceFinish
{ after(grammarAccess.getDependanceFinishRule()); } 
	 EOF 
;

// Rule DependanceFinish
ruleDependanceFinish
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDependanceFinishAccess().getGroup()); }
(rule__DependanceFinish__Group__0)
{ after(grammarAccess.getDependanceFinishAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleWorkSequenceKindFinish
entryRuleWorkSequenceKindFinish 
:
{ before(grammarAccess.getWorkSequenceKindFinishRule()); }
	 ruleWorkSequenceKindFinish
{ after(grammarAccess.getWorkSequenceKindFinishRule()); } 
	 EOF 
;

// Rule WorkSequenceKindFinish
ruleWorkSequenceKindFinish
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getWorkSequenceKindFinishAccess().getAlternatives()); }
(rule__WorkSequenceKindFinish__Alternatives)
{ after(grammarAccess.getWorkSequenceKindFinishAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleGuidance
entryRuleGuidance 
:
{ before(grammarAccess.getGuidanceRule()); }
	 ruleGuidance
{ after(grammarAccess.getGuidanceRule()); } 
	 EOF 
;

// Rule Guidance
ruleGuidance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGuidanceAccess().getTextAssignment()); }
(rule__Guidance__TextAssignment)
{ after(grammarAccess.getGuidanceAccess().getTextAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__ProcessElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); }
	ruleWorkDefinition
{ after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_1()); }
	ruleGuidance
{ after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequenceKindStart__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartAssignment_0()); }
(rule__WorkSequenceKindStart__Started2StartAssignment_0)
{ after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartAssignment_0()); }
)

    |(
{ before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishAssignment_1()); }
(rule__WorkSequenceKindStart__Started2FinishAssignment_1)
{ after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequenceKindFinish__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartAssignment_0()); }
(rule__WorkSequenceKindFinish__Finished2StartAssignment_0)
{ after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartAssignment_0()); }
)

    |(
{ before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishAssignment_1()); }
(rule__WorkSequenceKindFinish__Finished2FinishAssignment_1)
{ after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Process__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Process__Group__0__Impl
	rule__Process__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcessAccess().getProcessKeyword_0()); }

	'process' 

{ after(grammarAccess.getProcessAccess().getProcessKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Process__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Process__Group__1__Impl
	rule__Process__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcessAccess().getNameAssignment_1()); }
(rule__Process__NameAssignment_1)
{ after(grammarAccess.getProcessAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Process__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Process__Group__2__Impl
	rule__Process__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Process__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Process__Group__3__Impl
	rule__Process__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); }
(rule__Process__ProcessElementsAssignment_3)*
{ after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Process__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Process__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__WorkDefinition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group__0__Impl
	rule__WorkDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); }

	'wd' 

{ after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group__1__Impl
	rule__WorkDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); }
(rule__WorkDefinition__NameAssignment_1)
{ after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group__2__Impl
	rule__WorkDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group__3__Impl
	rule__WorkDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getGroup_3()); }
(rule__WorkDefinition__Group_3__0)?
{ after(grammarAccess.getWorkDefinitionAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group__4__Impl
	rule__WorkDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getGroup_4()); }
(rule__WorkDefinition__Group_4__0)?
{ after(grammarAccess.getWorkDefinitionAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__WorkDefinition__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group_3__0__Impl
	rule__WorkDefinition__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getStartsKeyword_3_0()); }

	'starts' 

{ after(grammarAccess.getWorkDefinitionAccess().getStartsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group_3__1__Impl
	rule__WorkDefinition__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getIfKeyword_3_1()); }

	'if' 

{ after(grammarAccess.getWorkDefinitionAccess().getIfKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_3_2()); }
(rule__WorkDefinition__LinksToPredecessorsAssignment_3_2)
{ after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_3_2()); }
)
(
{ before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_3_2()); }
(rule__WorkDefinition__LinksToPredecessorsAssignment_3_2)*
{ after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_3_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}








rule__WorkDefinition__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group_4__0__Impl
	rule__WorkDefinition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getFinishesKeyword_4_0()); }

	'finishes' 

{ after(grammarAccess.getWorkDefinitionAccess().getFinishesKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group_4__1__Impl
	rule__WorkDefinition__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getIfKeyword_4_1()); }

	'if' 

{ after(grammarAccess.getWorkDefinitionAccess().getIfKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkDefinition__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_4_2()); }
(rule__WorkDefinition__LinksToSuccessorsAssignment_4_2)
{ after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_4_2()); }
)
(
{ before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_4_2()); }
(rule__WorkDefinition__LinksToSuccessorsAssignment_4_2)*
{ after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_4_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}








rule__DependanceStart__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DependanceStart__Group__0__Impl
	rule__DependanceStart__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DependanceStart__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependanceStartAccess().getPredecessorAssignment_0()); }
(rule__DependanceStart__PredecessorAssignment_0)
{ after(grammarAccess.getDependanceStartAccess().getPredecessorAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DependanceStart__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DependanceStart__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DependanceStart__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependanceStartAccess().getLinkAssignment_1()); }
(rule__DependanceStart__LinkAssignment_1)
{ after(grammarAccess.getDependanceStartAccess().getLinkAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DependanceFinish__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DependanceFinish__Group__0__Impl
	rule__DependanceFinish__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DependanceFinish__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependanceFinishAccess().getPredecessorAssignment_0()); }
(rule__DependanceFinish__PredecessorAssignment_0)
{ after(grammarAccess.getDependanceFinishAccess().getPredecessorAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DependanceFinish__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DependanceFinish__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DependanceFinish__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependanceFinishAccess().getLinkAssignment_1()); }
(rule__DependanceFinish__LinkAssignment_1)
{ after(grammarAccess.getDependanceFinishAccess().getLinkAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Process__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Process__ProcessElementsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); }
	ruleProcessElement{ after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__LinksToPredecessorsAssignment_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsDependanceStartParserRuleCall_3_2_0()); }
	ruleDependanceStart{ after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsDependanceStartParserRuleCall_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__LinksToSuccessorsAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsDependanceFinishParserRuleCall_4_2_0()); }
	ruleDependanceFinish{ after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsDependanceFinishParserRuleCall_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DependanceStart__PredecessorAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionCrossReference_0_0()); }
(
{ before(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DependanceStart__LinkAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependanceStartAccess().getLinkWorkSequenceKindStartParserRuleCall_1_0()); }
	ruleWorkSequenceKindStart{ after(grammarAccess.getDependanceStartAccess().getLinkWorkSequenceKindStartParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequenceKindStart__Started2StartAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0()); }
(
{ before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0()); }

	'started' 

{ after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0()); }
)

{ after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequenceKindStart__Started2FinishAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0()); }
(
{ before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0()); }

	'finished' 

{ after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0()); }
)

{ after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DependanceFinish__PredecessorAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionCrossReference_0_0()); }
(
{ before(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DependanceFinish__LinkAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependanceFinishAccess().getLinkWorkSequenceKindFinishParserRuleCall_1_0()); }
	ruleWorkSequenceKindFinish{ after(grammarAccess.getDependanceFinishAccess().getLinkWorkSequenceKindFinishParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequenceKindFinish__Finished2StartAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0()); }
(
{ before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0()); }

	'started' 

{ after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0()); }
)

{ after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequenceKindFinish__Finished2FinishAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0()); }
(
{ before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0()); }

	'finished' 

{ after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0()); }
)

{ after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__TextAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0()); }
	RULE_STRING{ after(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


