grammar ReadTablan;

// A 1ª linha contém os atributos -> cabeçalho
// nmec, nome, nota1, nota2
// val1, val2, val3, val4

// Arquivo: linha linha* EOF;
file: line line* EOF;

// Linha: campo (SEP campo)* '\r'? '\n';
line: field (SEP field)* '\r'? '\n';

// Campo: TEXT | STRING | NUMBER | ;
field: TEXT 
    | STRING
    | NUMBER
    | ;

// Definição do separador entre os campos
SEP: [ \t]* ',' [ \t]* // (' ' | '\t')*
    | [ \t]* ';;' [ \t]*; // (' ' | '\t')*

// Regra para analisar uma string entre aspas duplas
STRING: [ \t]* '"' .*? '"' [ \t]*;

// Regra para analisar um número inteiro
NUMBER: [ \t]* '-'? [0-9]+ [ \t]*;

// Regra para analisar texto normal
TEXT: ~[,"\r\n]+ ~[,\r\n]*;
