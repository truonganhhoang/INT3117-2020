>Develop JUnit tests for the ```BoundedQueue class```. A compilable
 version is available on the book website in the file
 ```BoundedQueue.java```. Make sure your tests check every method,
 but we will not evaluate the quality of your test designs and do not
 expect you to satisfy any test criteria. Turn in a printout of your
 JUnit tests and either a printout or a screen shot showing the results
 of each test

 - Đầu tiên, ta thiết lập môi trường kiểm thử với ```Queue.size() = 4```
 ```
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoundedQueueTest {
    
    private BoundedQueue queue;

    @BeforeEach
    public void setUp() {
        this.queue = new BoundedQueue(4);
    }
```
- Hàm kiểm thử cho ```enQueue (Object o)```
```
    @Test
    public void enQueue() {
        int number = 0;
        this.queue.enQueue(number);
        Assertions.assertFalse(queue.isEmpty());
    }
```
- Hàm kiểm thử cho ```deQueue()```

```
    @Test
    public void deQueue() {
        int number = 0;
        this.queue.enQueue(number);
        Assertions.assertEquals(number, this.queue.deQueue());
    }
```

- Hàm kiểm thử cho ```isEmpty()```
```
    @Test
    public void isEmpty() {
        Assertions.assertTrue(this.queue.isEmpty());
    }
```

- Hàm kiểm thử cho ```isFull()```
```
    @Test
    public void isFull() {
        int number_0 = 0, number_1 = 1, number_2 = 2, number_3 = 3;

        this.queue.enQueue(number_0);

        this.queue.enQueue(number_1);
        Assertions.assertFalse(this.queue.isFull());

        this.queue.enQueue(number_2);
        Assertions.assertFalse(this.queue.isFull());

        this.queue.enQueue((number_3));
        Assertions.assertTrue(this.queue.isFull());
    }
```
- Hàm kiểm thử cho ```toString()```
```
    @Test
    public void testToString() {
        int number_0 = 0, number_1 = 1, number_2 = 2, number_3 = 3;

        this.queue.enQueue(number_0);
        this.queue.enQueue(number_1);
        this.queue.enQueue(number_2);
        this.queue.enQueue(number_3);

        Assertions.assertEquals("[0, 1, 2, 3]", this.queue.toString());
    }
}
```