package block7.cp.barrier;

public interface Barrier {

    /**
     * Waits, and only returns when sufficiently many 
     * (barrier height) threads have invoked await.  
     * @return The arrival index of the current thread. 
     */
    public int await() throws InterruptedException;
}
