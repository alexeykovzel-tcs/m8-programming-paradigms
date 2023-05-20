package block3.cp.lockcoupling;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncNode<T> {
    private final Lock lock = new ReentrantLock();
    private final T item;
    private SyncNode<T> next;

    public SyncNode(T value, SyncNode<T> next) {
        this.item = value;
        this.next = next;
    }

    public void lock() {
        lock.lock();
    }

    public void unlock() {
        lock.unlock();
    }

    public T getItem() {
        return this.item;
    }

    public SyncNode<T> getNext() {
        return this.next;
    }

    public void setNext(SyncNode<T> next) {
        this.next = next;
    }
}
