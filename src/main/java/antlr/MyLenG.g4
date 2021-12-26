grammar MyLenG;

parse
    : block EOF
    ;

block
    : stat*
    ;

assignment
    : ID '='  ((procedure) | s1= ( INT | STRING | ID)) SCOL
    ;

stat
    : assignment
    | if_state
    | while_state
    | print
    ;

procedure
    : s1= (ID | INT) op=(PLUS | MINUS | MULT | DIV) s2= (ID | INT)
    ;

if_state
    : IF OPAR log_block CPAR condition_block
    ;

while_state
    : WHILE OPAR log_block CPAR condition_block
    ;

condition_block
    : OBRACE block CBRACE
    ;

log_block
    : s1=(ID | INT) op=(EQ | NEQ | GT | LT) s2=(ID | INT)
    ;

print
    : LOG OPAR s=(INT | ID | STRING) CPAR SCOL
    ;




EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';

SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

IF : 'if';
WHILE : 'while';
LOG : 'log';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;
