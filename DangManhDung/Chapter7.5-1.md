Cho lớp **BoundQueue2**



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
