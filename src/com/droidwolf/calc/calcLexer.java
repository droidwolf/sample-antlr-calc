// $ANTLR 3.4 D:\\antlr\\calc.g 2012-09-19 00:59:43

	package com.droidwolf.calc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class calcLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int DOUBLE=4;
    public static final int ID=5;
    public static final int SEMI=6;
    public static final int WS=7;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public calcLexer() {} 
    public calcLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public calcLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\antlr\\calc.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:11:6: ( '(' )
            // D:\\antlr\\calc.g:11:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:12:6: ( ')' )
            // D:\\antlr\\calc.g:12:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:13:7: ( '*' )
            // D:\\antlr\\calc.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:14:7: ( '+' )
            // D:\\antlr\\calc.g:14:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:15:7: ( '-' )
            // D:\\antlr\\calc.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:16:7: ( '/' )
            // D:\\antlr\\calc.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:17:7: ( '=' )
            // D:\\antlr\\calc.g:17:9: '='
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:18:7: ( '^' )
            // D:\\antlr\\calc.g:18:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:19:7: ( 'cos' )
            // D:\\antlr\\calc.g:19:9: 'cos'
            {
            match("cos"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:20:7: ( 'ln' )
            // D:\\antlr\\calc.g:20:9: 'ln'
            {
            match("ln"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:21:7: ( 'log' )
            // D:\\antlr\\calc.g:21:9: 'log'
            {
            match("log"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:22:7: ( 'sin' )
            // D:\\antlr\\calc.g:22:9: 'sin'
            {
            match("sin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:23:7: ( 'tan' )
            // D:\\antlr\\calc.g:23:9: 'tan'
            {
            match("tan"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:39:8: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // D:\\antlr\\calc.g:39:10: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // D:\\antlr\\calc.g:39:10: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\antlr\\calc.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            // D:\\antlr\\calc.g:39:24: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\antlr\\calc.g:39:25: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // D:\\antlr\\calc.g:39:28: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // D:\\antlr\\calc.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


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
    // $ANTLR end "DOUBLE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:40:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // D:\\antlr\\calc.g:40:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\antlr\\calc.g:40:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\antlr\\calc.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:41:6: ( ( ';' )+ )
            // D:\\antlr\\calc.g:41:8: ( ';' )+
            {
            // D:\\antlr\\calc.g:41:8: ( ';' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==';') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\antlr\\calc.g:41:9: ';'
            	    {
            	    match(';'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\antlr\\calc.g:42:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // D:\\antlr\\calc.g:42:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // D:\\antlr\\calc.g:42:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\antlr\\calc.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


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

    public void mTokens() throws RecognitionException {
        // D:\\antlr\\calc.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | DOUBLE | ID | SEMI | WS )
        int alt7=17;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt7=1;
            }
            break;
        case ')':
            {
            alt7=2;
            }
            break;
        case '*':
            {
            alt7=3;
            }
            break;
        case '+':
            {
            alt7=4;
            }
            break;
        case '-':
            {
            alt7=5;
            }
            break;
        case '/':
            {
            alt7=6;
            }
            break;
        case '=':
            {
            alt7=7;
            }
            break;
        case '^':
            {
            alt7=8;
            }
            break;
        case 'c':
            {
            int LA7_9 = input.LA(2);

            if ( (LA7_9=='o') ) {
                int LA7_17 = input.LA(3);

                if ( (LA7_17=='s') ) {
                    int LA7_22 = input.LA(4);

                    if ( ((LA7_22 >= '0' && LA7_22 <= '9')||(LA7_22 >= 'A' && LA7_22 <= 'Z')||(LA7_22 >= 'a' && LA7_22 <= 'z')) ) {
                        alt7=15;
                    }
                    else {
                        alt7=9;
                    }
                }
                else {
                    alt7=15;
                }
            }
            else {
                alt7=15;
            }
            }
            break;
        case 'l':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA7_18 = input.LA(3);

                if ( ((LA7_18 >= '0' && LA7_18 <= '9')||(LA7_18 >= 'A' && LA7_18 <= 'Z')||(LA7_18 >= 'a' && LA7_18 <= 'z')) ) {
                    alt7=15;
                }
                else {
                    alt7=10;
                }
                }
                break;
            case 'o':
                {
                int LA7_19 = input.LA(3);

                if ( (LA7_19=='g') ) {
                    int LA7_24 = input.LA(4);

                    if ( ((LA7_24 >= '0' && LA7_24 <= '9')||(LA7_24 >= 'A' && LA7_24 <= 'Z')||(LA7_24 >= 'a' && LA7_24 <= 'z')) ) {
                        alt7=15;
                    }
                    else {
                        alt7=11;
                    }
                }
                else {
                    alt7=15;
                }
                }
                break;
            default:
                alt7=15;
            }

            }
            break;
        case 's':
            {
            int LA7_11 = input.LA(2);

            if ( (LA7_11=='i') ) {
                int LA7_20 = input.LA(3);

                if ( (LA7_20=='n') ) {
                    int LA7_25 = input.LA(4);

                    if ( ((LA7_25 >= '0' && LA7_25 <= '9')||(LA7_25 >= 'A' && LA7_25 <= 'Z')||(LA7_25 >= 'a' && LA7_25 <= 'z')) ) {
                        alt7=15;
                    }
                    else {
                        alt7=12;
                    }
                }
                else {
                    alt7=15;
                }
            }
            else {
                alt7=15;
            }
            }
            break;
        case 't':
            {
            int LA7_12 = input.LA(2);

            if ( (LA7_12=='a') ) {
                int LA7_21 = input.LA(3);

                if ( (LA7_21=='n') ) {
                    int LA7_26 = input.LA(4);

                    if ( ((LA7_26 >= '0' && LA7_26 <= '9')||(LA7_26 >= 'A' && LA7_26 <= 'Z')||(LA7_26 >= 'a' && LA7_26 <= 'z')) ) {
                        alt7=15;
                    }
                    else {
                        alt7=13;
                    }
                }
                else {
                    alt7=15;
                }
            }
            else {
                alt7=15;
            }
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
        case '8':
        case '9':
            {
            alt7=14;
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
        case 'a':
        case 'b':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt7=15;
            }
            break;
        case ';':
            {
            alt7=16;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt7=17;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }

        switch (alt7) {
            case 1 :
                // D:\\antlr\\calc.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // D:\\antlr\\calc.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // D:\\antlr\\calc.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // D:\\antlr\\calc.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // D:\\antlr\\calc.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // D:\\antlr\\calc.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // D:\\antlr\\calc.g:1:44: T__14
                {
                mT__14(); 


                }
                break;
            case 8 :
                // D:\\antlr\\calc.g:1:50: T__15
                {
                mT__15(); 


                }
                break;
            case 9 :
                // D:\\antlr\\calc.g:1:56: T__16
                {
                mT__16(); 


                }
                break;
            case 10 :
                // D:\\antlr\\calc.g:1:62: T__17
                {
                mT__17(); 


                }
                break;
            case 11 :
                // D:\\antlr\\calc.g:1:68: T__18
                {
                mT__18(); 


                }
                break;
            case 12 :
                // D:\\antlr\\calc.g:1:74: T__19
                {
                mT__19(); 


                }
                break;
            case 13 :
                // D:\\antlr\\calc.g:1:80: T__20
                {
                mT__20(); 


                }
                break;
            case 14 :
                // D:\\antlr\\calc.g:1:86: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 15 :
                // D:\\antlr\\calc.g:1:93: ID
                {
                mID(); 


                }
                break;
            case 16 :
                // D:\\antlr\\calc.g:1:96: SEMI
                {
                mSEMI(); 


                }
                break;
            case 17 :
                // D:\\antlr\\calc.g:1:101: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}