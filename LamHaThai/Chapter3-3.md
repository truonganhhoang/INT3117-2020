##Câu 3:
```java
```java
public class BoundedQueueTest {
    /**
     * Test of enQueue method, of class BoundedQueue.
     */
    @Test
    public void testEnQueue() {
        System.out.println("enQueue");
        Object o = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        
        assertEquals(instance.toString(), "[1]");
    }
    /**
     * Test of deQueue method, of class BoundedQueue.
     */
    @Test
    public void testDeQueue() {
        System.out.println("deQueue"); 
        Object o = 4;
        Object a = 8;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        instance.enQueue(a);
        instance.deQueue();
        
        assertEquals(instance.toString(), "[8]");
    }
    /**
     * Test of isEmpty method, of class BoundedQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty")        
        BoundedQueue instance = new BoundedQueue(5);
        assertEquals(instance.isEmpty(), true);
    }
    /**
     * Test of isFull method, of class BoundedQueue.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull      
        Object a = 0;
        BoundedQueue instance = new BoundedQueue(2);
        instance.enQueue(a);
        instance.enQueue(a);
        assertEquals(instance.isFull(), true);
    }
    /**
     * Test of toString method, of class BoundedQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString      
        Object o = 3;
        Object a = 6;
        Object b = 9;
        BoundedQueue instance = new BoundedQueue(4);
        instance.enQueue(a);
        instance.enQueue(b);
        instance.enQueue(o);
        assertEquals(instance.toString(), "[3, 6, 9]");
    }
}
```
```