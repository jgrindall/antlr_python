grammar Expr;

root: expr EOF;

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
WS: [ \n] -> skip;
