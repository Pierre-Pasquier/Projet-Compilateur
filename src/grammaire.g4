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

binaryoperator
    :plus
    |mult
    |'='
    |'<>'
    |'<'
    |'>'
    |'<='
    |'>='
    |'&'
    |'|'
    ;



plus    
    : mult (('+'|'-') mult)*
    ;

mult
    : expr (('*'|'/') expr)*
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




declarationlist
    :declaration F
	;

F
	:declaration F
	|nil
	;


declaration
    :typedeclaration
    |variabledeclaration
    |functiondeclaration
    ;

typedeclaration
    :type typeid '=' type
    ;

type
    :typeid
    |'{' typefields '}'
    |array 'of' typeid
    ;



typefields
    :typefield G
	;

G
	:',' typefield G
	|nil
	;



typefield
    :id ':' typeid
    ;

variabledeclaration
    :'var' id ':=' expr
    |'var' id ':' typeid ':=' expr
    ;

functiondeclaration
    :'function' id '(' typefields ')' '=' expr
    |'function' id '(' typefields ')' ':' typeid '=' expr
    ;





STRING : '"'('a'..'z' | 'A'..'Z' | '0'..'9' | '?' | ',' | '!' | '.' | ';' | '=' | '<' | '>' | ':' | ')' | '(' | '-' | '_' | '%' | '#')*'"';

IDF : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

INT : ('0'..'9')+;

WS : [\t\n\r] + -> skip ;


