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

// der AST wird hier auf der obersten Ebene bis ganz tief nach unten zusammengebaut
prog	:   	b00=block opHorzTop=OP b10=block EQ b20=block	NL
		opVertLeft=OP opVertMid=OP  opVertRight=OP 	NL
		b01=block opHorzMid=OP b11=block EQ b21=block 	NL
			EQ 		EQ 		EQ 	NL
		b02=block opHorzBot=OP b12=block EQ b22=block
		
		-> ^(CONDS
			^($opHorzTop   $b00 $b10 $b20)	//zuerst die horizontalen
			^($opHorzMid   $b01 $b11 $b21)
			^($opHorzBot   $b02 $b12 $b22)
			^($opVertLeft  $b00 $b01 $b02)	// dann die vertikalen
			^($opVertMid   $b10 $b11 $b12)
			^($opVertRight $b20 $b21 $b22)
		)
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

