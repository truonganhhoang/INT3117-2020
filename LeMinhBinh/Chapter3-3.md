# Chapter 3-3

> Develop JUnit tests for the ```BoundedQueue``` class. A compilable version is available on the book website in the file ```BoundedQueue.java```. Make sure your tests check every method, but we will not evaluate the quality of your test designs and do not expect you to satisfy any test criteria. Turn in a printout of your JUnit tests and either a printout or a screen shot showing the results of each test.

```java
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

```java
package com.testing.maven.quickstart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoundedQueueTest {

    private BoundedQueue queue;

    @BeforeEach
    public void setUp() {
        this.queue = new BoundedQueue(3);
    }

    @Test
    public void testEmptyQueue() {
        Assertions.assertTrue(this.queue.isEmpty());
    }

    @Test
    public void testEnqueue() {
    String newElement = "Hello World";
    this.queue.enQueue(newElement);
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeue() {
        String newElement = "Hello World";
        this.queue.enQueue(newElement);
        Assertions.assertEquals(newElement, this.queue.deQueue());
    }

    @Test
    public void testFullQueue() {
        String el1, el2, el3;
        el1 = "element1";
        el2 = "element2";
        el3 = "element3 ";

        this.queue.enQueue(el1);
        this.queue.enQueue(el2);
        Assertions.assertFalse(this.queue.isFull());

        this.queue.enQueue(el3);
        Assertions.assertTrue(this.queue.isFull());
    }

    @Test
    public void testToString() {
        String el1, el2, el3;
        el1 = "one";
        el2 = "two";
        el3 = "three";

        this.queue.enQueue(el1);
        this.queue.enQueue(el2);
        this.queue.enQueue(el3);

        Assertions.assertEquals("[one, two, three]", this.queue.toString());
    }
}
```
