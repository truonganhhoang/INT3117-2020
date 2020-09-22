import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BoundedQueueTest {
    @Test(expected = IllegalArgumentException.class) public void testConstructor(){
        BoundedQueue queue = new BoundedQueue(-1);
    }
    @Test public void testEnQueue(){
        BoundedQueue queue = new BoundedQueue(3);
        queue.enQueue("Test String");
        assertEquals("[Test String]",queue.toString());
    }
    @Test public void testDeQueue(){
        BoundedQueue queue = new BoundedQueue(3);
        String temp = "Test String";
        queue.enQueue(temp);
        assertEquals(temp,queue.deQueue());
    }
    @Test public void testIsEmpty(){
        BoundedQueue queue = new BoundedQueue(3);
        assertTrue(queue.isEmpty());
    }
    @Test public void testIsFull(){
        BoundedQueue queue = new BoundedQueue(3);
        String temp = "Test String";
        queue.enQueue(temp);
        queue.enQueue(temp);
        queue.enQueue(temp);
        assertTrue(queue.isFull());
    }
    @Test public void testToString(){
        BoundedQueue queue = new BoundedQueue(3);
        queue.enQueue("123");
        queue.enQueue("abc");
        queue.enQueue("1a2b3c!@#$%^");
        assertEquals("[123, abc, 1a2b3c!@#$%^]",queue.toString());
    }
}
