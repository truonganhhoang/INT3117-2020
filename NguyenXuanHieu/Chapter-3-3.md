# Develop JUnit tests for the BoundedQueue class. A compilable version is available on the book website in the file BoundedQueue.java. Make sure your tests check every method, but we will not evaluate the quality of your test designs and do not expect you to satisfy any test criteria. Turn in a printout of your JUnit tests and either a printout or a screen shot showing the results of each test.

```
public class BoundedQueueTest {
    public void testEnQuene() {
        Object o = 10;

        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        
        assertEquals(instance.toString(), "[10]");
    }

    public void testDeQueue() {
        Object a = 9;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        instance.enQueue(a);
        instance.deQueue();
        
        assertEquals(instance.toString(), "[9]");
    }

    public void testIsEmpty() {
        BoundedQueue instance = new BoundedQueue(5);

        assertEquals(instance.isEmpty(), true);
    }

    public void testIsFull() {
        Object a = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);

        assertEquals(instance.isFull(), true);
    }   
}
```