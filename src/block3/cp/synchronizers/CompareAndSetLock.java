package block3.cp.synchronizers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CompareAndSetLock implements BasicLock {
    private final AtomicInteger lock = new AtomicInteger(0);
    private final Map<Integer, Integer> enterMap = new ConcurrentHashMap<>();

    @Override
    public void lock(int threadNumber) {
        int enters = enterMap.getOrDefault(threadNumber, 0);
        if (enters == 0) {
            while (!lock.compareAndSet(0, 1)) {
                // Busy wait
            }
        } else {
            enterMap.put(threadNumber, enters + 1);
        }
    }

    @Override
    public void unlock(int threadNumber) {
        int enters = enterMap.getOrDefault(threadNumber, 0);
        if (enters != 0) {
            enterMap.put(threadNumber, enters - 1);
        } else {
            lock.set(0);
        }
    }
}
