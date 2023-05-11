grammar Math;

expr    : <assoc=right> expr PLUS expr
        | <assoc=right> expr MULT expr
        | <assoc=left> expr EXP expr
        | MINUS expr
        | OPEN expr CLOSE
        | NUMBER
        ;

NUMBER  : '0' | '1'..'9' '0'..'9'*;
PLUS    : '+';
MULT    : '*';
MINUS   : '-';
EXP     : '^';
OPEN    : '(';
CLOSE   : ')';

WS      : [ \t\r\n]+ -> skip;