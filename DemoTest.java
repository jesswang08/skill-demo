import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {
    @Test
    public void testEvenOrOdd() {
        assertEquals("even", Demo.evenOrOdd(4));
    }
}
