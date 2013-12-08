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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'wd'", "'starts'", "'if'", "'finishes'", "'started'", "'finished'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalPDL2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL2Parser.tokenNames; }
    public String getGrammarFileName() { return "../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g"; }


     
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




    // $ANTLR start "entryRuleProcess"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:60:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:61:1: ( ruleProcess EOF )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:62:1: ruleProcess EOF
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:69:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:73:2: ( ( ( rule__Process__Group__0 ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:74:1: ( ( rule__Process__Group__0 ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:74:1: ( ( rule__Process__Group__0 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:75:1: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:76:1: ( rule__Process__Group__0 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:76:2: rule__Process__Group__0
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:88:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:89:1: ( ruleProcessElement EOF )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:90:1: ruleProcessElement EOF
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:97:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:101:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:102:1: ( ( rule__ProcessElement__Alternatives ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:102:1: ( ( rule__ProcessElement__Alternatives ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:103:1: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:104:1: ( rule__ProcessElement__Alternatives )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:104:2: rule__ProcessElement__Alternatives
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:116:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:117:1: ( ruleWorkDefinition EOF )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:118:1: ruleWorkDefinition EOF
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:125:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:129:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:130:1: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:130:1: ( ( rule__WorkDefinition__Group__0 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:131:1: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:132:1: ( rule__WorkDefinition__Group__0 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:132:2: rule__WorkDefinition__Group__0
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


    // $ANTLR start "entryRuleDependanceStart"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:144:1: entryRuleDependanceStart : ruleDependanceStart EOF ;
    public final void entryRuleDependanceStart() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:145:1: ( ruleDependanceStart EOF )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:146:1: ruleDependanceStart EOF
            {
             before(grammarAccess.getDependanceStartRule()); 
            pushFollow(FOLLOW_ruleDependanceStart_in_entryRuleDependanceStart241);
            ruleDependanceStart();

            state._fsp--;

             after(grammarAccess.getDependanceStartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependanceStart248); 

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
    // $ANTLR end "entryRuleDependanceStart"


    // $ANTLR start "ruleDependanceStart"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:153:1: ruleDependanceStart : ( ( rule__DependanceStart__Group__0 ) ) ;
    public final void ruleDependanceStart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:157:2: ( ( ( rule__DependanceStart__Group__0 ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:158:1: ( ( rule__DependanceStart__Group__0 ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:158:1: ( ( rule__DependanceStart__Group__0 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:159:1: ( rule__DependanceStart__Group__0 )
            {
             before(grammarAccess.getDependanceStartAccess().getGroup()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:160:1: ( rule__DependanceStart__Group__0 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:160:2: rule__DependanceStart__Group__0
            {
            pushFollow(FOLLOW_rule__DependanceStart__Group__0_in_ruleDependanceStart274);
            rule__DependanceStart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependanceStartAccess().getGroup()); 

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
    // $ANTLR end "ruleDependanceStart"


    // $ANTLR start "entryRuleWorkSequenceKindStart"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:172:1: entryRuleWorkSequenceKindStart : ruleWorkSequenceKindStart EOF ;
    public final void entryRuleWorkSequenceKindStart() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:173:1: ( ruleWorkSequenceKindStart EOF )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:174:1: ruleWorkSequenceKindStart EOF
            {
             before(grammarAccess.getWorkSequenceKindStartRule()); 
            pushFollow(FOLLOW_ruleWorkSequenceKindStart_in_entryRuleWorkSequenceKindStart301);
            ruleWorkSequenceKindStart();

            state._fsp--;

             after(grammarAccess.getWorkSequenceKindStartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSequenceKindStart308); 

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
    // $ANTLR end "entryRuleWorkSequenceKindStart"


    // $ANTLR start "ruleWorkSequenceKindStart"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:181:1: ruleWorkSequenceKindStart : ( ( rule__WorkSequenceKindStart__Alternatives ) ) ;
    public final void ruleWorkSequenceKindStart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:185:2: ( ( ( rule__WorkSequenceKindStart__Alternatives ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:186:1: ( ( rule__WorkSequenceKindStart__Alternatives ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:186:1: ( ( rule__WorkSequenceKindStart__Alternatives ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:187:1: ( rule__WorkSequenceKindStart__Alternatives )
            {
             before(grammarAccess.getWorkSequenceKindStartAccess().getAlternatives()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:188:1: ( rule__WorkSequenceKindStart__Alternatives )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:188:2: rule__WorkSequenceKindStart__Alternatives
            {
            pushFollow(FOLLOW_rule__WorkSequenceKindStart__Alternatives_in_ruleWorkSequenceKindStart334);
            rule__WorkSequenceKindStart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceKindStartAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceKindStart"


    // $ANTLR start "entryRuleDependanceFinish"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:200:1: entryRuleDependanceFinish : ruleDependanceFinish EOF ;
    public final void entryRuleDependanceFinish() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:201:1: ( ruleDependanceFinish EOF )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:202:1: ruleDependanceFinish EOF
            {
             before(grammarAccess.getDependanceFinishRule()); 
            pushFollow(FOLLOW_ruleDependanceFinish_in_entryRuleDependanceFinish361);
            ruleDependanceFinish();

            state._fsp--;

             after(grammarAccess.getDependanceFinishRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependanceFinish368); 

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
    // $ANTLR end "entryRuleDependanceFinish"


    // $ANTLR start "ruleDependanceFinish"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:209:1: ruleDependanceFinish : ( ( rule__DependanceFinish__Group__0 ) ) ;
    public final void ruleDependanceFinish() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:213:2: ( ( ( rule__DependanceFinish__Group__0 ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:214:1: ( ( rule__DependanceFinish__Group__0 ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:214:1: ( ( rule__DependanceFinish__Group__0 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:215:1: ( rule__DependanceFinish__Group__0 )
            {
             before(grammarAccess.getDependanceFinishAccess().getGroup()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:216:1: ( rule__DependanceFinish__Group__0 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:216:2: rule__DependanceFinish__Group__0
            {
            pushFollow(FOLLOW_rule__DependanceFinish__Group__0_in_ruleDependanceFinish394);
            rule__DependanceFinish__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependanceFinishAccess().getGroup()); 

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
    // $ANTLR end "ruleDependanceFinish"


    // $ANTLR start "entryRuleWorkSequenceKindFinish"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:228:1: entryRuleWorkSequenceKindFinish : ruleWorkSequenceKindFinish EOF ;
    public final void entryRuleWorkSequenceKindFinish() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:229:1: ( ruleWorkSequenceKindFinish EOF )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:230:1: ruleWorkSequenceKindFinish EOF
            {
             before(grammarAccess.getWorkSequenceKindFinishRule()); 
            pushFollow(FOLLOW_ruleWorkSequenceKindFinish_in_entryRuleWorkSequenceKindFinish421);
            ruleWorkSequenceKindFinish();

            state._fsp--;

             after(grammarAccess.getWorkSequenceKindFinishRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSequenceKindFinish428); 

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
    // $ANTLR end "entryRuleWorkSequenceKindFinish"


    // $ANTLR start "ruleWorkSequenceKindFinish"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:237:1: ruleWorkSequenceKindFinish : ( ( rule__WorkSequenceKindFinish__Alternatives ) ) ;
    public final void ruleWorkSequenceKindFinish() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:241:2: ( ( ( rule__WorkSequenceKindFinish__Alternatives ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:242:1: ( ( rule__WorkSequenceKindFinish__Alternatives ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:242:1: ( ( rule__WorkSequenceKindFinish__Alternatives ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:243:1: ( rule__WorkSequenceKindFinish__Alternatives )
            {
             before(grammarAccess.getWorkSequenceKindFinishAccess().getAlternatives()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:244:1: ( rule__WorkSequenceKindFinish__Alternatives )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:244:2: rule__WorkSequenceKindFinish__Alternatives
            {
            pushFollow(FOLLOW_rule__WorkSequenceKindFinish__Alternatives_in_ruleWorkSequenceKindFinish454);
            rule__WorkSequenceKindFinish__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceKindFinishAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceKindFinish"


    // $ANTLR start "entryRuleGuidance"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:256:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:257:1: ( ruleGuidance EOF )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:258:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_ruleGuidance_in_entryRuleGuidance481);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidance488); 

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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:265:1: ruleGuidance : ( ( rule__Guidance__TextAssignment ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:269:2: ( ( ( rule__Guidance__TextAssignment ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:270:1: ( ( rule__Guidance__TextAssignment ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:270:1: ( ( rule__Guidance__TextAssignment ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:271:1: ( rule__Guidance__TextAssignment )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:272:1: ( rule__Guidance__TextAssignment )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:272:2: rule__Guidance__TextAssignment
            {
            pushFollow(FOLLOW_rule__Guidance__TextAssignment_in_ruleGuidance514);
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


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:284:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleGuidance ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:288:1: ( ( ruleWorkDefinition ) | ( ruleGuidance ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:289:1: ( ruleWorkDefinition )
                    {
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:289:1: ( ruleWorkDefinition )
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:290:1: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWorkDefinition_in_rule__ProcessElement__Alternatives550);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:295:6: ( ruleGuidance )
                    {
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:295:6: ( ruleGuidance )
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:296:1: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGuidance_in_rule__ProcessElement__Alternatives567);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_1()); 

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


    // $ANTLR start "rule__WorkSequenceKindStart__Alternatives"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:306:1: rule__WorkSequenceKindStart__Alternatives : ( ( ( rule__WorkSequenceKindStart__Started2StartAssignment_0 ) ) | ( ( rule__WorkSequenceKindStart__Started2FinishAssignment_1 ) ) );
    public final void rule__WorkSequenceKindStart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:310:1: ( ( ( rule__WorkSequenceKindStart__Started2StartAssignment_0 ) ) | ( ( rule__WorkSequenceKindStart__Started2FinishAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:311:1: ( ( rule__WorkSequenceKindStart__Started2StartAssignment_0 ) )
                    {
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:311:1: ( ( rule__WorkSequenceKindStart__Started2StartAssignment_0 ) )
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:312:1: ( rule__WorkSequenceKindStart__Started2StartAssignment_0 )
                    {
                     before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartAssignment_0()); 
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:313:1: ( rule__WorkSequenceKindStart__Started2StartAssignment_0 )
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:313:2: rule__WorkSequenceKindStart__Started2StartAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WorkSequenceKindStart__Started2StartAssignment_0_in_rule__WorkSequenceKindStart__Alternatives599);
                    rule__WorkSequenceKindStart__Started2StartAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:317:6: ( ( rule__WorkSequenceKindStart__Started2FinishAssignment_1 ) )
                    {
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:317:6: ( ( rule__WorkSequenceKindStart__Started2FinishAssignment_1 ) )
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:318:1: ( rule__WorkSequenceKindStart__Started2FinishAssignment_1 )
                    {
                     before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishAssignment_1()); 
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:319:1: ( rule__WorkSequenceKindStart__Started2FinishAssignment_1 )
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:319:2: rule__WorkSequenceKindStart__Started2FinishAssignment_1
                    {
                    pushFollow(FOLLOW_rule__WorkSequenceKindStart__Started2FinishAssignment_1_in_rule__WorkSequenceKindStart__Alternatives617);
                    rule__WorkSequenceKindStart__Started2FinishAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishAssignment_1()); 

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
    // $ANTLR end "rule__WorkSequenceKindStart__Alternatives"


    // $ANTLR start "rule__WorkSequenceKindFinish__Alternatives"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:328:1: rule__WorkSequenceKindFinish__Alternatives : ( ( ( rule__WorkSequenceKindFinish__Finished2StartAssignment_0 ) ) | ( ( rule__WorkSequenceKindFinish__Finished2FinishAssignment_1 ) ) );
    public final void rule__WorkSequenceKindFinish__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:332:1: ( ( ( rule__WorkSequenceKindFinish__Finished2StartAssignment_0 ) ) | ( ( rule__WorkSequenceKindFinish__Finished2FinishAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:333:1: ( ( rule__WorkSequenceKindFinish__Finished2StartAssignment_0 ) )
                    {
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:333:1: ( ( rule__WorkSequenceKindFinish__Finished2StartAssignment_0 ) )
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:334:1: ( rule__WorkSequenceKindFinish__Finished2StartAssignment_0 )
                    {
                     before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartAssignment_0()); 
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:335:1: ( rule__WorkSequenceKindFinish__Finished2StartAssignment_0 )
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:335:2: rule__WorkSequenceKindFinish__Finished2StartAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WorkSequenceKindFinish__Finished2StartAssignment_0_in_rule__WorkSequenceKindFinish__Alternatives650);
                    rule__WorkSequenceKindFinish__Finished2StartAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:339:6: ( ( rule__WorkSequenceKindFinish__Finished2FinishAssignment_1 ) )
                    {
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:339:6: ( ( rule__WorkSequenceKindFinish__Finished2FinishAssignment_1 ) )
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:340:1: ( rule__WorkSequenceKindFinish__Finished2FinishAssignment_1 )
                    {
                     before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishAssignment_1()); 
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:341:1: ( rule__WorkSequenceKindFinish__Finished2FinishAssignment_1 )
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:341:2: rule__WorkSequenceKindFinish__Finished2FinishAssignment_1
                    {
                    pushFollow(FOLLOW_rule__WorkSequenceKindFinish__Finished2FinishAssignment_1_in_rule__WorkSequenceKindFinish__Alternatives668);
                    rule__WorkSequenceKindFinish__Finished2FinishAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishAssignment_1()); 

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
    // $ANTLR end "rule__WorkSequenceKindFinish__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:352:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:356:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:357:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__0699);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__1_in_rule__Process__Group__0702);
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:364:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:368:1: ( ( 'process' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:369:1: ( 'process' )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:369:1: ( 'process' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:370:1: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Process__Group__0__Impl730); 
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:383:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:387:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:388:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__1761);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__2_in_rule__Process__Group__1764);
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:395:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:399:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:400:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:400:1: ( ( rule__Process__NameAssignment_1 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:401:1: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:402:1: ( rule__Process__NameAssignment_1 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:402:2: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Process__NameAssignment_1_in_rule__Process__Group__1__Impl791);
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:412:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:416:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:417:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__2821);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__3_in_rule__Process__Group__2824);
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:424:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:428:1: ( ( '{' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:429:1: ( '{' )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:429:1: ( '{' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:430:1: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Process__Group__2__Impl852); 
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:443:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:447:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:448:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__3883);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__4_in_rule__Process__Group__3886);
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:455:1: rule__Process__Group__3__Impl : ( ( rule__Process__ProcessElementsAssignment_3 )* ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:459:1: ( ( ( rule__Process__ProcessElementsAssignment_3 )* ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:460:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:460:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:461:1: ( rule__Process__ProcessElementsAssignment_3 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:462:1: ( rule__Process__ProcessElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:462:2: rule__Process__ProcessElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Process__ProcessElementsAssignment_3_in_rule__Process__Group__3__Impl913);
            	    rule__Process__ProcessElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:472:1: rule__Process__Group__4 : rule__Process__Group__4__Impl ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:476:1: ( rule__Process__Group__4__Impl )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:477:2: rule__Process__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__4944);
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:483:1: rule__Process__Group__4__Impl : ( '}' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:487:1: ( ( '}' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:488:1: ( '}' )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:488:1: ( '}' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:489:1: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Process__Group__4__Impl972); 
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:512:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:516:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:517:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__0__Impl_in_rule__WorkDefinition__Group__01013);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group__1_in_rule__WorkDefinition__Group__01016);
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:524:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:528:1: ( ( 'wd' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:529:1: ( 'wd' )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:529:1: ( 'wd' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:530:1: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__WorkDefinition__Group__0__Impl1044); 
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:543:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:547:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:548:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__1__Impl_in_rule__WorkDefinition__Group__11075);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group__2_in_rule__WorkDefinition__Group__11078);
            rule__WorkDefinition__Group__2();

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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:555:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:559:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:560:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:560:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:561:1: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:562:1: ( rule__WorkDefinition__NameAssignment_1 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:562:2: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkDefinition__NameAssignment_1_in_rule__WorkDefinition__Group__1__Impl1105);
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


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:572:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:576:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:577:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__2__Impl_in_rule__WorkDefinition__Group__21135);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group__3_in_rule__WorkDefinition__Group__21138);
            rule__WorkDefinition__Group__3();

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
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:584:1: rule__WorkDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:588:1: ( ( '{' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:589:1: ( '{' )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:589:1: ( '{' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:590:1: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__WorkDefinition__Group__2__Impl1166); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:603:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:607:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:608:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__3__Impl_in_rule__WorkDefinition__Group__31197);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group__4_in_rule__WorkDefinition__Group__31200);
            rule__WorkDefinition__Group__4();

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
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:615:1: rule__WorkDefinition__Group__3__Impl : ( ( rule__WorkDefinition__Group_3__0 )? ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:619:1: ( ( ( rule__WorkDefinition__Group_3__0 )? ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:620:1: ( ( rule__WorkDefinition__Group_3__0 )? )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:620:1: ( ( rule__WorkDefinition__Group_3__0 )? )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:621:1: ( rule__WorkDefinition__Group_3__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_3()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:622:1: ( rule__WorkDefinition__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:622:2: rule__WorkDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__WorkDefinition__Group_3__0_in_rule__WorkDefinition__Group__3__Impl1227);
                    rule__WorkDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__4"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:632:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:636:1: ( rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:637:2: rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__4__Impl_in_rule__WorkDefinition__Group__41258);
            rule__WorkDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group__5_in_rule__WorkDefinition__Group__41261);
            rule__WorkDefinition__Group__5();

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
    // $ANTLR end "rule__WorkDefinition__Group__4"


    // $ANTLR start "rule__WorkDefinition__Group__4__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:644:1: rule__WorkDefinition__Group__4__Impl : ( ( rule__WorkDefinition__Group_4__0 )? ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:648:1: ( ( ( rule__WorkDefinition__Group_4__0 )? ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:649:1: ( ( rule__WorkDefinition__Group_4__0 )? )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:649:1: ( ( rule__WorkDefinition__Group_4__0 )? )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:650:1: ( rule__WorkDefinition__Group_4__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_4()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:651:1: ( rule__WorkDefinition__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:651:2: rule__WorkDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__WorkDefinition__Group_4__0_in_rule__WorkDefinition__Group__4__Impl1288);
                    rule__WorkDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__5"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:661:1: rule__WorkDefinition__Group__5 : rule__WorkDefinition__Group__5__Impl ;
    public final void rule__WorkDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:665:1: ( rule__WorkDefinition__Group__5__Impl )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:666:2: rule__WorkDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__5__Impl_in_rule__WorkDefinition__Group__51319);
            rule__WorkDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group__5"


    // $ANTLR start "rule__WorkDefinition__Group__5__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:672:1: rule__WorkDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:676:1: ( ( '}' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:677:1: ( '}' )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:677:1: ( '}' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:678:1: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__WorkDefinition__Group__5__Impl1347); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__5__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3__0"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:703:1: rule__WorkDefinition__Group_3__0 : rule__WorkDefinition__Group_3__0__Impl rule__WorkDefinition__Group_3__1 ;
    public final void rule__WorkDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:707:1: ( rule__WorkDefinition__Group_3__0__Impl rule__WorkDefinition__Group_3__1 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:708:2: rule__WorkDefinition__Group_3__0__Impl rule__WorkDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group_3__0__Impl_in_rule__WorkDefinition__Group_3__01390);
            rule__WorkDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group_3__1_in_rule__WorkDefinition__Group_3__01393);
            rule__WorkDefinition__Group_3__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_3__0__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:715:1: rule__WorkDefinition__Group_3__0__Impl : ( 'starts' ) ;
    public final void rule__WorkDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:719:1: ( ( 'starts' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:720:1: ( 'starts' )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:720:1: ( 'starts' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:721:1: 'starts'
            {
             before(grammarAccess.getWorkDefinitionAccess().getStartsKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__WorkDefinition__Group_3__0__Impl1421); 
             after(grammarAccess.getWorkDefinitionAccess().getStartsKeyword_3_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3__1"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:734:1: rule__WorkDefinition__Group_3__1 : rule__WorkDefinition__Group_3__1__Impl rule__WorkDefinition__Group_3__2 ;
    public final void rule__WorkDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:738:1: ( rule__WorkDefinition__Group_3__1__Impl rule__WorkDefinition__Group_3__2 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:739:2: rule__WorkDefinition__Group_3__1__Impl rule__WorkDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group_3__1__Impl_in_rule__WorkDefinition__Group_3__11452);
            rule__WorkDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group_3__2_in_rule__WorkDefinition__Group_3__11455);
            rule__WorkDefinition__Group_3__2();

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
    // $ANTLR end "rule__WorkDefinition__Group_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_3__1__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:746:1: rule__WorkDefinition__Group_3__1__Impl : ( 'if' ) ;
    public final void rule__WorkDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:750:1: ( ( 'if' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:751:1: ( 'if' )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:751:1: ( 'if' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:752:1: 'if'
            {
             before(grammarAccess.getWorkDefinitionAccess().getIfKeyword_3_1()); 
            match(input,16,FOLLOW_16_in_rule__WorkDefinition__Group_3__1__Impl1483); 
             after(grammarAccess.getWorkDefinitionAccess().getIfKeyword_3_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3__2"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:765:1: rule__WorkDefinition__Group_3__2 : rule__WorkDefinition__Group_3__2__Impl ;
    public final void rule__WorkDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:769:1: ( rule__WorkDefinition__Group_3__2__Impl )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:770:2: rule__WorkDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group_3__2__Impl_in_rule__WorkDefinition__Group_3__21514);
            rule__WorkDefinition__Group_3__2__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_3__2"


    // $ANTLR start "rule__WorkDefinition__Group_3__2__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:776:1: rule__WorkDefinition__Group_3__2__Impl : ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 ) ) ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 )* ) ) ;
    public final void rule__WorkDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:780:1: ( ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 ) ) ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 )* ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:781:1: ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 ) ) ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 )* ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:781:1: ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 ) ) ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 )* ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:782:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 ) ) ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 )* )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:782:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:783:1: ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_3_2()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:784:1: ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:784:2: rule__WorkDefinition__LinksToPredecessorsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__WorkDefinition__LinksToPredecessorsAssignment_3_2_in_rule__WorkDefinition__Group_3__2__Impl1543);
            rule__WorkDefinition__LinksToPredecessorsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_3_2()); 

            }

            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:787:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 )* )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:788:1: ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_3_2()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:789:1: ( rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:789:2: rule__WorkDefinition__LinksToPredecessorsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__WorkDefinition__LinksToPredecessorsAssignment_3_2_in_rule__WorkDefinition__Group_3__2__Impl1555);
            	    rule__WorkDefinition__LinksToPredecessorsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_3_2()); 

            }


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
    // $ANTLR end "rule__WorkDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__0"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:806:1: rule__WorkDefinition__Group_4__0 : rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1 ;
    public final void rule__WorkDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:810:1: ( rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:811:2: rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group_4__0__Impl_in_rule__WorkDefinition__Group_4__01594);
            rule__WorkDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group_4__1_in_rule__WorkDefinition__Group_4__01597);
            rule__WorkDefinition__Group_4__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_4__0"


    // $ANTLR start "rule__WorkDefinition__Group_4__0__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:818:1: rule__WorkDefinition__Group_4__0__Impl : ( 'finishes' ) ;
    public final void rule__WorkDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:822:1: ( ( 'finishes' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:823:1: ( 'finishes' )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:823:1: ( 'finishes' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:824:1: 'finishes'
            {
             before(grammarAccess.getWorkDefinitionAccess().getFinishesKeyword_4_0()); 
            match(input,17,FOLLOW_17_in_rule__WorkDefinition__Group_4__0__Impl1625); 
             after(grammarAccess.getWorkDefinitionAccess().getFinishesKeyword_4_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__1"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:837:1: rule__WorkDefinition__Group_4__1 : rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2 ;
    public final void rule__WorkDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:841:1: ( rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:842:2: rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group_4__1__Impl_in_rule__WorkDefinition__Group_4__11656);
            rule__WorkDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group_4__2_in_rule__WorkDefinition__Group_4__11659);
            rule__WorkDefinition__Group_4__2();

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
    // $ANTLR end "rule__WorkDefinition__Group_4__1"


    // $ANTLR start "rule__WorkDefinition__Group_4__1__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:849:1: rule__WorkDefinition__Group_4__1__Impl : ( 'if' ) ;
    public final void rule__WorkDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:853:1: ( ( 'if' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:854:1: ( 'if' )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:854:1: ( 'if' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:855:1: 'if'
            {
             before(grammarAccess.getWorkDefinitionAccess().getIfKeyword_4_1()); 
            match(input,16,FOLLOW_16_in_rule__WorkDefinition__Group_4__1__Impl1687); 
             after(grammarAccess.getWorkDefinitionAccess().getIfKeyword_4_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__2"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:868:1: rule__WorkDefinition__Group_4__2 : rule__WorkDefinition__Group_4__2__Impl ;
    public final void rule__WorkDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:872:1: ( rule__WorkDefinition__Group_4__2__Impl )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:873:2: rule__WorkDefinition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group_4__2__Impl_in_rule__WorkDefinition__Group_4__21718);
            rule__WorkDefinition__Group_4__2__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_4__2"


    // $ANTLR start "rule__WorkDefinition__Group_4__2__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:879:1: rule__WorkDefinition__Group_4__2__Impl : ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 ) ) ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 )* ) ) ;
    public final void rule__WorkDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:883:1: ( ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 ) ) ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 )* ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:884:1: ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 ) ) ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 )* ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:884:1: ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 ) ) ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 )* ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:885:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 ) ) ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 )* )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:885:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:886:1: ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_4_2()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:887:1: ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:887:2: rule__WorkDefinition__LinksToSuccessorsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__WorkDefinition__LinksToSuccessorsAssignment_4_2_in_rule__WorkDefinition__Group_4__2__Impl1747);
            rule__WorkDefinition__LinksToSuccessorsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_4_2()); 

            }

            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:890:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 )* )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:891:1: ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_4_2()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:892:1: ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:892:2: rule__WorkDefinition__LinksToSuccessorsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__WorkDefinition__LinksToSuccessorsAssignment_4_2_in_rule__WorkDefinition__Group_4__2__Impl1759);
            	    rule__WorkDefinition__LinksToSuccessorsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_4_2()); 

            }


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
    // $ANTLR end "rule__WorkDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__DependanceStart__Group__0"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:909:1: rule__DependanceStart__Group__0 : rule__DependanceStart__Group__0__Impl rule__DependanceStart__Group__1 ;
    public final void rule__DependanceStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:913:1: ( rule__DependanceStart__Group__0__Impl rule__DependanceStart__Group__1 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:914:2: rule__DependanceStart__Group__0__Impl rule__DependanceStart__Group__1
            {
            pushFollow(FOLLOW_rule__DependanceStart__Group__0__Impl_in_rule__DependanceStart__Group__01798);
            rule__DependanceStart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DependanceStart__Group__1_in_rule__DependanceStart__Group__01801);
            rule__DependanceStart__Group__1();

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
    // $ANTLR end "rule__DependanceStart__Group__0"


    // $ANTLR start "rule__DependanceStart__Group__0__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:921:1: rule__DependanceStart__Group__0__Impl : ( ( rule__DependanceStart__PredecessorAssignment_0 ) ) ;
    public final void rule__DependanceStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:925:1: ( ( ( rule__DependanceStart__PredecessorAssignment_0 ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:926:1: ( ( rule__DependanceStart__PredecessorAssignment_0 ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:926:1: ( ( rule__DependanceStart__PredecessorAssignment_0 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:927:1: ( rule__DependanceStart__PredecessorAssignment_0 )
            {
             before(grammarAccess.getDependanceStartAccess().getPredecessorAssignment_0()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:928:1: ( rule__DependanceStart__PredecessorAssignment_0 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:928:2: rule__DependanceStart__PredecessorAssignment_0
            {
            pushFollow(FOLLOW_rule__DependanceStart__PredecessorAssignment_0_in_rule__DependanceStart__Group__0__Impl1828);
            rule__DependanceStart__PredecessorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDependanceStartAccess().getPredecessorAssignment_0()); 

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
    // $ANTLR end "rule__DependanceStart__Group__0__Impl"


    // $ANTLR start "rule__DependanceStart__Group__1"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:938:1: rule__DependanceStart__Group__1 : rule__DependanceStart__Group__1__Impl ;
    public final void rule__DependanceStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:942:1: ( rule__DependanceStart__Group__1__Impl )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:943:2: rule__DependanceStart__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DependanceStart__Group__1__Impl_in_rule__DependanceStart__Group__11858);
            rule__DependanceStart__Group__1__Impl();

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
    // $ANTLR end "rule__DependanceStart__Group__1"


    // $ANTLR start "rule__DependanceStart__Group__1__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:949:1: rule__DependanceStart__Group__1__Impl : ( ( rule__DependanceStart__LinkAssignment_1 ) ) ;
    public final void rule__DependanceStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:953:1: ( ( ( rule__DependanceStart__LinkAssignment_1 ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:954:1: ( ( rule__DependanceStart__LinkAssignment_1 ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:954:1: ( ( rule__DependanceStart__LinkAssignment_1 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:955:1: ( rule__DependanceStart__LinkAssignment_1 )
            {
             before(grammarAccess.getDependanceStartAccess().getLinkAssignment_1()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:956:1: ( rule__DependanceStart__LinkAssignment_1 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:956:2: rule__DependanceStart__LinkAssignment_1
            {
            pushFollow(FOLLOW_rule__DependanceStart__LinkAssignment_1_in_rule__DependanceStart__Group__1__Impl1885);
            rule__DependanceStart__LinkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDependanceStartAccess().getLinkAssignment_1()); 

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
    // $ANTLR end "rule__DependanceStart__Group__1__Impl"


    // $ANTLR start "rule__DependanceFinish__Group__0"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:970:1: rule__DependanceFinish__Group__0 : rule__DependanceFinish__Group__0__Impl rule__DependanceFinish__Group__1 ;
    public final void rule__DependanceFinish__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:974:1: ( rule__DependanceFinish__Group__0__Impl rule__DependanceFinish__Group__1 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:975:2: rule__DependanceFinish__Group__0__Impl rule__DependanceFinish__Group__1
            {
            pushFollow(FOLLOW_rule__DependanceFinish__Group__0__Impl_in_rule__DependanceFinish__Group__01919);
            rule__DependanceFinish__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DependanceFinish__Group__1_in_rule__DependanceFinish__Group__01922);
            rule__DependanceFinish__Group__1();

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
    // $ANTLR end "rule__DependanceFinish__Group__0"


    // $ANTLR start "rule__DependanceFinish__Group__0__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:982:1: rule__DependanceFinish__Group__0__Impl : ( ( rule__DependanceFinish__PredecessorAssignment_0 ) ) ;
    public final void rule__DependanceFinish__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:986:1: ( ( ( rule__DependanceFinish__PredecessorAssignment_0 ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:987:1: ( ( rule__DependanceFinish__PredecessorAssignment_0 ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:987:1: ( ( rule__DependanceFinish__PredecessorAssignment_0 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:988:1: ( rule__DependanceFinish__PredecessorAssignment_0 )
            {
             before(grammarAccess.getDependanceFinishAccess().getPredecessorAssignment_0()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:989:1: ( rule__DependanceFinish__PredecessorAssignment_0 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:989:2: rule__DependanceFinish__PredecessorAssignment_0
            {
            pushFollow(FOLLOW_rule__DependanceFinish__PredecessorAssignment_0_in_rule__DependanceFinish__Group__0__Impl1949);
            rule__DependanceFinish__PredecessorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDependanceFinishAccess().getPredecessorAssignment_0()); 

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
    // $ANTLR end "rule__DependanceFinish__Group__0__Impl"


    // $ANTLR start "rule__DependanceFinish__Group__1"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:999:1: rule__DependanceFinish__Group__1 : rule__DependanceFinish__Group__1__Impl ;
    public final void rule__DependanceFinish__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1003:1: ( rule__DependanceFinish__Group__1__Impl )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1004:2: rule__DependanceFinish__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DependanceFinish__Group__1__Impl_in_rule__DependanceFinish__Group__11979);
            rule__DependanceFinish__Group__1__Impl();

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
    // $ANTLR end "rule__DependanceFinish__Group__1"


    // $ANTLR start "rule__DependanceFinish__Group__1__Impl"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1010:1: rule__DependanceFinish__Group__1__Impl : ( ( rule__DependanceFinish__LinkAssignment_1 ) ) ;
    public final void rule__DependanceFinish__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1014:1: ( ( ( rule__DependanceFinish__LinkAssignment_1 ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1015:1: ( ( rule__DependanceFinish__LinkAssignment_1 ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1015:1: ( ( rule__DependanceFinish__LinkAssignment_1 ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1016:1: ( rule__DependanceFinish__LinkAssignment_1 )
            {
             before(grammarAccess.getDependanceFinishAccess().getLinkAssignment_1()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1017:1: ( rule__DependanceFinish__LinkAssignment_1 )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1017:2: rule__DependanceFinish__LinkAssignment_1
            {
            pushFollow(FOLLOW_rule__DependanceFinish__LinkAssignment_1_in_rule__DependanceFinish__Group__1__Impl2006);
            rule__DependanceFinish__LinkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDependanceFinishAccess().getLinkAssignment_1()); 

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
    // $ANTLR end "rule__DependanceFinish__Group__1__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1032:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1036:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1037:1: ( RULE_ID )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1037:1: ( RULE_ID )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1038:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__NameAssignment_12045); 
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1047:1: rule__Process__ProcessElementsAssignment_3 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1051:1: ( ( ruleProcessElement ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1052:1: ( ruleProcessElement )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1052:1: ( ruleProcessElement )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1053:1: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_32076);
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
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1062:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1066:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1067:1: ( RULE_ID )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1067:1: ( RULE_ID )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1068:1: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkDefinition__NameAssignment_12107); 
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


    // $ANTLR start "rule__WorkDefinition__LinksToPredecessorsAssignment_3_2"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1077:1: rule__WorkDefinition__LinksToPredecessorsAssignment_3_2 : ( ruleDependanceStart ) ;
    public final void rule__WorkDefinition__LinksToPredecessorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1081:1: ( ( ruleDependanceStart ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1082:1: ( ruleDependanceStart )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1082:1: ( ruleDependanceStart )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1083:1: ruleDependanceStart
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsDependanceStartParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleDependanceStart_in_rule__WorkDefinition__LinksToPredecessorsAssignment_3_22138);
            ruleDependanceStart();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsDependanceStartParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__LinksToPredecessorsAssignment_3_2"


    // $ANTLR start "rule__WorkDefinition__LinksToSuccessorsAssignment_4_2"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1092:1: rule__WorkDefinition__LinksToSuccessorsAssignment_4_2 : ( ruleDependanceFinish ) ;
    public final void rule__WorkDefinition__LinksToSuccessorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1096:1: ( ( ruleDependanceFinish ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1097:1: ( ruleDependanceFinish )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1097:1: ( ruleDependanceFinish )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1098:1: ruleDependanceFinish
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsDependanceFinishParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleDependanceFinish_in_rule__WorkDefinition__LinksToSuccessorsAssignment_4_22169);
            ruleDependanceFinish();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsDependanceFinishParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__LinksToSuccessorsAssignment_4_2"


    // $ANTLR start "rule__DependanceStart__PredecessorAssignment_0"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1107:1: rule__DependanceStart__PredecessorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DependanceStart__PredecessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1111:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1112:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1112:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1113:1: ( RULE_ID )
            {
             before(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1114:1: ( RULE_ID )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1115:1: RULE_ID
            {
             before(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DependanceStart__PredecessorAssignment_02204); 
             after(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 

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
    // $ANTLR end "rule__DependanceStart__PredecessorAssignment_0"


    // $ANTLR start "rule__DependanceStart__LinkAssignment_1"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1126:1: rule__DependanceStart__LinkAssignment_1 : ( ruleWorkSequenceKindStart ) ;
    public final void rule__DependanceStart__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1130:1: ( ( ruleWorkSequenceKindStart ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1131:1: ( ruleWorkSequenceKindStart )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1131:1: ( ruleWorkSequenceKindStart )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1132:1: ruleWorkSequenceKindStart
            {
             before(grammarAccess.getDependanceStartAccess().getLinkWorkSequenceKindStartParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorkSequenceKindStart_in_rule__DependanceStart__LinkAssignment_12239);
            ruleWorkSequenceKindStart();

            state._fsp--;

             after(grammarAccess.getDependanceStartAccess().getLinkWorkSequenceKindStartParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DependanceStart__LinkAssignment_1"


    // $ANTLR start "rule__WorkSequenceKindStart__Started2StartAssignment_0"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1141:1: rule__WorkSequenceKindStart__Started2StartAssignment_0 : ( ( 'started' ) ) ;
    public final void rule__WorkSequenceKindStart__Started2StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1145:1: ( ( ( 'started' ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1146:1: ( ( 'started' ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1146:1: ( ( 'started' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1147:1: ( 'started' )
            {
             before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1148:1: ( 'started' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1149:1: 'started'
            {
             before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__WorkSequenceKindStart__Started2StartAssignment_02275); 
             after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0()); 

            }

             after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0()); 

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
    // $ANTLR end "rule__WorkSequenceKindStart__Started2StartAssignment_0"


    // $ANTLR start "rule__WorkSequenceKindStart__Started2FinishAssignment_1"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1164:1: rule__WorkSequenceKindStart__Started2FinishAssignment_1 : ( ( 'finished' ) ) ;
    public final void rule__WorkSequenceKindStart__Started2FinishAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1168:1: ( ( ( 'finished' ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1169:1: ( ( 'finished' ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1169:1: ( ( 'finished' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1170:1: ( 'finished' )
            {
             before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1171:1: ( 'finished' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1172:1: 'finished'
            {
             before(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__WorkSequenceKindStart__Started2FinishAssignment_12319); 
             after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0()); 

            }

             after(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0()); 

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
    // $ANTLR end "rule__WorkSequenceKindStart__Started2FinishAssignment_1"


    // $ANTLR start "rule__DependanceFinish__PredecessorAssignment_0"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1187:1: rule__DependanceFinish__PredecessorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DependanceFinish__PredecessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1191:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1192:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1192:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1193:1: ( RULE_ID )
            {
             before(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1194:1: ( RULE_ID )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1195:1: RULE_ID
            {
             before(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DependanceFinish__PredecessorAssignment_02362); 
             after(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 

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
    // $ANTLR end "rule__DependanceFinish__PredecessorAssignment_0"


    // $ANTLR start "rule__DependanceFinish__LinkAssignment_1"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1206:1: rule__DependanceFinish__LinkAssignment_1 : ( ruleWorkSequenceKindFinish ) ;
    public final void rule__DependanceFinish__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1210:1: ( ( ruleWorkSequenceKindFinish ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1211:1: ( ruleWorkSequenceKindFinish )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1211:1: ( ruleWorkSequenceKindFinish )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1212:1: ruleWorkSequenceKindFinish
            {
             before(grammarAccess.getDependanceFinishAccess().getLinkWorkSequenceKindFinishParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorkSequenceKindFinish_in_rule__DependanceFinish__LinkAssignment_12397);
            ruleWorkSequenceKindFinish();

            state._fsp--;

             after(grammarAccess.getDependanceFinishAccess().getLinkWorkSequenceKindFinishParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DependanceFinish__LinkAssignment_1"


    // $ANTLR start "rule__WorkSequenceKindFinish__Finished2StartAssignment_0"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1221:1: rule__WorkSequenceKindFinish__Finished2StartAssignment_0 : ( ( 'started' ) ) ;
    public final void rule__WorkSequenceKindFinish__Finished2StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1225:1: ( ( ( 'started' ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1226:1: ( ( 'started' ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1226:1: ( ( 'started' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1227:1: ( 'started' )
            {
             before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1228:1: ( 'started' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1229:1: 'started'
            {
             before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__WorkSequenceKindFinish__Finished2StartAssignment_02433); 
             after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0()); 

            }

             after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0()); 

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
    // $ANTLR end "rule__WorkSequenceKindFinish__Finished2StartAssignment_0"


    // $ANTLR start "rule__WorkSequenceKindFinish__Finished2FinishAssignment_1"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1244:1: rule__WorkSequenceKindFinish__Finished2FinishAssignment_1 : ( ( 'finished' ) ) ;
    public final void rule__WorkSequenceKindFinish__Finished2FinishAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1248:1: ( ( ( 'finished' ) ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1249:1: ( ( 'finished' ) )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1249:1: ( ( 'finished' ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1250:1: ( 'finished' )
            {
             before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0()); 
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1251:1: ( 'finished' )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1252:1: 'finished'
            {
             before(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__WorkSequenceKindFinish__Finished2FinishAssignment_12477); 
             after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0()); 

            }

             after(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0()); 

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
    // $ANTLR end "rule__WorkSequenceKindFinish__Finished2FinishAssignment_1"


    // $ANTLR start "rule__Guidance__TextAssignment"
    // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1267:1: rule__Guidance__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Guidance__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1271:1: ( ( RULE_STRING ) )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1272:1: ( RULE_STRING )
            {
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1272:1: ( RULE_STRING )
            // ../fr.enseeiht.pdl2.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDL2.g:1273:1: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Guidance__TextAssignment2516); 
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
    public static final BitSet FOLLOW_ruleDependanceStart_in_entryRuleDependanceStart241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependanceStart248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependanceStart__Group__0_in_ruleDependanceStart274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequenceKindStart_in_entryRuleWorkSequenceKindStart301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSequenceKindStart308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequenceKindStart__Alternatives_in_ruleWorkSequenceKindStart334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependanceFinish_in_entryRuleDependanceFinish361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependanceFinish368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependanceFinish__Group__0_in_ruleDependanceFinish394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequenceKindFinish_in_entryRuleWorkSequenceKindFinish421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSequenceKindFinish428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequenceKindFinish__Alternatives_in_ruleWorkSequenceKindFinish454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidance488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TextAssignment_in_ruleGuidance514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_rule__ProcessElement__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_rule__ProcessElement__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequenceKindStart__Started2StartAssignment_0_in_rule__WorkSequenceKindStart__Alternatives599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequenceKindStart__Started2FinishAssignment_1_in_rule__WorkSequenceKindStart__Alternatives617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequenceKindFinish__Finished2StartAssignment_0_in_rule__WorkSequenceKindFinish__Alternatives650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequenceKindFinish__Finished2FinishAssignment_1_in_rule__WorkSequenceKindFinish__Alternatives668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__0699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__0702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Process__Group__0__Impl730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__1761 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__NameAssignment_1_in_rule__Process__Group__1__Impl791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__2821 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__Process__Group__3_in_rule__Process__Group__2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Process__Group__2__Impl852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__3883 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_3_in_rule__Process__Group__3__Impl913 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Process__Group__4__Impl972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__0__Impl_in_rule__WorkDefinition__Group__01013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__1_in_rule__WorkDefinition__Group__01016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WorkDefinition__Group__0__Impl1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__1__Impl_in_rule__WorkDefinition__Group__11075 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__2_in_rule__WorkDefinition__Group__11078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__NameAssignment_1_in_rule__WorkDefinition__Group__1__Impl1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__2__Impl_in_rule__WorkDefinition__Group__21135 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__3_in_rule__WorkDefinition__Group__21138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkDefinition__Group__2__Impl1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__3__Impl_in_rule__WorkDefinition__Group__31197 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__4_in_rule__WorkDefinition__Group__31200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_3__0_in_rule__WorkDefinition__Group__3__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__4__Impl_in_rule__WorkDefinition__Group__41258 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__5_in_rule__WorkDefinition__Group__41261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_4__0_in_rule__WorkDefinition__Group__4__Impl1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__5__Impl_in_rule__WorkDefinition__Group__51319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WorkDefinition__Group__5__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_3__0__Impl_in_rule__WorkDefinition__Group_3__01390 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_3__1_in_rule__WorkDefinition__Group_3__01393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WorkDefinition__Group_3__0__Impl1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_3__1__Impl_in_rule__WorkDefinition__Group_3__11452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_3__2_in_rule__WorkDefinition__Group_3__11455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WorkDefinition__Group_3__1__Impl1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_3__2__Impl_in_rule__WorkDefinition__Group_3__21514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__LinksToPredecessorsAssignment_3_2_in_rule__WorkDefinition__Group_3__2__Impl1543 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__WorkDefinition__LinksToPredecessorsAssignment_3_2_in_rule__WorkDefinition__Group_3__2__Impl1555 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_4__0__Impl_in_rule__WorkDefinition__Group_4__01594 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_4__1_in_rule__WorkDefinition__Group_4__01597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WorkDefinition__Group_4__0__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_4__1__Impl_in_rule__WorkDefinition__Group_4__11656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_4__2_in_rule__WorkDefinition__Group_4__11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WorkDefinition__Group_4__1__Impl1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group_4__2__Impl_in_rule__WorkDefinition__Group_4__21718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__LinksToSuccessorsAssignment_4_2_in_rule__WorkDefinition__Group_4__2__Impl1747 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__WorkDefinition__LinksToSuccessorsAssignment_4_2_in_rule__WorkDefinition__Group_4__2__Impl1759 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DependanceStart__Group__0__Impl_in_rule__DependanceStart__Group__01798 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__DependanceStart__Group__1_in_rule__DependanceStart__Group__01801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependanceStart__PredecessorAssignment_0_in_rule__DependanceStart__Group__0__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependanceStart__Group__1__Impl_in_rule__DependanceStart__Group__11858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependanceStart__LinkAssignment_1_in_rule__DependanceStart__Group__1__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependanceFinish__Group__0__Impl_in_rule__DependanceFinish__Group__01919 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__DependanceFinish__Group__1_in_rule__DependanceFinish__Group__01922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependanceFinish__PredecessorAssignment_0_in_rule__DependanceFinish__Group__0__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependanceFinish__Group__1__Impl_in_rule__DependanceFinish__Group__11979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependanceFinish__LinkAssignment_1_in_rule__DependanceFinish__Group__1__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__NameAssignment_12045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_32076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkDefinition__NameAssignment_12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependanceStart_in_rule__WorkDefinition__LinksToPredecessorsAssignment_3_22138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependanceFinish_in_rule__WorkDefinition__LinksToSuccessorsAssignment_4_22169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DependanceStart__PredecessorAssignment_02204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequenceKindStart_in_rule__DependanceStart__LinkAssignment_12239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WorkSequenceKindStart__Started2StartAssignment_02275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__WorkSequenceKindStart__Started2FinishAssignment_12319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DependanceFinish__PredecessorAssignment_02362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequenceKindFinish_in_rule__DependanceFinish__LinkAssignment_12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WorkSequenceKindFinish__Finished2StartAssignment_02433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__WorkSequenceKindFinish__Finished2FinishAssignment_12477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Guidance__TextAssignment2516 = new BitSet(new long[]{0x0000000000000002L});

}