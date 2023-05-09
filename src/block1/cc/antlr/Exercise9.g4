lexer grammar Exercise9;

fragment LETTER     : 'a'..'z' | 'A'..'Z';
fragment DIGIT      : '0'..'9';
fragment ALPHANUM   : LETTER | DIGIT;

RESULT  : LETTER ALPHANUM ALPHANUM ALPHANUM ALPHANUM ALPHANUM;