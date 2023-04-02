grammar Expr;

root: action+ EOF;

action:
    WRITE NAME #write
    | NAME SETEQUALS expr #setequals
    | IF boolexpr action+ #if
    | IF boolexpr action+ ELSE action+ #ifelse
    ;

expr:
    <assoc=right> expr POWER expr #power
    | expr DIV expr #div
    | expr MULT expr #mult
    | expr PLUS expr #add
    | expr SUB expr #sub
    | NUM #num
    ;

boolexpr:
    expr LESS_THAN expr
    | expr GREATER_THAN expr
    ;


LESS_THAN: '<';
GREATER_THAN: '>';
IF: 'if';
ELSE: 'else';
NUM: [0-9]+;
PLUS: '+';
SUB: '-';
POWER: '^';
DIV: '/';
MULT: '*';
WRITE: 'write';
NAME : [a-z]+;
SETEQUALS : ':=';
WS: [ \n] -> skip;
