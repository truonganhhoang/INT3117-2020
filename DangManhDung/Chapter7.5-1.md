Cho lớp **BoundQueue2**

        // Introduction to Software Testing
        // Authors: Paul Ammann & Jeff Offutt
        // Chapter 7, page ??
        // No JUnit tests at this time

        public class BoundedQueue2
        { 
           // Overview:  a BoundedQueue2 is a mutable, bounded FIFO data structure
           // of fixed size , with size being fixed at 2.
           // A typical Queue is [], [o1], or [o1, o2], where neither o1 nor o2
           // are ever null.  Older elements are listed before newer ones.

           private final Object[] elements;
           private int size, front, back;
           private final int CAPACITY = 2;

           public BoundedQueue2 ()
           {
              elements = new Object [CAPACITY];
              size  = 0; front = 0; back  = 0;
           }

           public void enQueue (Object o)
              throws NullPointerException, IllegalStateException
           {  // Modifies: this
              // Effects:   If argument is null throw NullPointerException
              // else if this is full, throw IllegalStateException,
              // else make o the newest element of this
              if (o == null)
                 throw new NullPointerException ("BoundedQueue2.enQueue");
              else if (size == CAPACITY)
                 throw new IllegalStateException ("BoundedQueue2.enQueue");
              else
              {
                 size++;
                 elements [back] = o;
                 back = (back+1) % CAPACITY;
              }
           }

           public Object deQueue () throws IllegalStateException
           {  // Modifies: this
              // Effects:   If queue is empty, throw IllegalStateException,
              // else remove and return oldest element of this

              if (size == 0)
                 throw new IllegalStateException ("BoundedQueue2.deQueue");
              else
              {
                 size--;
                 Object o = elements [ (front % CAPACITY) ];
                 elements [front] = null;
                 front = (front+1) % CAPACITY;
                 return o;
              }
           }

           public boolean isEmpty()
           { 
              return (size == 0); 
           }
           public boolean isFull() 
           { 
              return (size == CAPACITY); 
           }

           public String toString()
           {
              String result = "[";
              for (int i = 0; i < size; i++)
              {
                 result += elements[ (front + i) % CAPACITY ] . toString();
                 if (i < size -1) {
                    result += ", ";
                 }
              }
              result += "]";
              return result;
           }

        }

(a) Có bốn giá trị hữu dụng cho tham số *elements*. Liệt kê chúng.
* [null, null], [obj, null], [null, obj], [obj, obj]

(b) Có bao nhiêu trạng thái?
* |elements| x |size| x |front| x |back| = 4x3x2x2 = 48 trạng thái

(c) Có bao nhiêu trạng thái tới được?
* [].0.1.1
* [].0.0.0
* [obj].1.0.1
* [obj].1.1.0
* [obj,obj].2.0.0
* [obj,obj].2.1.1

(d) Vẽ để thể hiện các trạng thái tới được



(f) Thiết lập một bộ kiểm thử đạt được bao hàm cạnh.

        Queue q = new Queue();
        Object obj = new Object();
        q.enqueue(obj);
        q.enqueue(obj);
        q.dequeue();
        q.enqueue(obj);
        q.dequeue();
        q.dequeue();
        q.enqueue(obj);
        q.dequeue();
