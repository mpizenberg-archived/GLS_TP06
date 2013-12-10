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
import fr.enseeiht.services.PETRI1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPETRI1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'petrinet'", "'{'", "'}'", "'place'", "'('", "')'", "'transition'", "'arc'", "'from'", "'to'", "'r'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPETRI1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPETRI1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPETRI1Parser.tokenNames; }
    public String getGrammarFileName() { return "../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g"; }


     
     	private PETRI1GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PETRI1GrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulePetriNet"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:60:1: entryRulePetriNet : rulePetriNet EOF ;
    public final void entryRulePetriNet() throws RecognitionException {
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:61:1: ( rulePetriNet EOF )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:62:1: rulePetriNet EOF
            {
             before(grammarAccess.getPetriNetRule()); 
            pushFollow(FOLLOW_rulePetriNet_in_entryRulePetriNet61);
            rulePetriNet();

            state._fsp--;

             after(grammarAccess.getPetriNetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePetriNet68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePetriNet"


    // $ANTLR start "rulePetriNet"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:69:1: rulePetriNet : ( ( rule__PetriNet__Group__0 ) ) ;
    public final void rulePetriNet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:73:2: ( ( ( rule__PetriNet__Group__0 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:74:1: ( ( rule__PetriNet__Group__0 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:74:1: ( ( rule__PetriNet__Group__0 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:75:1: ( rule__PetriNet__Group__0 )
            {
             before(grammarAccess.getPetriNetAccess().getGroup()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:76:1: ( rule__PetriNet__Group__0 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:76:2: rule__PetriNet__Group__0
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__0_in_rulePetriNet94);
            rule__PetriNet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePetriNet"


    // $ANTLR start "entryRulePetriNetElement"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:88:1: entryRulePetriNetElement : rulePetriNetElement EOF ;
    public final void entryRulePetriNetElement() throws RecognitionException {
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:89:1: ( rulePetriNetElement EOF )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:90:1: rulePetriNetElement EOF
            {
             before(grammarAccess.getPetriNetElementRule()); 
            pushFollow(FOLLOW_rulePetriNetElement_in_entryRulePetriNetElement121);
            rulePetriNetElement();

            state._fsp--;

             after(grammarAccess.getPetriNetElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePetriNetElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePetriNetElement"


    // $ANTLR start "rulePetriNetElement"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:97:1: rulePetriNetElement : ( ( rule__PetriNetElement__Alternatives ) ) ;
    public final void rulePetriNetElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:101:2: ( ( ( rule__PetriNetElement__Alternatives ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:102:1: ( ( rule__PetriNetElement__Alternatives ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:102:1: ( ( rule__PetriNetElement__Alternatives ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:103:1: ( rule__PetriNetElement__Alternatives )
            {
             before(grammarAccess.getPetriNetElementAccess().getAlternatives()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:104:1: ( rule__PetriNetElement__Alternatives )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:104:2: rule__PetriNetElement__Alternatives
            {
            pushFollow(FOLLOW_rule__PetriNetElement__Alternatives_in_rulePetriNetElement154);
            rule__PetriNetElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePetriNetElement"


    // $ANTLR start "entryRuleNode"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:116:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:117:1: ( ruleNode EOF )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:118:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode181);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:125:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:129:2: ( ( ( rule__Node__Alternatives ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:130:1: ( ( rule__Node__Alternatives ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:130:1: ( ( rule__Node__Alternatives ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:131:1: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:132:1: ( rule__Node__Alternatives )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:132:2: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_in_ruleNode214);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRulePlace"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:144:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:145:1: ( rulePlace EOF )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:146:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_rulePlace_in_entryRulePlace241);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlace248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:153:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:157:2: ( ( ( rule__Place__Group__0 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:158:1: ( ( rule__Place__Group__0 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:158:1: ( ( rule__Place__Group__0 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:159:1: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:160:1: ( rule__Place__Group__0 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:160:2: rule__Place__Group__0
            {
            pushFollow(FOLLOW_rule__Place__Group__0_in_rulePlace274);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleTransition"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:172:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:173:1: ( ruleTransition EOF )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:174:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition301);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:181:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:185:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:186:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:186:1: ( ( rule__Transition__Group__0 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:187:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:188:1: ( rule__Transition__Group__0 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:188:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition334);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleArc"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:200:1: entryRuleArc : ruleArc EOF ;
    public final void entryRuleArc() throws RecognitionException {
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:201:1: ( ruleArc EOF )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:202:1: ruleArc EOF
            {
             before(grammarAccess.getArcRule()); 
            pushFollow(FOLLOW_ruleArc_in_entryRuleArc361);
            ruleArc();

            state._fsp--;

             after(grammarAccess.getArcRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArc368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArc"


    // $ANTLR start "ruleArc"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:209:1: ruleArc : ( ( rule__Arc__Group__0 ) ) ;
    public final void ruleArc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:213:2: ( ( ( rule__Arc__Group__0 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:214:1: ( ( rule__Arc__Group__0 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:214:1: ( ( rule__Arc__Group__0 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:215:1: ( rule__Arc__Group__0 )
            {
             before(grammarAccess.getArcAccess().getGroup()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:216:1: ( rule__Arc__Group__0 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:216:2: rule__Arc__Group__0
            {
            pushFollow(FOLLOW_rule__Arc__Group__0_in_ruleArc394);
            rule__Arc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArc"


    // $ANTLR start "rule__PetriNetElement__Alternatives"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:228:1: rule__PetriNetElement__Alternatives : ( ( ruleNode ) | ( ruleArc ) );
    public final void rule__PetriNetElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:232:1: ( ( ruleNode ) | ( ruleArc ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14||LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:233:1: ( ruleNode )
                    {
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:233:1: ( ruleNode )
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:234:1: ruleNode
                    {
                     before(grammarAccess.getPetriNetElementAccess().getNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNode_in_rule__PetriNetElement__Alternatives430);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getPetriNetElementAccess().getNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:239:6: ( ruleArc )
                    {
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:239:6: ( ruleArc )
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:240:1: ruleArc
                    {
                     before(grammarAccess.getPetriNetElementAccess().getArcParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArc_in_rule__PetriNetElement__Alternatives447);
                    ruleArc();

                    state._fsp--;

                     after(grammarAccess.getPetriNetElementAccess().getArcParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNetElement__Alternatives"


    // $ANTLR start "rule__Node__Alternatives"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:250:1: rule__Node__Alternatives : ( ( rulePlace ) | ( ruleTransition ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:254:1: ( ( rulePlace ) | ( ruleTransition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:255:1: ( rulePlace )
                    {
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:255:1: ( rulePlace )
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:256:1: rulePlace
                    {
                     before(grammarAccess.getNodeAccess().getPlaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePlace_in_rule__Node__Alternatives479);
                    rulePlace();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getPlaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:261:6: ( ruleTransition )
                    {
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:261:6: ( ruleTransition )
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:262:1: ruleTransition
                    {
                     before(grammarAccess.getNodeAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTransition_in_rule__Node__Alternatives496);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getTransitionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__PetriNet__Group__0"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:274:1: rule__PetriNet__Group__0 : rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1 ;
    public final void rule__PetriNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:278:1: ( rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:279:2: rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__0__Impl_in_rule__PetriNet__Group__0526);
            rule__PetriNet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__1_in_rule__PetriNet__Group__0529);
            rule__PetriNet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__0"


    // $ANTLR start "rule__PetriNet__Group__0__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:286:1: rule__PetriNet__Group__0__Impl : ( 'petrinet' ) ;
    public final void rule__PetriNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:290:1: ( ( 'petrinet' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:291:1: ( 'petrinet' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:291:1: ( 'petrinet' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:292:1: 'petrinet'
            {
             before(grammarAccess.getPetriNetAccess().getPetrinetKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__PetriNet__Group__0__Impl557); 
             after(grammarAccess.getPetriNetAccess().getPetrinetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__0__Impl"


    // $ANTLR start "rule__PetriNet__Group__1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:305:1: rule__PetriNet__Group__1 : rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2 ;
    public final void rule__PetriNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:309:1: ( rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:310:2: rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__1__Impl_in_rule__PetriNet__Group__1588);
            rule__PetriNet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__2_in_rule__PetriNet__Group__1591);
            rule__PetriNet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__1"


    // $ANTLR start "rule__PetriNet__Group__1__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:317:1: rule__PetriNet__Group__1__Impl : ( ( rule__PetriNet__NameAssignment_1 ) ) ;
    public final void rule__PetriNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:321:1: ( ( ( rule__PetriNet__NameAssignment_1 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:322:1: ( ( rule__PetriNet__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:322:1: ( ( rule__PetriNet__NameAssignment_1 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:323:1: ( rule__PetriNet__NameAssignment_1 )
            {
             before(grammarAccess.getPetriNetAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:324:1: ( rule__PetriNet__NameAssignment_1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:324:2: rule__PetriNet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PetriNet__NameAssignment_1_in_rule__PetriNet__Group__1__Impl618);
            rule__PetriNet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__1__Impl"


    // $ANTLR start "rule__PetriNet__Group__2"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:334:1: rule__PetriNet__Group__2 : rule__PetriNet__Group__2__Impl rule__PetriNet__Group__3 ;
    public final void rule__PetriNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:338:1: ( rule__PetriNet__Group__2__Impl rule__PetriNet__Group__3 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:339:2: rule__PetriNet__Group__2__Impl rule__PetriNet__Group__3
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__2__Impl_in_rule__PetriNet__Group__2648);
            rule__PetriNet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__3_in_rule__PetriNet__Group__2651);
            rule__PetriNet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__2"


    // $ANTLR start "rule__PetriNet__Group__2__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:346:1: rule__PetriNet__Group__2__Impl : ( '{' ) ;
    public final void rule__PetriNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:350:1: ( ( '{' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:351:1: ( '{' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:351:1: ( '{' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:352:1: '{'
            {
             before(grammarAccess.getPetriNetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__PetriNet__Group__2__Impl679); 
             after(grammarAccess.getPetriNetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__2__Impl"


    // $ANTLR start "rule__PetriNet__Group__3"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:365:1: rule__PetriNet__Group__3 : rule__PetriNet__Group__3__Impl rule__PetriNet__Group__4 ;
    public final void rule__PetriNet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:369:1: ( rule__PetriNet__Group__3__Impl rule__PetriNet__Group__4 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:370:2: rule__PetriNet__Group__3__Impl rule__PetriNet__Group__4
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__3__Impl_in_rule__PetriNet__Group__3710);
            rule__PetriNet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__4_in_rule__PetriNet__Group__3713);
            rule__PetriNet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__3"


    // $ANTLR start "rule__PetriNet__Group__3__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:377:1: rule__PetriNet__Group__3__Impl : ( ( rule__PetriNet__PetriNetElementsAssignment_3 )* ) ;
    public final void rule__PetriNet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:381:1: ( ( ( rule__PetriNet__PetriNetElementsAssignment_3 )* ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:382:1: ( ( rule__PetriNet__PetriNetElementsAssignment_3 )* )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:382:1: ( ( rule__PetriNet__PetriNetElementsAssignment_3 )* )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:383:1: ( rule__PetriNet__PetriNetElementsAssignment_3 )*
            {
             before(grammarAccess.getPetriNetAccess().getPetriNetElementsAssignment_3()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:384:1: ( rule__PetriNet__PetriNetElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||(LA3_0>=17 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:384:2: rule__PetriNet__PetriNetElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PetriNet__PetriNetElementsAssignment_3_in_rule__PetriNet__Group__3__Impl740);
            	    rule__PetriNet__PetriNetElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPetriNetAccess().getPetriNetElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__3__Impl"


    // $ANTLR start "rule__PetriNet__Group__4"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:394:1: rule__PetriNet__Group__4 : rule__PetriNet__Group__4__Impl ;
    public final void rule__PetriNet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:398:1: ( rule__PetriNet__Group__4__Impl )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:399:2: rule__PetriNet__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__4__Impl_in_rule__PetriNet__Group__4771);
            rule__PetriNet__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__4"


    // $ANTLR start "rule__PetriNet__Group__4__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:405:1: rule__PetriNet__Group__4__Impl : ( '}' ) ;
    public final void rule__PetriNet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:409:1: ( ( '}' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:410:1: ( '}' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:410:1: ( '}' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:411:1: '}'
            {
             before(grammarAccess.getPetriNetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__PetriNet__Group__4__Impl799); 
             after(grammarAccess.getPetriNetAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__4__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:434:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:438:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:439:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FOLLOW_rule__Place__Group__0__Impl_in_rule__Place__Group__0840);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__1_in_rule__Place__Group__0843);
            rule__Place__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:446:1: rule__Place__Group__0__Impl : ( 'place' ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:450:1: ( ( 'place' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:451:1: ( 'place' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:451:1: ( 'place' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:452:1: 'place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Place__Group__0__Impl871); 
             after(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:465:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:469:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:470:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FOLLOW_rule__Place__Group__1__Impl_in_rule__Place__Group__1902);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__2_in_rule__Place__Group__1905);
            rule__Place__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:477:1: rule__Place__Group__1__Impl : ( ( rule__Place__NameAssignment_1 ) ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:481:1: ( ( ( rule__Place__NameAssignment_1 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:482:1: ( ( rule__Place__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:482:1: ( ( rule__Place__NameAssignment_1 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:483:1: ( rule__Place__NameAssignment_1 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:484:1: ( rule__Place__NameAssignment_1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:484:2: rule__Place__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Place__NameAssignment_1_in_rule__Place__Group__1__Impl932);
            rule__Place__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:494:1: rule__Place__Group__2 : rule__Place__Group__2__Impl ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:498:1: ( rule__Place__Group__2__Impl )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:499:2: rule__Place__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Place__Group__2__Impl_in_rule__Place__Group__2962);
            rule__Place__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:505:1: rule__Place__Group__2__Impl : ( ( rule__Place__Group_2__0 )? ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:509:1: ( ( ( rule__Place__Group_2__0 )? ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:510:1: ( ( rule__Place__Group_2__0 )? )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:510:1: ( ( rule__Place__Group_2__0 )? )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:511:1: ( rule__Place__Group_2__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_2()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:512:1: ( rule__Place__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:512:2: rule__Place__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Place__Group_2__0_in_rule__Place__Group__2__Impl989);
                    rule__Place__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group_2__0"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:528:1: rule__Place__Group_2__0 : rule__Place__Group_2__0__Impl rule__Place__Group_2__1 ;
    public final void rule__Place__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:532:1: ( rule__Place__Group_2__0__Impl rule__Place__Group_2__1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:533:2: rule__Place__Group_2__0__Impl rule__Place__Group_2__1
            {
            pushFollow(FOLLOW_rule__Place__Group_2__0__Impl_in_rule__Place__Group_2__01026);
            rule__Place__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group_2__1_in_rule__Place__Group_2__01029);
            rule__Place__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__0"


    // $ANTLR start "rule__Place__Group_2__0__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:540:1: rule__Place__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Place__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:544:1: ( ( '(' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:545:1: ( '(' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:545:1: ( '(' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:546:1: '('
            {
             before(grammarAccess.getPlaceAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Place__Group_2__0__Impl1057); 
             after(grammarAccess.getPlaceAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__0__Impl"


    // $ANTLR start "rule__Place__Group_2__1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:559:1: rule__Place__Group_2__1 : rule__Place__Group_2__1__Impl rule__Place__Group_2__2 ;
    public final void rule__Place__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:563:1: ( rule__Place__Group_2__1__Impl rule__Place__Group_2__2 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:564:2: rule__Place__Group_2__1__Impl rule__Place__Group_2__2
            {
            pushFollow(FOLLOW_rule__Place__Group_2__1__Impl_in_rule__Place__Group_2__11088);
            rule__Place__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group_2__2_in_rule__Place__Group_2__11091);
            rule__Place__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__1"


    // $ANTLR start "rule__Place__Group_2__1__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:571:1: rule__Place__Group_2__1__Impl : ( ( rule__Place__MarkingAssignment_2_1 ) ) ;
    public final void rule__Place__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:575:1: ( ( ( rule__Place__MarkingAssignment_2_1 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:576:1: ( ( rule__Place__MarkingAssignment_2_1 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:576:1: ( ( rule__Place__MarkingAssignment_2_1 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:577:1: ( rule__Place__MarkingAssignment_2_1 )
            {
             before(grammarAccess.getPlaceAccess().getMarkingAssignment_2_1()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:578:1: ( rule__Place__MarkingAssignment_2_1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:578:2: rule__Place__MarkingAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Place__MarkingAssignment_2_1_in_rule__Place__Group_2__1__Impl1118);
            rule__Place__MarkingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getMarkingAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__1__Impl"


    // $ANTLR start "rule__Place__Group_2__2"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:588:1: rule__Place__Group_2__2 : rule__Place__Group_2__2__Impl ;
    public final void rule__Place__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:592:1: ( rule__Place__Group_2__2__Impl )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:593:2: rule__Place__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Place__Group_2__2__Impl_in_rule__Place__Group_2__21148);
            rule__Place__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__2"


    // $ANTLR start "rule__Place__Group_2__2__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:599:1: rule__Place__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Place__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:603:1: ( ( ')' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:604:1: ( ')' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:604:1: ( ')' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:605:1: ')'
            {
             before(grammarAccess.getPlaceAccess().getRightParenthesisKeyword_2_2()); 
            match(input,16,FOLLOW_16_in_rule__Place__Group_2__2__Impl1176); 
             after(grammarAccess.getPlaceAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:624:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:628:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:629:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01213);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01216);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:636:1: rule__Transition__Group__0__Impl : ( 'transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:640:1: ( ( 'transition' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:641:1: ( 'transition' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:641:1: ( 'transition' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:642:1: 'transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Transition__Group__0__Impl1244); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:655:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:659:1: ( rule__Transition__Group__1__Impl )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:660:2: rule__Transition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11275);
            rule__Transition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:666:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:670:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:671:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:671:1: ( ( rule__Transition__NameAssignment_1 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:672:1: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:673:1: ( rule__Transition__NameAssignment_1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:673:2: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__NameAssignment_1_in_rule__Transition__Group__1__Impl1302);
            rule__Transition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Arc__Group__0"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:687:1: rule__Arc__Group__0 : rule__Arc__Group__0__Impl rule__Arc__Group__1 ;
    public final void rule__Arc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:691:1: ( rule__Arc__Group__0__Impl rule__Arc__Group__1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:692:2: rule__Arc__Group__0__Impl rule__Arc__Group__1
            {
            pushFollow(FOLLOW_rule__Arc__Group__0__Impl_in_rule__Arc__Group__01336);
            rule__Arc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__1_in_rule__Arc__Group__01339);
            rule__Arc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__0"


    // $ANTLR start "rule__Arc__Group__0__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:699:1: rule__Arc__Group__0__Impl : ( 'arc' ) ;
    public final void rule__Arc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:703:1: ( ( 'arc' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:704:1: ( 'arc' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:704:1: ( 'arc' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:705:1: 'arc'
            {
             before(grammarAccess.getArcAccess().getArcKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Arc__Group__0__Impl1367); 
             after(grammarAccess.getArcAccess().getArcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__0__Impl"


    // $ANTLR start "rule__Arc__Group__1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:718:1: rule__Arc__Group__1 : rule__Arc__Group__1__Impl rule__Arc__Group__2 ;
    public final void rule__Arc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:722:1: ( rule__Arc__Group__1__Impl rule__Arc__Group__2 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:723:2: rule__Arc__Group__1__Impl rule__Arc__Group__2
            {
            pushFollow(FOLLOW_rule__Arc__Group__1__Impl_in_rule__Arc__Group__11398);
            rule__Arc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__2_in_rule__Arc__Group__11401);
            rule__Arc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__1"


    // $ANTLR start "rule__Arc__Group__1__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:730:1: rule__Arc__Group__1__Impl : ( ( rule__Arc__Group_1__0 )? ) ;
    public final void rule__Arc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:734:1: ( ( ( rule__Arc__Group_1__0 )? ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:735:1: ( ( rule__Arc__Group_1__0 )? )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:735:1: ( ( rule__Arc__Group_1__0 )? )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:736:1: ( rule__Arc__Group_1__0 )?
            {
             before(grammarAccess.getArcAccess().getGroup_1()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:737:1: ( rule__Arc__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:737:2: rule__Arc__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Arc__Group_1__0_in_rule__Arc__Group__1__Impl1428);
                    rule__Arc__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArcAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__1__Impl"


    // $ANTLR start "rule__Arc__Group__2"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:747:1: rule__Arc__Group__2 : rule__Arc__Group__2__Impl rule__Arc__Group__3 ;
    public final void rule__Arc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:751:1: ( rule__Arc__Group__2__Impl rule__Arc__Group__3 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:752:2: rule__Arc__Group__2__Impl rule__Arc__Group__3
            {
            pushFollow(FOLLOW_rule__Arc__Group__2__Impl_in_rule__Arc__Group__21459);
            rule__Arc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__3_in_rule__Arc__Group__21462);
            rule__Arc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__2"


    // $ANTLR start "rule__Arc__Group__2__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:759:1: rule__Arc__Group__2__Impl : ( ( rule__Arc__ReadOnlyAssignment_2 )? ) ;
    public final void rule__Arc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:763:1: ( ( ( rule__Arc__ReadOnlyAssignment_2 )? ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:764:1: ( ( rule__Arc__ReadOnlyAssignment_2 )? )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:764:1: ( ( rule__Arc__ReadOnlyAssignment_2 )? )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:765:1: ( rule__Arc__ReadOnlyAssignment_2 )?
            {
             before(grammarAccess.getArcAccess().getReadOnlyAssignment_2()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:766:1: ( rule__Arc__ReadOnlyAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:766:2: rule__Arc__ReadOnlyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Arc__ReadOnlyAssignment_2_in_rule__Arc__Group__2__Impl1489);
                    rule__Arc__ReadOnlyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArcAccess().getReadOnlyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__2__Impl"


    // $ANTLR start "rule__Arc__Group__3"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:776:1: rule__Arc__Group__3 : rule__Arc__Group__3__Impl rule__Arc__Group__4 ;
    public final void rule__Arc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:780:1: ( rule__Arc__Group__3__Impl rule__Arc__Group__4 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:781:2: rule__Arc__Group__3__Impl rule__Arc__Group__4
            {
            pushFollow(FOLLOW_rule__Arc__Group__3__Impl_in_rule__Arc__Group__31520);
            rule__Arc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__4_in_rule__Arc__Group__31523);
            rule__Arc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__3"


    // $ANTLR start "rule__Arc__Group__3__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:788:1: rule__Arc__Group__3__Impl : ( 'from' ) ;
    public final void rule__Arc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:792:1: ( ( 'from' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:793:1: ( 'from' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:793:1: ( 'from' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:794:1: 'from'
            {
             before(grammarAccess.getArcAccess().getFromKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Arc__Group__3__Impl1551); 
             after(grammarAccess.getArcAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__3__Impl"


    // $ANTLR start "rule__Arc__Group__4"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:807:1: rule__Arc__Group__4 : rule__Arc__Group__4__Impl rule__Arc__Group__5 ;
    public final void rule__Arc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:811:1: ( rule__Arc__Group__4__Impl rule__Arc__Group__5 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:812:2: rule__Arc__Group__4__Impl rule__Arc__Group__5
            {
            pushFollow(FOLLOW_rule__Arc__Group__4__Impl_in_rule__Arc__Group__41582);
            rule__Arc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__5_in_rule__Arc__Group__41585);
            rule__Arc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__4"


    // $ANTLR start "rule__Arc__Group__4__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:819:1: rule__Arc__Group__4__Impl : ( ( rule__Arc__PredecessorAssignment_4 ) ) ;
    public final void rule__Arc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:823:1: ( ( ( rule__Arc__PredecessorAssignment_4 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:824:1: ( ( rule__Arc__PredecessorAssignment_4 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:824:1: ( ( rule__Arc__PredecessorAssignment_4 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:825:1: ( rule__Arc__PredecessorAssignment_4 )
            {
             before(grammarAccess.getArcAccess().getPredecessorAssignment_4()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:826:1: ( rule__Arc__PredecessorAssignment_4 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:826:2: rule__Arc__PredecessorAssignment_4
            {
            pushFollow(FOLLOW_rule__Arc__PredecessorAssignment_4_in_rule__Arc__Group__4__Impl1612);
            rule__Arc__PredecessorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getPredecessorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__4__Impl"


    // $ANTLR start "rule__Arc__Group__5"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:836:1: rule__Arc__Group__5 : rule__Arc__Group__5__Impl rule__Arc__Group__6 ;
    public final void rule__Arc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:840:1: ( rule__Arc__Group__5__Impl rule__Arc__Group__6 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:841:2: rule__Arc__Group__5__Impl rule__Arc__Group__6
            {
            pushFollow(FOLLOW_rule__Arc__Group__5__Impl_in_rule__Arc__Group__51642);
            rule__Arc__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__6_in_rule__Arc__Group__51645);
            rule__Arc__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__5"


    // $ANTLR start "rule__Arc__Group__5__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:848:1: rule__Arc__Group__5__Impl : ( 'to' ) ;
    public final void rule__Arc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:852:1: ( ( 'to' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:853:1: ( 'to' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:853:1: ( 'to' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:854:1: 'to'
            {
             before(grammarAccess.getArcAccess().getToKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Arc__Group__5__Impl1673); 
             after(grammarAccess.getArcAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__5__Impl"


    // $ANTLR start "rule__Arc__Group__6"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:867:1: rule__Arc__Group__6 : rule__Arc__Group__6__Impl ;
    public final void rule__Arc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:871:1: ( rule__Arc__Group__6__Impl )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:872:2: rule__Arc__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Arc__Group__6__Impl_in_rule__Arc__Group__61704);
            rule__Arc__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__6"


    // $ANTLR start "rule__Arc__Group__6__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:878:1: rule__Arc__Group__6__Impl : ( ( rule__Arc__SuccessorAssignment_6 ) ) ;
    public final void rule__Arc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:882:1: ( ( ( rule__Arc__SuccessorAssignment_6 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:883:1: ( ( rule__Arc__SuccessorAssignment_6 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:883:1: ( ( rule__Arc__SuccessorAssignment_6 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:884:1: ( rule__Arc__SuccessorAssignment_6 )
            {
             before(grammarAccess.getArcAccess().getSuccessorAssignment_6()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:885:1: ( rule__Arc__SuccessorAssignment_6 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:885:2: rule__Arc__SuccessorAssignment_6
            {
            pushFollow(FOLLOW_rule__Arc__SuccessorAssignment_6_in_rule__Arc__Group__6__Impl1731);
            rule__Arc__SuccessorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getSuccessorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__6__Impl"


    // $ANTLR start "rule__Arc__Group_1__0"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:909:1: rule__Arc__Group_1__0 : rule__Arc__Group_1__0__Impl rule__Arc__Group_1__1 ;
    public final void rule__Arc__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:913:1: ( rule__Arc__Group_1__0__Impl rule__Arc__Group_1__1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:914:2: rule__Arc__Group_1__0__Impl rule__Arc__Group_1__1
            {
            pushFollow(FOLLOW_rule__Arc__Group_1__0__Impl_in_rule__Arc__Group_1__01775);
            rule__Arc__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group_1__1_in_rule__Arc__Group_1__01778);
            rule__Arc__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_1__0"


    // $ANTLR start "rule__Arc__Group_1__0__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:921:1: rule__Arc__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Arc__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:925:1: ( ( '(' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:926:1: ( '(' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:926:1: ( '(' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:927:1: '('
            {
             before(grammarAccess.getArcAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Arc__Group_1__0__Impl1806); 
             after(grammarAccess.getArcAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_1__0__Impl"


    // $ANTLR start "rule__Arc__Group_1__1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:940:1: rule__Arc__Group_1__1 : rule__Arc__Group_1__1__Impl rule__Arc__Group_1__2 ;
    public final void rule__Arc__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:944:1: ( rule__Arc__Group_1__1__Impl rule__Arc__Group_1__2 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:945:2: rule__Arc__Group_1__1__Impl rule__Arc__Group_1__2
            {
            pushFollow(FOLLOW_rule__Arc__Group_1__1__Impl_in_rule__Arc__Group_1__11837);
            rule__Arc__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group_1__2_in_rule__Arc__Group_1__11840);
            rule__Arc__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_1__1"


    // $ANTLR start "rule__Arc__Group_1__1__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:952:1: rule__Arc__Group_1__1__Impl : ( ( rule__Arc__MultiplicityAssignment_1_1 ) ) ;
    public final void rule__Arc__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:956:1: ( ( ( rule__Arc__MultiplicityAssignment_1_1 ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:957:1: ( ( rule__Arc__MultiplicityAssignment_1_1 ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:957:1: ( ( rule__Arc__MultiplicityAssignment_1_1 ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:958:1: ( rule__Arc__MultiplicityAssignment_1_1 )
            {
             before(grammarAccess.getArcAccess().getMultiplicityAssignment_1_1()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:959:1: ( rule__Arc__MultiplicityAssignment_1_1 )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:959:2: rule__Arc__MultiplicityAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Arc__MultiplicityAssignment_1_1_in_rule__Arc__Group_1__1__Impl1867);
            rule__Arc__MultiplicityAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getMultiplicityAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_1__1__Impl"


    // $ANTLR start "rule__Arc__Group_1__2"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:969:1: rule__Arc__Group_1__2 : rule__Arc__Group_1__2__Impl ;
    public final void rule__Arc__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:973:1: ( rule__Arc__Group_1__2__Impl )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:974:2: rule__Arc__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Arc__Group_1__2__Impl_in_rule__Arc__Group_1__21897);
            rule__Arc__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_1__2"


    // $ANTLR start "rule__Arc__Group_1__2__Impl"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:980:1: rule__Arc__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Arc__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:984:1: ( ( ')' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:985:1: ( ')' )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:985:1: ( ')' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:986:1: ')'
            {
             before(grammarAccess.getArcAccess().getRightParenthesisKeyword_1_2()); 
            match(input,16,FOLLOW_16_in_rule__Arc__Group_1__2__Impl1925); 
             after(grammarAccess.getArcAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_1__2__Impl"


    // $ANTLR start "rule__PetriNet__NameAssignment_1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1006:1: rule__PetriNet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PetriNet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1010:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1011:1: ( RULE_ID )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1011:1: ( RULE_ID )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1012:1: RULE_ID
            {
             before(grammarAccess.getPetriNetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PetriNet__NameAssignment_11967); 
             after(grammarAccess.getPetriNetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__NameAssignment_1"


    // $ANTLR start "rule__PetriNet__PetriNetElementsAssignment_3"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1021:1: rule__PetriNet__PetriNetElementsAssignment_3 : ( rulePetriNetElement ) ;
    public final void rule__PetriNet__PetriNetElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1025:1: ( ( rulePetriNetElement ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1026:1: ( rulePetriNetElement )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1026:1: ( rulePetriNetElement )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1027:1: rulePetriNetElement
            {
             before(grammarAccess.getPetriNetAccess().getPetriNetElementsPetriNetElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePetriNetElement_in_rule__PetriNet__PetriNetElementsAssignment_31998);
            rulePetriNetElement();

            state._fsp--;

             after(grammarAccess.getPetriNetAccess().getPetriNetElementsPetriNetElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__PetriNetElementsAssignment_3"


    // $ANTLR start "rule__Place__NameAssignment_1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1036:1: rule__Place__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Place__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1040:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1041:1: ( RULE_ID )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1041:1: ( RULE_ID )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1042:1: RULE_ID
            {
             before(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Place__NameAssignment_12029); 
             after(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__NameAssignment_1"


    // $ANTLR start "rule__Place__MarkingAssignment_2_1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1051:1: rule__Place__MarkingAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Place__MarkingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1055:1: ( ( RULE_INT ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1056:1: ( RULE_INT )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1056:1: ( RULE_INT )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1057:1: RULE_INT
            {
             before(grammarAccess.getPlaceAccess().getMarkingINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Place__MarkingAssignment_2_12060); 
             after(grammarAccess.getPlaceAccess().getMarkingINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__MarkingAssignment_2_1"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1066:1: rule__Transition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1070:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1071:1: ( RULE_ID )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1071:1: ( RULE_ID )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1072:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_12091); 
             after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Arc__MultiplicityAssignment_1_1"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1081:1: rule__Arc__MultiplicityAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Arc__MultiplicityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1085:1: ( ( RULE_INT ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1086:1: ( RULE_INT )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1086:1: ( RULE_INT )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1087:1: RULE_INT
            {
             before(grammarAccess.getArcAccess().getMultiplicityINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Arc__MultiplicityAssignment_1_12122); 
             after(grammarAccess.getArcAccess().getMultiplicityINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__MultiplicityAssignment_1_1"


    // $ANTLR start "rule__Arc__ReadOnlyAssignment_2"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1096:1: rule__Arc__ReadOnlyAssignment_2 : ( ( 'r' ) ) ;
    public final void rule__Arc__ReadOnlyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1100:1: ( ( ( 'r' ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1101:1: ( ( 'r' ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1101:1: ( ( 'r' ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1102:1: ( 'r' )
            {
             before(grammarAccess.getArcAccess().getReadOnlyRKeyword_2_0()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1103:1: ( 'r' )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1104:1: 'r'
            {
             before(grammarAccess.getArcAccess().getReadOnlyRKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Arc__ReadOnlyAssignment_22158); 
             after(grammarAccess.getArcAccess().getReadOnlyRKeyword_2_0()); 

            }

             after(grammarAccess.getArcAccess().getReadOnlyRKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__ReadOnlyAssignment_2"


    // $ANTLR start "rule__Arc__PredecessorAssignment_4"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1119:1: rule__Arc__PredecessorAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Arc__PredecessorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1123:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1124:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1124:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1125:1: ( RULE_ID )
            {
             before(grammarAccess.getArcAccess().getPredecessorNodeCrossReference_4_0()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1126:1: ( RULE_ID )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1127:1: RULE_ID
            {
             before(grammarAccess.getArcAccess().getPredecessorNodeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Arc__PredecessorAssignment_42201); 
             after(grammarAccess.getArcAccess().getPredecessorNodeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getArcAccess().getPredecessorNodeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__PredecessorAssignment_4"


    // $ANTLR start "rule__Arc__SuccessorAssignment_6"
    // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1138:1: rule__Arc__SuccessorAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Arc__SuccessorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1142:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1143:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1143:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1144:1: ( RULE_ID )
            {
             before(grammarAccess.getArcAccess().getSuccessorNodeCrossReference_6_0()); 
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1145:1: ( RULE_ID )
            // ../fr.enseeiht.petrinet1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPETRI1.g:1146:1: RULE_ID
            {
             before(grammarAccess.getArcAccess().getSuccessorNodeIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Arc__SuccessorAssignment_62240); 
             after(grammarAccess.getArcAccess().getSuccessorNodeIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getArcAccess().getSuccessorNodeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__SuccessorAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePetriNet_in_entryRulePetriNet61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePetriNet68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__0_in_rulePetriNet94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePetriNetElement_in_entryRulePetriNetElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePetriNetElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNetElement__Alternatives_in_rulePetriNetElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_in_ruleNode214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_entryRulePlace241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlace248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__0_in_rulePlace274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArc_in_entryRuleArc361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArc368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__0_in_ruleArc394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__PetriNetElement__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArc_in_rule__PetriNetElement__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_rule__Node__Alternatives479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Node__Alternatives496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__0__Impl_in_rule__PetriNet__Group__0526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__1_in_rule__PetriNet__Group__0529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PetriNet__Group__0__Impl557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__1__Impl_in_rule__PetriNet__Group__1588 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__2_in_rule__PetriNet__Group__1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__NameAssignment_1_in_rule__PetriNet__Group__1__Impl618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__2__Impl_in_rule__PetriNet__Group__2648 = new BitSet(new long[]{0x0000000000066000L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__3_in_rule__PetriNet__Group__2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PetriNet__Group__2__Impl679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__3__Impl_in_rule__PetriNet__Group__3710 = new BitSet(new long[]{0x0000000000066000L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__4_in_rule__PetriNet__Group__3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__PetriNetElementsAssignment_3_in_rule__PetriNet__Group__3__Impl740 = new BitSet(new long[]{0x0000000000064002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__4__Impl_in_rule__PetriNet__Group__4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PetriNet__Group__4__Impl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__0__Impl_in_rule__Place__Group__0840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Place__Group__1_in_rule__Place__Group__0843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Place__Group__0__Impl871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__1__Impl_in_rule__Place__Group__1902 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Place__Group__2_in_rule__Place__Group__1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__NameAssignment_1_in_rule__Place__Group__1__Impl932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__2__Impl_in_rule__Place__Group__2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group_2__0_in_rule__Place__Group__2__Impl989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group_2__0__Impl_in_rule__Place__Group_2__01026 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Place__Group_2__1_in_rule__Place__Group_2__01029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Place__Group_2__0__Impl1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group_2__1__Impl_in_rule__Place__Group_2__11088 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Place__Group_2__2_in_rule__Place__Group_2__11091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__MarkingAssignment_2_1_in_rule__Place__Group_2__1__Impl1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group_2__2__Impl_in_rule__Place__Group_2__21148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Place__Group_2__2__Impl1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Transition__Group__0__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__NameAssignment_1_in_rule__Transition__Group__1__Impl1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__0__Impl_in_rule__Arc__Group__01336 = new BitSet(new long[]{0x0000000000288000L});
    public static final BitSet FOLLOW_rule__Arc__Group__1_in_rule__Arc__Group__01339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Arc__Group__0__Impl1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__1__Impl_in_rule__Arc__Group__11398 = new BitSet(new long[]{0x0000000000288000L});
    public static final BitSet FOLLOW_rule__Arc__Group__2_in_rule__Arc__Group__11401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group_1__0_in_rule__Arc__Group__1__Impl1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__2__Impl_in_rule__Arc__Group__21459 = new BitSet(new long[]{0x0000000000288000L});
    public static final BitSet FOLLOW_rule__Arc__Group__3_in_rule__Arc__Group__21462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__ReadOnlyAssignment_2_in_rule__Arc__Group__2__Impl1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__3__Impl_in_rule__Arc__Group__31520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Arc__Group__4_in_rule__Arc__Group__31523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Arc__Group__3__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__4__Impl_in_rule__Arc__Group__41582 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Arc__Group__5_in_rule__Arc__Group__41585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__PredecessorAssignment_4_in_rule__Arc__Group__4__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__5__Impl_in_rule__Arc__Group__51642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Arc__Group__6_in_rule__Arc__Group__51645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Arc__Group__5__Impl1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__6__Impl_in_rule__Arc__Group__61704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__SuccessorAssignment_6_in_rule__Arc__Group__6__Impl1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group_1__0__Impl_in_rule__Arc__Group_1__01775 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Arc__Group_1__1_in_rule__Arc__Group_1__01778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Arc__Group_1__0__Impl1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group_1__1__Impl_in_rule__Arc__Group_1__11837 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Arc__Group_1__2_in_rule__Arc__Group_1__11840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__MultiplicityAssignment_1_1_in_rule__Arc__Group_1__1__Impl1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group_1__2__Impl_in_rule__Arc__Group_1__21897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Arc__Group_1__2__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PetriNet__NameAssignment_11967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePetriNetElement_in_rule__PetriNet__PetriNetElementsAssignment_31998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Place__NameAssignment_12029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Place__MarkingAssignment_2_12060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_12091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Arc__MultiplicityAssignment_1_12122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Arc__ReadOnlyAssignment_22158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Arc__PredecessorAssignment_42201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Arc__SuccessorAssignment_62240 = new BitSet(new long[]{0x0000000000000002L});

}