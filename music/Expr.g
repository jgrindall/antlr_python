grammar Expr;

root: proc_def+ EOF;

proc_def: PROC_NAME args_list OPEN instructions CLOSE;

proc_call: PROC_NAME expr_list;

expr_list: expr (SPACE expr)*;

args_list: VAR_NAME (SPACE VAR_NAME)*;

instructions: instruction*;

instruction: assign
            | input
            | output
            | play
            | proc_call
            | if_else
            | while_
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
    | list_count #count
    | list_index #index    
    | expr LESS_THAN expr #lt
    | expr GREATER_THAN expr #gt
    | expr EQUALS expr #equals
    | NUM #num
    | NOTE_NAME #notename 
    | STRING #string
    ;

list_count: '#' VAR_NAME;

list_index: (VAR_NAME | list_) '[' expr ']' ;

STRING: '"' [a-zA-Z]* '"';
VAR_NAME: [a-z]+;
OPEN: '|:';
CLOSE: ':|';
PLAY: '(:)';
SPACE: ' ';
PROC_NAME:[A-Z][a-zA-Z]*;
EQUALS: '=';
SETEQUALS:'<-';
WHILE: 'while';
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
WRITE: '<w>';
PROMPT: '<?>';
L_BRACE: '{';
R_BRACE: '}';
CUT: '8<';
APPEND: '<<';
WS: [ \n] -> skip;
NOTE_NAME: [A-G][0-9]?;
