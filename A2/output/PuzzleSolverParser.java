// $ANTLR 3.4 C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g 2014-04-24 14:34:42

import org.antlr.tool.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PuzzleSolverParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "CHAR", "CONDS", "EQ", "ESC_SEQ", "HEX_DIGIT", "ID", "NL", "OCTAL_ESC", "OP", "OPS", "PLUS", "UNICODE_ESC", "WS"
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
    public static final int OPS=14;
    public static final int PLUS=15;
    public static final int UNICODE_ESC=16;
    public static final int WS=17;

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
    public String getGrammarFileName() { return "C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g"; }



    public static CommonTree buildFromBILD(String operator, Tree first, Tree second, Tree third) {
    	CommonTree vertical = new CommonTree(new CommonToken(PLUS,"PLUS"));
    	if(operator.trim().equals("-")) {
    		vertical.addChild(second);
    		vertical.addChild(third);
    		vertical.addChild(first);
    	}
    	else {
    		vertical.addChild(first);
    		vertical.addChild(second);
    		vertical.addChild(third);
    	}
    	return vertical;
    }



    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:48:1: prog : c1= row NL opRow= op_row NL c2= row NL eq_row NL c3= row -> ^( CONDS row row row ) ;
    public final PuzzleSolverParser.prog_return prog() throws RecognitionException {
        PuzzleSolverParser.prog_return retval = new PuzzleSolverParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NL1=null;
        Token NL2=null;
        Token NL3=null;
        Token NL5=null;
        PuzzleSolverParser.row_return c1 =null;

        PuzzleSolverParser.op_row_return opRow =null;

        PuzzleSolverParser.row_return c2 =null;

        PuzzleSolverParser.row_return c3 =null;

        PuzzleSolverParser.eq_row_return eq_row4 =null;


        CommonTree NL1_tree=null;
        CommonTree NL2_tree=null;
        CommonTree NL3_tree=null;
        CommonTree NL5_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_op_row=new RewriteRuleSubtreeStream(adaptor,"rule op_row");
        RewriteRuleSubtreeStream stream_eq_row=new RewriteRuleSubtreeStream(adaptor,"rule eq_row");
        RewriteRuleSubtreeStream stream_row=new RewriteRuleSubtreeStream(adaptor,"rule row");
        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:48:6: (c1= row NL opRow= op_row NL c2= row NL eq_row NL c3= row -> ^( CONDS row row row ) )
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:48:11: c1= row NL opRow= op_row NL c2= row NL eq_row NL c3= row
            {
            pushFollow(FOLLOW_row_in_prog72);
            c1=row();

            state._fsp--;

            stream_row.add(c1.getTree());

            NL1=(Token)match(input,NL,FOLLOW_NL_in_prog74);  
            stream_NL.add(NL1);


            pushFollow(FOLLOW_op_row_in_prog80);
            opRow=op_row();

            state._fsp--;

            stream_op_row.add(opRow.getTree());

            NL2=(Token)match(input,NL,FOLLOW_NL_in_prog82);  
            stream_NL.add(NL2);


            pushFollow(FOLLOW_row_in_prog88);
            c2=row();

            state._fsp--;

            stream_row.add(c2.getTree());

            NL3=(Token)match(input,NL,FOLLOW_NL_in_prog90);  
            stream_NL.add(NL3);


            pushFollow(FOLLOW_eq_row_in_prog94);
            eq_row4=eq_row();

            state._fsp--;

            stream_eq_row.add(eq_row4.getTree());

            NL5=(Token)match(input,NL,FOLLOW_NL_in_prog96);  
            stream_NL.add(NL5);


            pushFollow(FOLLOW_row_in_prog102);
            c3=row();

            state._fsp--;

            stream_row.add(c3.getTree());


            	// First Vertical Condition
            	CommonTree leftVertical = buildFromBILD(opRow.left, c1.left, c2.left, c3.left);
            	
            	// Second Vertical Condition
            	CommonTree midVertical = buildFromBILD(opRow.mid, c1.mid, c2.mid, c3.mid);
            	
            	// Third Vertical Condition
            	CommonTree rightVertical = buildFromBILD(opRow.right, c1.right, c2.right, c3.right);
            	
                    System.out.println("leftVertical: " + leftVertical.toStringTree());	// demonstration
                    System.out.println("midVertical: " + midVertical.toStringTree());	// demonstration
                    System.out.println(c2.tree.toStringTree());
            	
            	// http://www.docjar.com/docs/api/org/antlr/runtime/tree/Tree.html
            	

            // AST REWRITE
            // elements: row, row, row
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 69:3: -> ^( CONDS row row row )
            {
                // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:69:6: ^( CONDS row row row )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDS, "CONDS")
                , root_1);

                adaptor.addChild(root_1, stream_row.nextTree());

                adaptor.addChild(root_1, stream_row.nextTree());

                adaptor.addChild(root_1, stream_row.nextTree());

                adaptor.addChild(root_1, leftVertical);

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


    public static class row_return extends ParserRuleReturnScope {
        public Tree left;
        public Tree mid;
        public Tree right;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "row"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:73:1: row returns [Tree left, Tree mid, Tree right] : l= grouped_ids op= OP m= grouped_ids EQ r= grouped_ids -> { $op.text.trim().equals(\"-\") }? ^( PLUS $m $r $l) -> ^( PLUS grouped_ids grouped_ids grouped_ids ) ;
    public final PuzzleSolverParser.row_return row() throws RecognitionException {
        PuzzleSolverParser.row_return retval = new PuzzleSolverParser.row_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token op=null;
        Token EQ6=null;
        PuzzleSolverParser.grouped_ids_return l =null;

        PuzzleSolverParser.grouped_ids_return m =null;

        PuzzleSolverParser.grouped_ids_return r =null;


        CommonTree op_tree=null;
        CommonTree EQ6_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_OP=new RewriteRuleTokenStream(adaptor,"token OP");
        RewriteRuleSubtreeStream stream_grouped_ids=new RewriteRuleSubtreeStream(adaptor,"rule grouped_ids");
        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:74:2: (l= grouped_ids op= OP m= grouped_ids EQ r= grouped_ids -> { $op.text.trim().equals(\"-\") }? ^( PLUS $m $r $l) -> ^( PLUS grouped_ids grouped_ids grouped_ids ) )
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:75:2: l= grouped_ids op= OP m= grouped_ids EQ r= grouped_ids
            {
            pushFollow(FOLLOW_grouped_ids_in_row146);
            l=grouped_ids();

            state._fsp--;

            stream_grouped_ids.add(l.getTree());

            op=(Token)match(input,OP,FOLLOW_OP_in_row150);  
            stream_OP.add(op);


            pushFollow(FOLLOW_grouped_ids_in_row154);
            m=grouped_ids();

            state._fsp--;

            stream_grouped_ids.add(m.getTree());

            EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_row156);  
            stream_EQ.add(EQ6);


            pushFollow(FOLLOW_grouped_ids_in_row160);
            r=grouped_ids();

            state._fsp--;

            stream_grouped_ids.add(r.getTree());

            retval.left =(l!=null?((CommonTree)l.tree):null);

            retval.mid =(m!=null?((CommonTree)m.tree):null);

            retval.right =(r!=null?((CommonTree)r.tree):null);

            // AST REWRITE
            // elements: grouped_ids, l, m, r, grouped_ids, grouped_ids
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
            // 79:2: -> { $op.text.trim().equals(\"-\") }? ^( PLUS $m $r $l)
            if ( (op!=null?op.getText():null).trim().equals("-") ) {
                // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:79:38: ^( PLUS $m $r $l)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PLUS, "PLUS")
                , root_1);

                adaptor.addChild(root_1, stream_m.nextTree());

                adaptor.addChild(root_1, stream_r.nextTree());

                adaptor.addChild(root_1, stream_l.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 80:2: -> ^( PLUS grouped_ids grouped_ids grouped_ids )
            {
                // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:80:6: ^( PLUS grouped_ids grouped_ids grouped_ids )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PLUS, "PLUS")
                , root_1);

                adaptor.addChild(root_1, stream_grouped_ids.nextTree());

                adaptor.addChild(root_1, stream_grouped_ids.nextTree());

                adaptor.addChild(root_1, stream_grouped_ids.nextTree());

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
    // $ANTLR end "row"


    public static class op_row_return extends ParserRuleReturnScope {
        public String left;
        public String mid;
        public String right;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op_row"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:84:1: op_row returns [String left, String mid, String right] : l= OP m= OP r= OP ;
    public final PuzzleSolverParser.op_row_return op_row() throws RecognitionException {
        PuzzleSolverParser.op_row_return retval = new PuzzleSolverParser.op_row_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token l=null;
        Token m=null;
        Token r=null;

        CommonTree l_tree=null;
        CommonTree m_tree=null;
        CommonTree r_tree=null;

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:85:2: (l= OP m= OP r= OP )
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:85:6: l= OP m= OP r= OP
            {
            root_0 = (CommonTree)adaptor.nil();


            l=(Token)match(input,OP,FOLLOW_OP_in_op_row221); 
            l_tree = 
            (CommonTree)adaptor.create(l)
            ;
            adaptor.addChild(root_0, l_tree);


            m=(Token)match(input,OP,FOLLOW_OP_in_op_row225); 
            m_tree = 
            (CommonTree)adaptor.create(m)
            ;
            adaptor.addChild(root_0, m_tree);


            r=(Token)match(input,OP,FOLLOW_OP_in_op_row229); 
            r_tree = 
            (CommonTree)adaptor.create(r)
            ;
            adaptor.addChild(root_0, r_tree);


            retval.left =(l!=null?l.getText():null);

            retval.mid =(m!=null?m.getText():null); 

            retval.right =(r!=null?r.getText():null);

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
    // $ANTLR end "op_row"


    public static class eq_row_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eq_row"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:91:1: eq_row : EQ ! EQ ! EQ !;
    public final PuzzleSolverParser.eq_row_return eq_row() throws RecognitionException {
        PuzzleSolverParser.eq_row_return retval = new PuzzleSolverParser.eq_row_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ7=null;
        Token EQ8=null;
        Token EQ9=null;

        CommonTree EQ7_tree=null;
        CommonTree EQ8_tree=null;
        CommonTree EQ9_tree=null;

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:92:5: ( EQ ! EQ ! EQ !)
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:92:10: EQ ! EQ ! EQ !
            {
            root_0 = (CommonTree)adaptor.nil();


            EQ7=(Token)match(input,EQ,FOLLOW_EQ_in_eq_row256); 

            EQ8=(Token)match(input,EQ,FOLLOW_EQ_in_eq_row259); 

            EQ9=(Token)match(input,EQ,FOLLOW_EQ_in_eq_row262); 

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
    // $ANTLR end "eq_row"


    public static class grouped_ids_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "grouped_ids"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:96:1: grouped_ids : ( ID )+ -> ^( BLOCK ( ID )+ ) ;
    public final PuzzleSolverParser.grouped_ids_return grouped_ids() throws RecognitionException {
        PuzzleSolverParser.grouped_ids_return retval = new PuzzleSolverParser.grouped_ids_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID10=null;

        CommonTree ID10_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:97:2: ( ( ID )+ -> ^( BLOCK ( ID )+ ) )
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:97:4: ( ID )+
            {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:97:4: ( ID )+
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
            	    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:97:4: ID
            	    {
            	    ID10=(Token)match(input,ID,FOLLOW_ID_in_grouped_ids279);  
            	    stream_ID.add(ID10);


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
            // 97:8: -> ^( BLOCK ( ID )+ )
            {
                // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\PuzzleSolver.g:97:11: ^( BLOCK ( ID )+ )
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
    // $ANTLR end "grouped_ids"

    // Delegated rules


 

    public static final BitSet FOLLOW_row_in_prog72 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_prog74 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_op_row_in_prog80 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_prog82 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_row_in_prog88 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_prog90 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_eq_row_in_prog94 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_prog96 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_row_in_prog102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouped_ids_in_row146 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OP_in_row150 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_grouped_ids_in_row154 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_row156 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_grouped_ids_in_row160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_in_op_row221 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OP_in_op_row225 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OP_in_op_row229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_eq_row256 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_eq_row259 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_eq_row262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_grouped_ids279 = new BitSet(new long[]{0x0000000000000402L});

}