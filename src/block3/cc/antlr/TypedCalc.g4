grammar TypedCalc;

import CalcVocab;

expr : expr TIMES expr      # mult
     | expr PLUS expr       # plus
     | LPAR expr RPAR       # parens
     | NUMBER               # number
     | STRING               # string
     | BOOLEAN              # boolean
     ;