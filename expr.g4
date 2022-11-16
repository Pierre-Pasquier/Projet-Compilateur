grammar expr;

@header{package parser;}


program : expr EOF;



expr
    :a
    |'nil' a
    |(typeid '{' fieldlist '}' | typeid '[' expr ']' 'of' expr)? a
    |lvalue (':=' expr | '(' exprlist ')' )? a
    |'-' expr a
    |'(' exprseq ')' a
    |'if' expr 'then' expr ('else' expr)? a
    |'while' expr 'do' expr a
    |'for' IDF ':=' expr 'to' expr 'do' expr a
    |'break' a
    |'let' declarationlist 'in' exprseq 'end' a
    ;

a
    :(binaryop expr)*;

binaryop
    :plus
    |eq
    ;


eq
    :(lvalue|plus|STRING) (('='|'<>') (plus|STRING|lvalue))? ('&' eq)* ('|' eq)*
    ;


plus
    : (INT|IDF) (('*'|'/') (INT|IDF))* (('+'|'-') plus)*
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
    :'.' IDF e?
	| '[' expr ']' e?
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
    :typefield? (',' typefield)*
	;



typefield
    :IDF ':' typeid
    ;

typeid
    :'int'
    |'string'
    |'intArray'
    |IDF
    ;

variabledeclaration
    :'var' IDF (':' typeid )? ':=' expr

    ;

functiondeclaration
    :'function' IDF '(' typefields ')' (':' typeid )? '=' expr
    ;





STRING : '"'('a'..'z' | 'A'..'Z' | '0'..'9' | '?' | ' ' | ',' | '!' | '.' | ';' | '=' | '<' | '>' | ':' | ')' | '(' | '-' | '_' | '%' | '#' | '\\')*'"';

IDF : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;

INT : ('0'..'9')+;

COM : '/*' .*? '*/' -> skip;

RES : 'print' | 'printi' | 'flush' | 'getchar' | 'ord' | 'chr' | 'size' | 'substring' | 'concat' | 'not' | 'exit' | 'array' | 'break' | 'do' | 'else' | 'end' | 'for' | 'function' | 'if' | 'in' | 'let' | 'nil' | 'of' | 'then' | 'to' | 'type' | 'var' | 'while';

WS : [ \t\n\r]+ -> skip ;


