package fr.enseeiht.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.enseeiht.services.PDL2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL2Parser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g"; }



     	private PDL2GrammarAccess grammarAccess;
     	
        public InternalPDL2Parser(TokenStream input, PDL2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Process";	
       	}
       	
       	@Override
       	protected PDL2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProcess"
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:67:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:68:2: (iv_ruleProcess= ruleProcess EOF )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:69:2: iv_ruleProcess= ruleProcess EOF
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
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:76:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:79:28: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:80:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:80:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:80:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProcess122); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:85:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:86:3: lv_name_1_0= RULE_ID
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
                
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:106:1: ( (lv_processElements_3_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:107:1: (lv_processElements_3_0= ruleProcessElement )
            	    {
            	    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:107:1: (lv_processElements_3_0= ruleProcessElement )
            	    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:108:3: lv_processElements_3_0= ruleProcessElement
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
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:136:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:137:2: (iv_ruleProcessElement= ruleProcessElement EOF )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:138:2: iv_ruleProcessElement= ruleProcessElement EOF
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
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:145:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_Guidance_1= ruleGuidance ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_Guidance_1 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:148:28: ( (this_WorkDefinition_0= ruleWorkDefinition | this_Guidance_1= ruleGuidance ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:149:1: (this_WorkDefinition_0= ruleWorkDefinition | this_Guidance_1= ruleGuidance )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:149:1: (this_WorkDefinition_0= ruleWorkDefinition | this_Guidance_1= ruleGuidance )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:150:5: this_WorkDefinition_0= ruleWorkDefinition
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
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:160:5: this_Guidance_1= ruleGuidance
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGuidance_in_ruleProcessElement310);
                    this_Guidance_1=ruleGuidance();

                    state._fsp--;

                     
                            current = this_Guidance_1; 
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
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:176:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:177:2: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:178:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition345);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkDefinition355); 

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
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:185:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )? (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToSuccessors_8_0= ruleDependanceFinish ) )+ )? otherlv_9= '}' ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_linksToPredecessors_5_0 = null;

        EObject lv_linksToSuccessors_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:188:28: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )? (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToSuccessors_8_0= ruleDependanceFinish ) )+ )? otherlv_9= '}' ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:189:1: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )? (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToSuccessors_8_0= ruleDependanceFinish ) )+ )? otherlv_9= '}' )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:189:1: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )? (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToSuccessors_8_0= ruleDependanceFinish ) )+ )? otherlv_9= '}' )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:189:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )? (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToSuccessors_8_0= ruleDependanceFinish ) )+ )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleWorkDefinition392); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
                
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:193:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:194:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:194:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:195:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkDefinition409); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleWorkDefinition426); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:215:1: (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:215:3: otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleWorkDefinition439); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getStartsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleWorkDefinition451); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getIfKeyword_3_1());
                        
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:223:1: ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:224:1: (lv_linksToPredecessors_5_0= ruleDependanceStart )
                    	    {
                    	    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:224:1: (lv_linksToPredecessors_5_0= ruleDependanceStart )
                    	    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:225:3: lv_linksToPredecessors_5_0= ruleDependanceStart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsDependanceStartParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDependanceStart_in_ruleWorkDefinition472);
                    	    lv_linksToPredecessors_5_0=ruleDependanceStart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"linksToPredecessors",
                    	            		lv_linksToPredecessors_5_0, 
                    	            		"DependanceStart");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:241:5: (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToSuccessors_8_0= ruleDependanceFinish ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:241:7: otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToSuccessors_8_0= ruleDependanceFinish ) )+
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleWorkDefinition488); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkDefinitionAccess().getFinishesKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleWorkDefinition500); 

                        	newLeafNode(otherlv_7, grammarAccess.getWorkDefinitionAccess().getIfKeyword_4_1());
                        
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:249:1: ( (lv_linksToSuccessors_8_0= ruleDependanceFinish ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:250:1: (lv_linksToSuccessors_8_0= ruleDependanceFinish )
                    	    {
                    	    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:250:1: (lv_linksToSuccessors_8_0= ruleDependanceFinish )
                    	    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:251:3: lv_linksToSuccessors_8_0= ruleDependanceFinish
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsDependanceFinishParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDependanceFinish_in_ruleWorkDefinition521);
                    	    lv_linksToSuccessors_8_0=ruleDependanceFinish();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"linksToSuccessors",
                    	            		lv_linksToSuccessors_8_0, 
                    	            		"DependanceFinish");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleWorkDefinition536); 

                	newLeafNode(otherlv_9, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleDependanceStart"
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:279:1: entryRuleDependanceStart returns [EObject current=null] : iv_ruleDependanceStart= ruleDependanceStart EOF ;
    public final EObject entryRuleDependanceStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependanceStart = null;


        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:280:2: (iv_ruleDependanceStart= ruleDependanceStart EOF )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:281:2: iv_ruleDependanceStart= ruleDependanceStart EOF
            {
             newCompositeNode(grammarAccess.getDependanceStartRule()); 
            pushFollow(FOLLOW_ruleDependanceStart_in_entryRuleDependanceStart572);
            iv_ruleDependanceStart=ruleDependanceStart();

            state._fsp--;

             current =iv_ruleDependanceStart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependanceStart582); 

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
    // $ANTLR end "entryRuleDependanceStart"


    // $ANTLR start "ruleDependanceStart"
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:288:1: ruleDependanceStart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindStart ) ) ) ;
    public final EObject ruleDependanceStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_link_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:291:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindStart ) ) ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:292:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindStart ) ) )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:292:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindStart ) ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:292:2: ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindStart ) )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:292:2: ( (otherlv_0= RULE_ID ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:293:1: (otherlv_0= RULE_ID )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:293:1: (otherlv_0= RULE_ID )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:294:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependanceStartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependanceStart627); 

            		newLeafNode(otherlv_0, grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 
            	

            }


            }

            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:305:2: ( (lv_link_1_0= ruleWorkSequenceKindStart ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:306:1: (lv_link_1_0= ruleWorkSequenceKindStart )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:306:1: (lv_link_1_0= ruleWorkSequenceKindStart )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:307:3: lv_link_1_0= ruleWorkSequenceKindStart
            {
             
            	        newCompositeNode(grammarAccess.getDependanceStartAccess().getLinkWorkSequenceKindStartParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleWorkSequenceKindStart_in_ruleDependanceStart648);
            lv_link_1_0=ruleWorkSequenceKindStart();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependanceStartRule());
            	        }
                   		set(
                   			current, 
                   			"link",
                    		lv_link_1_0, 
                    		"WorkSequenceKindStart");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDependanceStart"


    // $ANTLR start "entryRuleWorkSequenceKindStart"
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:331:1: entryRuleWorkSequenceKindStart returns [EObject current=null] : iv_ruleWorkSequenceKindStart= ruleWorkSequenceKindStart EOF ;
    public final EObject entryRuleWorkSequenceKindStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequenceKindStart = null;


        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:332:2: (iv_ruleWorkSequenceKindStart= ruleWorkSequenceKindStart EOF )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:333:2: iv_ruleWorkSequenceKindStart= ruleWorkSequenceKindStart EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceKindStartRule()); 
            pushFollow(FOLLOW_ruleWorkSequenceKindStart_in_entryRuleWorkSequenceKindStart684);
            iv_ruleWorkSequenceKindStart=ruleWorkSequenceKindStart();

            state._fsp--;

             current =iv_ruleWorkSequenceKindStart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSequenceKindStart694); 

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
    // $ANTLR end "entryRuleWorkSequenceKindStart"


    // $ANTLR start "ruleWorkSequenceKindStart"
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:340:1: ruleWorkSequenceKindStart returns [EObject current=null] : ( ( (lv_Started2Start_0_0= 'started' ) ) | ( (lv_Started2Finish_1_0= 'finished' ) ) ) ;
    public final EObject ruleWorkSequenceKindStart() throws RecognitionException {
        EObject current = null;

        Token lv_Started2Start_0_0=null;
        Token lv_Started2Finish_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:343:28: ( ( ( (lv_Started2Start_0_0= 'started' ) ) | ( (lv_Started2Finish_1_0= 'finished' ) ) ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:344:1: ( ( (lv_Started2Start_0_0= 'started' ) ) | ( (lv_Started2Finish_1_0= 'finished' ) ) )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:344:1: ( ( (lv_Started2Start_0_0= 'started' ) ) | ( (lv_Started2Finish_1_0= 'finished' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:344:2: ( (lv_Started2Start_0_0= 'started' ) )
                    {
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:344:2: ( (lv_Started2Start_0_0= 'started' ) )
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:345:1: (lv_Started2Start_0_0= 'started' )
                    {
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:345:1: (lv_Started2Start_0_0= 'started' )
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:346:3: lv_Started2Start_0_0= 'started'
                    {
                    lv_Started2Start_0_0=(Token)match(input,18,FOLLOW_18_in_ruleWorkSequenceKindStart737); 

                            newLeafNode(lv_Started2Start_0_0, grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkSequenceKindStartRule());
                    	        }
                           		setWithLastConsumed(current, "Started2Start", lv_Started2Start_0_0, "started");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:360:6: ( (lv_Started2Finish_1_0= 'finished' ) )
                    {
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:360:6: ( (lv_Started2Finish_1_0= 'finished' ) )
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:361:1: (lv_Started2Finish_1_0= 'finished' )
                    {
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:361:1: (lv_Started2Finish_1_0= 'finished' )
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:362:3: lv_Started2Finish_1_0= 'finished'
                    {
                    lv_Started2Finish_1_0=(Token)match(input,19,FOLLOW_19_in_ruleWorkSequenceKindStart774); 

                            newLeafNode(lv_Started2Finish_1_0, grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkSequenceKindStartRule());
                    	        }
                           		setWithLastConsumed(current, "Started2Finish", lv_Started2Finish_1_0, "finished");
                    	    

                    }


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
    // $ANTLR end "ruleWorkSequenceKindStart"


    // $ANTLR start "entryRuleDependanceFinish"
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:383:1: entryRuleDependanceFinish returns [EObject current=null] : iv_ruleDependanceFinish= ruleDependanceFinish EOF ;
    public final EObject entryRuleDependanceFinish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependanceFinish = null;


        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:384:2: (iv_ruleDependanceFinish= ruleDependanceFinish EOF )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:385:2: iv_ruleDependanceFinish= ruleDependanceFinish EOF
            {
             newCompositeNode(grammarAccess.getDependanceFinishRule()); 
            pushFollow(FOLLOW_ruleDependanceFinish_in_entryRuleDependanceFinish823);
            iv_ruleDependanceFinish=ruleDependanceFinish();

            state._fsp--;

             current =iv_ruleDependanceFinish; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependanceFinish833); 

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
    // $ANTLR end "entryRuleDependanceFinish"


    // $ANTLR start "ruleDependanceFinish"
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:392:1: ruleDependanceFinish returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindFinish ) ) ) ;
    public final EObject ruleDependanceFinish() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_link_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:395:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindFinish ) ) ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:396:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindFinish ) ) )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:396:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindFinish ) ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:396:2: ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindFinish ) )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:396:2: ( (otherlv_0= RULE_ID ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:397:1: (otherlv_0= RULE_ID )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:397:1: (otherlv_0= RULE_ID )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:398:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependanceFinishRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependanceFinish878); 

            		newLeafNode(otherlv_0, grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 
            	

            }


            }

            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:409:2: ( (lv_link_1_0= ruleWorkSequenceKindFinish ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:410:1: (lv_link_1_0= ruleWorkSequenceKindFinish )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:410:1: (lv_link_1_0= ruleWorkSequenceKindFinish )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:411:3: lv_link_1_0= ruleWorkSequenceKindFinish
            {
             
            	        newCompositeNode(grammarAccess.getDependanceFinishAccess().getLinkWorkSequenceKindFinishParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleWorkSequenceKindFinish_in_ruleDependanceFinish899);
            lv_link_1_0=ruleWorkSequenceKindFinish();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependanceFinishRule());
            	        }
                   		set(
                   			current, 
                   			"link",
                    		lv_link_1_0, 
                    		"WorkSequenceKindFinish");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDependanceFinish"


    // $ANTLR start "entryRuleWorkSequenceKindFinish"
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:435:1: entryRuleWorkSequenceKindFinish returns [EObject current=null] : iv_ruleWorkSequenceKindFinish= ruleWorkSequenceKindFinish EOF ;
    public final EObject entryRuleWorkSequenceKindFinish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequenceKindFinish = null;


        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:436:2: (iv_ruleWorkSequenceKindFinish= ruleWorkSequenceKindFinish EOF )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:437:2: iv_ruleWorkSequenceKindFinish= ruleWorkSequenceKindFinish EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceKindFinishRule()); 
            pushFollow(FOLLOW_ruleWorkSequenceKindFinish_in_entryRuleWorkSequenceKindFinish935);
            iv_ruleWorkSequenceKindFinish=ruleWorkSequenceKindFinish();

            state._fsp--;

             current =iv_ruleWorkSequenceKindFinish; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSequenceKindFinish945); 

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
    // $ANTLR end "entryRuleWorkSequenceKindFinish"


    // $ANTLR start "ruleWorkSequenceKindFinish"
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:444:1: ruleWorkSequenceKindFinish returns [EObject current=null] : ( ( (lv_Finished2Start_0_0= 'started' ) ) | ( (lv_Finished2Finish_1_0= 'finished' ) ) ) ;
    public final EObject ruleWorkSequenceKindFinish() throws RecognitionException {
        EObject current = null;

        Token lv_Finished2Start_0_0=null;
        Token lv_Finished2Finish_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:447:28: ( ( ( (lv_Finished2Start_0_0= 'started' ) ) | ( (lv_Finished2Finish_1_0= 'finished' ) ) ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:448:1: ( ( (lv_Finished2Start_0_0= 'started' ) ) | ( (lv_Finished2Finish_1_0= 'finished' ) ) )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:448:1: ( ( (lv_Finished2Start_0_0= 'started' ) ) | ( (lv_Finished2Finish_1_0= 'finished' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:448:2: ( (lv_Finished2Start_0_0= 'started' ) )
                    {
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:448:2: ( (lv_Finished2Start_0_0= 'started' ) )
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:449:1: (lv_Finished2Start_0_0= 'started' )
                    {
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:449:1: (lv_Finished2Start_0_0= 'started' )
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:450:3: lv_Finished2Start_0_0= 'started'
                    {
                    lv_Finished2Start_0_0=(Token)match(input,18,FOLLOW_18_in_ruleWorkSequenceKindFinish988); 

                            newLeafNode(lv_Finished2Start_0_0, grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkSequenceKindFinishRule());
                    	        }
                           		setWithLastConsumed(current, "Finished2Start", lv_Finished2Start_0_0, "started");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:464:6: ( (lv_Finished2Finish_1_0= 'finished' ) )
                    {
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:464:6: ( (lv_Finished2Finish_1_0= 'finished' ) )
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:465:1: (lv_Finished2Finish_1_0= 'finished' )
                    {
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:465:1: (lv_Finished2Finish_1_0= 'finished' )
                    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:466:3: lv_Finished2Finish_1_0= 'finished'
                    {
                    lv_Finished2Finish_1_0=(Token)match(input,19,FOLLOW_19_in_ruleWorkSequenceKindFinish1025); 

                            newLeafNode(lv_Finished2Finish_1_0, grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkSequenceKindFinishRule());
                    	        }
                           		setWithLastConsumed(current, "Finished2Finish", lv_Finished2Finish_1_0, "finished");
                    	    

                    }


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
    // $ANTLR end "ruleWorkSequenceKindFinish"


    // $ANTLR start "entryRuleGuidance"
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:487:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:488:2: (iv_ruleGuidance= ruleGuidance EOF )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:489:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_ruleGuidance_in_entryRuleGuidance1074);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidance1084); 

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
    // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:496:1: ruleGuidance returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:499:28: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:500:1: ( (lv_text_0_0= RULE_STRING ) )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:500:1: ( (lv_text_0_0= RULE_STRING ) )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:501:1: (lv_text_0_0= RULE_STRING )
            {
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:501:1: (lv_text_0_0= RULE_STRING )
            // ../fr.enseeiht.pdl2/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDL2.g:502:3: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGuidance1125); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProcess122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcess156 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_ruleProcessElement_in_ruleProcess177 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_13_in_ruleProcess190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessElement_in_entryRuleProcessElement226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessElement236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_ruleProcessElement283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_ruleProcessElement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkDefinition355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleWorkDefinition392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkDefinition409 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWorkDefinition426 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_15_in_ruleWorkDefinition439 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleWorkDefinition451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependanceStart_in_ruleWorkDefinition472 = new BitSet(new long[]{0x0000000000022010L});
    public static final BitSet FOLLOW_17_in_ruleWorkDefinition488 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleWorkDefinition500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependanceFinish_in_ruleWorkDefinition521 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleWorkDefinition536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependanceStart_in_entryRuleDependanceStart572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependanceStart582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependanceStart627 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleWorkSequenceKindStart_in_ruleDependanceStart648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequenceKindStart_in_entryRuleWorkSequenceKindStart684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSequenceKindStart694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWorkSequenceKindStart737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWorkSequenceKindStart774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependanceFinish_in_entryRuleDependanceFinish823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependanceFinish833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependanceFinish878 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleWorkSequenceKindFinish_in_ruleDependanceFinish899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequenceKindFinish_in_entryRuleWorkSequenceKindFinish935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSequenceKindFinish945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWorkSequenceKindFinish988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWorkSequenceKindFinish1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance1074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidance1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGuidance1125 = new BitSet(new long[]{0x0000000000000002L});

}