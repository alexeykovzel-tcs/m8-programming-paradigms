package block3.cp.lockcoupling;

import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;

@ThreadSafe
public class LockCoupledList<T> implements List<T> {

    // The sentinel node points to the first element of the list.
    private final SyncNode<T> sentinel = new SyncNode<>(null, null);

    @Override
    public void insert(int position, T value) {
        AtomicInteger pos = new AtomicInteger(position);
        traverse((current, next) -> {
            if (pos.get() == 0) {
                current.setNext(new SyncNode<>(value, next));
                return true;
            }
            pos.decrementAndGet();
            return false;
        });
    }

    @Override
    public void add(T value) {
        traverse((current, next) -> {
            if (next == null) {
                current.setNext(new SyncNode<>(value, null));
                return true;
            }
            return false;
        });
    }

    @Override
    public int size() {
        AtomicInteger count = new AtomicInteger(0);
        traverse((current, next) -> {
            count.incrementAndGet();
            return false;
        });
        return count.get();
    }

    @Override
    public void remove(T item) {
        traverse((current, next) -> {
            if (next != null && next.getItem().equals(item)) {
                current.setNext(next.getNext());
                return true;
            }
            return false;
        });
    }

    @Override
    public void delete(int position) {
        AtomicInteger pos = new AtomicInteger(position);
        traverse((current, next) -> {
            if (pos.get() == 0 && next != null) {
                current.setNext(next.getNext());
                return true;
            }
            pos.decrementAndGet();
            return false;
        });
    }

    private void traverse(BiFunction<SyncNode<T>, SyncNode<T>, Boolean> operation) {
        SyncNode<T> current = this.sentinel;
        current.lock();
        try {
            while (current.getNext() != null) {
                SyncNode<T> next = current.getNext();
                next.lock();
                try {
                    if (operation.apply(current, next)) {
                        return;
                    }
                } finally {
                    current.unlock();
                }
                current = next;
            }
        } finally {
            current.unlock();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        traverse((current, next) -> {
            if (next != null) {
                String item = next.getItem().toString();
                result.append(item).append(" ");
            }
            return false;
        });
        return result.toString();
    }
}
