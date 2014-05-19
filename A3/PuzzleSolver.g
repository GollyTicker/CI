grammar PuzzleSolver;

options {
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	BLOCK;
	CONDS;
	PLUS;
	MINUS;
}


prog	:   	block OP block EQ block NL
		OP OP OP NL
		block OP block EQ block NL
		EQ EQ EQ NL
		block OP block EQ block
		-> ^(CONDS)
		;
		
block
	:	ID+ -> ^(BLOCK ID+)	// A C E -> (BLOCK A C E); A -> (BLOCK A)
	;
    
NL	:	('\r\n'
        | 	'\r'
        |	'\n')
	;

OP 	: 	('+'|'-')
	;

ID  	:	('A'..'Z')
    	;
    
EQ 	:	'='
	;

// Automated Stubs	
WS  :   ( ' '
        | '\t'
        ) {$channel=HIDDEN;}
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

