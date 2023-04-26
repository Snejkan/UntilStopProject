package untilStop;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JunitTest {

    @Test
    public void testCharacters() {

    Counter counter = new Counter();

        counter.count("programming");
        int characters = counter.getCharCount();

        assertEquals(11, characters);

    }
    @Test
    public void testLine() {
        Counter counter = new Counter();

        counter.count("hello");
        counter.count("goodbye");
        counter.count("stop");


        int line = counter.getLineCount();

        assertEquals(2,line);

    }
    @Test
    public void testNotCountWhenStop() {
        Counter counter = new Counter();

        counter.count("stop");
        int stop = counter.getCharCount();


        assertEquals(0, stop);

    }
}
