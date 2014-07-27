grammar calc;

options{
	output=AST;
	ASTLabelType=CommonTree;
	language=Java;
}


@header{
	package com.droidwolf.calc;
}

@lexer::header{
	package com.droidwolf.calc;
}

program	:	(statement{ System.out.println( $statement.tree.toStringTree() ); })+;
statement
	:	expression SEMI->expression			//expression tree node
	|	ID'='expression SEMI->^('=' ID expression)	
	| 	SEMI->;						//delete SEMI in the tree
	
expression
	:	term( ('+'^|'-'^) term )*;			//"^" set the node parent
term	:	factor( ('*'^|'/'^) factor )*;
factor	:	atom( '^'^atom )*;
atom	:	DOUBLE
	|	ID
	|	'('! expression ')'!				// "!" does not collect node
	|	'sin' '('! expression ')'!	
	|	'cos' '('! expression ')'!	
	|	'tan' '('! expression ')'!	
	|	'ln' '('! expression ')'!	
	|	'log' '('! expression ')'!	
	|	'-' atom
	;
	
DOUBLE	:	( '0'..'9' )+ ('.'( '0'..'9' )+)?;
ID	:	( 'a'..'z'|'A'..'Z' )( 'a'..'z'|'A'..'Z'| '0'..'9')*;
SEMI	:	(';')+;
WS	:	(' '|'\t'|'\r'|'\n')+{$channel=HIDDEN;};