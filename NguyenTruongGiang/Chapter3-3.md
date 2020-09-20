 # 3. Develop JUnit tests for the BoundedQueue class. A compilable version is available on the book website in the file BoundedQueue.java. Make sure your tests check every method, but we will not evaluate the quality of your test designs and do not expect you to satisfy any test criteria. Turn in a printout of your JUnit tests and either a printout or a screen shot showing the results of each test.

```java

   import org.junit.jupiter.api.*;
   
   public class BoundedQueueTest {
       private BoundedQueue queue;
   
       @BeforeEach
       public void setUpBeforeTest() {
           this.queue = new BoundedQueue(5);
       }
   
       @Test
       public void testEmptyQueue() {
           Assertions.assertTrue(this.queue.isEmpty());
           Object o = 1;
           this.queue.enQueue(o);
           Assertions.assertFalse(this,queue.isEmpty());
       }
   
       @Test
       public void testEnQueue() {
           Object o1 = 1;
           Object o2 = 2;
           this.queue.enQueue(o1);
           Assertions.assertEquals(this.queue.toString(), "[1]");
           this.queue.enQueue(o2);
           Assertions.assertEquals(this.queue.toString(), "[1, 2]");
       }
   
       @Test
       public void testDeQueue() {
           Object o1 = 1;
           Object o2 = 2;
           this.queue.enQueue(o1);
           this.queue.enQueue(o2);
           this.queue.deQueue();
   
           Assertions.assertEquals(this.queue.toString(), "[2]");
       }
   
       @Test
       public void testIsFull() {
           Object a = 1;
           Assertions.assertTrue(this.queue.isFull());
           for(int i=0;i<5;i++){
               this.queue.enQuere(a);
               Assertions.assertFalse(this.queue.isFull());
           }
       }
   
       @Test
       public void testToString() {
           Object o1 = 5;
           Object o2 = 4;
           Object o3 = 3;
           this.queue.enQueue(o1);
           this.queue.enQueue(o2);
           this.queue.enQueue(o3);
   
           Assertions.assertEquals(this.queue.toString(), "[5, 4, 3]");
       }
   }
   
```