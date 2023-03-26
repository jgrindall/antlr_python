grammar Expr;

root: action+ EOF;

action:
    WRITE NAME #write
    | NAME SETEQUALS expr #setequals
    ;

expr:
    expr DIV expr #div
    | expr MULT expr #mult
    | expr PLUS expr #add
    | expr SUB expr #sub
    | NUM #num
    ;

NUM: [0-9]+;
PLUS: '+';
SUB: '-';
DIV: '/';
MULT: '*';
WRITE: 'write';
NAME : [a-z]+;
SETEQUALS : ':=';
WS: [ \n] -> skip;
