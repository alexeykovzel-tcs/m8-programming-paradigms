lexer grammar Exercise12;

STRING      : '"' (~'"' | '""')* '"';
WHITESPACE  : [ \t\n\r]+ -> skip;