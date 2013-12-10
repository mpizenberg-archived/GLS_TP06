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
import fr.enseeiht.services.PETRI1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPETRI1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'petrinet'", "'{'", "'}'", "'place'", "'('", "')'", "'transition'", "'arc'", "'r'", "'from'", "'to'"
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
    public String getGrammarFileName() { return "../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g"; }



     	private PETRI1GrammarAccess grammarAccess;
     	
        public InternalPETRI1Parser(TokenStream input, PETRI1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PetriNet";	
       	}
       	
       	@Override
       	protected PETRI1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePetriNet"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:67:1: entryRulePetriNet returns [EObject current=null] : iv_rulePetriNet= rulePetriNet EOF ;
    public final EObject entryRulePetriNet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePetriNet = null;


        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:68:2: (iv_rulePetriNet= rulePetriNet EOF )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:69:2: iv_rulePetriNet= rulePetriNet EOF
            {
             newCompositeNode(grammarAccess.getPetriNetRule()); 
            pushFollow(FOLLOW_rulePetriNet_in_entryRulePetriNet75);
            iv_rulePetriNet=rulePetriNet();

            state._fsp--;

             current =iv_rulePetriNet; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePetriNet85); 

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
    // $ANTLR end "entryRulePetriNet"


    // $ANTLR start "rulePetriNet"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:76:1: rulePetriNet returns [EObject current=null] : (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_petriNetElements_3_0= rulePetriNetElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePetriNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_petriNetElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:79:28: ( (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_petriNetElements_3_0= rulePetriNetElement ) )* otherlv_4= '}' ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:80:1: (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_petriNetElements_3_0= rulePetriNetElement ) )* otherlv_4= '}' )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:80:1: (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_petriNetElements_3_0= rulePetriNetElement ) )* otherlv_4= '}' )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:80:3: otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_petriNetElements_3_0= rulePetriNetElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePetriNet122); 

                	newLeafNode(otherlv_0, grammarAccess.getPetriNetAccess().getPetrinetKeyword_0());
                
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:85:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePetriNet139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPetriNetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPetriNetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePetriNet156); 

                	newLeafNode(otherlv_2, grammarAccess.getPetriNetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:106:1: ( (lv_petriNetElements_3_0= rulePetriNetElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:107:1: (lv_petriNetElements_3_0= rulePetriNetElement )
            	    {
            	    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:107:1: (lv_petriNetElements_3_0= rulePetriNetElement )
            	    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:108:3: lv_petriNetElements_3_0= rulePetriNetElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPetriNetAccess().getPetriNetElementsPetriNetElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePetriNetElement_in_rulePetriNet177);
            	    lv_petriNetElements_3_0=rulePetriNetElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPetriNetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"petriNetElements",
            	            		lv_petriNetElements_3_0, 
            	            		"PetriNetElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePetriNet190); 

                	newLeafNode(otherlv_4, grammarAccess.getPetriNetAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePetriNet"


    // $ANTLR start "entryRulePetriNetElement"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:136:1: entryRulePetriNetElement returns [EObject current=null] : iv_rulePetriNetElement= rulePetriNetElement EOF ;
    public final EObject entryRulePetriNetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePetriNetElement = null;


        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:137:2: (iv_rulePetriNetElement= rulePetriNetElement EOF )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:138:2: iv_rulePetriNetElement= rulePetriNetElement EOF
            {
             newCompositeNode(grammarAccess.getPetriNetElementRule()); 
            pushFollow(FOLLOW_rulePetriNetElement_in_entryRulePetriNetElement226);
            iv_rulePetriNetElement=rulePetriNetElement();

            state._fsp--;

             current =iv_rulePetriNetElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePetriNetElement236); 

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
    // $ANTLR end "entryRulePetriNetElement"


    // $ANTLR start "rulePetriNetElement"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:145:1: rulePetriNetElement returns [EObject current=null] : (this_Node_0= ruleNode | this_Arc_1= ruleArc ) ;
    public final EObject rulePetriNetElement() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Arc_1 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:148:28: ( (this_Node_0= ruleNode | this_Arc_1= ruleArc ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:149:1: (this_Node_0= ruleNode | this_Arc_1= ruleArc )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:149:1: (this_Node_0= ruleNode | this_Arc_1= ruleArc )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14||LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:150:5: this_Node_0= ruleNode
                    {
                     
                            newCompositeNode(grammarAccess.getPetriNetElementAccess().getNodeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNode_in_rulePetriNetElement283);
                    this_Node_0=ruleNode();

                    state._fsp--;

                     
                            current = this_Node_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:160:5: this_Arc_1= ruleArc
                    {
                     
                            newCompositeNode(grammarAccess.getPetriNetElementAccess().getArcParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArc_in_rulePetriNetElement310);
                    this_Arc_1=ruleArc();

                    state._fsp--;

                     
                            current = this_Arc_1; 
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
    // $ANTLR end "rulePetriNetElement"


    // $ANTLR start "entryRuleNode"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:176:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:177:2: (iv_ruleNode= ruleNode EOF )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:178:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode345);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode355); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:185:1: ruleNode returns [EObject current=null] : (this_Place_0= rulePlace | this_Transition_1= ruleTransition ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Place_0 = null;

        EObject this_Transition_1 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:188:28: ( (this_Place_0= rulePlace | this_Transition_1= ruleTransition ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:189:1: (this_Place_0= rulePlace | this_Transition_1= ruleTransition )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:189:1: (this_Place_0= rulePlace | this_Transition_1= ruleTransition )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:190:5: this_Place_0= rulePlace
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getPlaceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePlace_in_ruleNode402);
                    this_Place_0=rulePlace();

                    state._fsp--;

                     
                            current = this_Place_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:200:5: this_Transition_1= ruleTransition
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTransition_in_ruleNode429);
                    this_Transition_1=ruleTransition();

                    state._fsp--;

                     
                            current = this_Transition_1; 
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRulePlace"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:216:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:217:2: (iv_rulePlace= rulePlace EOF )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:218:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_rulePlace_in_entryRulePlace464);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlace474); 

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
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:225:1: rulePlace returns [EObject current=null] : (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_marking_3_0= RULE_INT ) ) otherlv_4= ')' )? ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_marking_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:228:28: ( (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_marking_3_0= RULE_INT ) ) otherlv_4= ')' )? ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:229:1: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_marking_3_0= RULE_INT ) ) otherlv_4= ')' )? )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:229:1: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_marking_3_0= RULE_INT ) ) otherlv_4= ')' )? )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:229:3: otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_marking_3_0= RULE_INT ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePlace511); 

                	newLeafNode(otherlv_0, grammarAccess.getPlaceAccess().getPlaceKeyword_0());
                
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:233:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:234:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:234:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:235:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlace528); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:251:2: (otherlv_2= '(' ( (lv_marking_3_0= RULE_INT ) ) otherlv_4= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:251:4: otherlv_2= '(' ( (lv_marking_3_0= RULE_INT ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePlace546); 

                        	newLeafNode(otherlv_2, grammarAccess.getPlaceAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:255:1: ( (lv_marking_3_0= RULE_INT ) )
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:256:1: (lv_marking_3_0= RULE_INT )
                    {
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:256:1: (lv_marking_3_0= RULE_INT )
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:257:3: lv_marking_3_0= RULE_INT
                    {
                    lv_marking_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePlace563); 

                    			newLeafNode(lv_marking_3_0, grammarAccess.getPlaceAccess().getMarkingINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPlaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"marking",
                            		lv_marking_3_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePlace580); 

                        	newLeafNode(otherlv_4, grammarAccess.getPlaceAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

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
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleTransition"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:285:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:286:2: (iv_ruleTransition= ruleTransition EOF )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:287:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition618);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition628); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:294:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:297:28: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:298:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:298:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:298:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTransition665); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
                
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:302:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:303:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:303:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:304:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition682); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleArc"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:328:1: entryRuleArc returns [EObject current=null] : iv_ruleArc= ruleArc EOF ;
    public final EObject entryRuleArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArc = null;


        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:329:2: (iv_ruleArc= ruleArc EOF )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:330:2: iv_ruleArc= ruleArc EOF
            {
             newCompositeNode(grammarAccess.getArcRule()); 
            pushFollow(FOLLOW_ruleArc_in_entryRuleArc723);
            iv_ruleArc=ruleArc();

            state._fsp--;

             current =iv_ruleArc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArc733); 

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
    // $ANTLR end "entryRuleArc"


    // $ANTLR start "ruleArc"
    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:337:1: ruleArc returns [EObject current=null] : (otherlv_0= 'arc' (otherlv_1= '(' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= ')' )? ( (lv_readOnly_4_0= 'r' ) )? otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) ) ;
    public final EObject ruleArc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_multiplicity_2_0=null;
        Token otherlv_3=null;
        Token lv_readOnly_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:340:28: ( (otherlv_0= 'arc' (otherlv_1= '(' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= ')' )? ( (lv_readOnly_4_0= 'r' ) )? otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:341:1: (otherlv_0= 'arc' (otherlv_1= '(' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= ')' )? ( (lv_readOnly_4_0= 'r' ) )? otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:341:1: (otherlv_0= 'arc' (otherlv_1= '(' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= ')' )? ( (lv_readOnly_4_0= 'r' ) )? otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:341:3: otherlv_0= 'arc' (otherlv_1= '(' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= ')' )? ( (lv_readOnly_4_0= 'r' ) )? otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleArc770); 

                	newLeafNode(otherlv_0, grammarAccess.getArcAccess().getArcKeyword_0());
                
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:345:1: (otherlv_1= '(' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:345:3: otherlv_1= '(' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleArc783); 

                        	newLeafNode(otherlv_1, grammarAccess.getArcAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:349:1: ( (lv_multiplicity_2_0= RULE_INT ) )
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:350:1: (lv_multiplicity_2_0= RULE_INT )
                    {
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:350:1: (lv_multiplicity_2_0= RULE_INT )
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:351:3: lv_multiplicity_2_0= RULE_INT
                    {
                    lv_multiplicity_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArc800); 

                    			newLeafNode(lv_multiplicity_2_0, grammarAccess.getArcAccess().getMultiplicityINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArcRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"multiplicity",
                            		lv_multiplicity_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleArc817); 

                        	newLeafNode(otherlv_3, grammarAccess.getArcAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }

            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:371:3: ( (lv_readOnly_4_0= 'r' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:372:1: (lv_readOnly_4_0= 'r' )
                    {
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:372:1: (lv_readOnly_4_0= 'r' )
                    // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:373:3: lv_readOnly_4_0= 'r'
                    {
                    lv_readOnly_4_0=(Token)match(input,19,FOLLOW_19_in_ruleArc837); 

                            newLeafNode(lv_readOnly_4_0, grammarAccess.getArcAccess().getReadOnlyRKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArcRule());
                    	        }
                           		setWithLastConsumed(current, "readOnly", true, "r");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleArc863); 

                	newLeafNode(otherlv_5, grammarAccess.getArcAccess().getFromKeyword_3());
                
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:390:1: ( (otherlv_6= RULE_ID ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:391:1: (otherlv_6= RULE_ID )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:391:1: (otherlv_6= RULE_ID )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:392:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArcRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArc883); 

            		newLeafNode(otherlv_6, grammarAccess.getArcAccess().getPredecessorNodeCrossReference_4_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleArc895); 

                	newLeafNode(otherlv_7, grammarAccess.getArcAccess().getToKeyword_5());
                
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:407:1: ( (otherlv_8= RULE_ID ) )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:408:1: (otherlv_8= RULE_ID )
            {
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:408:1: (otherlv_8= RULE_ID )
            // ../fr.enseeiht.petrinet1/src-gen/fr/enseeiht/parser/antlr/internal/InternalPETRI1.g:409:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArcRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArc915); 

            		newLeafNode(otherlv_8, grammarAccess.getArcAccess().getSuccessorNodeCrossReference_6_0()); 
            	

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
    // $ANTLR end "ruleArc"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePetriNet_in_entryRulePetriNet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePetriNet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePetriNet122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePetriNet139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePetriNet156 = new BitSet(new long[]{0x0000000000066000L});
    public static final BitSet FOLLOW_rulePetriNetElement_in_rulePetriNet177 = new BitSet(new long[]{0x0000000000066000L});
    public static final BitSet FOLLOW_13_in_rulePetriNet190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePetriNetElement_in_entryRulePetriNetElement226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePetriNetElement236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rulePetriNetElement283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArc_in_rulePetriNetElement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_ruleNode402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleNode429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_entryRulePlace464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlace474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePlace511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlace528 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_rulePlace546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePlace563 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePlace580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTransition665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArc_in_entryRuleArc723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArc733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleArc770 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_15_in_ruleArc783 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArc800 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArc817 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleArc837 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleArc863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArc883 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArc895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArc915 = new BitSet(new long[]{0x0000000000000002L});

}