grammar expr;

@header{package parser;}


program : expr EOF;



expr
    :nil 
    |(typeid '{' fieldlist '}' | typeid '[' expr ']' 'of' expr)? 
    |lvalue (':=' expr | '(' exprlist ')' )? 
    |'-' expr 
    |'(' exprseq ')' 
    |'if' expr 'then' expr ('else' expr)? 
    |'while' expr 'do' expr 
    |'for' IDF ':=' expr 'to' expr 'do' expr 
    |'break' 
    |'let' declarationlist 'in' exprseq 'end' 
    ;



or
    :nil (('*'|'/') nil)* (('+'|'-') nil (('*'|'/') nil)*)* (('='|'<>'|'>'|'<'|'>='|'<=') nil (('*'|'/') nil)* (('+'|'-') nil (('*'|'/') nil)*)*)? ('&' nil (('*'|'/') nil)* (('+'|'-') nil (('*'|'/') nil)*)* (('='|'<>'|'>'|'<'|'>='|'<=') nil (('*'|'/') nil)* (('+'|'-') nil (('*'|'/') nil)*)*)?)* ('|' nil (('*'|'/') nil)* (('+'|'-') nil (('*'|'/') nil)*)* (('='|'<>'|'>'|'<'|'>='|'<=') nil (('*'|'/') nil)* (('+'|'-') nil (('*'|'/') nil)*)*)? ('&' nil (('*'|'/') nil)* (('+'|'-') nil (('*'|'/') nil)*)* (('='|'<>'|'>'|'<'|'>='|'<=') nil (('*'|'/') nil)* (('+'|'-') nil (('*'|'/') nil)*)*)?)*)*
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
	:IDF e?
	;

e
    :'.' IDF e
	| '[' expr ']' e
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
    :'type' typeid '=' type
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
    |'intArray'
    ;

variabledeclaration
    :'var' IDF (':' typeid )? ':=' expr

    ;

functiondeclaration
    :'function' IDF '(' typefields ')' (':' typeid )? '=' expr
    ;

nil
    :STRING
    |INT
    ;



STRING : '"'('a'..'z' | 'A'..'Z' | '0'..'9' | '?' | ',' | '!' | '.' | ';' | '=' | '<' | '>' | ':' | ')' | '(' | '-' | '_' | '%' | '#')*'"';

IDF : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

INT : ('0'..'9')+;

WS : [ \t\n\r] + -> skip ;


