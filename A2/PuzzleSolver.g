grammar PuzzleSolver;

options {
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	BLOCK;
	CONDS;
	PLUS;
}

@header {
// import zum manuellen Bauen der Trees

// http://www.docjar.com/docs/api/org/antlr/runtime/tree/Tree.html	Interface

import org.antlr.tool.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
}

@members {

// Diese Methode nimmt die Baeume fuer eine Spalte und den dazugehoerigen Operator (plus oder minus)
// und baut daraus den korrekten AST.
// z.b. buildFromBILD("+", (BLOCK A B C) (BLOCK D E F) (BLOCK G H I) ) => (PLUS (BLOCK A B C) (BLOCK D E F) (BLOCK G H I) )
// oder buildFromBILD("-", (BLOCK A B C) (BLOCK D E F) (BLOCK G H I) ) => (PLUS (BLOCK D E F) (BLOCK G H I) (BLOCK A B C) )
// Zweiteres vereinfacht den AST mehr und macht ihn von der konkreten Wahl einer Operators unabhaengig.
// a - b = c wird umgeschrieben zu b + c = a
public static CommonTree buildFromBILD(String operator, Tree first, Tree second, Tree third) {
	CommonTree vertical = new CommonTree(new CommonToken(PLUS,"PLUS")); // erzeugen eines PLUS Knotens
	if(operator.trim().equals("-")) {
		vertical.addChild(second);
		vertical.addChild(third);
		vertical.addChild(first);
	}
	else {
		vertical.addChild(first);
		vertical.addChild(second);
		vertical.addChild(third);
	}
	return vertical;
}

public CommonTree condsAST = null;

}

// mit ^ kann man den root des Unterbaums festlegen.
// mit ! sagt man, was fuer den AST ignoriert werden soll
// mit -> kann man Tree Rewrites machen und die Stuktur ganz selber vorgeben

// Siehe Folien:
// https://pub.informatik.haw-hamburg.de/home/pub/prof/neitzke/Compiler%20und%20Interpreter/Vorlesungsfolien/CI04%20-%20Zwischencode%20alt.pdf#page=65&zoom=page-fit,0,540	


// Mit den Variablen werden Referenzen zu den geparsten Tokens gespeichert.
// Da wir in den dazugehoerigen Regeln einige synthetische Attribute festgelegt haben,
// koennen wir von hier auf diese zugrifen. Dies ermoeglich uns hier auf die linken, mittleren und
// rechten Spalten zuzugreifen und daraus manuell die AST zusammenzubauen.
prog	:   	c1=row NL
		opRow=op_row NL
		c2=row NL
		eq_row NL
		c3=row
	{
	// First Vertical Condition
	CommonTree leftVertical = buildFromBILD(opRow.left, c1.left, c2.left, c3.left);
	
	// Second Vertical Condition
	CommonTree midVertical = buildFromBILD(opRow.mid, c1.mid, c2.mid, c3.mid);
	
	// Third Vertical Condition
	CommonTree rightVertical = buildFromBILD(opRow.right, c1.right, c2.right, c3.right);
	
	// Demonstration. Tree's are printed in LISP Tree Notation.
	// f.e. (A B C D E) means a Node A with children B, C, D and E.
        System.out.println("leftVertical: " + leftVertical.toStringTree()); //leftVertical: (PLUS (BLOCK A A A) (BLOCK A H) (BLOCK A C E))
        System.out.println("midVertical: " + midVertical.toStringTree());   //midVertical: (PLUS (BLOCK D A C) (BLOCK H F C) (BLOCK I I I))
        System.out.println("Middle Row: "+ c2.tree.toStringTree());	    //Middle Row: (PLUS (BLOCK H F C) (BLOCK G I) (BLOCK A A A))
        
        
        // creating from atlrs adoptor.
//      http://www.docjar.com/docs/api/org/antlr/runtime/tree/BaseTreeAdaptor.html
//	http://stackoverflow.com/questions/13812543/antlr-grandchild-nodes-in-tree-construction
        
        condsAST = (CommonTree) adaptor.create(PLUS, "PLUS");//new CommonTree(new CommonToken(PLUS,"PLUS"));
        System.out.println("condsAST: " + condsAST.toStringTree());
        
	}
		-> {(Object)condsAST)}//^(CONDS row row row) /*{leftVertical}*/  // merging simply wont work....
		// it is also possible to insert java code here, to create the AST. See. Antlr Reference p.170
    ;

row	returns[Tree left, Tree mid, Tree right]
	:
	l=grouped_ids op=OP m=grouped_ids EQ r=grouped_ids
	{$left=$l.tree;}	// extrahieren der ASTs aus den grouped_ids um diese nach oben zurueckzugeben.
	{$mid=$m.tree;}
	{$right=$r.tree;}
	// Conditional Tree Rewrites: see Antlr - The Definitive Reference, p.168, Chosing between Tree Structures at Runtime
	-> { $op.text.trim().equals("-") }? ^(PLUS $m $r $l)	// case "-"
	->  ^(PLUS $l $m $r)	// general case "+"
;


op_row	returns[String left, String mid, String right]
	:   l=OP m=OP r=OP
	{$left=$l.text;}
	{$mid=$m.text;}
	{$right=$r.text;} 
	;

eq_row
    :    EQ! EQ! EQ!	// ignorieren aller '='
    ;

// die einzellnen Ids nach oben delegieren
grouped_ids
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

