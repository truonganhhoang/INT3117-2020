## Câu 3: Tạo 1 Jnit test cho BoundedQueue class

```java
public class BoundedQueueTest {

    //kiểm thử enQueue method

    public void testEnQueue() {
        System.out.println("enQueue testing"); 
        Object o = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        
        assertEquals(instance.toString(), "[1]");
    }

    //kiểm thử deQueue method

    public void testDeQueue() {
        System.out.println("deQueue testing"); 
        Object o = 1;
        Object a = 2;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        instance.enQueue(a);
        instance.deQueue();
        
        assertEquals(instance.toString(), "[2]");
    }

    //kiểm thử isEmpty method

    public void testIsEmpty() {
        System.out.println("isEmpty testing");        
        BoundedQueue instance = new BoundedQueue(5);

        assertEquals(instance.isEmpty(), true);
    }

    //kiểm thử isFull method

    public void testIsFull() {
        System.out.println("isFull testing"); 
        Object a = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);

        assertEquals(instance.isFull(), true);
    }

    //kiểm thử toString method
    public void testToString() {
        System.out.println("toString testing");      
        Object o = 3;
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
