# Develop JUnit tests for the BoundedQueue class.

- Thêm các thư viện cần thiết:

```java
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
```

- Tạo `class BoundedQueueTest`

```java
public class BoundedQueueTest {
  private BoundedQueue queue;
    // Các thiết lập, hàm kiểm thử sẽ nằm trong này
}
```

- Thiết lập, khởi tạo cho các ca kiểm thử:

```java
@BeforeEach
public void setUp() {
  this.queue = new BoundedQueue(5);
}
```

- Kiểm thử cho phương thức `isEmpty()`

```java
@Test
public void testEmptyQueue() {
    Assertions.assertTrue(this.queue.isEmpty());
    Object o = 1;
    this.queue.enQueue(o);
    Assertions.assertFalse(this,queue.isEmpty());
}
```

- Kiểm thử cho phương thức `enQueue()`

```java
@Test
public void testEnQueue() {
    Object o1 = 1;
    Object o2 = 2;
    this.queue.enQueue(o1);
    Assertions.assertEquals(this.queue.toString(), "[1]");
    this.queue.enQueue(o2);
    Assertions.assertEquals(this.queue.toString(), "[1, 2]");
}
```

- Kiểm thử cho phương thức `deQueue()`

```java
@Test
public void testDeQueue() {
    Object o1 = 1;
    Object o2 = 2;
    this.queue.enQueue(o1);
    this.queue.enQueue(o2);
    this.queue.deQueue();

    Assertions.assertEquals(this.queue.toString(), "[2]");
}
```

- Kiểm thử cho phương thức `isFull()`

```java
@Test
public void testIsFull() {
    Object a = 1;
    Assertions.assertFalse(this.queue.isFull());
    this.queue.enQueue(a);
    Assertions.assertFalse(this.queue.isFull());
    this.queue.enQueue(a);
    this.queue.enQueue(a);
    this.queue.enQueue(a);
    this.queue.enQueue(a);
    Assertions.assertTrue(this.queue.isFull());
}
```

- Kiểm thử cho phương thức `toString()`

```java
@Test
public void testToString() {
    Object o1 = 2;
    Object o2 = 4;
    Object o3 = 1;
    this.queue.enQueue(o1);
    this.queue.enQueue(o2);
    this.queue.enQueue(o3);

    Assertions.assertEquals(this.queue.toString(), "[2, 4, 1]");
}
```
