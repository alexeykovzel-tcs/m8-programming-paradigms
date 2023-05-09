package block2.cp.unsafesequence;

import nl.utwente.pp.cp.junit.ConcurrentRunner;
import nl.utwente.pp.cp.junit.Threaded;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(ConcurrentRunner.class)
public class SequenceTest {
    private Sequence sequence;

    private static final int THREAD_COUNT = 50;

    private final List<Integer> nums = new ArrayList<>();

    @Before
    public void setUp() {
        sequence = new LockBasedSequence();
    }

    @Test
    @Threaded(count = THREAD_COUNT)
    public void testSequenceThreadSafety() {
        int num = sequence.getNext();
        synchronized (this) {
            nums.add(num);
        }
    }

    @After
    public void testIfSequence() {
        nums.sort(Integer::compareTo);
        for (int i = 0; i < nums.size() - 1; i++) {
            Integer nextNum = nums.get(i) + 1;
            Assert.assertEquals(nums.get(i + 1), nextNum);
        }
    }
}
