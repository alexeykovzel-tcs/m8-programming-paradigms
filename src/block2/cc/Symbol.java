package block2.cc;

/**
 * Supertype of (terminal and non-terminal) grammar symbols.
 */
public interface Symbol {

    /**
     * Returns the name of this symbol.
     */
    String getName();

    /**
     * Special terminal for the empty string.
     */
    Term EMPTY = new Term("EMPTY");

    /**
     * Special terminal for the end-of-file token.
     */
    Term EOF = new Term("EOF");
}
