grammar Sentence;

/** Full sentence: the start symbol of the grammar. */
sentence    : subject VERB object ENDMARK
            ;

/** Grammatical subject in a sentence. */
subject     : modifier subject  # extendSubject
            | NOUN              # nounSubject
            ;

/** Grammatical object in a sentence. */
object      : modifier object   # extendObject
            | NOUN              # nounObject
            ;

/** Modifier in an object or subject. */
modifier    : ADJECTIVE;

NOUN : 'students' | 'compilers' ;
VERB : 'love' ;
ADJECTIVE : 'all' | 'smart' | 'undergraduate' ;
ENDMARK : '.' ;

// ignore whitespace
WS : [ \t\n\r] -> skip;

// everything else is a typo
TYPO : [a-zA-Z]+;
