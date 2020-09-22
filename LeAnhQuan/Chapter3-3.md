Câu 3:
```java

public class BoundedQueueTest {
    
    @Test
    public void testEnQueue() {
        System.out.println("enQueue");
        Object ob = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(ob);
        
        assertEquals(instance.toString(), "[1]");
    }

    
    @Test
    public void testDeQueue() {
        System.out.println("deQueue");
        Object a = 1;
        Object b = 2;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(a);
        instance.enQueue(b);
        instance.deQueue();
        
        assertEquals(instance.toString(), "[2]");
    }

   
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");

        BoundedQueue instance = new BoundedQueue(5);

        assertEquals(instance.isEmpty(), true);
    }

    @Test
    public void testIsFull() {
        System.out.println("isFull");
        Object x = 9;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(x);
        instance.enQueue(x);
        instance.enQueue(x);
        instance.enQueue(x);
        instance.enQueue(x);

        assertEquals(instance.isFull(), true);
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        Object a1 = 1;
        Object a2 = 2;
        Object a3 = 3;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(a3);
        instance.enQueue(a1);
        instance.enQueue(a2);
        assertEquals(instance.toString(), "[3, 1, 2]");
    }
}

```
