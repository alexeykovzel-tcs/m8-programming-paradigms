grammar TypedCalcAttr;

import CalcVocab;

@members {
    private Type getType(Type type1, Type type2) {
        return (type1 == type2) ? type1 : Type.ERR;
    }
}

expr returns [ Type type ]

     // expr * expr
     : e0=expr TIMES e1=expr
       { $type = getType($e0.type, $e1.type); }

     // expr + expr
     |  e0=expr PLUS e1=expr
       { $type = getType($e0.type, $e1.type); }

     // - expr
     |  MINUS e=expr
        { $type = ($e.type == Type.NUM) ? Type.NUM : Type.ERR; }

     // ( expr )
     |  LPAR e=expr RPAR
        { $type = $e.type; }

     |  NUMBER
        { $type = Type.NUM; }

     |  STRING
        { $type = Type.STR; }

     |  BOOLEAN
        { $type = Type.BOOL; }

     ;
