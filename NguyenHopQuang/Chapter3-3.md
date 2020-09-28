### Bài 3:

File **BoundedQueue.java**:

```
public class BoundedQueue {
    private final Object[] elements;
    private int size, front, back;
    private final int capacity;

    public BoundedQueue(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("BoundedQueue.constructor");
        }

        this.capacity = capacity;
        elements = new Object[capacity];
        size = 0;
        front = 0;
        back = 0;
    }

    public void enQueue (Object o) throws NullPointerException, IllegalStateException {
        if (o == null)
            throw new NullPointerException ("BoundedQueue.enQueue");
        else if (size == capacity)
            throw new IllegalStateException ("BoundedQueue.enQueue");
        else {
            size++;
            elements [back] = o;
            back = (back+1) % capacity;
        }
    }

    public Object deQueue () throws IllegalStateException {
        if (size == 0)
            throw new IllegalStateException ("BoundedQueue.deQueue");
        else {
            size--;
            Object o = elements [ (front % capacity) ];
            elements [front] = null;
            front = (front+1) % capacity;
            return 0;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++)
        {
            result += elements[ (front + i) % capacity ] . toString();
            if (i < size -1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
```

File kiểm tra **BoundedQueueTest.java**

```
import org.junit.Test;
import static org.junit.Assert.*;

public class BoundedQueueTest {

    @Test
    public void testEnQueue() {
        System.out.println("enQueue");
        Object o  = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);

        assertEquals(instance.toString(), "[1]");
    }

    @Test
    public void testDeQueue() {
        System.out.println("deQueue");

        Object o = 1;
        Object a = 2;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        instance.enQueue(a);
        instance.deQueue();

        assertEquals(instance.toString(), "[2]");
    }

    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");

        BoundedQueue instance = new BoundedQueue(5);

        assertTrue(instance.isEmpty());
    }

    @Test
    public void testIsFull() {
        System.out.println("isFull");
        Object a = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);

        assertTrue(instance.isFull());
    }

    @Test
    public void testToString() {
        System.out.println("toString");
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
```

Kết quả chạy kiểm tra:

![Ket qua](https://i.imgur.com/Pyb8vjI.png)
