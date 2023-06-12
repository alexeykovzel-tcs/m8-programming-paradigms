package block7.cp.lockfree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LockFreeStackTest {
    private static final int NUM_PRODUCERS = 100;
    private static final int NUM_CONSUMERS = 100;
    private static final int NUM_CALLS = 100 * 1000;

    private LockFreeStack<String> stack;

    @Before
    public void init() {
        stack = new LockFreeStack<>();
    }

    @Test
    public void produceConsumeTest() {
        List<Thread> producers = new ArrayList<>();
        List<Thread> consumers = new ArrayList<>();
        for (int i = 0; i < NUM_PRODUCERS; i++) {
            Thread producer = new Thread(new ProducerTask());
            producers.add(producer);
            producer.start();
        }
        for (int i = 0; i < NUM_CONSUMERS; i++) {
            Thread consumer = new Thread(new ConsumerTask());
            consumers.add(consumer);
            consumer.start();
        }
        for (int i = 0; i < NUM_PRODUCERS; i++) {
            try {
                producers.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < NUM_PRODUCERS; i++) {
            try {
                consumers.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class ProducerTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < NUM_CALLS; i++) {
                LockFreeStackTest.this.stack.
                	push("Hello there " + i);
            }
        }
    }

    private class ConsumerTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < NUM_CALLS; i++) {
                LockFreeStackTest.this.stack.pop();
            }
        }
    }

    @After
    public void after() {
        // After all operations above, stack
        // should be empty again. 
        assertTrue(stack.isEmpty());
        // However, check that stack can actually
        // store something at all. 
        stack.push("Is not everything discarded?");
        assertFalse("Stack empty, but shouldn't", 
            stack.isEmpty());
    }
}