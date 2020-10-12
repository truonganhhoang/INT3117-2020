1. Use the class BoundedQueue2 for questions a–f below. A
compilable version is available on the book website in the file
BoundedQueue2.java. The queue is managed in the usual
circular fashion.
Suppose we build an FSM where states are defined by the
representation variables of BoundedQueue2. That is, a state is a 4-
tuple defined by the values for [elements, size, front, back]. For
example, the initial state has the value [[null, null], 0, 0, 0], and the
state that results from pushing an object obj onto the queue in its
initial state is [[obj, null], 1, 0, 1].
(a) We do not care which specific objects are in the queue.
Consequently, there are really just four useful values for the
variable elements. What are they?
(b) How many states are there?
(c) How many of these states are reachable ?
(d) Show the reachable states in a drawing.
(e) Add edges for the enQueue() and deQueue() methods. (For
this assignment, ignore the exceptional returns, although you
should observe that when exceptional returns are taken, none ofthe instance variables are modified.)
(f) Define a small test set that achieves Edge Coverage. Implement
and execute this test set. You might find it helps to write a
method that shows the internal variables at each call.

(a)
They are :[null, null],[obj, null],[null, obj],[obj, obj].

(b) There are 48 states.

(c) There are 6 states reachable.

(d)

