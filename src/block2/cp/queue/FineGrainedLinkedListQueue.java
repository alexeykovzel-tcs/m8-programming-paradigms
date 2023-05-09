package block2.cp.queue;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FineGrainedLinkedListQueue<T> implements Queue<T> {
    private volatile LinkedListNode<T> head = null;
    private volatile LinkedListNode<T> tail = null;
    private final AtomicInteger length = new AtomicInteger();
    private final Object headLock = new Object();
    private final Object tailLock = new Object();

    @Override
    public void push(T object) {
        LinkedListNode<T> newNode = new LinkedListNode<>(object);
        synchronized (tailLock) {
            if (tail == null) {
                synchronized (headLock) {
                    head = newNode;
                }
            } else {
                tail.setNext(newNode);
            }
            tail = newNode;
        }
        length.incrementAndGet();
    }

    @Override
    public T pull() throws QueueEmptyException {
        T object;
        synchronized (headLock) {
            if (head == null) {
                throw new QueueEmptyException();
            }
            object = head.getContent();
            if (head.hasNext()) {
                head = head.getNext();
            } else {
                head = null;
                synchronized (tailLock) {
                    tail = null;
                }
            }
        }
        length.decrementAndGet();
        return object;
    }

    @Override
    public int getLength() {
        return length.get();
    }
}
