grammar grammaire;

@header{package parser;}

program : expr+ EOF;

expr
    :STRING
    |INT
    |nil
    |lvalue
    |'-' expr
    |expr binaryoperator expr
    |lvalue ':=' expr
    |id '(' exprlist ')'
    |'(' exprseq ')'
    |typeid '{' fieldlist '}'
    |typeid '[' expr ']' 'of' expr
    |'if' expr 'then' expr
    |'if' expr 'then' expr 'else' expr
    |'while' expr 'do' expr
    |'for' id ':=' expr 'to' expr 'do' expr
    |'break'
    |'let' declarationlist 'in' exprseq 'end'
    ;

exprseq
    :expr
    |exprseq ';' expr
    ;

exprlist
    :expr
    |exprlist ',' expr
    ;

fieldlist
    :id '=' expr
    |fieldlist ',' id '=' expr
    ;

lvalue
    :id
    |lvalue '.' id
    |lvalue '[' expr ']'
    ;

declaration-list
    :declaration
    |declaration-list declaration
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
    :type-field
    |type-fields ',' type-field
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

