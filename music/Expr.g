grammar Expr;

root: proc_def* instructions EOF;

proc_def: PROC_NAME args_list? OPEN instructions CLOSE;

proc_call: PROC_NAME expr_list?;

expr_list: expr (COMMA expr)*;

args_list: VAR_NAME (COMMA VAR_NAME)*;

instructions: instruction*;

instruction: 
            while_
            | if_else
            | assign
            | input
            | output
            | play
            | proc_call
            | append
            | cut
            ;

assign: VAR_NAME SETEQUALS expr;

input: PROMPT VAR_NAME;

output: WRITE expr;

play: PLAY expr;

if_else: IF expr OPEN instructions CLOSE (ELSE OPEN instructions CLOSE)?;

while_: WHILE expr OPEN instructions CLOSE;

append: VAR_NAME APPEND expr;

cut: CUT VAR_NAME '[' expr ']';

list_: L_BRACE expr* R_BRACE;

expr:
    <assoc=right> expr POWER expr #power
    | expr DIV expr #div
    | expr MULT expr #mult
    | expr PLUS expr #add
    | expr SUB expr #sub
    | '(' expr ')' #bracketed
    | VAR_NAME #nameval
    | list_ #listval
    | '#' VAR_NAME #count
    | (VAR_NAME | list_) '[' expr ']' #index    
    | expr LESS_THAN expr #lt
    | expr GREATER_THAN expr #gt
    | expr EQUALS expr #equals
    | NUM #num
    | NOTE_NAME #notename 
    | STRING #string
    ;

WHILE: 'while';
IF: 'if';
ELSE: 'else';
PLAY: '(:)';
OPEN: '|:';
CLOSE: ':|';
WRITE: '<w>';
PROMPT: '<?>';
CUT: '8<';
APPEND: '<<';
SETEQUALS:'<-';
LESS_THAN: '<';
GREATER_THAN: '>';
STRING: '"' [a-zA-Z]* '"';
VAR_NAME: [a-z]+;
COMMA: ',';
EQUALS: '=';
NUM: [0-9]+;
PLUS: '+';
SUB: '-';
POWER: '^';
DIV: '/';
MULT: '*';
L_BRACE: '{';
R_BRACE: '}';
NOTE_NAME: [A-G][0-9]?;
PROC_NAME:[A-Z][a-zA-Z_]*;
WHITESPACE : [ \t\r\n]+ -> skip ;
