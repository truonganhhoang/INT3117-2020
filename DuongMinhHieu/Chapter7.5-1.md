# Use the class BoundedQueue2 for questions a–f below. A compilable version is available on the book website in the file BoundedQueue2.java. The queue is managed in the usual circular fashion.
Suppose we build an FSM where states are defined by the representation variables of BoundedQueue2. That is, a state is a 4-tuple defined by the values for [elements, size, front, back]. For example, the initial state has the value [[null, null], 0, 0, 0], and the state that results from pushing an object obj onto the queue in its initial state is [[obj, null], 1, 0, 1].
* (a) We do not care which specific objects are in the queue. Consequently, there are really just four useful values for the variable `elements`. What are they?
* (b) How many states are there?
* (c) How many of these states are reachable?
* (d) Show the reachable states in a drawing.
* (e) Add edges for the enQueue() and deQueue() methods. (For this assignment, ignore the exceptional returns, although you should observe that when exceptional returns are taken, none of the instance variables are modified.)
* (f) Define a small test set that achieves Edge Coverage. Implement and execute this test set. You might find it helps to write a method that shows the internal variables at each call.


# Trả lời:
* (a) 4 giá trị hữu dụng cho biến `elements` là `[null, null]`, `[object, null]`, `[null, object]`, `[object, object]`.

* (b) Có 4 trạng thái tất cả:
	* Trạng thái 1: `[[null, null], 0, 0, 0]` là trạng thái ban đầu.
	* Trạng thái 2: `[[object, null], 1, 0, 1]` khi có 1 `object` được nhập vào.
	* Trạng thái 3: `[[null, object], 1, 1, 0]` khi đã có 1 `object` được nhập từ trước và tiếp theo nhập vào 1 `object = null`.
	* Trạng thái 4: `[[object, object], 2, 1, 1]` khi queue đã được nhập cả 2 `object != null`.

* (c) Chỉ có 3 trạng thái được chạm tới là 1, 2, 4 vì trạng thái 3 khi nhập `object = null` thì sẽ `throw new NullPointerException` nên không đạt được trạng thái này.

* (d) + (e) Link: <https://github.com/duongminhhieu16/CodeKiemThu>.

* (f) Tập kiểm thử thỏa mãn bao phủ cạnh:
t1 = [obj, obj] = [1, 2].