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
import fr.enseeiht.services.PDL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "'{'", "'}'", "'wd'", "'ws'", "'from'", "'to'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPDL1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL1Parser.tokenNames; }
    public String getGrammarFileName() { return "../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g"; }


     
     	private PDL1GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PDL1GrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProcess"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:60:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:61:1: ( ruleProcess EOF )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:62:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess61);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess68); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:69:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:73:2: ( ( ( rule__Process__Group__0 ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:74:1: ( ( rule__Process__Group__0 ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:74:1: ( ( rule__Process__Group__0 ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:75:1: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:76:1: ( rule__Process__Group__0 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:76:2: rule__Process__Group__0
            {
            pushFollow(FOLLOW_rule__Process__Group__0_in_ruleProcess94);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:88:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:89:1: ( ruleProcessElement EOF )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:90:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_ruleProcessElement_in_entryRuleProcessElement121);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessElement128); 

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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:97:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:101:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:102:1: ( ( rule__ProcessElement__Alternatives ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:102:1: ( ( rule__ProcessElement__Alternatives ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:103:1: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:104:1: ( rule__ProcessElement__Alternatives )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:104:2: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ProcessElement__Alternatives_in_ruleProcessElement154);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:116:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:117:1: ( ruleWorkDefinition EOF )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:118:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition181);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkDefinition188); 

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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:125:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:129:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:130:1: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:130:1: ( ( rule__WorkDefinition__Group__0 ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:131:1: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:132:1: ( rule__WorkDefinition__Group__0 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:132:2: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__0_in_ruleWorkDefinition214);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:144:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:145:1: ( ruleWorkSequence EOF )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:146:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence241);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSequence248); 

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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:153:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:157:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:158:1: ( ( rule__WorkSequence__Group__0 ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:158:1: ( ( rule__WorkSequence__Group__0 ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:159:1: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:160:1: ( rule__WorkSequence__Group__0 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:160:2: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__0_in_ruleWorkSequence274);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:172:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:173:1: ( ruleGuidance EOF )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:174:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_ruleGuidance_in_entryRuleGuidance301);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidance308); 

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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:181:1: ruleGuidance : ( ( rule__Guidance__TextAssignment ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:185:2: ( ( ( rule__Guidance__TextAssignment ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:186:1: ( ( rule__Guidance__TextAssignment ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:186:1: ( ( rule__Guidance__TextAssignment ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:187:1: ( rule__Guidance__TextAssignment )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:188:1: ( rule__Guidance__TextAssignment )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:188:2: rule__Guidance__TextAssignment
            {
            pushFollow(FOLLOW_rule__Guidance__TextAssignment_in_ruleGuidance334);
            rule__Guidance__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment()); 

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "ruleWorkSequenceType"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:201:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:205:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:206:1: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:206:1: ( ( rule__WorkSequenceType__Alternatives ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:207:1: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:208:1: ( rule__WorkSequenceType__Alternatives )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:208:2: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_rule__WorkSequenceType__Alternatives_in_ruleWorkSequenceType371);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:219:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:223:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:224:1: ( ruleWorkDefinition )
                    {
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:224:1: ( ruleWorkDefinition )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:225:1: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWorkDefinition_in_rule__ProcessElement__Alternatives406);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:230:6: ( ruleWorkSequence )
                    {
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:230:6: ( ruleWorkSequence )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:231:1: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWorkSequence_in_rule__ProcessElement__Alternatives423);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:236:6: ( ruleGuidance )
                    {
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:236:6: ( ruleGuidance )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:237:1: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGuidance_in_rule__ProcessElement__Alternatives440);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

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
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:247:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:251:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:252:1: ( ( 's2s' ) )
                    {
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:252:1: ( ( 's2s' ) )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:253:1: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:254:1: ( 's2s' )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:254:3: 's2s'
                    {
                    match(input,11,FOLLOW_11_in_rule__WorkSequenceType__Alternatives473); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:259:6: ( ( 'f2s' ) )
                    {
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:259:6: ( ( 'f2s' ) )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:260:1: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:261:1: ( 'f2s' )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:261:3: 'f2s'
                    {
                    match(input,12,FOLLOW_12_in_rule__WorkSequenceType__Alternatives494); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:266:6: ( ( 's2f' ) )
                    {
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:266:6: ( ( 's2f' ) )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:267:1: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:268:1: ( 's2f' )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:268:3: 's2f'
                    {
                    match(input,13,FOLLOW_13_in_rule__WorkSequenceType__Alternatives515); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:273:6: ( ( 'f2f' ) )
                    {
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:273:6: ( ( 'f2f' ) )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:274:1: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:275:1: ( 'f2f' )
                    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:275:3: 'f2f'
                    {
                    match(input,14,FOLLOW_14_in_rule__WorkSequenceType__Alternatives536); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:287:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:291:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:292:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__0569);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__1_in_rule__Process__Group__0572);
            rule__Process__Group__1();

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
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:299:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:303:1: ( ( 'process' ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:304:1: ( 'process' )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:304:1: ( 'process' )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:305:1: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Process__Group__0__Impl600); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

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
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:318:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:322:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:323:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__1631);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__2_in_rule__Process__Group__1634);
            rule__Process__Group__2();

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
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:330:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:334:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:335:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:335:1: ( ( rule__Process__NameAssignment_1 ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:336:1: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:337:1: ( rule__Process__NameAssignment_1 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:337:2: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Process__NameAssignment_1_in_rule__Process__Group__1__Impl661);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:347:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:351:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:352:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__2691);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__3_in_rule__Process__Group__2694);
            rule__Process__Group__3();

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
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:359:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:363:1: ( ( '{' ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:364:1: ( '{' )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:364:1: ( '{' )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:365:1: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Process__Group__2__Impl722); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:378:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:382:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:383:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__3753);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__4_in_rule__Process__Group__3756);
            rule__Process__Group__4();

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
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:390:1: rule__Process__Group__3__Impl : ( ( rule__Process__ProcessElementsAssignment_3 )* ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:394:1: ( ( ( rule__Process__ProcessElementsAssignment_3 )* ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:395:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:395:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:396:1: ( rule__Process__ProcessElementsAssignment_3 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:397:1: ( rule__Process__ProcessElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||(LA3_0>=18 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:397:2: rule__Process__ProcessElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Process__ProcessElementsAssignment_3_in_rule__Process__Group__3__Impl783);
            	    rule__Process__ProcessElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:407:1: rule__Process__Group__4 : rule__Process__Group__4__Impl ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:411:1: ( rule__Process__Group__4__Impl )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:412:2: rule__Process__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__4814);
            rule__Process__Group__4__Impl();

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
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:418:1: rule__Process__Group__4__Impl : ( '}' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:422:1: ( ( '}' ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:423:1: ( '}' )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:423:1: ( '}' )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:424:1: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Process__Group__4__Impl842); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:447:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:451:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:452:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__0__Impl_in_rule__WorkDefinition__Group__0883);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group__1_in_rule__WorkDefinition__Group__0886);
            rule__WorkDefinition__Group__1();

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
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:459:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:463:1: ( ( 'wd' ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:464:1: ( 'wd' )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:464:1: ( 'wd' )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:465:1: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__WorkDefinition__Group__0__Impl914); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:478:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:482:1: ( rule__WorkDefinition__Group__1__Impl )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:483:2: rule__WorkDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__1__Impl_in_rule__WorkDefinition__Group__1945);
            rule__WorkDefinition__Group__1__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:489:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:493:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:494:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:494:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:495:1: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:496:1: ( rule__WorkDefinition__NameAssignment_1 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:496:2: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkDefinition__NameAssignment_1_in_rule__WorkDefinition__Group__1__Impl972);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:510:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:514:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:515:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__0__Impl_in_rule__WorkSequence__Group__01006);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkSequence__Group__1_in_rule__WorkSequence__Group__01009);
            rule__WorkSequence__Group__1();

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
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:522:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:526:1: ( ( 'ws' ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:527:1: ( 'ws' )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:527:1: ( 'ws' )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:528:1: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__WorkSequence__Group__0__Impl1037); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:541:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:545:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:546:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__1__Impl_in_rule__WorkSequence__Group__11068);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkSequence__Group__2_in_rule__WorkSequence__Group__11071);
            rule__WorkSequence__Group__2();

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
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:553:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:557:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:558:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:558:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:559:1: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:560:1: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:560:2: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkSequence__LinkTypeAssignment_1_in_rule__WorkSequence__Group__1__Impl1098);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:570:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:574:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:575:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__2__Impl_in_rule__WorkSequence__Group__21128);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkSequence__Group__3_in_rule__WorkSequence__Group__21131);
            rule__WorkSequence__Group__3();

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
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:582:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:586:1: ( ( 'from' ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:587:1: ( 'from' )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:587:1: ( 'from' )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:588:1: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__WorkSequence__Group__2__Impl1159); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:601:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:605:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:606:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__3__Impl_in_rule__WorkSequence__Group__31190);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkSequence__Group__4_in_rule__WorkSequence__Group__31193);
            rule__WorkSequence__Group__4();

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
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:613:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:617:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:618:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:618:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:619:1: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:620:1: ( rule__WorkSequence__PredecessorAssignment_3 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:620:2: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_rule__WorkSequence__PredecessorAssignment_3_in_rule__WorkSequence__Group__3__Impl1220);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

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
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:630:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:634:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:635:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__4__Impl_in_rule__WorkSequence__Group__41250);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkSequence__Group__5_in_rule__WorkSequence__Group__41253);
            rule__WorkSequence__Group__5();

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
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:642:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:646:1: ( ( 'to' ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:647:1: ( 'to' )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:647:1: ( 'to' )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:648:1: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__WorkSequence__Group__4__Impl1281); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:661:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:665:1: ( rule__WorkSequence__Group__5__Impl )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:666:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__5__Impl_in_rule__WorkSequence__Group__51312);
            rule__WorkSequence__Group__5__Impl();

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
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:672:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:676:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:677:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:677:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:678:1: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:679:1: ( rule__WorkSequence__SuccessorAssignment_5 )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:679:2: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_rule__WorkSequence__SuccessorAssignment_5_in_rule__WorkSequence__Group__5__Impl1339);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

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
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:702:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:706:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:707:1: ( RULE_ID )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:707:1: ( RULE_ID )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:708:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__NameAssignment_11386); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_3"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:717:1: rule__Process__ProcessElementsAssignment_3 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:721:1: ( ( ruleProcessElement ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:722:1: ( ruleProcessElement )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:722:1: ( ruleProcessElement )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:723:1: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_31417);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_3"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:732:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:736:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:737:1: ( RULE_ID )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:737:1: ( RULE_ID )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:738:1: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkDefinition__NameAssignment_11448); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:747:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:751:1: ( ( ruleWorkSequenceType ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:752:1: ( ruleWorkSequenceType )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:752:1: ( ruleWorkSequenceType )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:753:1: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorkSequenceType_in_rule__WorkSequence__LinkTypeAssignment_11479);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:762:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:766:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:767:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:767:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:768:1: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:769:1: ( RULE_ID )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:770:1: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkSequence__PredecessorAssignment_31514); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:781:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:785:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:786:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:786:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:787:1: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:788:1: ( RULE_ID )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:789:1: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkSequence__SuccessorAssignment_51553); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Guidance__TextAssignment"
    // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:800:1: rule__Guidance__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Guidance__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:804:1: ( ( RULE_STRING ) )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:805:1: ( RULE_STRING )
            {
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:805:1: ( RULE_STRING )
            // ../fr.enseeiht.pdl1.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL1.g:806:1: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Guidance__TextAssignment1588); 
             after(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Guidance__TextAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__0_in_ruleProcess94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessElement_in_entryRuleProcessElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessElement__Alternatives_in_ruleProcessElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__0_in_ruleWorkDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSequence248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__0_in_ruleWorkSequence274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidance308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TextAssignment_in_ruleGuidance334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequenceType__Alternatives_in_ruleWorkSequenceType371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_rule__ProcessElement__Alternatives406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequence_in_rule__ProcessElement__Alternatives423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_rule__ProcessElement__Alternatives440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__WorkSequenceType__Alternatives473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkSequenceType__Alternatives494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WorkSequenceType__Alternatives515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WorkSequenceType__Alternatives536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__0569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__0572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Process__Group__0__Impl600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__1631 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__NameAssignment_1_in_rule__Process__Group__1__Impl661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__2691 = new BitSet(new long[]{0x00000000000E0020L});
    public static final BitSet FOLLOW_rule__Process__Group__3_in_rule__Process__Group__2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Process__Group__2__Impl722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__3753 = new BitSet(new long[]{0x00000000000E0020L});
    public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_3_in_rule__Process__Group__3__Impl783 = new BitSet(new long[]{0x00000000000C0022L});
    public static final BitSet FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Process__Group__4__Impl842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__0__Impl_in_rule__WorkDefinition__Group__0883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__1_in_rule__WorkDefinition__Group__0886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WorkDefinition__Group__0__Impl914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__1__Impl_in_rule__WorkDefinition__Group__1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__NameAssignment_1_in_rule__WorkDefinition__Group__1__Impl972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__0__Impl_in_rule__WorkSequence__Group__01006 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__1_in_rule__WorkSequence__Group__01009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__WorkSequence__Group__0__Impl1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__1__Impl_in_rule__WorkSequence__Group__11068 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__2_in_rule__WorkSequence__Group__11071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__LinkTypeAssignment_1_in_rule__WorkSequence__Group__1__Impl1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__2__Impl_in_rule__WorkSequence__Group__21128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__3_in_rule__WorkSequence__Group__21131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__WorkSequence__Group__2__Impl1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__3__Impl_in_rule__WorkSequence__Group__31190 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__4_in_rule__WorkSequence__Group__31193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__PredecessorAssignment_3_in_rule__WorkSequence__Group__3__Impl1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__4__Impl_in_rule__WorkSequence__Group__41250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__5_in_rule__WorkSequence__Group__41253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__WorkSequence__Group__4__Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__5__Impl_in_rule__WorkSequence__Group__51312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__SuccessorAssignment_5_in_rule__WorkSequence__Group__5__Impl1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__NameAssignment_11386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_31417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkDefinition__NameAssignment_11448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequenceType_in_rule__WorkSequence__LinkTypeAssignment_11479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkSequence__PredecessorAssignment_31514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkSequence__SuccessorAssignment_51553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Guidance__TextAssignment1588 = new BitSet(new long[]{0x0000000000000002L});

}