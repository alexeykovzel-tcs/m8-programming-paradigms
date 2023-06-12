package block7.cp.lockfree;

public class LockFreeStack<T> {
    
    // TODO: Finalize Node class
    private class Node {
        final T value = null; // TODO: Initialize properly
    }

    /**
     * Pushes element onto stack. 
     */
    public void push(T x) {
        // TODO: Implement
    }

    /**
     * Removes and returns top element from stack. 
     * When stack is initially empty, (busy) waits
     * until an element is there. 
     */
    public T pop() {
        return null; // TODO: Implement
    }

    /**
     * Indicates if stack is currently empty. 
     */
    public boolean isEmpty() {
        return false; // TODO: Implement
    }
}
