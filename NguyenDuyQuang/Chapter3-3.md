
## **Question 3: Develop JUnit tests for the BoundedQueue class. A compilable version is available on the book website in the file BoundedQueue.java. Make sure your tests check every method, but we will not evaluate the quality of your test designs and do not expect you to satisfy any test criteria. Turn in a printout of your JUnit tests and either a printout or a screen shot showing the results of each test.** ##

```java
public class BoundedQueueTest {
    /**
     * kiểm tra enQueue method
     */
    @Test
    public void testEnQueue() {
        System.out.println("enQueue Object o = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        
        assertEquals(instance.toString(), "[1]");
    }

    /** kiểm tra deQueue method

     */
    @Test
    public void testDeQueue() {
        System.out.println("deQueue Object o = 1;
        Object a = 2;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        instance.enQueue(a);
        instance.deQueue();
        
        assertEquals(instance.toString(), "[2]");
    }

    /**
     * kiểm tra isEmpty method
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty        BoundedQueue instance = new BoundedQueue(5);

        assertEquals(instance.isEmpty(), true);
    }

    /**
     * kiểm tra isFull method
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull Object a = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);

        assertEquals(instance.isFull(), true);
    }

    /**
     * kiểm tra toString method
     */
    @Test
    public void testToString() {
        System.out.println("toString       Object o = 3;
        Object a = 5;
        Object b = 9;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(a);
        instance.enQueue(b);
        instance.enQueue(o);
        assertEquals(instance.toString(), "[5, 9, 3]");
    }
}
```