tree grammar calcTree;

options{
	tokenVocab=calc;
	ASTLabelType=CommonTree;
	language=Java;
}

@header{
	package com.droidwolf.calc;
	
	import java.util.HashMap;
}

@members{
	HashMap memory=new HashMap();
}

program	:	statement+;
statement
	:	expression{ System.out.println( "result="+$expression.value ); }
	|	^('=' ID expression) { memory.put( $ID.text, $expression.value); }
	;
	
expression returns[double value]
	: 	^('+' a=expression b=expression) {$value=a+b;}
	| 	^('-' a=expression b=expression) {$value=a-b;}
	| 	^('*' a=expression b=expression) {$value=a*b;}
	| 	^('/' a=expression b=expression) {
			if(b==0){
				System.out.println($a.value+" divide zero!");
			}else{
			 	$value=a/b;
			 }
		}
	| 	^('^' a=expression b=expression) {$value=Math.pow(a,b);}
	| 	#('sin' x=expression) {$value=Math.sin(x);}			//"#" child node
	| 	#('cos' x=expression) {$value=Math.cos(x);}
	| 	#('tan' x=expression) {$value=Math.tan(x);}
	| 	#('ln' x=expression) {$value=Math.log(x);}
	| 	#('-' x=expression) {$value=-x;}
	| 	#('log' a=expression b=expression) {$value=Math.log(b)/Math.log(b);}
	|	ID{
		$value=0;
		Double v=(Double)memory.get($ID.text);
		if(v!=null) $value=v;
		else System.err.println( "#f0000 variable"+$ID.text);
		}
	|	DOUBLE { $value =Double.parseDouble($DOUBLE.text); }
	;
	
	
