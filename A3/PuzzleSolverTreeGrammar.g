tree grammar PuzzleSolverTreeGrammar;

options {
  tokenVocab=PuzzleSolver;
  ASTLabelType=CommonTree;
  output=AST; 
  rewrite=true; 
} 


prog  : ^(CONDS . . . rule rule rule)
;


rule  :
	^(MINUS l=. m=. r=.) -> ^(PLUS $m $r $l)
	| ^(PLUS l=. m=. r=.) -> ^(PLUS $l $m $r)
; 
