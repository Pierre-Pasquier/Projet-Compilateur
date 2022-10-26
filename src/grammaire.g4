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


STRING : '"'('a'..'z' | 'A'..'Z' | '0'..'9' | '?' | ',' | '!' | '.' | ';' | '=' | '<' | '>' | ':' | ')' | '(' | '-' | '_')*'"';

IDF : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

INT : ('0'..'9')+;

WS : [\t\n\r] + -> skip ;

