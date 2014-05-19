// $ANTLR 3.4 /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g 2014-05-19 11:18:33
package antlrmain;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PuzzleSolverTreeGrammar extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "CHAR", "CONDS", "EQ", "ESC_SEQ", "HEX_DIGIT", "ID", "MINUS", "NL", "OCTAL_ESC", "OP", "PLUS", "UNICODE_ESC", "WS"
    };

    public static final int EOF=-1;
    public static final int BLOCK=4;
    public static final int CHAR=5;
    public static final int CONDS=6;
    public static final int EQ=7;
    public static final int ESC_SEQ=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int MINUS=11;
    public static final int NL=12;
    public static final int OCTAL_ESC=13;
    public static final int OP=14;
    public static final int PLUS=15;
    public static final int UNICODE_ESC=16;
    public static final int WS=17;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public PuzzleSolverTreeGrammar(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public PuzzleSolverTreeGrammar(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return PuzzleSolverTreeGrammar.tokenNames; }
    public String getGrammarFileName() { return "/Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g"; }


    public static class walk_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "walk"
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:10:1: walk : ^( CONDS ( rule )* ) ;
    public final PuzzleSolverTreeGrammar.walk_return walk() throws RecognitionException {
        PuzzleSolverTreeGrammar.walk_return retval = new PuzzleSolverTreeGrammar.walk_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDS1=null;
        PuzzleSolverTreeGrammar.rule_return rule2 =null;


        CommonTree CONDS1_tree=null;

        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:10:7: ( ^( CONDS ( rule )* ) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:10:9: ^( CONDS ( rule )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CONDS1=(CommonTree)match(input,CONDS,FOLLOW_CONDS_in_walk41); 
            CONDS1_tree = (CommonTree)adaptor.dupNode(CONDS1);


            root_1 = (CommonTree)adaptor.becomeRoot(CONDS1_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:10:17: ( rule )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==MINUS||LA1_0==PLUS) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:10:17: rule
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_rule_in_walk43);
                	    rule2=rule();

                	    state._fsp--;

                	    adaptor.addChild(root_1, rule2.getTree());


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "walk"


    public static class rule_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:14:1: rule : ( ^( PLUS BLOCK BLOCK BLOCK ) | ^( MINUS l= BLOCK m= BLOCK r= BLOCK ) -> ^( PLUS $m $r $l) );
    public final PuzzleSolverTreeGrammar.rule_return rule() throws RecognitionException {
        PuzzleSolverTreeGrammar.rule_return retval = new PuzzleSolverTreeGrammar.rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree l=null;
        CommonTree m=null;
        CommonTree r=null;
        CommonTree PLUS3=null;
        CommonTree BLOCK4=null;
        CommonTree BLOCK5=null;
        CommonTree BLOCK6=null;
        CommonTree MINUS7=null;

        CommonTree l_tree=null;
        CommonTree m_tree=null;
        CommonTree r_tree=null;
        CommonTree PLUS3_tree=null;
        CommonTree BLOCK4_tree=null;
        CommonTree BLOCK5_tree=null;
        CommonTree BLOCK6_tree=null;
        CommonTree MINUS7_tree=null;
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleNodeStream stream_BLOCK=new RewriteRuleNodeStream(adaptor,"token BLOCK");

        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:14:7: ( ^( PLUS BLOCK BLOCK BLOCK ) | ^( MINUS l= BLOCK m= BLOCK r= BLOCK ) -> ^( PLUS $m $r $l) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PLUS) ) {
                alt2=1;
            }
            else if ( (LA2_0==MINUS) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:14:9: ^( PLUS BLOCK BLOCK BLOCK )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS3=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_rule57); 
                    PLUS3_tree = (CommonTree)adaptor.dupNode(PLUS3);


                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS3_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BLOCK4=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_rule59); 
                    BLOCK4_tree = (CommonTree)adaptor.dupNode(BLOCK4);


                    adaptor.addChild(root_1, BLOCK4_tree);


                    _last = (CommonTree)input.LT(1);
                    BLOCK5=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_rule61); 
                    BLOCK5_tree = (CommonTree)adaptor.dupNode(BLOCK5);


                    adaptor.addChild(root_1, BLOCK5_tree);


                    _last = (CommonTree)input.LT(1);
                    BLOCK6=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_rule63); 
                    BLOCK6_tree = (CommonTree)adaptor.dupNode(BLOCK6);


                    adaptor.addChild(root_1, BLOCK6_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:15:5: ^( MINUS l= BLOCK m= BLOCK r= BLOCK )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS7=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_rule72);  
                    stream_MINUS.add(MINUS7);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    l=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_rule76);  
                    stream_BLOCK.add(l);


                    _last = (CommonTree)input.LT(1);
                    m=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_rule80);  
                    stream_BLOCK.add(m);


                    _last = (CommonTree)input.LT(1);
                    r=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_rule84);  
                    stream_BLOCK.add(r);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: r, l, m
                    // token labels: r, l, m
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_r=new RewriteRuleNodeStream(adaptor,"token r",r);
                    RewriteRuleNodeStream stream_l=new RewriteRuleNodeStream(adaptor,"token l",l);
                    RewriteRuleNodeStream stream_m=new RewriteRuleNodeStream(adaptor,"token m",m);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 15:38: -> ^( PLUS $m $r $l)
                    {
                        // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:15:41: ^( PLUS $m $r $l)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PLUS, "PLUS")
                        , root_1);

                        adaptor.addChild(root_1, stream_m.nextNode());

                        adaptor.addChild(root_1, stream_r.nextNode());

                        adaptor.addChild(root_1, stream_l.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rule"

    // Delegated rules


 

    public static final BitSet FOLLOW_CONDS_in_walk41 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rule_in_walk43 = new BitSet(new long[]{0x0000000000008808L});
    public static final BitSet FOLLOW_PLUS_in_rule57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCK_in_rule59 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BLOCK_in_rule61 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BLOCK_in_rule63 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_rule72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCK_in_rule76 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BLOCK_in_rule80 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BLOCK_in_rule84 = new BitSet(new long[]{0x0000000000000008L});

}