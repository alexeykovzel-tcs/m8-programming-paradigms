package block3.cp.barriers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

/**
 * Abstract class implementing the map-reduce framework.
 */
public abstract class MapReduceBase<I, O, R> {
    private final List<I> input;
    private final List<O> output;
    private final CountDownLatch latch;

    protected MapReduceBase(List<I> input) {
        this.input = input;
        output = Collections.synchronizedList(new ArrayList<>(input.size()));
        latch = new CountDownLatch(input.size());
    }

    protected abstract O map(I in);

    protected abstract R reduce(List<O> in);

    protected R run() {
        for (I value : input) {
            new Thread(new RunMap(value)).start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return reduce(output);
    }

    private class RunMap implements Runnable {
        private final I value;

        public RunMap(I value) {
            this.value = value;
        }

        @Override
        public void run() {
            output.add(map(value));
            latch.countDown();
        }
    }
}
