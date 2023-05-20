package block3.cp.synchronizers;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class DekkerLock implements BasicLock {
    private final AtomicIntegerArray flag = new AtomicIntegerArray(2);
    private volatile int turn = 0;

    @Override
    public void lock(int thread) {
        int otherThread = 1 - thread;
        flag.set(thread, 1);
        while (flag.get(otherThread) == 1) {
            if (turn != thread) {
                flag.set(thread, 0);
                while (turn != thread) {
                    // Busy wait
                }
                flag.set(thread, 1);
            }
        }
    }

    @Override
    public void unlock(int thread) {
        turn = 1 - thread;
        flag.set(thread, 0);
    }
}
