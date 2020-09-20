- Tệp kiểm thử "BoundedQueueTest.java"

```
import org.junit.Test;
import static org.junit.Assert.*;

public class BoundedQueueTest {

    @Test
    public void testEnQueue() {
        System.out.println(" Testing enQueue");
        Object o = 1;
        BoundedQueue testQueue = new BoundedQueue(5);
        testQueue.enQueue(o);

        assertEquals(testQueue.toString(), "[1]");
    }

    @Test
    public void testDeQueue() {
        System.out.println("Testing deQueue");
        Object o = 1;
        Object o1 = 2;
        BoundedQueue testQueue = new BoundedQueue(5);
        testQueue.enQueue(o);
        testQueue.enQueue(o1);
        testQueue.deQueue();

        assertEquals(testQueue.toString(), "[2]");
    }

    @Test
    public void testIsEmpty() {
        System.out.println("Testing isEmpty");
        BoundedQueue testQueue = new BoundedQueue(5);

        assertTrue(testQueue.isEmpty());
    }

    @Test
    public void testIsFull() {
        System.out.println("Testing isFull");
        Object o = 1;
        BoundedQueue testQueue = new BoundedQueue(5);
        testQueue.enQueue(o);
        testQueue.enQueue(o);
        testQueue.enQueue(o);
        testQueue.enQueue(o);
        testQueue.enQueue(o);

        assertTrue(testQueue.isFull());
    }

    @Test
    public void testToString() {
        System.out.println("Testing toString");
        Object o = 1;
        Object o1 = 3;
        Object o2 = 5;
        BoundedQueue testQueue = new BoundedQueue(5);
        testQueue.enQueue(o1);
        testQueue.enQueue(o2);
        testQueue.enQueue(o);
        assertEquals(testQueue.toString(), "[3, 5, 1]");
    }
}
```
- Kết quả: https://ibb.co/8459jnv