package block3.cc.symbol;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SymbolTableImpl implements SymbolTable {
    private final Map<Integer, Set<String>> vars = new HashMap<>();
    private int scope = 0;

    public SymbolTableImpl() {
        vars.put(scope, new HashSet<>());
    }

    @Override
    public void openScope() {
        scope++;
        vars.put(scope, new HashSet<>());
    }

    @Override
    public void closeScope() {
        if (scope == 0) {
            throw new RuntimeException("Cannot close the top-level scope");
        }
        scope--;
    }

    @Override
    public boolean add(String id) {
        return vars.get(scope).add(id);
    }

    @Override
    public boolean contains(String id) {
        for (int i = scope; i >= 0; i--) {
            if (vars.get(i).contains(id)) {
                return true;
            }
        }
        return false;
    }
}
