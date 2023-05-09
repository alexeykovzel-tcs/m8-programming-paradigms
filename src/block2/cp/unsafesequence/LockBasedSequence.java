package block2.cp.unsafesequence;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockBasedSequence implements Sequence {
    private final Lock lock = new ReentrantLock();
    private int value;

    @Override
    public int getNext() {
        lock.lock();
        try {
            return value++;
        } finally {
            lock.unlock();
        }
    }
}
