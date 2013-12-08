package fr.enseeiht.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.enseeiht.services.PDL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'wd'", "'ws'", "'from'", "'to'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
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
    public String getGrammarFileName() { return "../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g"; }



     	private PDL1GrammarAccess grammarAccess;
     	
        public InternalPDL1Parser(TokenStream input, PDL1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Process";	
       	}
       	
       	@Override
       	protected PDL1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProcess"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:68:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:69:2: (iv_ruleProcess= ruleProcess EOF )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:70:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess75);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:77:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:80:28: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:81:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:81:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:81:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProcess122); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:86:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProcess156); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:107:1: ( (lv_processElements_3_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||(LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:108:1: (lv_processElements_3_0= ruleProcessElement )
            	    {
            	    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:108:1: (lv_processElements_3_0= ruleProcessElement )
            	    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:109:3: lv_processElements_3_0= ruleProcessElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessElement_in_ruleProcess177);
            	    lv_processElements_3_0=ruleProcessElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"processElements",
            	            		lv_processElements_3_0, 
            	            		"ProcessElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleProcess190); 

                	newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:137:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:138:2: (iv_ruleProcessElement= ruleProcessElement EOF )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:139:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_ruleProcessElement_in_entryRuleProcessElement226);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessElement236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:146:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Guidance_2 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:149:28: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:150:1: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:150:1: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:151:5: this_WorkDefinition_0= ruleWorkDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWorkDefinition_in_ruleProcessElement283);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;

                     
                            current = this_WorkDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:161:5: this_WorkSequence_1= ruleWorkSequence
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWorkSequence_in_ruleProcessElement310);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;

                     
                            current = this_WorkSequence_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:171:5: this_Guidance_2= ruleGuidance
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGuidance_in_ruleProcessElement337);
                    this_Guidance_2=ruleGuidance();

                    state._fsp--;

                     
                            current = this_Guidance_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:187:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:188:2: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:189:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition372);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkDefinition382); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:196:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:199:28: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:200:1: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:200:1: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:200:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleWorkDefinition419); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
                
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:204:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:205:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:205:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:206:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkDefinition436); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:230:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:231:2: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:232:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence477);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSequence487); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:239:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_linkType_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:242:28: ( (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:243:1: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:243:1: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:243:3: otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleWorkSequence524); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
                
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:247:1: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:248:1: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:248:1: (lv_linkType_1_0= ruleWorkSequenceType )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:249:3: lv_linkType_1_0= ruleWorkSequenceType
            {
             
            	        newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleWorkSequenceType_in_ruleWorkSequence545);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            	        }
                   		set(
                   			current, 
                   			"linkType",
                    		lv_linkType_1_0, 
                    		"WorkSequenceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleWorkSequence557); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
                
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:269:1: ( (otherlv_3= RULE_ID ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:270:1: (otherlv_3= RULE_ID )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:270:1: (otherlv_3= RULE_ID )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:271:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkSequenceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSequence577); 

            		newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleWorkSequence589); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
                
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:286:1: ( (otherlv_5= RULE_ID ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:287:1: (otherlv_5= RULE_ID )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:287:1: (otherlv_5= RULE_ID )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:288:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkSequenceRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSequence609); 

            		newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:307:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:308:2: (iv_ruleGuidance= ruleGuidance EOF )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:309:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_ruleGuidance_in_entryRuleGuidance645);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidance655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:316:1: ruleGuidance returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:319:28: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:320:1: ( (lv_text_0_0= RULE_STRING ) )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:320:1: ( (lv_text_0_0= RULE_STRING ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:321:1: (lv_text_0_0= RULE_STRING )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:321:1: (lv_text_0_0= RULE_STRING )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:322:3: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGuidance696); 

            			newLeafNode(lv_text_0_0, grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuidanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "ruleWorkSequenceType"
    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:346:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:348:28: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:349:1: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:349:1: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:349:2: (enumLiteral_0= 's2s' )
                    {
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:349:2: (enumLiteral_0= 's2s' )
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:349:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleWorkSequenceType750); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:355:6: (enumLiteral_1= 'f2s' )
                    {
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:355:6: (enumLiteral_1= 'f2s' )
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:355:8: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_19_in_ruleWorkSequenceType767); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:361:6: (enumLiteral_2= 's2f' )
                    {
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:361:6: (enumLiteral_2= 's2f' )
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:361:8: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_20_in_ruleWorkSequenceType784); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:367:6: (enumLiteral_3= 'f2f' )
                    {
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:367:6: (enumLiteral_3= 'f2f' )
                    // ../fr.enseeiht.pdl1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL1.g:367:8: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_21_in_ruleWorkSequenceType801); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProcess122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcess156 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_ruleProcessElement_in_ruleProcess177 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_13_in_ruleProcess190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessElement_in_entryRuleProcessElement226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessElement236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_ruleProcessElement283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequence_in_ruleProcessElement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_ruleProcessElement337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkDefinition382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleWorkDefinition419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkDefinition436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSequence487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleWorkSequence524 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_ruleWorkSequenceType_in_ruleWorkSequence545 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleWorkSequence557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSequence577 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWorkSequence589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSequence609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidance655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGuidance696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWorkSequenceType750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWorkSequenceType767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleWorkSequenceType784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleWorkSequenceType801 = new BitSet(new long[]{0x0000000000000002L});

}