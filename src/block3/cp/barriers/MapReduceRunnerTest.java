package block3.cp.barriers;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MapReduceRunnerTest {
    private MapReduceBase<String, Integer, Integer> sumCalculator;

    @Before
    public void setUp() {
        List<String> input = List.of("1", "5", "2", "5", "1", "5", "3", "2");
        sumCalculator = new MapReduceBase<>(input) {

            @Override
            protected Integer map(String value) {
                return Integer.parseInt(value);
            }

            @Override
            protected Integer reduce(List<Integer> values) {
                int sum = 0;
                for (int value : values) {
                    sum += value;
                }
                return sum;
            }
        };
    }

    @Test
    public void testRunnerCorrectness() {
        int result = sumCalculator.run();
        assertEquals(24, result);
    }
}
