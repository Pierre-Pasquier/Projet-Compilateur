grammar expr;

@header{package parser;}


program : expr+ EOF;


expr
    :STRING (binaryoperator expr)*
    |INT (binaryoperator expr)*
    |nil (binaryoperator expr)*
    |lvalue (binaryoperator expr)*
    |'-' expr (binaryoperator expr)*
    |lvalue ':=' expr (binaryoperator expr)*
    |IDF '(' exprlist ')' (binaryoperator expr)*
    |'(' exprseq ')' (binaryoperator expr)*
    |typeid '{' fieldlist '}' (binaryoperator expr)*
    |typeid '[' expr ']' 'of' expr (binaryoperator expr)*
    |'if' expr 'then' expr (binaryoperator expr)*
    |'if' expr 'then' expr 'else' expr (binaryoperator expr)*
    |'while' expr 'do' expr (binaryoperator expr)*
    |'for' IDF ':=' expr 'to' expr 'do' expr (binaryoperator expr)*
    |'break' (binaryoperator expr)*
    |'let' declarationlist 'in' exprseq 'end' (binaryoperator expr)*
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
	:expr (';' expr)*
	;



exprlist
	:expr (',' expr)*
	;


fieldlist
	:IDF '=' expr (',' IDF '=' expr)*
	;




lvalue
	:IDF e
	;

e
    :'.' IDF e
	| '[' expr ']' e
	|
	;




declarationlist
    :declaration+
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
    :typefield (',' typefield)*
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

nil
    :STRING
    |INT
    ;



STRING : '"'('a'..'z' | 'A'..'Z' | '0'..'9' | '?' | ',' | '!' | '.' | ';' | '=' | '<' | '>' | ':' | ')' | '(' | '-' | '_' | '%' | '#')*'"';

IDF : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

INT : ('0'..'9')+;

WS : [ \t\n\r] + -> skip ;


