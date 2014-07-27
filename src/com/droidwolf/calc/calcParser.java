// $ANTLR 3.4 D:\\antlr\\calc.g 2012-09-19 00:59:43

	package com.droidwolf.calc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class calcParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public calcParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public calcParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return calcParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\antlr\\calc.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\antlr\\calc.g:18:1: program : ( statement )+ ;
    public final calcParser.program_return program() throws RecognitionException {
        calcParser.program_return retval = new calcParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        calcParser.statement_return statement1 =null;



        try {
            // D:\\antlr\\calc.g:18:9: ( ( statement )+ )
            // D:\\antlr\\calc.g:18:11: ( statement )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\antlr\\calc.g:18:11: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= DOUBLE && LA1_0 <= SEMI)||LA1_0==8||LA1_0==12||(LA1_0 >= 16 && LA1_0 <= 20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\antlr\\calc.g:18:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program48);
            	    statement1=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement1.getTree());

            	     System.out.println( (statement1!=null?((CommonTree)statement1.tree):null).toStringTree() ); 

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
    // $ANTLR end "program"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // D:\\antlr\\calc.g:19:1: statement : ( expression SEMI -> expression | ID '=' expression SEMI -> ^( '=' ID expression ) | SEMI ->);
    public final calcParser.statement_return statement() throws RecognitionException {
        calcParser.statement_return retval = new calcParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SEMI3=null;
        Token ID4=null;
        Token char_literal5=null;
        Token SEMI7=null;
        Token SEMI8=null;
        calcParser.expression_return expression2 =null;

        calcParser.expression_return expression6 =null;


        CommonTree SEMI3_tree=null;
        CommonTree ID4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree SEMI7_tree=null;
        CommonTree SEMI8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\antlr\\calc.g:20:2: ( expression SEMI -> expression | ID '=' expression SEMI -> ^( '=' ID expression ) | SEMI ->)
            int alt2=3;
            switch ( input.LA(1) ) {
            case DOUBLE:
            case 8:
            case 12:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==14) ) {
                    alt2=2;
                }
                else if ( (LA2_2==SEMI||(LA2_2 >= 10 && LA2_2 <= 13)||LA2_2==15) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case SEMI:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // D:\\antlr\\calc.g:20:4: expression SEMI
                    {
                    pushFollow(FOLLOW_expression_in_statement59);
                    expression2=expression();

                    state._fsp--;

                    stream_expression.add(expression2.getTree());

                    SEMI3=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement61);  
                    stream_SEMI.add(SEMI3);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 20:19: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\antlr\\calc.g:21:4: ID '=' expression SEMI
                    {
                    ID4=(Token)match(input,ID,FOLLOW_ID_in_statement71);  
                    stream_ID.add(ID4);


                    char_literal5=(Token)match(input,14,FOLLOW_14_in_statement72);  
                    stream_14.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_statement73);
                    expression6=expression();

                    state._fsp--;

                    stream_expression.add(expression6.getTree());

                    SEMI7=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement75);  
                    stream_SEMI.add(SEMI7);


                    // AST REWRITE
                    // elements: ID, 14, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 21:24: -> ^( '=' ID expression )
                    {
                        // D:\\antlr\\calc.g:21:26: ^( '=' ID expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_14.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\antlr\\calc.g:22:5: SEMI
                    {
                    SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement90);  
                    stream_SEMI.add(SEMI8);


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
                    // 22:9: ->
                    {
                        root_0 = null;
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
        return retval;
    }
    // $ANTLR end "statement"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // D:\\antlr\\calc.g:24:1: expression : term ( ( '+' ^| '-' ^) term )* ;
    public final calcParser.expression_return expression() throws RecognitionException {
        calcParser.expression_return retval = new calcParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal10=null;
        Token char_literal11=null;
        calcParser.term_return term9 =null;

        calcParser.term_return term12 =null;


        CommonTree char_literal10_tree=null;
        CommonTree char_literal11_tree=null;

        try {
            // D:\\antlr\\calc.g:25:2: ( term ( ( '+' ^| '-' ^) term )* )
            // D:\\antlr\\calc.g:25:4: term ( ( '+' ^| '-' ^) term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_expression107);
            term9=term();

            state._fsp--;

            adaptor.addChild(root_0, term9.getTree());

            // D:\\antlr\\calc.g:25:8: ( ( '+' ^| '-' ^) term )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 11 && LA4_0 <= 12)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\antlr\\calc.g:25:10: ( '+' ^| '-' ^) term
            	    {
            	    // D:\\antlr\\calc.g:25:10: ( '+' ^| '-' ^)
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==11) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==12) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // D:\\antlr\\calc.g:25:11: '+' ^
            	            {
            	            char_literal10=(Token)match(input,11,FOLLOW_11_in_expression111); 
            	            char_literal10_tree = 
            	            (CommonTree)adaptor.create(char_literal10)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal10_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\antlr\\calc.g:25:16: '-' ^
            	            {
            	            char_literal11=(Token)match(input,12,FOLLOW_12_in_expression114); 
            	            char_literal11_tree = 
            	            (CommonTree)adaptor.create(char_literal11)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal11_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_expression118);
            	    term12=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term12.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "expression"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // D:\\antlr\\calc.g:26:1: term : factor ( ( '*' ^| '/' ^) factor )* ;
    public final calcParser.term_return term() throws RecognitionException {
        calcParser.term_return retval = new calcParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal14=null;
        Token char_literal15=null;
        calcParser.factor_return factor13 =null;

        calcParser.factor_return factor16 =null;


        CommonTree char_literal14_tree=null;
        CommonTree char_literal15_tree=null;

        try {
            // D:\\antlr\\calc.g:26:6: ( factor ( ( '*' ^| '/' ^) factor )* )
            // D:\\antlr\\calc.g:26:8: factor ( ( '*' ^| '/' ^) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term131);
            factor13=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor13.getTree());

            // D:\\antlr\\calc.g:26:14: ( ( '*' ^| '/' ^) factor )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==10||LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\antlr\\calc.g:26:16: ( '*' ^| '/' ^) factor
            	    {
            	    // D:\\antlr\\calc.g:26:16: ( '*' ^| '/' ^)
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==10) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==13) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // D:\\antlr\\calc.g:26:17: '*' ^
            	            {
            	            char_literal14=(Token)match(input,10,FOLLOW_10_in_term135); 
            	            char_literal14_tree = 
            	            (CommonTree)adaptor.create(char_literal14)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal14_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\antlr\\calc.g:26:22: '/' ^
            	            {
            	            char_literal15=(Token)match(input,13,FOLLOW_13_in_term138); 
            	            char_literal15_tree = 
            	            (CommonTree)adaptor.create(char_literal15)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal15_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term142);
            	    factor16=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor16.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // D:\\antlr\\calc.g:27:1: factor : atom ( '^' ^ atom )* ;
    public final calcParser.factor_return factor() throws RecognitionException {
        calcParser.factor_return retval = new calcParser.factor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal18=null;
        calcParser.atom_return atom17 =null;

        calcParser.atom_return atom19 =null;


        CommonTree char_literal18_tree=null;

        try {
            // D:\\antlr\\calc.g:27:8: ( atom ( '^' ^ atom )* )
            // D:\\antlr\\calc.g:27:10: atom ( '^' ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_factor152);
            atom17=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom17.getTree());

            // D:\\antlr\\calc.g:27:14: ( '^' ^ atom )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\antlr\\calc.g:27:16: '^' ^ atom
            	    {
            	    char_literal18=(Token)match(input,15,FOLLOW_15_in_factor155); 
            	    char_literal18_tree = 
            	    (CommonTree)adaptor.create(char_literal18)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal18_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_factor157);
            	    atom19=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom19.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // D:\\antlr\\calc.g:28:1: atom : ( DOUBLE | ID | '(' ! expression ')' !| 'sin' '(' ! expression ')' !| 'cos' '(' ! expression ')' !| 'tan' '(' ! expression ')' !| 'ln' '(' ! expression ')' !| 'log' '(' ! expression ')' !| '-' atom );
    public final calcParser.atom_return atom() throws RecognitionException {
        calcParser.atom_return retval = new calcParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOUBLE20=null;
        Token ID21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token string_literal25=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token string_literal29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token string_literal33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        Token string_literal37=null;
        Token char_literal38=null;
        Token char_literal40=null;
        Token string_literal41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Token char_literal45=null;
        calcParser.expression_return expression23 =null;

        calcParser.expression_return expression27 =null;

        calcParser.expression_return expression31 =null;

        calcParser.expression_return expression35 =null;

        calcParser.expression_return expression39 =null;

        calcParser.expression_return expression43 =null;

        calcParser.atom_return atom46 =null;


        CommonTree DOUBLE20_tree=null;
        CommonTree ID21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree string_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree string_literal29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree string_literal33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree string_literal37_tree=null;
        CommonTree char_literal38_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree string_literal41_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree char_literal45_tree=null;

        try {
            // D:\\antlr\\calc.g:28:6: ( DOUBLE | ID | '(' ! expression ')' !| 'sin' '(' ! expression ')' !| 'cos' '(' ! expression ')' !| 'tan' '(' ! expression ')' !| 'ln' '(' ! expression ')' !| 'log' '(' ! expression ')' !| '-' atom )
            int alt8=9;
            switch ( input.LA(1) ) {
            case DOUBLE:
                {
                alt8=1;
                }
                break;
            case ID:
                {
                alt8=2;
                }
                break;
            case 8:
                {
                alt8=3;
                }
                break;
            case 19:
                {
                alt8=4;
                }
                break;
            case 16:
                {
                alt8=5;
                }
                break;
            case 20:
                {
                alt8=6;
                }
                break;
            case 17:
                {
                alt8=7;
                }
                break;
            case 18:
                {
                alt8=8;
                }
                break;
            case 12:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // D:\\antlr\\calc.g:28:8: DOUBLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DOUBLE20=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom167); 
                    DOUBLE20_tree = 
                    (CommonTree)adaptor.create(DOUBLE20)
                    ;
                    adaptor.addChild(root_0, DOUBLE20_tree);


                    }
                    break;
                case 2 :
                    // D:\\antlr\\calc.g:29:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID21=(Token)match(input,ID,FOLLOW_ID_in_atom172); 
                    ID21_tree = 
                    (CommonTree)adaptor.create(ID21)
                    ;
                    adaptor.addChild(root_0, ID21_tree);


                    }
                    break;
                case 3 :
                    // D:\\antlr\\calc.g:30:4: '(' ! expression ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal22=(Token)match(input,8,FOLLOW_8_in_atom177); 

                    pushFollow(FOLLOW_expression_in_atom180);
                    expression23=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression23.getTree());

                    char_literal24=(Token)match(input,9,FOLLOW_9_in_atom182); 

                    }
                    break;
                case 4 :
                    // D:\\antlr\\calc.g:31:4: 'sin' '(' ! expression ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal25=(Token)match(input,19,FOLLOW_19_in_atom192); 
                    string_literal25_tree = 
                    (CommonTree)adaptor.create(string_literal25)
                    ;
                    adaptor.addChild(root_0, string_literal25_tree);


                    char_literal26=(Token)match(input,8,FOLLOW_8_in_atom194); 

                    pushFollow(FOLLOW_expression_in_atom197);
                    expression27=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression27.getTree());

                    char_literal28=(Token)match(input,9,FOLLOW_9_in_atom199); 

                    }
                    break;
                case 5 :
                    // D:\\antlr\\calc.g:32:4: 'cos' '(' ! expression ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal29=(Token)match(input,16,FOLLOW_16_in_atom206); 
                    string_literal29_tree = 
                    (CommonTree)adaptor.create(string_literal29)
                    ;
                    adaptor.addChild(root_0, string_literal29_tree);


                    char_literal30=(Token)match(input,8,FOLLOW_8_in_atom208); 

                    pushFollow(FOLLOW_expression_in_atom211);
                    expression31=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression31.getTree());

                    char_literal32=(Token)match(input,9,FOLLOW_9_in_atom213); 

                    }
                    break;
                case 6 :
                    // D:\\antlr\\calc.g:33:4: 'tan' '(' ! expression ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal33=(Token)match(input,20,FOLLOW_20_in_atom220); 
                    string_literal33_tree = 
                    (CommonTree)adaptor.create(string_literal33)
                    ;
                    adaptor.addChild(root_0, string_literal33_tree);


                    char_literal34=(Token)match(input,8,FOLLOW_8_in_atom222); 

                    pushFollow(FOLLOW_expression_in_atom225);
                    expression35=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression35.getTree());

                    char_literal36=(Token)match(input,9,FOLLOW_9_in_atom227); 

                    }
                    break;
                case 7 :
                    // D:\\antlr\\calc.g:34:4: 'ln' '(' ! expression ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal37=(Token)match(input,17,FOLLOW_17_in_atom234); 
                    string_literal37_tree = 
                    (CommonTree)adaptor.create(string_literal37)
                    ;
                    adaptor.addChild(root_0, string_literal37_tree);


                    char_literal38=(Token)match(input,8,FOLLOW_8_in_atom236); 

                    pushFollow(FOLLOW_expression_in_atom239);
                    expression39=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression39.getTree());

                    char_literal40=(Token)match(input,9,FOLLOW_9_in_atom241); 

                    }
                    break;
                case 8 :
                    // D:\\antlr\\calc.g:35:4: 'log' '(' ! expression ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal41=(Token)match(input,18,FOLLOW_18_in_atom248); 
                    string_literal41_tree = 
                    (CommonTree)adaptor.create(string_literal41)
                    ;
                    adaptor.addChild(root_0, string_literal41_tree);


                    char_literal42=(Token)match(input,8,FOLLOW_8_in_atom250); 

                    pushFollow(FOLLOW_expression_in_atom253);
                    expression43=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression43.getTree());

                    char_literal44=(Token)match(input,9,FOLLOW_9_in_atom255); 

                    }
                    break;
                case 9 :
                    // D:\\antlr\\calc.g:36:4: '-' atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal45=(Token)match(input,12,FOLLOW_12_in_atom262); 
                    char_literal45_tree = 
                    (CommonTree)adaptor.create(char_literal45)
                    ;
                    adaptor.addChild(root_0, char_literal45_tree);


                    pushFollow(FOLLOW_atom_in_atom264);
                    atom46=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom46.getTree());

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
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_program48 = new BitSet(new long[]{0x00000000001F1172L});
    public static final BitSet FOLLOW_expression_in_statement59 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_statement61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_statement71 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement72 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_expression_in_statement73 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expression107 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11_in_expression111 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_12_in_expression114 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_term_in_expression118 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_factor_in_term131 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_10_in_term135 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_13_in_term138 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_factor_in_term142 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_atom_in_factor152 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_factor155 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_atom_in_factor157 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom177 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_expression_in_atom180 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_atom192 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_atom194 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_expression_in_atom197 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_atom206 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_atom208 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_expression_in_atom211 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_atom220 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_atom222 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_expression_in_atom225 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_atom234 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_atom236 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_expression_in_atom239 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_atom248 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_atom250 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_expression_in_atom253 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_atom262 = new BitSet(new long[]{0x00000000001F1130L});
    public static final BitSet FOLLOW_atom_in_atom264 = new BitSet(new long[]{0x0000000000000002L});

}