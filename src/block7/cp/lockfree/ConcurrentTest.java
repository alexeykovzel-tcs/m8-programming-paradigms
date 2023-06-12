package block7.cp.lockfree;

import java.util.ArrayList;

public abstract class ConcurrentTest {
    private int numProducers = 1;
    private int numConsumers = 1;

    public final void setProducers(int i) { this.numProducers = i; }
    public final void setConsumers(int i) { this.numConsumers = i; }
    
    // Container for the multiple threads
    private ArrayList<Thread> consumers;
    private ArrayList<Thread> producers;

    public abstract void ConcurrentProducerTask();
    public abstract void ConcurrentConsumerTask();
    
    private class ConcurrentProducer implements Runnable {
        @Override
        public void run() { ConcurrentProducerTask(); }
    }

    private class ConcurrentConsumer implements Runnable {
        @Override
        public void run() { ConcurrentConsumerTask(); }
    }

    public void runTest() {
        runTest(false);
    }
    
    public void runTest(boolean displayInfo) {
        long beginTime = System.currentTimeMillis();

		this.consumers = new ArrayList<Thread>(this.numConsumers);
		this.producers = new ArrayList<Thread>(this.numProducers);
        
        // Initialize the threads and start them.
		for (int i = 0; i < this.numProducers; i++) {
			this.producers.add(new Thread(new ConcurrentProducer()));
			this.producers.get(i).start();
        }

		for (int i = 0; i < this.numConsumers; i++) {
			this.consumers.add(new Thread(new ConcurrentConsumer()));
			this.consumers.get(i).start();
        }
        
        if (displayInfo)
            System.out.println("All threads have been started.");
        
        // Join the threads (block until they have finished executing.
		for (int i = 0; i < this.numProducers; i++) {
            try {
				this.producers.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        if (displayInfo) 
            System.out.println("Producers have finished.");
        
		for (int i = 0; i < this.numConsumers; i++) {
            try {
				this.consumers.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        if (displayInfo) {
            System.out.println("Consumers have finished.");
            System.out.println("Test took: " + 
                (System.currentTimeMillis() - beginTime) + " ms.");
        }
    }
}
