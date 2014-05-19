// $ANTLR 3.4 /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g 2014-05-19 11:23:06

// import zum manuellen Bauen der Trees
// http://www.docjar.com/docs/api/org/antlr/runtime/tree/Tree.html
package antlrmain;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PuzzleSolverParser extends Parser {
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



    // Diese Methode nimmt die Baeume fuer eine Spalte und den dazugehoerigen Operator (plus oder minus)
    // und baut daraus den korrekten AST.
    // z.b. buildFromBILD("+", (BLOCK A B C) (BLOCK D E F) (BLOCK G H I) ) => (PLUS (BLOCK A B C) (BLOCK D E F) (BLOCK G H I) )
    // oder buildFromBILD("-", (BLOCK A B C) (BLOCK D E F) (BLOCK G H I) ) => (PLUS (BLOCK D E F) (BLOCK G H I) (BLOCK A B C) )
    // Zweiteres vereinfacht den AST mehr und macht ihn von der konkreten Wahl einer Operators unabhaengig.
    // a - b = c wird umgeschrieben zu b + c = a
    public CommonTree buildFromBILD(String operator, Tree first, Tree second, Tree third) {
    	CommonTree vertical = (CommonTree)adaptor.create(new CommonToken(PLUS, operator));// erzeugen eines PLUS Knotens
    	if ( operator.trim().equals("-") ) {
    		vertical = (CommonTree)adaptor.create(new CommonToken(PLUS, operator));// erzeugen eines MINUS Knotens
    	}
    	adaptor.addChild(vertical, first);
    	adaptor.addChild(vertical, second);
    	adaptor.addChild(vertical, third); 
    	return vertical;
    }
    // anstatt "new CommonTree(...)" muss an adaptor verwenden, da sonst die Integration mit den
    // ANTLR ASTs nicht funktioniert.

    public void show(Object a) {System.out.println(a);}



    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:62:1: prog : c1= row NL opRow= op_row NL c2= row NL eq_row NL c3= row ->;
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
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:62:6: (c1= row NL opRow= op_row NL c2= row NL eq_row NL c3= row ->)
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:62:11: c1= row NL opRow= op_row NL c2= row NL eq_row NL c3= row
            {
            pushFollow(FOLLOW_row_in_prog79);
            c1=row();

            state._fsp--;

            stream_row.add(c1.getTree());

            NL1=(Token)match(input,NL,FOLLOW_NL_in_prog81);  
            stream_NL.add(NL1);


            pushFollow(FOLLOW_op_row_in_prog87);
            opRow=op_row();

            state._fsp--;

            stream_op_row.add(opRow.getTree());

            NL2=(Token)match(input,NL,FOLLOW_NL_in_prog89);  
            stream_NL.add(NL2);


            pushFollow(FOLLOW_row_in_prog95);
            c2=row();

            state._fsp--;

            stream_row.add(c2.getTree());

            NL3=(Token)match(input,NL,FOLLOW_NL_in_prog97);  
            stream_NL.add(NL3);


            pushFollow(FOLLOW_eq_row_in_prog101);
            eq_row4=eq_row();

            state._fsp--;

            stream_eq_row.add(eq_row4.getTree());

            NL5=(Token)match(input,NL,FOLLOW_NL_in_prog103);  
            stream_NL.add(NL5);


            pushFollow(FOLLOW_row_in_prog109);
            c3=row();

            state._fsp--;

            stream_row.add(c3.getTree());


            	// First Vertical Condition
            	// access the synthetic attributes and the trees for manuel AST building.
            	CommonTree leftVertical = buildFromBILD(opRow.left, c1.left, c2.left, c3.left);
            	
            	// Second Vertical Condition
            	CommonTree midVertical = buildFromBILD(opRow.mid, c1.mid, c2.mid, c3.mid);
            	
            	// Third Vertical Condition
            	CommonTree rightVertical = buildFromBILD(opRow.right, c1.right, c2.right, c3.right);
            	
            	// Demonstration. Tree's are printed in LISP Tree Notation.
            	// f.e. (A B C D E) means a Node A with children B, C, D and E.
                    show("leftVertical: " + leftVertical.toStringTree()); // leftVertical: (PLUS (BLOCK A A A) (BLOCK A H) (BLOCK A C E))
                    show("midVertical: " + midVertical.toStringTree());   // midVertical: (PLUS (BLOCK D A C) (BLOCK H F C) (BLOCK I I I))
                    show("Middle Row: "+ c2.tree.toStringTree());	      // Middle Row: (PLUS (BLOCK H F C) (BLOCK G I) (BLOCK A A A))
                    
                    
                    // creating from atlrs adoptor.
            	// http://www.docjar.com/docs/api/org/antlr/runtime/tree/BaseTreeAdaptor.html
            	// http://stackoverflow.com/questions/13812543/antlr-grandchild-nodes-in-tree-construction
                    
                    // creating final tree
                    CommonTree condsAST = (CommonTree) adaptor.create(CONDS, "CONDS");
                    adaptor.addChild(condsAST,(c1!=null?((CommonTree)c1.tree):null));
                    adaptor.addChild(condsAST,(c2!=null?((CommonTree)c2.tree):null));
                    adaptor.addChild(condsAST,(c3!=null?((CommonTree)c3.tree):null));
                    adaptor.addChild(condsAST,leftVertical);
                    adaptor.addChild(condsAST,midVertical);
                    adaptor.addChild(condsAST,rightVertical);
                    
                    show("condsAST: " + condsAST.toStringTree());
                    
            	

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 101:3: ->
            {
                adaptor.addChild(root_0, (Object)condsAST);

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
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:105:1: row returns [Tree left, Tree mid, Tree right] : l= grouped_ids op= OP m= grouped_ids EQ r= grouped_ids -> ^( $op $l $m $r) ;
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
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:106:2: (l= grouped_ids op= OP m= grouped_ids EQ r= grouped_ids -> ^( $op $l $m $r) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:107:2: l= grouped_ids op= OP m= grouped_ids EQ r= grouped_ids
            {
            pushFollow(FOLLOW_grouped_ids_in_row142);
            l=grouped_ids();

            state._fsp--;

            stream_grouped_ids.add(l.getTree());

            op=(Token)match(input,OP,FOLLOW_OP_in_row146);  
            stream_OP.add(op);


            pushFollow(FOLLOW_grouped_ids_in_row150);
            m=grouped_ids();

            state._fsp--;

            stream_grouped_ids.add(m.getTree());

            EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_row152);  
            stream_EQ.add(EQ6);


            pushFollow(FOLLOW_grouped_ids_in_row156);
            r=grouped_ids();

            state._fsp--;

            stream_grouped_ids.add(r.getTree());

            retval.left =(l!=null?((CommonTree)l.tree):null);

            retval.mid =(m!=null?((CommonTree)m.tree):null);

            retval.right =(r!=null?((CommonTree)r.tree):null);

            // AST REWRITE
            // elements: op, l, r, m
            // token labels: op
            // rule labels: retval, r, l, m
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 114:2: -> ^( $op $l $m $r)
            {
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:114:6: ^( $op $l $m $r)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                adaptor.addChild(root_1, stream_l.nextTree());

                adaptor.addChild(root_1, stream_m.nextTree());

                adaptor.addChild(root_1, stream_r.nextTree());

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
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:118:1: op_row returns [String left, String mid, String right] : l= OP m= OP r= OP ;
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
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:119:2: (l= OP m= OP r= OP )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:119:6: l= OP m= OP r= OP
            {
            root_0 = (CommonTree)adaptor.nil();


            l=(Token)match(input,OP,FOLLOW_OP_in_op_row209); 
            l_tree = 
            (CommonTree)adaptor.create(l)
            ;
            adaptor.addChild(root_0, l_tree);


            m=(Token)match(input,OP,FOLLOW_OP_in_op_row213); 
            m_tree = 
            (CommonTree)adaptor.create(m)
            ;
            adaptor.addChild(root_0, m_tree);


            r=(Token)match(input,OP,FOLLOW_OP_in_op_row217); 
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
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:125:1: eq_row : EQ ! EQ ! EQ !;
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
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:126:5: ( EQ ! EQ ! EQ !)
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:126:10: EQ ! EQ ! EQ !
            {
            root_0 = (CommonTree)adaptor.nil();


            EQ7=(Token)match(input,EQ,FOLLOW_EQ_in_eq_row244); 

            EQ8=(Token)match(input,EQ,FOLLOW_EQ_in_eq_row247); 

            EQ9=(Token)match(input,EQ,FOLLOW_EQ_in_eq_row250); 

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
    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:130:1: grouped_ids : ( ID )+ -> ^( BLOCK ( ID )+ ) ;
    public final PuzzleSolverParser.grouped_ids_return grouped_ids() throws RecognitionException {
        PuzzleSolverParser.grouped_ids_return retval = new PuzzleSolverParser.grouped_ids_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID10=null;

        CommonTree ID10_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:131:2: ( ( ID )+ -> ^( BLOCK ( ID )+ ) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:131:4: ( ID )+
            {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:131:4: ( ID )+
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
            	    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:131:4: ID
            	    {
            	    ID10=(Token)match(input,ID,FOLLOW_ID_in_grouped_ids267);  
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
            // 131:8: -> ^( BLOCK ( ID )+ )
            {
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:131:11: ^( BLOCK ( ID )+ )
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


 

    public static final BitSet FOLLOW_row_in_prog79 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NL_in_prog81 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_op_row_in_prog87 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NL_in_prog89 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_row_in_prog95 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NL_in_prog97 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_eq_row_in_prog101 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NL_in_prog103 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_row_in_prog109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouped_ids_in_row142 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_OP_in_row146 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_grouped_ids_in_row150 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_row152 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_grouped_ids_in_row156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_in_op_row209 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_OP_in_op_row213 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_OP_in_op_row217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_eq_row244 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_eq_row247 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_eq_row250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_grouped_ids267 = new BitSet(new long[]{0x0000000000000402L});

}