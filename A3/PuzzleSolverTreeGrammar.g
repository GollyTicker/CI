tree grammar PuzzleSolverTreeGrammar;

options {
  tokenVocab=PuzzleSolver;
  ASTLabelType=CommonTree;
  output=AST; 
}

tokens {
	PLUS;
}


prog  : ^(CONDS rule rule rule rule rule rule)
;


rule  :	^(op=OP l=block m=block r=block)
	-> {$op.text.trim().equals("-")}? ^(PLUS["+"] $m $r $l)
	-> ^(PLUS["+"] $l $m $r)
;

/*
Dies hier funktioniert nicht... Antlr kann das Matching mit dem '-'
nicht machen und erekennt daher das Minus nicht.

rule	:	^('-' l=block m=block r=block)	-> ^(PLUS["+"]	$m $r $l)
	|	.
	;

Ersetzt man den zweiten Zweig durch ein entsprechendes Matching mit '+',
dann kann Antlr keine Regel parsen. Daher wird oben manuell auf Plus oder Minus ueberprueft.

*/
	
block	:	^(BLOCK ID+)
	;