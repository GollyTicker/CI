package antlrmain;
// $ANTLR 3.4 /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g 2014-06-07 13:09:36

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PuzzleSolverTreeGrammar extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "CHAR", "CONDS", "EQ", "ESC_SEQ", "HEX_DIGIT", "ID", "NL", "OCTAL_ESC", "OP", "UNICODE_ESC", "WS", "PLUS"
    };

    public static final int EOF=-1;
    public static final int BLOCK=4;
    public static final int CHAR=5;
    public static final int CONDS=6;
    public static final int EQ=7;
    public static final int ESC_SEQ=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int NL=11;
    public static final int OCTAL_ESC=12;
    public static final int OP=13;
    public static final int UNICODE_ESC=14;
    public static final int WS=15;
    public static final int PLUS=16;

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


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:14:1: prog : ^( CONDS rule rule rule rule rule rule ) ;
    public final PuzzleSolverTreeGrammar.prog_return prog() throws RecognitionException {
        PuzzleSolverTreeGrammar.prog_return retval = new PuzzleSolverTreeGrammar.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDS1=null;
        PuzzleSolverTreeGrammar.rule_return rule2 =null;

        PuzzleSolverTreeGrammar.rule_return rule3 =null;

        PuzzleSolverTreeGrammar.rule_return rule4 =null;

        PuzzleSolverTreeGrammar.rule_return rule5 =null;

        PuzzleSolverTreeGrammar.rule_return rule6 =null;

        PuzzleSolverTreeGrammar.rule_return rule7 =null;


        CommonTree CONDS1_tree=null;

        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:14:7: ( ^( CONDS rule rule rule rule rule rule ) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:14:9: ^( CONDS rule rule rule rule rule rule )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CONDS1=(CommonTree)match(input,CONDS,FOLLOW_CONDS_in_prog51); 
            CONDS1_tree = (CommonTree)adaptor.dupNode(CONDS1);


            root_1 = (CommonTree)adaptor.becomeRoot(CONDS1_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_rule_in_prog53);
            rule2=rule();

            state._fsp--;

            adaptor.addChild(root_1, rule2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_rule_in_prog55);
            rule3=rule();

            state._fsp--;

            adaptor.addChild(root_1, rule3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_rule_in_prog57);
            rule4=rule();

            state._fsp--;

            adaptor.addChild(root_1, rule4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_rule_in_prog59);
            rule5=rule();

            state._fsp--;

            adaptor.addChild(root_1, rule5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_rule_in_prog61);
            rule6=rule();

            state._fsp--;

            adaptor.addChild(root_1, rule6.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_rule_in_prog63);
            rule7=rule();

            state._fsp--;

            adaptor.addChild(root_1, rule7.getTree());


            match(input, Token.UP, null); 
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
    // $ANTLR end "prog"


    public static class rule_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:18:1: rule : ^(op= OP l= block m= block r= block ) -> {$op.text.trim().equals(\"-\")}? ^( PLUS[\"+\"] $m $r $l) -> ^( PLUS[\"+\"] $l $m $r) ;
    public final PuzzleSolverTreeGrammar.rule_return rule() throws RecognitionException {
        PuzzleSolverTreeGrammar.rule_return retval = new PuzzleSolverTreeGrammar.rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree op=null;
        PuzzleSolverTreeGrammar.block_return l =null;

        PuzzleSolverTreeGrammar.block_return m =null;

        PuzzleSolverTreeGrammar.block_return r =null;


        CommonTree op_tree=null;
        RewriteRuleNodeStream stream_OP=new RewriteRuleNodeStream(adaptor,"token OP");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:18:7: ( ^(op= OP l= block m= block r= block ) -> {$op.text.trim().equals(\"-\")}? ^( PLUS[\"+\"] $m $r $l) -> ^( PLUS[\"+\"] $l $m $r) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:18:9: ^(op= OP l= block m= block r= block )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            op=(CommonTree)match(input,OP,FOLLOW_OP_in_rule78);  
            stream_OP.add(op);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_block_in_rule82);
            l=block();

            state._fsp--;

            stream_block.add(l.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_block_in_rule86);
            m=block();

            state._fsp--;

            stream_block.add(m.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_block_in_rule90);
            r=block();

            state._fsp--;

            stream_block.add(r.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: r, m, l, r, m, l
            // token labels: 
            // rule labels: retval, r, l, m
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 19:2: -> {$op.text.trim().equals(\"-\")}? ^( PLUS[\"+\"] $m $r $l)
            if ((op!=null?op.getText():null).trim().equals("-")) {
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:19:36: ^( PLUS[\"+\"] $m $r $l)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PLUS, "+")
                , root_1);

                adaptor.addChild(root_1, stream_m.nextTree());

                adaptor.addChild(root_1, stream_r.nextTree());

                adaptor.addChild(root_1, stream_l.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 20:2: -> ^( PLUS[\"+\"] $l $m $r)
            {
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:20:5: ^( PLUS[\"+\"] $l $m $r)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PLUS, "+")
                , root_1);

                adaptor.addChild(root_1, stream_l.nextTree());

                adaptor.addChild(root_1, stream_m.nextTree());

                adaptor.addChild(root_1, stream_r.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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


    public static class block_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:36:1: block : ^( BLOCK ( ID )+ ) ;
    public final PuzzleSolverTreeGrammar.block_return block() throws RecognitionException {
        PuzzleSolverTreeGrammar.block_return retval = new PuzzleSolverTreeGrammar.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLOCK8=null;
        CommonTree ID9=null;

        CommonTree BLOCK8_tree=null;
        CommonTree ID9_tree=null;

        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:36:7: ( ^( BLOCK ( ID )+ ) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:36:9: ^( BLOCK ( ID )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            BLOCK8=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_block141); 
            BLOCK8_tree = (CommonTree)adaptor.dupNode(BLOCK8);


            root_1 = (CommonTree)adaptor.becomeRoot(BLOCK8_tree, root_1);


            match(input, Token.DOWN, null); 
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:36:17: ( ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolverTreeGrammar.g:36:17: ID
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_block143); 
            	    ID9_tree = (CommonTree)adaptor.dupNode(ID9);


            	    adaptor.addChild(root_1, ID9_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input, Token.UP, null); 
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
    // $ANTLR end "block"

    // Delegated rules


 

    public static final BitSet FOLLOW_CONDS_in_prog51 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rule_in_prog53 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule_in_prog55 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule_in_prog57 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule_in_prog59 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule_in_prog61 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule_in_prog63 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_in_rule78 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_rule82 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_rule86 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_rule90 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_block143 = new BitSet(new long[]{0x0000000000000408L});

}