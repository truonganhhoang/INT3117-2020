#### Exercise 6:
```java
public class BoundedQueue
{
   // Overview: a BoundedQueue is a mutable, boundedFIFO data structure
   // of fixed size , with size being set in theconstructor
   // A typical Queue is [], [o1], or [o1, o2], whereneither o1 nor o2
   // are ever null. Older elements are listed beforenewer ones.
   private finalObject[] elements;
   private int size,front, back;
   private finalint capacity;
   
   public BoundedQueue(int capacity){
        if (capacity < 0)
           throw newIllegalArgumentException (“BoundedQueue.constructor”);
                this.capacity = capacity;
                    elements = new Object [capacity];
                    size = 0; front = 0; back = 0;
       
   }
   
   public voidenQueue (Object o){
        throws NullPointerException,IllegalStateException
    // Modifies: this
    // Effects: If argument is null throw NullPointerException
    // else if this is full, throw IllegalStateException,
    // else make o the newest element of this
        if (o == null)
            throw newNullPointerException (“BoundedQueue.enQueue”);
        else if (size == capacity)
            throw newIllegalStateException (“BoundedQueue.enQueue”);
        else {
            size++;
            elements [back] = o;
            back = (back+1) % capacity;
        }
    }

   public Object deQueue ()throws IllegalStateException{ 
    // Modifies: this
    // Effects: If queue is empty, throw IllegalStateException,
    // else remove and return oldest element of this
        if (size == 0)
            throw newIllegalStateException (“BoundedQueue.deQueue”);
        else {
           size–;
           Object o = elements [ (front % capacity) ];
           elements [front] = null;
           front = (front+1) % capacity;
           return o;
        }
    }

   public booleanisEmpty(){
        return (size == 0);
    }

   public booleanisFull(){
        return (size == capacity);
   }
}
```
