## Xây dựng các bài kiểm thử JUnit cho lớp BoundQueue. Một phiên bản tổng hợp có sẵn trên trang web sách trong tệp BoundQueue.java. Đảm bảo các bài kiểm tra của bạn kiểm tra mọi phương pháp, nhưng chúng tôi sẽ không đánh giá chất lượng của các thiết kế kiểm tra của bạn và không mong đợi bạn đáp ứng bất kỳ tiêu chí kiểm tra nào. Nộp bản in các bài kiểm tra JUnit của bạn và bản in hoặc ảnh chụp màn hình hiển thị kết quả của mỗi bài kiểm tra.

+ Class khởi tạo `BoundedQueue.java` từ sách giáo trình
```java
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3, page ??
// See BoundedQueueTest.java for JUnit tests. (Instructor only)

public class BoundedQueue
{
    // Overview:  a BoundedQueue is a mutable, bounded FIFO data structure
    // of fixed size , with size being set in the constructor
    // A typical Queue is [], [o1], or [o1, o2], where neither o1 nor o2
    // are ever null.  Older elements are listed before newer ones.

    private final Object[] elements;
    private int size, front, back;
    private final int capacity;

    public BoundedQueue (int capacity)
    {
        if (capacity < 0)
            throw new IllegalArgumentException ("BoundedQueue.constructor");
        this.capacity = capacity;
        elements = new Object [capacity];
        size  = 0; front = 0; back  = 0;
    }

    public void enQueue (Object o)
            throws NullPointerException, IllegalStateException
    {  // Modifies: this
        // Effects:   If argument is null throw NullPointerException
        // else if this is full, throw IllegalStateException,
        // else make o the newest element of this
        if (o == null)
            throw new NullPointerException ("BoundedQueue.enQueue");
        else if (size == capacity)
            throw new IllegalStateException ("BoundedQueue.enQueue");
        else
        {
            size++;
            elements [back] = o;
            back = (back+1) % capacity;
        }
    }

    public Object deQueue () throws IllegalStateException
    {  // Modifies: this
        // Effects:   If queue is empty, throw IllegalStateException,
        // else remove and return oldest element of this

        if (size == 0)
            throw new IllegalStateException ("BoundedQueue.deQueue");
        else
        {
            size--;
            Object o = elements [ (front % capacity) ];
            elements [front] = null;
            front = (front+1) % capacity;
            return o;
        }
    }

    public boolean isEmpty()
    {
        return (size == 0);
    }
    public boolean isFull()
    {
        return (size == capacity);
    }

    public String toString()
    {
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

+ Khởi tạo các ca kiểm thử với jUnit5
  + Mã lệnh đầy đủ
    ```java
    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    
    //public test class
    public class BoundedQueueTest {
        private BoundedQueue queue;
    
        //setup new bounded queue
        //this method will be run before each '@Test' due to the '@Before' annotation.
        //use it to initialize data structures, and other things you need to do before each test
        @BeforeEach
        public void init() {
            queue = new BoundedQueue(3);
        }
    
        //@test annotation
        //each test will be run independently
        //test empty queue
        @Test
        public void testEmptyQueue() {
            Assertions.assertTrue(queue.isEmpty());
        }
    
        //test full queue
        @Test
        public void testFullQueue() {
            this.queue.enQueue(1);
            this.queue.enQueue(2);
            Assertions.assertFalse(queue.isFull());
    
            this.queue.enQueue(3);
            Assertions.assertTrue(queue.isFull());
        }
    
        //test enqueue
        @Test
        public void testEnqueue() {
            queue.enQueue(5);
            Assertions.assertFalse(queue.isEmpty());
        }
    
        //test dequeue
        @Test
        public void testDequeue() {
            queue.enQueue(5);
            Assertions.assertEquals(5, queue.deQueue());
        }
    
        //test dequeue while empty
        @Test
        public void testDequeueWhileEmpty() {
            Assertions.assertTrue(queue.isEmpty());
            queue.deQueue();
            Assertions.assertEquals("Error! Dequeue While Empty",queue.toString());
        }
    
        //test to string
        @Test
        public void testToString() {
            this.queue.enQueue(1);
            this.queue.enQueue(2);
            this.queue.enQueue(3);
    
            Assertions.assertEquals("1,2,3", this.queue.toString());
        }
    }

    ```
  + Kết quả các phép thử
  
    ![Test Result](/images/logo.png)
    
   + Kiểm thử hàng đợi rỗng `isEmpty`
     + Mã lệnh
       ```java
       @Test
           public void testEmptyQueue() {
               Assertions.assertTrue(this.queue.isEmpty());
           }
       ```
     + Kết quả
     
   + Kiểm thử hàng đợi đầy `isFull`
        + Mã lệnh
          ```java
          @Test
              public void testFullQueue() {
                  this.queue.enQueue(1);
                  this.queue.enQueue(2);
                  Assertions.assertFalse(this.queue.isFull());
                  this.queue.enQueue(3);
                  Assertions.assertTrue(this.queue.isFull());
              }
          ```
        + Kết quả
        
   + Kiểm thử thêm một phần tử vào hàng đợi `enQueue`
        + Mã lệnh
          ```java
          @Test
              public void testEnqueue() {
                  this.queue.enQueue(5);
                  Assertions.assertFalse(this.queue.isEmpty());
              }
          ```
        + Kết quả
        
   + Kiểm thử thêm bỏ phần tử ra hàng đợi `deQueue`
        + Mã lệnh
          ```java
          public void testDequeue() {
                  this.queue.enQueue(5);
                  Assertions.assertEquals(5, this.queue.deQueue());
              }
          ```
        + Kết quả
   + Kiểm thử thêm bỏ phần tử ra hàng đợi rỗng `deQueueWhileEmpty`
        + Mã lệnh
          ```java
          @Test
              public void testDequeueWhileEmpty() {
                  Assertions.assertTrue(this.queue.isEmpty());
                  this.queue.deQueue();
                  Assertions.assertEquals("Error! Dequeue While Empty", this.queue.toString());
              }
          ```
        + Kết quả     