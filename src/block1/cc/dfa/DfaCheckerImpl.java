package block1.cc.dfa;

public class DfaCheckerImpl implements DfaChecker {

    @Override
    public boolean accepts(DfaState initState, String word) {
        DfaState nextState = initState;

        for (char c : word.toCharArray()) {
            nextState = nextState.getNext(c);
            if (nextState == null) {
                return false;
            }
        }
        return nextState.isAccepting();
    }
}
