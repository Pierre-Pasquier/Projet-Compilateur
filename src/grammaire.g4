grammar grammaire;

@header{package parser;}

program : instruction+ EOF;

instruction
    :affect 
    |conditionnelle
    |print
    ;



exp : INT (('+'|'-'|'*'|'/') INT)* ;

IDF : ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

INT : ('0'..'9')+;

WS : [ \n\t\r] + -> skip ;

