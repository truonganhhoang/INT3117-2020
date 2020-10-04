# Chapter 3-3
## Develop JUnit tests for the BoundedQueue class. A compilable version is available on the book website in the file BoundedQueue.java. Make sure your tests check every method, but we will not evaluate the quality of your test designs and do not expect you to satisfy any test criteria. Turn in a printout of your JUnit tests and either a printout or a screen shot showing the results of each test.



### Kết quả chạy:

![](images/Chapter%203-3.png)


### File BoundedQueueTest:

```java
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
```

