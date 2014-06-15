grammar akrabs;


s	:	B a | a B;

a	:	A s?
	|	b A A
	;

b	:	B s?
	|	a B B
	;

B	: 	'b'
;

A 	:	'a'
;

// Automated Stubs	
WS  :   ( ' '
        | '\t'
        ) {$channel=HIDDEN;}
    ;