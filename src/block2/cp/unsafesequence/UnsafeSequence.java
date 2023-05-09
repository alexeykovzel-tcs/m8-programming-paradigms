package block2.cp.unsafesequence;

public class UnsafeSequence implements Sequence {
    private int value = 0;

    @Override
    public int getNext() {
        return value++;
    }
}
