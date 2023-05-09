package block1.cc.dfa;

import java.util.ArrayList;
import java.util.List;

public class DfaScannerImpl implements DfaScanner {

    @Override
    public List<String> scan(DfaState state, String text) {
        List<String> tokens = new ArrayList<>();
        int scanned = 0;

        while (true) {
            String token = getNextToken(state, text, scanned);
            if (token == null) {
                break;
            }
            tokens.add(token);
            scanned += token.length();
        }
        return tokens;
    }

    private String getNextToken(DfaState state, String text, int scanned) {
        DfaState nextState = state;
        int tokenLength = 0;
        for (int i = scanned; i < text.length(); i++) {
            nextState = nextState.getNext(text.charAt(i));
            if (nextState == null) {
                break;
            }
            if (nextState.isAccepting()) {
                tokenLength = i;
            }
        }
        return tokenLength != 0
                ? text.substring(scanned, tokenLength + 1)
                : null;
    }
}
