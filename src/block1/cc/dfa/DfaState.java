package block1.cc.dfa;

import java.util.Map;
import java.util.TreeMap;

/**
 * State of a DFA.
 */
public class DfaState {
    /**
     * State number
     */
    private final int nr;

    /**
     * Flag indicating if this state is accepting.
     */
    private final boolean accepting;

    /**
     * Mapping to next states.
     */
    private final Map<Character, DfaState> next;

    /**
     * Constructs a new, possibly accepting state with a given number. The
     * number is meant to identify the state, but there is no check for
     * uniqueness.
     */
    public DfaState(int nr, boolean accepting) {
        this.next = new TreeMap<>();
        this.nr = nr;
        this.accepting = accepting;
    }

    /**
     * Returns the state number.
     */
    public int getNumber() {
        return this.nr;
    }

    /**
     * Indicates if the state is accepting.
     */
    public boolean isAccepting() {
        return this.accepting;
    }

    /**
     * Adds an outgoing transition to a next state. This overrides any previous
     * transition for that character.
     */
    public void addNext(Character c, DfaState next) {
        this.next.put(c, next);
    }

    /**
     * Indicates if there is a next state for a given character.
     */
    public boolean hasNext(Character c) {
        return getNext(c) != null;
    }

    /**
     * Returns the (possibly <code>null</code>) next state for a given
     * character.
     */
    public DfaState getNext(Character c) {
        return this.next.get(c);
    }

    @Override
    public String toString() {
        String trans = "";
        for (Map.Entry<Character, DfaState> out : this.next.entrySet()) {
            if (!trans.isEmpty()) {
                trans += ", ";
            }
            trans += "--" + out.getKey() + "-> " + out.getValue().getNumber();
        }
        return String.format("State %d (%s) with outgoing transitions %s",
                this.nr, this.accepting ? "accepting" : "not accepting", trans);
    }

    static final public DfaState DFA_ID6;
    static final public DfaState DFA_LALA;

    static {
        DFA_ID6 = buildDfaID6();
        DFA_LALA = buildDfaLala();
    }

    private static DfaState buildDfaLala() {
        DfaState q0 = new DfaState(0, false);
        DfaState q1 = new DfaState(1, false);
        DfaState q2 = new DfaState(2, true);
        DfaState q3 = new DfaState(3, true);
        DfaState q4 = new DfaState(4, false);
        DfaState q5 = new DfaState(5, true);
        DfaState q6 = new DfaState(6, true);
        DfaState q7 = new DfaState(7, false);
        DfaState q8 = new DfaState(8, false);
        DfaState q9 = new DfaState(9, false);
        DfaState q10 = new DfaState(10, false);
        DfaState q11 = new DfaState(11, true);

        q0.addNext('L', q1);
        q1.addNext('a', q2);
        q2.addNext('a', q2);
        q2.addNext(' ', q3);
        q3.addNext(' ', q3);
        q3.addNext('L', q4);
        q4.addNext('a', q5);
        q5.addNext('a', q5);
        q5.addNext(' ', q6);
        q6.addNext(' ', q6);
        q6.addNext('L', q7);
        q7.addNext('a', q8);
        q8.addNext('a', q8);
        q8.addNext(' ', q9);
        q9.addNext(' ', q9);
        q9.addNext('L', q10);
        q10.addNext('i', q11);
        q11.addNext(' ', q11);

        return q0;
    }

    private static DfaState buildDfaID6() {
        DfaState q0 = new DfaState(0, false);
        DfaState[] states = {
                q0,
                new DfaState(1, false),
                new DfaState(2, false),
                new DfaState(3, false),
                new DfaState(4, false),
                new DfaState(5, false),
                new DfaState(6, true)
        };
        for (int s = 0; s < states.length - 1; s++) {
            for (char c = 'a'; c < 'z'; c++) {
                states[s].addNext(c, states[s + 1]);
            }
        }
        for (int s = 0; s < states.length - 1; s++) {
            for (char c = 'A'; c < 'Z'; c++) {
                states[s].addNext(c, states[s + 1]);
            }
        }
        for (int s = 1; s < states.length - 1; s++) {
            for (char c = '0'; c < '9'; c++) {
                states[s].addNext(c, states[s + 1]);
            }
        }
        return q0;
    }
}
