Question
```
(a) We do not care which specific objects are in the queue. Consequently, there are really just four useful values for the variable elements. What are they?
(b) How many states are there?
(c) How many of these states are reachable ?
(d) Show the reachable states in a drawing.
(e) Add edges for the enQueue() and deQueue() methods. (For this assignment, ignore the exceptional returns, although you should observe that when exceptional returns are taken, none of
the instance variables are modified.)
(f) Define a small test set that achieves Edge Coverage. Implement and execute this test set. You might find it helps to write a method that shows the internal variables at each call. 
```

Answer
```
(a)
The four values for elements are [null, null], [obj, null], [null, obj] and [obj, obj], [obj, null] and [ull, obj] are different at the representation level.

(b)
The number of states = Element * size * front * back = 4*3*2*2 = 48 (total states).

(c) Of the 48 states, only 6 are reachable.


(d)
The exceptions (enqueue() on full queues and dequeue() on empty queues) as well as observer method. Result in "loop transitions from a state back to itself.

(e)
These are not shown on the diagram for clarity and from a grading perspective, aren't relevant. Labels on nodes show the values of the representation state variables : Elements, size, front and back.
```

(f)
Small test:
```java
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
```