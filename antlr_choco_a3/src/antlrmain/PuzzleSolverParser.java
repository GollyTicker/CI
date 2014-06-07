package antlrmain;
// $ANTLR 3.4 /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g 2014-06-07 13:08:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PuzzleSolverParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "CHAR", "CONDS", "EQ", "ESC_SEQ", "HEX_DIGIT", "ID", "NL", "OCTAL_ESC", "OP", "UNICODE_ESC", "WS"
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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public PuzzleSolverParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public PuzzleSolverParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return PuzzleSolverParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:14:1: prog : b00= block opHorzTop= OP b10= block EQ b20= block NL opVertLeft= OP opVertMid= OP opVertRight= OP NL b01= block opHorzMid= OP b11= block EQ b21= block NL EQ EQ EQ NL b02= block opHorzBot= OP b12= block EQ b22= block -> ^( CONDS ^( $opHorzTop $b00 $b10 $b20) ^( $opHorzMid $b01 $b11 $b21) ^( $opHorzBot $b02 $b12 $b22) ^( $opVertLeft $b00 $b01 $b02) ^( $opVertMid $b10 $b11 $b12) ^( $opVertRight $b20 $b21 $b22) ) ;
    public final PuzzleSolverParser.prog_return prog() throws RecognitionException {
        PuzzleSolverParser.prog_return retval = new PuzzleSolverParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token opHorzTop=null;
        Token opVertLeft=null;
        Token opVertMid=null;
        Token opVertRight=null;
        Token opHorzMid=null;
        Token opHorzBot=null;
        Token EQ1=null;
        Token NL2=null;
        Token NL3=null;
        Token EQ4=null;
        Token NL5=null;
        Token EQ6=null;
        Token EQ7=null;
        Token EQ8=null;
        Token NL9=null;
        Token EQ10=null;
        PuzzleSolverParser.block_return b00 =null;

        PuzzleSolverParser.block_return b10 =null;

        PuzzleSolverParser.block_return b20 =null;

        PuzzleSolverParser.block_return b01 =null;

        PuzzleSolverParser.block_return b11 =null;

        PuzzleSolverParser.block_return b21 =null;

        PuzzleSolverParser.block_return b02 =null;

        PuzzleSolverParser.block_return b12 =null;

        PuzzleSolverParser.block_return b22 =null;


        CommonTree opHorzTop_tree=null;
        CommonTree opVertLeft_tree=null;
        CommonTree opVertMid_tree=null;
        CommonTree opVertRight_tree=null;
        CommonTree opHorzMid_tree=null;
        CommonTree opHorzBot_tree=null;
        CommonTree EQ1_tree=null;
        CommonTree NL2_tree=null;
        CommonTree NL3_tree=null;
        CommonTree EQ4_tree=null;
        CommonTree NL5_tree=null;
        CommonTree EQ6_tree=null;
        CommonTree EQ7_tree=null;
        CommonTree EQ8_tree=null;
        CommonTree NL9_tree=null;
        CommonTree EQ10_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_OP=new RewriteRuleTokenStream(adaptor,"token OP");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:14:6: (b00= block opHorzTop= OP b10= block EQ b20= block NL opVertLeft= OP opVertMid= OP opVertRight= OP NL b01= block opHorzMid= OP b11= block EQ b21= block NL EQ EQ EQ NL b02= block opHorzBot= OP b12= block EQ b22= block -> ^( CONDS ^( $opHorzTop $b00 $b10 $b20) ^( $opHorzMid $b01 $b11 $b21) ^( $opHorzBot $b02 $b12 $b22) ^( $opVertLeft $b00 $b01 $b02) ^( $opVertMid $b10 $b11 $b12) ^( $opVertRight $b20 $b21 $b22) ) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:14:11: b00= block opHorzTop= OP b10= block EQ b20= block NL opVertLeft= OP opVertMid= OP opVertRight= OP NL b01= block opHorzMid= OP b11= block EQ b21= block NL EQ EQ EQ NL b02= block opHorzBot= OP b12= block EQ b22= block
            {
            pushFollow(FOLLOW_block_in_prog47);
            b00=block();

            state._fsp--;

            stream_block.add(b00.getTree());

            opHorzTop=(Token)match(input,OP,FOLLOW_OP_in_prog51);  
            stream_OP.add(opHorzTop);


            pushFollow(FOLLOW_block_in_prog55);
            b10=block();

            state._fsp--;

            stream_block.add(b10.getTree());

            EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_prog57);  
            stream_EQ.add(EQ1);


            pushFollow(FOLLOW_block_in_prog61);
            b20=block();

            state._fsp--;

            stream_block.add(b20.getTree());

            NL2=(Token)match(input,NL,FOLLOW_NL_in_prog63);  
            stream_NL.add(NL2);


            opVertLeft=(Token)match(input,OP,FOLLOW_OP_in_prog69);  
            stream_OP.add(opVertLeft);


            opVertMid=(Token)match(input,OP,FOLLOW_OP_in_prog73);  
            stream_OP.add(opVertMid);


            opVertRight=(Token)match(input,OP,FOLLOW_OP_in_prog78);  
            stream_OP.add(opVertRight);


            NL3=(Token)match(input,NL,FOLLOW_NL_in_prog81);  
            stream_NL.add(NL3);


            pushFollow(FOLLOW_block_in_prog87);
            b01=block();

            state._fsp--;

            stream_block.add(b01.getTree());

            opHorzMid=(Token)match(input,OP,FOLLOW_OP_in_prog91);  
            stream_OP.add(opHorzMid);


            pushFollow(FOLLOW_block_in_prog95);
            b11=block();

            state._fsp--;

            stream_block.add(b11.getTree());

            EQ4=(Token)match(input,EQ,FOLLOW_EQ_in_prog97);  
            stream_EQ.add(EQ4);


            pushFollow(FOLLOW_block_in_prog101);
            b21=block();

            state._fsp--;

            stream_block.add(b21.getTree());

            NL5=(Token)match(input,NL,FOLLOW_NL_in_prog104);  
            stream_NL.add(NL5);


            EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_prog109);  
            stream_EQ.add(EQ6);


            EQ7=(Token)match(input,EQ,FOLLOW_EQ_in_prog113);  
            stream_EQ.add(EQ7);


            EQ8=(Token)match(input,EQ,FOLLOW_EQ_in_prog117);  
            stream_EQ.add(EQ8);


            NL9=(Token)match(input,NL,FOLLOW_NL_in_prog120);  
            stream_NL.add(NL9);


            pushFollow(FOLLOW_block_in_prog126);
            b02=block();

            state._fsp--;

            stream_block.add(b02.getTree());

            opHorzBot=(Token)match(input,OP,FOLLOW_OP_in_prog130);  
            stream_OP.add(opHorzBot);


            pushFollow(FOLLOW_block_in_prog134);
            b12=block();

            state._fsp--;

            stream_block.add(b12.getTree());

            EQ10=(Token)match(input,EQ,FOLLOW_EQ_in_prog136);  
            stream_EQ.add(EQ10);


            pushFollow(FOLLOW_block_in_prog140);
            b22=block();

            state._fsp--;

            stream_block.add(b22.getTree());

            // AST REWRITE
            // elements: b10, b01, b20, b02, b12, opHorzTop, b10, b11, b00, b11, b01, b12, opVertLeft, b21, opHorzBot, b21, b20, b22, opHorzMid, b00, b02, opVertMid, b22, opVertRight
            // token labels: opHorzBot, opVertRight, opVertLeft, opHorzMid, opVertMid, opHorzTop
            // rule labels: b01, b00, retval, b02, b11, b20, b21, b12, b22, b10
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_opHorzBot=new RewriteRuleTokenStream(adaptor,"token opHorzBot",opHorzBot);
            RewriteRuleTokenStream stream_opVertRight=new RewriteRuleTokenStream(adaptor,"token opVertRight",opVertRight);
            RewriteRuleTokenStream stream_opVertLeft=new RewriteRuleTokenStream(adaptor,"token opVertLeft",opVertLeft);
            RewriteRuleTokenStream stream_opHorzMid=new RewriteRuleTokenStream(adaptor,"token opHorzMid",opHorzMid);
            RewriteRuleTokenStream stream_opVertMid=new RewriteRuleTokenStream(adaptor,"token opVertMid",opVertMid);
            RewriteRuleTokenStream stream_opHorzTop=new RewriteRuleTokenStream(adaptor,"token opHorzTop",opHorzTop);
            RewriteRuleSubtreeStream stream_b01=new RewriteRuleSubtreeStream(adaptor,"rule b01",b01!=null?b01.tree:null);
            RewriteRuleSubtreeStream stream_b00=new RewriteRuleSubtreeStream(adaptor,"rule b00",b00!=null?b00.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b02=new RewriteRuleSubtreeStream(adaptor,"rule b02",b02!=null?b02.tree:null);
            RewriteRuleSubtreeStream stream_b11=new RewriteRuleSubtreeStream(adaptor,"rule b11",b11!=null?b11.tree:null);
            RewriteRuleSubtreeStream stream_b20=new RewriteRuleSubtreeStream(adaptor,"rule b20",b20!=null?b20.tree:null);
            RewriteRuleSubtreeStream stream_b21=new RewriteRuleSubtreeStream(adaptor,"rule b21",b21!=null?b21.tree:null);
            RewriteRuleSubtreeStream stream_b12=new RewriteRuleSubtreeStream(adaptor,"rule b12",b12!=null?b12.tree:null);
            RewriteRuleSubtreeStream stream_b22=new RewriteRuleSubtreeStream(adaptor,"rule b22",b22!=null?b22.tree:null);
            RewriteRuleSubtreeStream stream_b10=new RewriteRuleSubtreeStream(adaptor,"rule b10",b10!=null?b10.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 20:3: -> ^( CONDS ^( $opHorzTop $b00 $b10 $b20) ^( $opHorzMid $b01 $b11 $b21) ^( $opHorzBot $b02 $b12 $b22) ^( $opVertLeft $b00 $b01 $b02) ^( $opVertMid $b10 $b11 $b12) ^( $opVertRight $b20 $b21 $b22) )
            {
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:20:6: ^( CONDS ^( $opHorzTop $b00 $b10 $b20) ^( $opHorzMid $b01 $b11 $b21) ^( $opHorzBot $b02 $b12 $b22) ^( $opVertLeft $b00 $b01 $b02) ^( $opVertMid $b10 $b11 $b12) ^( $opVertRight $b20 $b21 $b22) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDS, "CONDS")
                , root_1);

                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:21:4: ^( $opHorzTop $b00 $b10 $b20)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_opHorzTop.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b00.nextTree());

                adaptor.addChild(root_2, stream_b10.nextTree());

                adaptor.addChild(root_2, stream_b20.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:22:4: ^( $opHorzMid $b01 $b11 $b21)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_opHorzMid.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b01.nextTree());

                adaptor.addChild(root_2, stream_b11.nextTree());

                adaptor.addChild(root_2, stream_b21.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:23:4: ^( $opHorzBot $b02 $b12 $b22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_opHorzBot.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b02.nextTree());

                adaptor.addChild(root_2, stream_b12.nextTree());

                adaptor.addChild(root_2, stream_b22.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:24:4: ^( $opVertLeft $b00 $b01 $b02)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_opVertLeft.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b00.nextTree());

                adaptor.addChild(root_2, stream_b01.nextTree());

                adaptor.addChild(root_2, stream_b02.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:25:4: ^( $opVertMid $b10 $b11 $b12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_opVertMid.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b10.nextTree());

                adaptor.addChild(root_2, stream_b11.nextTree());

                adaptor.addChild(root_2, stream_b12.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:26:4: ^( $opVertRight $b20 $b21 $b22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_opVertRight.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b20.nextTree());

                adaptor.addChild(root_2, stream_b21.nextTree());

                adaptor.addChild(root_2, stream_b22.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:30:1: block : ( ID )+ -> ^( BLOCK ( ID )+ ) ;
    public final PuzzleSolverParser.block_return block() throws RecognitionException {
        PuzzleSolverParser.block_return retval = new PuzzleSolverParser.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID11=null;

        CommonTree ID11_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:31:2: ( ( ID )+ -> ^( BLOCK ( ID )+ ) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:31:4: ( ID )+
            {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:31:4: ( ID )+
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
            	    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:31:4: ID
            	    {
            	    ID11=(Token)match(input,ID,FOLLOW_ID_in_block281);  
            	    stream_ID.add(ID11);


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


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 31:8: -> ^( BLOCK ( ID )+ )
            {
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:31:11: ^( BLOCK ( ID )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_prog47 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OP_in_prog51 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_prog55 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_prog57 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_prog61 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_prog63 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OP_in_prog69 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OP_in_prog73 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OP_in_prog78 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_prog81 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_prog87 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OP_in_prog91 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_prog95 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_prog97 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_prog101 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_prog104 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_prog109 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_prog113 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_prog117 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_prog120 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_prog126 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OP_in_prog130 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_prog134 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_prog136 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_prog140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_block281 = new BitSet(new long[]{0x0000000000000402L});

}