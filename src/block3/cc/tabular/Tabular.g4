grammar Tabular;

fragment DIGIT      : [0-9];
fragment LETTER     : [a-zA-Z];
fragment WORD       : (DIGIT | LETTER)+;
fragment OFFSET     : (' ')*;

OPEN    : '{';
CLOSE   : '}';
DOLLAR  : '$';
HASH    : '#';
HAT     : '^';
UNDER   : '_';
TILDE   : '~';
PERCENT : '%';

ENTRY           : WORD (' '+ WORD)*;
TABLE_START     : OFFSET '\\begin{tabular}' OFFSET '\n';
TABLE_END       : OFFSET '\\end{tabular}' OFFSET;
ROW_START       : ' '+;
ROW_END         : OFFSET '\\\\' OFFSET '\n';
AND             : OFFSET '&' OFFSET;

program     : (comment | tabular)*;
comment     : PERCENT (~('\n'))* '\n';
tabular     : TABLE_START (OPEN ('l'|'r'|'c')* CLOSE) row* TABLE_END;
row         : ROW_START? ENTRY (AND ENTRY)* ROW_END;
