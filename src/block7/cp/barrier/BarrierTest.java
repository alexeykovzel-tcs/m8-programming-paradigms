package block7.cp.barrier;

import block7.cp.lockfree.ConcurrentTest;

public class BarrierTest extends ConcurrentTest {
    int height  = 100;
    Barrier b   = new LockBarrier(height);
//    Barrier b   = new LockFreeBarrier(height);
    
    @Override
    public void ConcurrentProducerTask() {}

    @Override
    public void ConcurrentConsumerTask() {
        try {
            b.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BarrierTest test = new BarrierTest();
        test.setConsumers(50*1000);
        test.setProducers(0);
        test.runTest(true);
    }
}
