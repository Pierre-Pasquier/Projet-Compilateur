grammar expr;

@header{package parser;}


program : expr EOF;


expr
    :op                                                             #Ops
    |'nil' op                                                       #Nil_op
    |(typeid '{' fieldlist '}' | typeid '[' expr ']' 'of' expr)?    #Typeids
    |lvalue (':=' expr | '(' exprlist ')' )?                        #Lvalues
    |'-' expr                                                       #Exprtiret
    |'(' exprseq ')'                                                #Parenthesis
    |'if' expr 'then' expr 'else' expr                        #Ifthenelse
    |'if' expr 'then' expr                                          #Ifthen
    |'while' expr 'do' expr                                         #While
    |'for' IDF ':=' expr 'to' expr 'do' expr                        #For           
    |'break'                                                        #Break
    |'let' declarationlist 'in' exprseq 'end'                       #Declarationlists
    |printi                                                         #Printis
    |print                                                          #Prints
    ;

op
    :binaryop               #opbin
    |(binaryop expr)*       #opbinexpr
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
    :'-'? INT               #valint
    |'-'? IDF               #validf
    |'-'? '(' op ')'        #valop
    |'-'? lvalue            #vallvalue
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
	:IDF ('.' IDF)*                 #Idflist
    |IDF ('[' expr ']')*            #Idfexprlist
	;





declarationlist
    :declaration+
	;



declaration
    :typedeclaration        #typedecla
    |variabledeclaration    #vardecla
    |functiondeclaration    #fundecla
    ;

typedeclaration
    :'type' typeid '=' type
    ;

type
    :typeid                     #type_id
    |'{' typefields '}'         #typef
    |'array' 'of' typeid        #typeidarray
    ;



typefields
    :typefield? (',' typefield)*
	;



typefield
    :IDF ':' typeid
    ;

typeid
    :IDF
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


STRING : '"'('a'..'z' | 'A'..'Z' | '0'..'9' | '?' | ' ' | ',' | '!' | '.' | ';' | '=' | '<' | '>' | ':' | ')' | '(' | '-' | '_' | '%' | '#' | '\\' )*'"';

IDF : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;

INT : ('0'..'9')+;

COM : '/*' .*? '*/' -> skip;

WS : [ \t\n\r]+ -> skip ;


