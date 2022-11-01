
grammar grammaire;

@header{package parser;}

program : expr+ EOF;


expr
    :STRING A
    |INT A
    |nil A
    |lvalue A
    |'-' expr A
    |lvalue ':=' expr A
    |id '(' exprlist ')' A
    |'(' exprseq ')' A
    |typeid '{' fieldlist '}' A
    |typeid '[' expr ']' 'of' expr A
    |'if' expr 'then' expr A
    |'if' expr 'then' expr 'else' expr A
    |'while' expr 'do' expr A
    |'for' id ':=' expr 'to' expr 'do' expr A
    |'break' A
    |'let' declarationlist 'in' exprseq 'end' A
    ;

A
	:binaryoperator expr A
	|nil
	;



exprseq
	:expr B
	;

B
	: ';' expr B
	|nil
	;


exprlist
	:expr C
	;

C
	: ',' expr C
	|nil
	;



fieldlist
	:id '=' expr D
	;

D
	: ',' id '=' expr D
	|nil
	;



lvalue
	:id E
	;

E
	:'.' id E
	| '[' expr ']' E
	|nil
	;




declaration-list
    :declaration F
	;

F
	:declaration F
	|nil
	;


declaration
    :type-declaration
    |variable-declaration
    |function-declaration
    ;

type-declaration
    :type type-id '=' type
    ;

type
    :type-id
    |'{' type-fields '}'
    |array 'of' type_id
    ;



type-fields
    :type-field G
	;

G
	:',' type-field G
	|nil
	;



type-field
    :id ':' type-id
    ;

variable-declaration
    :'var' id ':=' expr
    :'var' id ':' type-id ':=' expr
    ;

function-declaration
    :'function' id '(' type-fields ')' '=' expr
    :'function' id '(' type-fields ')' ':' type-id '=' expr
    ;





STRING : '"'('a'..'z' | 'A'..'Z' | '0'..'9' | '?' | ',' | '!' | '.' | ';' | '=' | '<' | '>' | ':' | ')' | '(' | '-' | '_' | '%' | '#')*'"';

IDF : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

INT : ('0'..'9')+;

WS : [\t\n\r] + -> skip ;

