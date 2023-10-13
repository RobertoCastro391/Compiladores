grammar Tablan;
 
program: (instruction? ';')*;

instruction: define_table           
           | declare_variable       
           | loop                   
           | print                  
           | assignment             
           ;

define_table : 'type' 'table' table_type '{' (ID ':' element_type ('->' element_name)? (':=' expr)? ';')* '}' ;

table_type: ID (table_name)?;

table_name: '->' element_name;

column_name : ID element_name ;

element_name: STRING ;

declare_variable: ID ':' element_type
                | ID ':' ID 
                ;

element_type: 'integer'
            | 'text'
            | 'real'
            ;

assignment: ID ':=' expr 
          | column ':=' expr
          | column '->' element_name
          | table_type 
          | expr 
          ;

loop: 'for' ID 'in' ID 'do' (instruction? ':')* 'end' ;

print: 'println' print_expr(',' print_expr)*
     | 'print' print_expr(',' print_expr)* 
     ;


print_expr: expr
          | expr 'center' expr
          ;

expr: 'new' ('(' column (',' column)* ')' )*     #ExprNewTable
    | expr ('*'|'/') expr                        #ExprMulDiv
    | '(' expr ')'                               #ExprParent
    | column                                     #ExprColumn
    | expr 'using' selection (',' selection )*   #ExprUsing
    | 'lenght' column                            #ExprLenght
    | element_type expr                          #ExpreCoverser
    | 'read' ('in')* (expr)*                     #ExprRead
    | expr ('-'|'+') expr                        #ExprSubSum
    | literal                                    #ExprLiteral
    | vector                                     #ExprVector
    | ID                                         #ExprVariable
    ;

selection: 'column' expr 'as' ID
         | expr 'as' ID
         ;

column: ID '.' ID ;

literal: NUMBER
       | STRING
       ;

vector: '[' (expr (',' expr)*)* ']' '>>' ID ;

ID: [a-zA-Z][a-zA-Z0-9_]* ;
NUMBER: [0-9]+ ;
STRING: '"' .*? '"' ;

COMMENT: '--' .*? '\n' -> skip;
WS: [ \t\n\r]+ -> skip ;