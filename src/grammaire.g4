grammar grammaire;

@header{package parser;}

program : expr+ EOF;


expr
    :STRING a
    |INT a
    |nil a
    |lvalue a
    |'-' expr a
    |lvalue ':=' expr a
    |IDF '(' exprlist ')' a
    |'(' exprseq ')' a
    |typeid '{' fieldlist '}' a
    |typeid '[' expr ']' 'of' expr a
    |'if' expr 'then' expr a
    |'if' expr 'then' expr 'else' expr a
    |'while' expr 'do' expr a
    |'for' IDF ':=' expr 'to' expr 'do' expr a
    |'break' a
    |'let' declarationlist 'in' exprseq 'end' a
    ;

a
	:binaryoperator expr a
	|null
	;

binaryoperator
    :plus
    |mult
    |compare
    |and
    |or
    ;

or
    :and ('|' and)*
    ;

and
    :compare ('&' compare)*
    ;

compare
    :plus (('='|'<>'|'>'|'<'|'>='|'<=') plus)?
    ;

plus    
    : mult (('+'|'-') mult)*
    ;

mult
    : expr (('*'|'/') expr)*
    ;


exprseq
	:expr b
	;

b
	: ';' expr b
	|null
	;


exprlist
	:expr c
	;

c
	: ',' expr c
	|null
	;



fieldlist
	:IDF '=' expr d
	;

d
	: ',' IDF '=' expr d
	|null
	;



lvalue
	:IDF e
	;

e
    :'.' IDF e
	| '[' expr ']' e
	|null
	;




declarationlist
    :declaration f
	;

f
	:declaration f
	|null
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
    |'array' 'of' typeid
    ;



typefields
    :typefield g
	;

g
	:',' typefield g
	|null
	;



typefield
    :IDF ':' typeid
    ;

typeid
    :'int'
    |'string'
    ;

variabledeclaration
    :'var' IDF ':=' expr
    |'var' IDF ':' typeid ':=' expr
    ;

functiondeclaration
    :'function' IDF '(' typefields ')' '=' expr
    |'function' IDF '(' typefields ')' ':' typeid '=' expr
    ;





STRING : '"'('a'..'z' | 'A'..'Z' | '0'..'9' | '?' | ',' | '!' | '.' | ';' | '=' | '<' | '>' | ':' | ')' | '(' | '-' | '_' | '%' | '#')*'"';

IDF : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

INT : ('0'..'9')+;

WS : [\t\n\r] + -> skip ;


