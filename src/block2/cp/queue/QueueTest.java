package block2.cp.queue;

import nl.utwente.pp.cp.junit.ConcurrentRunner;
import nl.utwente.pp.cp.junit.Threaded;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ConcurrentRunner.class)
public class QueueTest {
    private Queue<Integer> queue;

    private final static int THREAD_COUNT = 50;

    @Before
    public void setUp() {
        queue = new FineGrainedLinkedListQueue<>();
    }

    @Test
    @Threaded(count = THREAD_COUNT)
    public void testQueue() throws QueueEmptyException {
        for (int i = 0; i < 5; i++) {
            queue.push(i);
        }
        for (int i = 0; i < 5; i++) {
            queue.pull();
        }
    }

    @After
    public void after() {
        Assert.assertEquals(0, queue.getLength());
    }
}
