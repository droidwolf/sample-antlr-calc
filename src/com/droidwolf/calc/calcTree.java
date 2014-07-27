// $ANTLR 3.4 D:\\antlr\\calcTree.g 2012-09-19 01:26:46

	package com.droidwolf.calc;
	
	import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class calcTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOUBLE", "ID", "SEMI", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'='", "'^'", "'cos'", "'ln'", "'log'", "'sin'", "'tan'"
    };

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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public calcTree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public calcTree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return calcTree.tokenNames; }
    public String getGrammarFileName() { return "D:\\antlr\\calcTree.g"; }


    	HashMap memory=new HashMap();



    // $ANTLR start "program"
    // D:\\antlr\\calcTree.g:19:1: program : ( statement )+ ;
    public final void program() throws RecognitionException {
        try {
            // D:\\antlr\\calcTree.g:19:9: ( ( statement )+ )
            // D:\\antlr\\calcTree.g:19:11: ( statement )+
            {
            // D:\\antlr\\calcTree.g:19:11: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= DOUBLE && LA1_0 <= ID)||(LA1_0 >= 10 && LA1_0 <= 20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\antlr\\calcTree.g:19:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program45);
            	    statement();

            	    state._fsp--;


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


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "statement"
    // D:\\antlr\\calcTree.g:20:1: statement : ( expression | ^( '=' ID expression ) );
    public final void statement() throws RecognitionException {
        CommonTree ID2=null;
        double expression1 =0.0;

        double expression3 =0.0;


        try {
            // D:\\antlr\\calcTree.g:21:2: ( expression | ^( '=' ID expression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= DOUBLE && LA2_0 <= ID)||(LA2_0 >= 10 && LA2_0 <= 13)||(LA2_0 >= 15 && LA2_0 <= 20)) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\antlr\\calcTree.g:21:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement54);
                    expression1=expression();

                    state._fsp--;


                     System.out.println( "result="+expression1 ); 

                    }
                    break;
                case 2 :
                    // D:\\antlr\\calcTree.g:22:4: ^( '=' ID expression )
                    {
                    match(input,14,FOLLOW_14_in_statement61); 

                    match(input, Token.DOWN, null); 
                    ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_statement63); 

                    pushFollow(FOLLOW_expression_in_statement65);
                    expression3=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     memory.put( (ID2!=null?ID2.getText():null), expression3); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "expression"
    // D:\\antlr\\calcTree.g:25:1: expression returns [double value] : ( ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ( 'sin' x= expression ) | ( 'cos' x= expression ) | ( 'tan' x= expression ) | ( 'ln' x= expression ) | ( '-' x= expression ) | ( 'log' a= expression b= expression ) | ID | DOUBLE );
    public final double expression() throws RecognitionException {
        double value = 0.0;


        CommonTree ID4=null;
        CommonTree DOUBLE5=null;
        double a =0.0;

        double b =0.0;

        double x =0.0;


        try {
            // D:\\antlr\\calcTree.g:26:2: ( ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ( 'sin' x= expression ) | ( 'cos' x= expression ) | ( 'tan' x= expression ) | ( 'ln' x= expression ) | ( '-' x= expression ) | ( 'log' a= expression b= expression ) | ID | DOUBLE )
            int alt3=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==DOWN) ) {
                    alt3=2;
                }
                else if ( ((LA3_2 >= DOUBLE && LA3_2 <= ID)||(LA3_2 >= 10 && LA3_2 <= 13)||(LA3_2 >= 15 && LA3_2 <= 20)) ) {
                    alt3=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;

                }
                }
                break;
            case 10:
                {
                alt3=3;
                }
                break;
            case 13:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            case 16:
                {
                alt3=7;
                }
                break;
            case 20:
                {
                alt3=8;
                }
                break;
            case 17:
                {
                alt3=9;
                }
                break;
            case 18:
                {
                alt3=11;
                }
                break;
            case ID:
                {
                alt3=12;
                }
                break;
            case DOUBLE:
                {
                alt3=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // D:\\antlr\\calcTree.g:26:5: ^( '+' a= expression b= expression )
                    {
                    match(input,11,FOLLOW_11_in_expression85); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression89);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression93);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    value =a+b;

                    }
                    break;
                case 2 :
                    // D:\\antlr\\calcTree.g:27:5: ^( '-' a= expression b= expression )
                    {
                    match(input,12,FOLLOW_12_in_expression103); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression107);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression111);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    value =a-b;

                    }
                    break;
                case 3 :
                    // D:\\antlr\\calcTree.g:28:5: ^( '*' a= expression b= expression )
                    {
                    match(input,10,FOLLOW_10_in_expression121); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression125);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression129);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    value =a*b;

                    }
                    break;
                case 4 :
                    // D:\\antlr\\calcTree.g:29:5: ^( '/' a= expression b= expression )
                    {
                    match(input,13,FOLLOW_13_in_expression139); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression143);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression147);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    value =a/b;

                    }
                    break;
                case 5 :
                    // D:\\antlr\\calcTree.g:30:5: ^( '^' a= expression b= expression )
                    {
                    match(input,15,FOLLOW_15_in_expression157); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression161);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression165);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    value =Math.pow(a,b);

                    }
                    break;
                case 6 :
                    // D:\\antlr\\calcTree.g:31:6: ( 'sin' x= expression )
                    {
                    // D:\\antlr\\calcTree.g:31:6: ( 'sin' x= expression )
                    // D:\\antlr\\calcTree.g:31:7: 'sin' x= expression
                    {
                    match(input,19,FOLLOW_19_in_expression175); 

                    pushFollow(FOLLOW_expression_in_expression179);
                    x=expression();

                    state._fsp--;


                    }


                    value =Math.sin(x);

                    }
                    break;
                case 7 :
                    // D:\\antlr\\calcTree.g:32:6: ( 'cos' x= expression )
                    {
                    // D:\\antlr\\calcTree.g:32:6: ( 'cos' x= expression )
                    // D:\\antlr\\calcTree.g:32:7: 'cos' x= expression
                    {
                    match(input,16,FOLLOW_16_in_expression192); 

                    pushFollow(FOLLOW_expression_in_expression196);
                    x=expression();

                    state._fsp--;


                    }


                    value =Math.cos(x);

                    }
                    break;
                case 8 :
                    // D:\\antlr\\calcTree.g:33:6: ( 'tan' x= expression )
                    {
                    // D:\\antlr\\calcTree.g:33:6: ( 'tan' x= expression )
                    // D:\\antlr\\calcTree.g:33:7: 'tan' x= expression
                    {
                    match(input,20,FOLLOW_20_in_expression206); 

                    pushFollow(FOLLOW_expression_in_expression210);
                    x=expression();

                    state._fsp--;


                    }


                    value =Math.tan(x);

                    }
                    break;
                case 9 :
                    // D:\\antlr\\calcTree.g:34:6: ( 'ln' x= expression )
                    {
                    // D:\\antlr\\calcTree.g:34:6: ( 'ln' x= expression )
                    // D:\\antlr\\calcTree.g:34:7: 'ln' x= expression
                    {
                    match(input,17,FOLLOW_17_in_expression220); 

                    pushFollow(FOLLOW_expression_in_expression224);
                    x=expression();

                    state._fsp--;


                    }


                    value =Math.log(x);

                    }
                    break;
                case 10 :
                    // D:\\antlr\\calcTree.g:35:6: ( '-' x= expression )
                    {
                    // D:\\antlr\\calcTree.g:35:6: ( '-' x= expression )
                    // D:\\antlr\\calcTree.g:35:7: '-' x= expression
                    {
                    match(input,12,FOLLOW_12_in_expression234); 

                    pushFollow(FOLLOW_expression_in_expression238);
                    x=expression();

                    state._fsp--;


                    }


                    value =-x;

                    }
                    break;
                case 11 :
                    // D:\\antlr\\calcTree.g:36:6: ( 'log' a= expression b= expression )
                    {
                    // D:\\antlr\\calcTree.g:36:6: ( 'log' a= expression b= expression )
                    // D:\\antlr\\calcTree.g:36:7: 'log' a= expression b= expression
                    {
                    match(input,18,FOLLOW_18_in_expression248); 

                    pushFollow(FOLLOW_expression_in_expression252);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression256);
                    b=expression();

                    state._fsp--;


                    }


                    value =Math.log(b)/Math.log(b);

                    }
                    break;
                case 12 :
                    // D:\\antlr\\calcTree.g:37:4: ID
                    {
                    ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_expression264); 


                    		value =0;
                    		Double v=(Double)memory.get((ID4!=null?ID4.getText():null));
                    		if(v!=null) value =v;
                    		else System.err.println( "#f0000 variable"+(ID4!=null?ID4.getText():null));
                    		

                    }
                    break;
                case 13 :
                    // D:\\antlr\\calcTree.g:43:4: DOUBLE
                    {
                    DOUBLE5=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_expression270); 

                     value =Double.parseDouble((DOUBLE5!=null?DOUBLE5.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_program45 = new BitSet(new long[]{0x00000000001FFC32L});
    public static final BitSet FOLLOW_expression_in_statement54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_statement61 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_statement63 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_statement65 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_11_in_expression85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression89 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_12_in_expression103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression107 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_10_in_expression121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression125 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_13_in_expression139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression143 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression147 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_15_in_expression157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression161 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_19_in_expression175 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_expression192 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_expression206 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expression220 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_expression234 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_expression248 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression252 = new BitSet(new long[]{0x00000000001FBC30L});
    public static final BitSet FOLLOW_expression_in_expression256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expression264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_expression270 = new BitSet(new long[]{0x0000000000000002L});

}