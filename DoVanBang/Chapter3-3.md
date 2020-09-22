# Chapter 3

#### 3

public class BoundedQueueTest {
    @Test
    public void testEnQueue() {
        Object o1 = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o1);
        assertEquals(instance.toString(), "[1]");
    }

    @Test
    public void testDeQueue() {
        Object o1 = 1;
        Object o1 = 2;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o1);
        instance.enQueue(o2);
        instance.deQueue();
        
        assertEquals(instance.toString(), "[2]");
    }

    @Test
    public void testIsEmpty() {
        BoundedQueue instance = new BoundedQueue(5);
        assertEquals(instance.isEmpty(), true);
    }

    @Test
    public void testIsFull() {
        Object o1 = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o1);
        instance.enQueue(o1);
        instance.enQueue(o1);
        instance.enQueue(o1);
        instance.enQueue(o1);

        assertEquals(instance.isFull(), true);
    }

    @Test
    public void testToString() {
        System.out.println("String");
        Object o = 1;
        Object a = 2;
        Object b = 4;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(a);
        instance.enQueue(b);
        instance.enQueue(o);
        assertEquals(instance.toString(), "[2, 4, 1]");
    }
}

