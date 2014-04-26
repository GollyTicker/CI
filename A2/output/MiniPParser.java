// $ANTLR 3.4 C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g 2014-04-24 15:28:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGIN", "BOOL", "COMMA", "COMMENT", "DECLS", "DEF", "DIGIT", "END", "ESC_SEQ", "FLOAT", "HEX_DIGIT", "ID", "IDLIST", "INT", "LETTER", "MAIN", "OCTAL_ESC", "PROGRAM", "PUNKT_OP", "RELOP", "SEMICOL", "SLIST", "STRICH_OP", "STRING", "TYPE", "UNICODE_ESC", "WS", "'('", "')'", "'do'", "'else'", "'fi'", "'if'", "'od'", "'print'", "'println'", "'read'", "'then'", "'while'"
    };

    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int BEGIN=4;
    public static final int BOOL=5;
    public static final int COMMA=6;
    public static final int COMMENT=7;
    public static final int DECLS=8;
    public static final int DEF=9;
    public static final int DIGIT=10;
    public static final int END=11;
    public static final int ESC_SEQ=12;
    public static final int FLOAT=13;
    public static final int HEX_DIGIT=14;
    public static final int ID=15;
    public static final int IDLIST=16;
    public static final int INT=17;
    public static final int LETTER=18;
    public static final int MAIN=19;
    public static final int OCTAL_ESC=20;
    public static final int PROGRAM=21;
    public static final int PUNKT_OP=22;
    public static final int RELOP=23;
    public static final int SEMICOL=24;
    public static final int SLIST=25;
    public static final int STRICH_OP=26;
    public static final int STRING=27;
    public static final int TYPE=28;
    public static final int UNICODE_ESC=29;
    public static final int WS=30;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "statements", "ids", "var_def", "ar_term", "cmp", "expression", 
    "declaration", "declarations", "ar_exp", "ifStmt", "whileStmt", "product", 
    "io_stmt", "main", "numberconst", "statement"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public MiniPParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public MiniPParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public MiniPParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return MiniPParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g"; }


    public static class main_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:15:1: main : PROGRAM declarations BEGIN statements END -> ^( MAIN declarations statements ) ;
    public final MiniPParser.main_return main() throws RecognitionException {
        MiniPParser.main_return retval = new MiniPParser.main_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PROGRAM1=null;
        Token BEGIN3=null;
        Token END5=null;
        MiniPParser.declarations_return declarations2 =null;

        MiniPParser.statements_return statements4 =null;


        CommonTree PROGRAM1_tree=null;
        CommonTree BEGIN3_tree=null;
        CommonTree END5_tree=null;
        RewriteRuleTokenStream stream_PROGRAM=new RewriteRuleTokenStream(adaptor,"token PROGRAM");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try { dbg.enterRule(getGrammarFileName(), "main");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:15:6: ( PROGRAM declarations BEGIN statements END -> ^( MAIN declarations statements ) )
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:15:8: PROGRAM declarations BEGIN statements END
            {
            dbg.location(15,8);
            PROGRAM1=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_main48);  
            stream_PROGRAM.add(PROGRAM1);

            dbg.location(15,16);
            pushFollow(FOLLOW_declarations_in_main50);
            declarations2=declarations();

            state._fsp--;

            stream_declarations.add(declarations2.getTree());
            dbg.location(15,29);
            BEGIN3=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_main52);  
            stream_BEGIN.add(BEGIN3);

            dbg.location(15,35);
            pushFollow(FOLLOW_statements_in_main54);
            statements4=statements();

            state._fsp--;

            stream_statements.add(statements4.getTree());
            dbg.location(15,46);
            END5=(Token)match(input,END,FOLLOW_END_in_main56);  
            stream_END.add(END5);


            // AST REWRITE
            // elements: statements, declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 15:50: -> ^( MAIN declarations statements )
            {
                dbg.location(15,53);
                // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:15:53: ^( MAIN declarations statements )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(15,55);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAIN, "MAIN")
                , root_1);

                dbg.location(15,60);
                adaptor.addChild(root_1, stream_declarations.nextTree());
                dbg.location(15,73);
                adaptor.addChild(root_1, stream_statements.nextTree());

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
        dbg.location(16, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "main");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "main"


    public static class declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarations"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:18:1: declarations : ( declaration )+ -> ^( DECLS ( declaration )+ ) ;
    public final MiniPParser.declarations_return declarations() throws RecognitionException {
        MiniPParser.declarations_return retval = new MiniPParser.declarations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MiniPParser.declaration_return declaration6 =null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try { dbg.enterRule(getGrammarFileName(), "declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:18:13: ( ( declaration )+ -> ^( DECLS ( declaration )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:18:15: ( declaration )+
            {
            dbg.location(18,15);
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:18:15: ( declaration )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:18:15: declaration
            	    {
            	    dbg.location(18,15);
            	    pushFollow(FOLLOW_declaration_in_declarations74);
            	    declaration6=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration6.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            // AST REWRITE
            // elements: declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 18:28: -> ^( DECLS ( declaration )+ )
            {
                dbg.location(18,31);
                // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:18:31: ^( DECLS ( declaration )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(18,33);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DECLS, "DECLS")
                , root_1);

                dbg.location(18,39);
                if ( !(stream_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declaration.hasNext() ) {
                    dbg.location(18,39);
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

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
        dbg.location(19, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarations"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:21:1: declaration : TYPE ^ ids SEMICOL !;
    public final MiniPParser.declaration_return declaration() throws RecognitionException {
        MiniPParser.declaration_return retval = new MiniPParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TYPE7=null;
        Token SEMICOL9=null;
        MiniPParser.ids_return ids8 =null;


        CommonTree TYPE7_tree=null;
        CommonTree SEMICOL9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:21:12: ( TYPE ^ ids SEMICOL !)
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:21:14: TYPE ^ ids SEMICOL !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(21,18);
            TYPE7=(Token)match(input,TYPE,FOLLOW_TYPE_in_declaration92); 
            TYPE7_tree = 
            (CommonTree)adaptor.create(TYPE7)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(TYPE7_tree, root_0);

            dbg.location(21,20);
            pushFollow(FOLLOW_ids_in_declaration95);
            ids8=ids();

            state._fsp--;

            adaptor.addChild(root_0, ids8.getTree());
            dbg.location(21,31);
            SEMICOL9=(Token)match(input,SEMICOL,FOLLOW_SEMICOL_in_declaration97); 

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
        dbg.location(22, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declaration"


    public static class ids_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ids"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:24:1: ids : ID ( COMMA ID )* -> ^( IDLIST ( ID )* ) ;
    public final MiniPParser.ids_return ids() throws RecognitionException {
        MiniPParser.ids_return retval = new MiniPParser.ids_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID10=null;
        Token COMMA11=null;
        Token ID12=null;

        CommonTree ID10_tree=null;
        CommonTree COMMA11_tree=null;
        CommonTree ID12_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try { dbg.enterRule(getGrammarFileName(), "ids");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:24:5: ( ID ( COMMA ID )* -> ^( IDLIST ( ID )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:24:7: ID ( COMMA ID )*
            {
            dbg.location(24,7);
            ID10=(Token)match(input,ID,FOLLOW_ID_in_ids107);  
            stream_ID.add(ID10);

            dbg.location(24,10);
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:24:10: ( COMMA ID )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:24:11: COMMA ID
            	    {
            	    dbg.location(24,11);
            	    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_ids110);  
            	    stream_COMMA.add(COMMA11);

            	    dbg.location(24,17);
            	    ID12=(Token)match(input,ID,FOLLOW_ID_in_ids112);  
            	    stream_ID.add(ID12);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}


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
            // 24:22: -> ^( IDLIST ( ID )* )
            {
                dbg.location(24,25);
                // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:24:25: ^( IDLIST ( ID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(24,27);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IDLIST, "IDLIST")
                , root_1);

                dbg.location(24,34);
                // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:24:34: ( ID )*
                while ( stream_ID.hasNext() ) {
                    dbg.location(24,34);
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
        dbg.location(25, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ids");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ids"


    public static class var_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_def"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:27:1: var_def : ID DEF expression -> ^( DEF ID expression ) ;
    public final MiniPParser.var_def_return var_def() throws RecognitionException {
        MiniPParser.var_def_return retval = new MiniPParser.var_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID13=null;
        Token DEF14=null;
        MiniPParser.expression_return expression15 =null;


        CommonTree ID13_tree=null;
        CommonTree DEF14_tree=null;
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "var_def");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:27:9: ( ID DEF expression -> ^( DEF ID expression ) )
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:27:11: ID DEF expression
            {
            dbg.location(27,11);
            ID13=(Token)match(input,ID,FOLLOW_ID_in_var_def132);  
            stream_ID.add(ID13);

            dbg.location(27,14);
            DEF14=(Token)match(input,DEF,FOLLOW_DEF_in_var_def134);  
            stream_DEF.add(DEF14);

            dbg.location(27,18);
            pushFollow(FOLLOW_expression_in_var_def136);
            expression15=expression();

            state._fsp--;

            stream_expression.add(expression15.getTree());

            // AST REWRITE
            // elements: DEF, expression, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 27:29: -> ^( DEF ID expression )
            {
                dbg.location(27,32);
                // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:27:32: ^( DEF ID expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(27,34);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_DEF.nextNode()
                , root_1);

                dbg.location(27,38);
                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );
                dbg.location(27,41);
                adaptor.addChild(root_1, stream_expression.nextTree());

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
        dbg.location(28, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var_def");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "var_def"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:30:1: expression : ( BOOL -> BOOL | STRING -> STRING | ar_exp -> ar_exp );
    public final MiniPParser.expression_return expression() throws RecognitionException {
        MiniPParser.expression_return retval = new MiniPParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BOOL16=null;
        Token STRING17=null;
        MiniPParser.ar_exp_return ar_exp18 =null;


        CommonTree BOOL16_tree=null;
        CommonTree STRING17_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
        RewriteRuleSubtreeStream stream_ar_exp=new RewriteRuleSubtreeStream(adaptor,"rule ar_exp");
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:31:2: ( BOOL -> BOOL | STRING -> STRING | ar_exp -> ar_exp )
            int alt3=3;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            switch ( input.LA(1) ) {
            case BOOL:
                {
                alt3=1;
                }
                break;
            case STRING:
                {
                alt3=2;
                }
                break;
            case FLOAT:
            case ID:
            case INT:
            case 31:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:31:4: BOOL
                    {
                    dbg.location(31,4);
                    BOOL16=(Token)match(input,BOOL,FOLLOW_BOOL_in_expression156);  
                    stream_BOOL.add(BOOL16);


                    // AST REWRITE
                    // elements: BOOL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 31:9: -> BOOL
                    {
                        dbg.location(31,12);
                        adaptor.addChild(root_0, 
                        stream_BOOL.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:32:4: STRING
                    {
                    dbg.location(32,4);
                    STRING17=(Token)match(input,STRING,FOLLOW_STRING_in_expression165);  
                    stream_STRING.add(STRING17);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 32:11: -> STRING
                    {
                        dbg.location(32,14);
                        adaptor.addChild(root_0, 
                        stream_STRING.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:33:4: ar_exp
                    {
                    dbg.location(33,4);
                    pushFollow(FOLLOW_ar_exp_in_expression174);
                    ar_exp18=ar_exp();

                    state._fsp--;

                    stream_ar_exp.add(ar_exp18.getTree());

                    // AST REWRITE
                    // elements: ar_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 33:11: -> ar_exp
                    {
                        dbg.location(33,14);
                        adaptor.addChild(root_0, stream_ar_exp.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

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
        dbg.location(34, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"


    public static class ifStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStmt"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:41:1: ifStmt : 'if' ^ ( BOOL | cmp ) 'then' ! statements ( 'else' ! statements )? 'fi' !;
    public final MiniPParser.ifStmt_return ifStmt() throws RecognitionException {
        MiniPParser.ifStmt_return retval = new MiniPParser.ifStmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal19=null;
        Token BOOL20=null;
        Token string_literal22=null;
        Token string_literal24=null;
        Token string_literal26=null;
        MiniPParser.cmp_return cmp21 =null;

        MiniPParser.statements_return statements23 =null;

        MiniPParser.statements_return statements25 =null;


        CommonTree string_literal19_tree=null;
        CommonTree BOOL20_tree=null;
        CommonTree string_literal22_tree=null;
        CommonTree string_literal24_tree=null;
        CommonTree string_literal26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ifStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:41:8: ( 'if' ^ ( BOOL | cmp ) 'then' ! statements ( 'else' ! statements )? 'fi' !)
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:41:10: 'if' ^ ( BOOL | cmp ) 'then' ! statements ( 'else' ! statements )? 'fi' !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(41,14);
            string_literal19=(Token)match(input,36,FOLLOW_36_in_ifStmt202); 
            string_literal19_tree = 
            (CommonTree)adaptor.create(string_literal19)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal19_tree, root_0);

            dbg.location(41,16);
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:41:16: ( BOOL | cmp )
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==BOOL) ) {
                alt4=1;
            }
            else if ( (LA4_0==FLOAT||LA4_0==ID||LA4_0==INT||LA4_0==31) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:41:17: BOOL
                    {
                    dbg.location(41,17);
                    BOOL20=(Token)match(input,BOOL,FOLLOW_BOOL_in_ifStmt206); 
                    BOOL20_tree = 
                    (CommonTree)adaptor.create(BOOL20)
                    ;
                    adaptor.addChild(root_0, BOOL20_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:41:24: cmp
                    {
                    dbg.location(41,24);
                    pushFollow(FOLLOW_cmp_in_ifStmt210);
                    cmp21=cmp();

                    state._fsp--;

                    adaptor.addChild(root_0, cmp21.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(41,36);
            string_literal22=(Token)match(input,41,FOLLOW_41_in_ifStmt214); 
            dbg.location(41,38);
            pushFollow(FOLLOW_statements_in_ifStmt217);
            statements23=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements23.getTree());
            dbg.location(41,49);
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:41:49: ( 'else' ! statements )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:41:50: 'else' ! statements
                    {
                    dbg.location(41,56);
                    string_literal24=(Token)match(input,34,FOLLOW_34_in_ifStmt220); 
                    dbg.location(41,58);
                    pushFollow(FOLLOW_statements_in_ifStmt223);
                    statements25=statements();

                    state._fsp--;

                    adaptor.addChild(root_0, statements25.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(41,75);
            string_literal26=(Token)match(input,35,FOLLOW_35_in_ifStmt227); 

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
        dbg.location(42, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ifStmt"


    public static class whileStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStmt"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:44:1: whileStmt : 'while' ^ ( BOOL | cmp ) 'do' ! statements 'od' !;
    public final MiniPParser.whileStmt_return whileStmt() throws RecognitionException {
        MiniPParser.whileStmt_return retval = new MiniPParser.whileStmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal27=null;
        Token BOOL28=null;
        Token string_literal30=null;
        Token string_literal32=null;
        MiniPParser.cmp_return cmp29 =null;

        MiniPParser.statements_return statements31 =null;


        CommonTree string_literal27_tree=null;
        CommonTree BOOL28_tree=null;
        CommonTree string_literal30_tree=null;
        CommonTree string_literal32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "whileStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:45:3: ( 'while' ^ ( BOOL | cmp ) 'do' ! statements 'od' !)
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:45:3: 'while' ^ ( BOOL | cmp ) 'do' ! statements 'od' !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(45,10);
            string_literal27=(Token)match(input,42,FOLLOW_42_in_whileStmt237); 
            string_literal27_tree = 
            (CommonTree)adaptor.create(string_literal27)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal27_tree, root_0);

            dbg.location(45,12);
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:45:12: ( BOOL | cmp )
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==BOOL) ) {
                alt6=1;
            }
            else if ( (LA6_0==FLOAT||LA6_0==ID||LA6_0==INT||LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:45:13: BOOL
                    {
                    dbg.location(45,13);
                    BOOL28=(Token)match(input,BOOL,FOLLOW_BOOL_in_whileStmt241); 
                    BOOL28_tree = 
                    (CommonTree)adaptor.create(BOOL28)
                    ;
                    adaptor.addChild(root_0, BOOL28_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:45:20: cmp
                    {
                    dbg.location(45,20);
                    pushFollow(FOLLOW_cmp_in_whileStmt245);
                    cmp29=cmp();

                    state._fsp--;

                    adaptor.addChild(root_0, cmp29.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(45,29);
            string_literal30=(Token)match(input,33,FOLLOW_33_in_whileStmt248); 
            dbg.location(45,31);
            pushFollow(FOLLOW_statements_in_whileStmt251);
            statements31=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements31.getTree());
            dbg.location(45,46);
            string_literal32=(Token)match(input,37,FOLLOW_37_in_whileStmt253); 

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
        dbg.location(46, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whileStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "whileStmt"


    public static class io_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "io_stmt"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:48:1: io_stmt : ( 'print' | 'println' | 'read' ) ^ '(' ! expression ')' !;
    public final MiniPParser.io_stmt_return io_stmt() throws RecognitionException {
        MiniPParser.io_stmt_return retval = new MiniPParser.io_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        MiniPParser.expression_return expression35 =null;


        CommonTree set33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal36_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "io_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:48:9: ( ( 'print' | 'println' | 'read' ) ^ '(' ! expression ')' !)
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:48:11: ( 'print' | 'println' | 'read' ) ^ '(' ! expression ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(48,41);
            set33=(Token)input.LT(1);

            set33=(Token)input.LT(1);

            if ( (input.LA(1) >= 38 && input.LA(1) <= 40) ) {
                input.consume();
                root_0 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(set33)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(48,46);
            char_literal34=(Token)match(input,31,FOLLOW_31_in_io_stmt276); 
            dbg.location(48,48);
            pushFollow(FOLLOW_expression_in_io_stmt279);
            expression35=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression35.getTree());
            dbg.location(48,62);
            char_literal36=(Token)match(input,32,FOLLOW_32_in_io_stmt281); 

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
        dbg.location(49, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "io_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "io_stmt"


    public static class ar_exp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ar_exp"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:50:1: ar_exp : product ( STRICH_OP ^ product )* ;
    public final MiniPParser.ar_exp_return ar_exp() throws RecognitionException {
        MiniPParser.ar_exp_return retval = new MiniPParser.ar_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRICH_OP38=null;
        MiniPParser.product_return product37 =null;

        MiniPParser.product_return product39 =null;


        CommonTree STRICH_OP38_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ar_exp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:51:3: ( product ( STRICH_OP ^ product )* )
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:51:3: product ( STRICH_OP ^ product )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(51,3);
            pushFollow(FOLLOW_product_in_ar_exp290);
            product37=product();

            state._fsp--;

            adaptor.addChild(root_0, product37.getTree());
            dbg.location(51,11);
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:51:11: ( STRICH_OP ^ product )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==STRICH_OP) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:51:12: STRICH_OP ^ product
            	    {
            	    dbg.location(51,21);
            	    STRICH_OP38=(Token)match(input,STRICH_OP,FOLLOW_STRICH_OP_in_ar_exp293); 
            	    STRICH_OP38_tree = 
            	    (CommonTree)adaptor.create(STRICH_OP38)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(STRICH_OP38_tree, root_0);

            	    dbg.location(51,23);
            	    pushFollow(FOLLOW_product_in_ar_exp296);
            	    product39=product();

            	    state._fsp--;

            	    adaptor.addChild(root_0, product39.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


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
        dbg.location(52, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ar_exp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ar_exp"


    public static class product_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "product"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:54:1: product : ar_term ( PUNKT_OP ^ ar_term )* ;
    public final MiniPParser.product_return product() throws RecognitionException {
        MiniPParser.product_return retval = new MiniPParser.product_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PUNKT_OP41=null;
        MiniPParser.ar_term_return ar_term40 =null;

        MiniPParser.ar_term_return ar_term42 =null;


        CommonTree PUNKT_OP41_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "product");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:54:9: ( ar_term ( PUNKT_OP ^ ar_term )* )
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:54:11: ar_term ( PUNKT_OP ^ ar_term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(54,11);
            pushFollow(FOLLOW_ar_term_in_product308);
            ar_term40=ar_term();

            state._fsp--;

            adaptor.addChild(root_0, ar_term40.getTree());
            dbg.location(54,19);
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:54:19: ( PUNKT_OP ^ ar_term )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==PUNKT_OP) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:54:20: PUNKT_OP ^ ar_term
            	    {
            	    dbg.location(54,28);
            	    PUNKT_OP41=(Token)match(input,PUNKT_OP,FOLLOW_PUNKT_OP_in_product311); 
            	    PUNKT_OP41_tree = 
            	    (CommonTree)adaptor.create(PUNKT_OP41)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(PUNKT_OP41_tree, root_0);

            	    dbg.location(54,30);
            	    pushFollow(FOLLOW_ar_term_in_product314);
            	    ar_term42=ar_term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ar_term42.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


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
        dbg.location(55, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "product");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "product"


    public static class ar_term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ar_term"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:57:1: ar_term : ( ID | numberconst | '(' ! ar_exp ')' !);
    public final MiniPParser.ar_term_return ar_term() throws RecognitionException {
        MiniPParser.ar_term_return retval = new MiniPParser.ar_term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID43=null;
        Token char_literal45=null;
        Token char_literal47=null;
        MiniPParser.numberconst_return numberconst44 =null;

        MiniPParser.ar_exp_return ar_exp46 =null;


        CommonTree ID43_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree char_literal47_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ar_term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:57:9: ( ID | numberconst | '(' ! ar_exp ')' !)
            int alt9=3;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case FLOAT:
            case INT:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:57:11: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(57,11);
                    ID43=(Token)match(input,ID,FOLLOW_ID_in_ar_term325); 
                    ID43_tree = 
                    (CommonTree)adaptor.create(ID43)
                    ;
                    adaptor.addChild(root_0, ID43_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:57:16: numberconst
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(57,16);
                    pushFollow(FOLLOW_numberconst_in_ar_term329);
                    numberconst44=numberconst();

                    state._fsp--;

                    adaptor.addChild(root_0, numberconst44.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:57:30: '(' ! ar_exp ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(57,33);
                    char_literal45=(Token)match(input,31,FOLLOW_31_in_ar_term333); 
                    dbg.location(57,35);
                    pushFollow(FOLLOW_ar_exp_in_ar_term336);
                    ar_exp46=ar_exp();

                    state._fsp--;

                    adaptor.addChild(root_0, ar_exp46.getTree());
                    dbg.location(57,45);
                    char_literal47=(Token)match(input,32,FOLLOW_32_in_ar_term338); 

                    }
                    break;

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
        dbg.location(58, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ar_term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ar_term"


    public static class cmp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmp"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:60:1: cmp : ar_exp RELOP ^ ar_exp ;
    public final MiniPParser.cmp_return cmp() throws RecognitionException {
        MiniPParser.cmp_return retval = new MiniPParser.cmp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RELOP49=null;
        MiniPParser.ar_exp_return ar_exp48 =null;

        MiniPParser.ar_exp_return ar_exp50 =null;


        CommonTree RELOP49_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cmp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:60:5: ( ar_exp RELOP ^ ar_exp )
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:60:7: ar_exp RELOP ^ ar_exp
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(60,7);
            pushFollow(FOLLOW_ar_exp_in_cmp348);
            ar_exp48=ar_exp();

            state._fsp--;

            adaptor.addChild(root_0, ar_exp48.getTree());
            dbg.location(60,19);
            RELOP49=(Token)match(input,RELOP,FOLLOW_RELOP_in_cmp350); 
            RELOP49_tree = 
            (CommonTree)adaptor.create(RELOP49)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(RELOP49_tree, root_0);

            dbg.location(60,21);
            pushFollow(FOLLOW_ar_exp_in_cmp353);
            ar_exp50=ar_exp();

            state._fsp--;

            adaptor.addChild(root_0, ar_exp50.getTree());

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
        dbg.location(61, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cmp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cmp"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:63:1: statement : ( ifStmt | whileStmt | io_stmt | var_def );
    public final MiniPParser.statement_return statement() throws RecognitionException {
        MiniPParser.statement_return retval = new MiniPParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MiniPParser.ifStmt_return ifStmt51 =null;

        MiniPParser.whileStmt_return whileStmt52 =null;

        MiniPParser.io_stmt_return io_stmt53 =null;

        MiniPParser.var_def_return var_def54 =null;



        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:64:3: ( ifStmt | whileStmt | io_stmt | var_def )
            int alt10=4;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 42:
                {
                alt10=2;
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt10=3;
                }
                break;
            case ID:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:64:3: ifStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(64,3);
                    pushFollow(FOLLOW_ifStmt_in_statement362);
                    ifStmt51=ifStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStmt51.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:65:3: whileStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(65,3);
                    pushFollow(FOLLOW_whileStmt_in_statement366);
                    whileStmt52=whileStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStmt52.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:66:3: io_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(66,3);
                    pushFollow(FOLLOW_io_stmt_in_statement370);
                    io_stmt53=io_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, io_stmt53.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:67:3: var_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(67,3);
                    pushFollow(FOLLOW_var_def_in_statement374);
                    var_def54=var_def();

                    state._fsp--;

                    adaptor.addChild(root_0, var_def54.getTree());

                    }
                    break;

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
        dbg.location(68, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"


    public static class statements_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statements"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:70:1: statements : ( statement SEMICOL )+ -> ^( SLIST ( statement )+ ) ;
    public final MiniPParser.statements_return statements() throws RecognitionException {
        MiniPParser.statements_return retval = new MiniPParser.statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SEMICOL56=null;
        MiniPParser.statement_return statement55 =null;


        CommonTree SEMICOL56_tree=null;
        RewriteRuleTokenStream stream_SEMICOL=new RewriteRuleTokenStream(adaptor,"token SEMICOL");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try { dbg.enterRule(getGrammarFileName(), "statements");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:71:2: ( ( statement SEMICOL )+ -> ^( SLIST ( statement )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:71:4: ( statement SEMICOL )+
            {
            dbg.location(71,4);
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:71:4: ( statement SEMICOL )+
            int cnt11=0;
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==ID||LA11_0==36||(LA11_0 >= 38 && LA11_0 <= 40)||LA11_0==42) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:71:5: statement SEMICOL
            	    {
            	    dbg.location(71,5);
            	    pushFollow(FOLLOW_statement_in_statements385);
            	    statement55=statement();

            	    state._fsp--;

            	    stream_statement.add(statement55.getTree());
            	    dbg.location(71,15);
            	    SEMICOL56=(Token)match(input,SEMICOL,FOLLOW_SEMICOL_in_statements387);  
            	    stream_SEMICOL.add(SEMICOL56);


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt11++;
            } while (true);
            } finally {dbg.exitSubRule(11);}


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 72:2: -> ^( SLIST ( statement )+ )
            {
                dbg.location(72,5);
                // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:72:5: ^( SLIST ( statement )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(72,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SLIST, "SLIST")
                , root_1);

                dbg.location(72,13);
                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    dbg.location(72,13);
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
        dbg.location(73, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statements");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statements"


    public static class numberconst_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numberconst"
    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:75:1: numberconst : ( INT -> INT | FLOAT -> FLOAT );
    public final MiniPParser.numberconst_return numberconst() throws RecognitionException {
        MiniPParser.numberconst_return retval = new MiniPParser.numberconst_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT57=null;
        Token FLOAT58=null;

        CommonTree INT57_tree=null;
        CommonTree FLOAT58_tree=null;
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try { dbg.enterRule(getGrammarFileName(), "numberconst");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:76:2: ( INT -> INT | FLOAT -> FLOAT )
            int alt12=2;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==FLOAT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:76:4: INT
                    {
                    dbg.location(76,4);
                    INT57=(Token)match(input,INT,FOLLOW_INT_in_numberconst409);  
                    stream_INT.add(INT57);


                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 76:8: -> INT
                    {
                        dbg.location(76,11);
                        adaptor.addChild(root_0, 
                        stream_INT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Swaneet\\github\\haw\\CI\\A2\\MiniP.g:77:4: FLOAT
                    {
                    dbg.location(77,4);
                    FLOAT58=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numberconst418);  
                    stream_FLOAT.add(FLOAT58);


                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:10: -> FLOAT
                    {
                        dbg.location(77,13);
                        adaptor.addChild(root_0, 
                        stream_FLOAT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

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
        dbg.location(78, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "numberconst");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "numberconst"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_main48 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_declarations_in_main50 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BEGIN_in_main52 = new BitSet(new long[]{0x000005D000008000L});
    public static final BitSet FOLLOW_statements_in_main54 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_END_in_main56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations74 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_TYPE_in_declaration92 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ids_in_declaration95 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_SEMICOL_in_declaration97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ids107 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_ids110 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_ids112 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ID_in_var_def132 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DEF_in_var_def134 = new BitSet(new long[]{0x000000008802A020L});
    public static final BitSet FOLLOW_expression_in_var_def136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_expression156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expression165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ar_exp_in_expression174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ifStmt202 = new BitSet(new long[]{0x000000008002A020L});
    public static final BitSet FOLLOW_BOOL_in_ifStmt206 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_cmp_in_ifStmt210 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ifStmt214 = new BitSet(new long[]{0x000005D000008000L});
    public static final BitSet FOLLOW_statements_in_ifStmt217 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ifStmt220 = new BitSet(new long[]{0x000005D000008000L});
    public static final BitSet FOLLOW_statements_in_ifStmt223 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ifStmt227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_whileStmt237 = new BitSet(new long[]{0x000000008002A020L});
    public static final BitSet FOLLOW_BOOL_in_whileStmt241 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_cmp_in_whileStmt245 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_whileStmt248 = new BitSet(new long[]{0x000005D000008000L});
    public static final BitSet FOLLOW_statements_in_whileStmt251 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_whileStmt253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_io_stmt263 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_io_stmt276 = new BitSet(new long[]{0x000000008802A020L});
    public static final BitSet FOLLOW_expression_in_io_stmt279 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_io_stmt281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_product_in_ar_exp290 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_STRICH_OP_in_ar_exp293 = new BitSet(new long[]{0x000000008002A000L});
    public static final BitSet FOLLOW_product_in_ar_exp296 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ar_term_in_product308 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_PUNKT_OP_in_product311 = new BitSet(new long[]{0x000000008002A000L});
    public static final BitSet FOLLOW_ar_term_in_product314 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ID_in_ar_term325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberconst_in_ar_term329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ar_term333 = new BitSet(new long[]{0x000000008002A000L});
    public static final BitSet FOLLOW_ar_exp_in_ar_term336 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ar_term338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ar_exp_in_cmp348 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RELOP_in_cmp350 = new BitSet(new long[]{0x000000008002A000L});
    public static final BitSet FOLLOW_ar_exp_in_cmp353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStmt_in_statement362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStmt_in_statement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_io_stmt_in_statement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_def_in_statement374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements385 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_SEMICOL_in_statements387 = new BitSet(new long[]{0x000005D000008002L});
    public static final BitSet FOLLOW_INT_in_numberconst409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_numberconst418 = new BitSet(new long[]{0x0000000000000002L});

}