grammar Expr;

root: action+ EOF;

action:
    WRITE expr #write
    | NEXT expr #next
    | NAME SETEQUALS expr #setequals
    | IF boolexpr action+ #if
    | IF boolexpr action+ ELSE action+ #ifelse
    | WHILE boolexpr action+ #whileloop
    ;

expr:
    <assoc=right> expr POWER expr #power
    | expr DIV expr #div
    | expr MULT expr #mult
    | expr PLUS expr #add
    | expr SUB expr #sub
    | NAME #nameval
    | NUM #num
    ;

boolexpr:
    expr LESS_THAN expr
    | expr GREATER_THAN expr
    | expr EQUALS expr
    ;

EQUALS: '==';
WHILE: 'while';
LESS_THAN: '<';
NEXT: 'next';
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
