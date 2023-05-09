package block2.cp.unsafesequence;

public class SynchronizedSequence implements Sequence {
    private int value = 0;

    @Override
    public synchronized int getNext() {
        return value++;
    }
}
