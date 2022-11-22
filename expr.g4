grammar expr;

@header{package parser;}


program : expr EOF;



expr
    :op
    |'nil' op
    |(typeid '{' fieldlist '}' | typeid '[' expr ']' 'of' expr)? 
    |lvalue (':=' expr | '(' exprlist ')' )?
    |'-' expr
    |'(' exprseq ')' 
    |'if' expr 'then' expr ('else' expr)? 
    |'while' expr 'do' expr 
    |'for' IDF ':=' expr 'to' expr 'do' expr
    |'break'
    |'let' declarationlist 'in' exprseq 'end'
    |printi
    |print
    ;

op
    :binaryop
    |(binaryop expr)*
    ;

binaryop
    :plus
    |eq
    |or
    |and
    |compare
    |mult
    ;



or
    :and ('|' and)*
    ;

and
    : eq ('&' eq)*
    | compare ('&' compare)*
    ;

eq
    :(lvalue|plus|STRING) (('='|'<>') (lvalue|plus|STRING|'nil'))?
    ;

compare
    :(lvalue|plus|STRING) (('>'|'<'|'>='|'<=') (lvalue|plus|STRING))?
    ;

plus
    :mult (('+'|'-') mult)* 
    ;

mult 
    : value (('*'|'/') ( value))*
    ;

value
    :'-'? INT
    |'-'? IDF
    |'-'? '(' op ')'
    |'-'? lvalue
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
	:IDF ('.' IDF)*
    |IDF ('[' expr ']')*
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


printi : 'printi(' op ')';
print : 'print(' expr')';


PRINT : 'print';
PRINTI : 'printi';
FLUSH : 'flush';
GETCHAR : 'getchar';
ORD : 'ord';
CHR : 'chr';
SIZE : 'size';
SUBSTRING : 'substring';
CONCAT : 'concat';
NOT : 'not';
EXIT : 'exit';
ARRAY : 'array';
BREAK : 'break';
DO : 'do';
ELSE : 'else';
END : 'end';
FOR : 'for';
FUNCTION : 'function';
IF : 'if';
IN : 'in';
LET : 'let';
NIL : 'nil';
OF : 'of';
THEN : 'then';
TO : 'to';
TYPE : 'type';
VAR : 'var';
WHILE : 'while';


STRING : '"'('a'..'z' | 'A'..'Z' | '0'..'9' | '?' | ' ' | ',' | '!' | '.' | ';' | '=' | '<' | '>' | ':' | ')' | '(' | '-' | '_' | '%' | '#' | '\\')*'"';

IDF : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;

INT : ('0'..'9')+;

COM : '/*' .*? '*/' -> skip;

WS : [ \t\n\r]+ -> skip ;


