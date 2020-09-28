```javascript

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoundedQueueTest {

    private BoundedQueue queue;

    @Before
    public void SetUp() {
        queue = new BoundedQueue(10);
    }

    @Test
    public void TestEmptyQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void TestQueueCount() {
        int test = 1;
        int test1 = 2;
        queue.put(test);
        queue.put(test1);
        assertTrue(2 == queue.getCount());
    }

    @Test
    public void TestQueuePut() {
        int test = 1;
        queue.put(test);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void TestFullQueue() {
        assertFalse(queue.isFull());
    }

    @After
    public void Destroy() {
        queue = null;
    }
}

```
