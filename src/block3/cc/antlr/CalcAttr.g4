grammar CalcAttr;

import CalcVocab;

@members {
    private int getValue(String text) {
        return Integer.parseInt(text);
    }
}

expr returns [ int val ]

     // expr * expr
     : e0=expr TIMES e1=expr
       { $val = $e0.val * $e1.val; }

     // expr + expr
     |  e0=expr PLUS e1=expr
       { $val = $e0.val + $e1.val; }

     // -expr
     |  { System.out.println("Evaluating MINUS"); }
        MINUS e=expr
        { $val = - $e.val; }

     // ( expr )
     |  { System.out.println("Evaluating PARENS"); }
        LPAR e=expr RPAR
        { $val = $e.val; }

     // Number
     |  { System.out.println("Evaluating NUMBER"); }
        NUMBER
        { $val = getValue($NUMBER.text); }
     ;
