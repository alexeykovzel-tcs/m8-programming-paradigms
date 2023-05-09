package block2.cp.queue;

import nl.utwente.pp.cp.junit.ConcurrentRunner;
import nl.utwente.pp.cp.junit.Threaded;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(ConcurrentRunner.class)
public class SimpleDateFormatTest {
    private SimpleDateFormat dateFormat;

    private final static int THREAD_COUNT = 50;

    @Before
    public void setUp() {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    @Test
    @Threaded(count = THREAD_COUNT)
    public void testThreadSafety() throws ParseException {
        String dateStr = "2018-06-22";
        Date date = dateFormat.parse(dateStr);
        System.out.println(date);
    }
}
