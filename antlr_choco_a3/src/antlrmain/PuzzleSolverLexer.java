package antlrmain;

// $ANTLR 3.4 /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g 2014-06-07 13:08:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PuzzleSolverLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public PuzzleSolverLexer() {} 
    public PuzzleSolverLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PuzzleSolverLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g"; }

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:34:4: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:34:6: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:34:6: ( '\\r\\n' | '\\r' | '\\n' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='\n') ) {
                    alt1=1;
                }
                else {
                    alt1=2;
                }
            }
            else if ( (LA1_0=='\n') ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:34:7: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:35:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:36:11: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "OP"
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:39:5: ( '+' | '-' )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:43:6: ( ( 'A' .. 'Z' ) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:46:5: ( '=' )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:46:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:50:5: ( ( ' ' | '\\t' ) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:50:9: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:55:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:55:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:55:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\\') ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:55:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:55:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:60:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:64:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt3=1;
                    }
                    break;
                case 'u':
                    {
                    alt3=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:64:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:65:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:66:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:71:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1 >= '0' && LA4_1 <= '3')) ) {
                    int LA4_2 = input.LA(3);

                    if ( ((LA4_2 >= '0' && LA4_2 <= '7')) ) {
                        int LA4_4 = input.LA(4);

                        if ( ((LA4_4 >= '0' && LA4_4 <= '7')) ) {
                            alt4=1;
                        }
                        else {
                            alt4=2;
                        }
                    }
                    else {
                        alt4=3;
                    }
                }
                else if ( ((LA4_1 >= '4' && LA4_1 <= '7')) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3 >= '0' && LA4_3 <= '7')) ) {
                        alt4=2;
                    }
                    else {
                        alt4=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:71:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:72:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:73:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:78:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:78:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:1:8: ( NL | OP | ID | EQ | WS | CHAR )
        int alt5=6;
        switch ( input.LA(1) ) {
        case '\n':
        case '\r':
            {
            alt5=1;
            }
            break;
        case '+':
        case '-':
            {
            alt5=2;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt5=3;
            }
            break;
        case '=':
            {
            alt5=4;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=5;
            }
            break;
        case '\'':
            {
            alt5=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:1:10: NL
                {
                mNL(); 


                }
                break;
            case 2 :
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:1:13: OP
                {
                mOP(); 


                }
                break;
            case 3 :
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:1:16: ID
                {
                mID(); 


                }
                break;
            case 4 :
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:1:19: EQ
                {
                mEQ(); 


                }
                break;
            case 5 :
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:1:22: WS
                {
                mWS(); 


                }
                break;
            case 6 :
                // /Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/A3/PuzzleSolver.g:1:25: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


 

}