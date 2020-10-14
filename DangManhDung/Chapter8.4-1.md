Dùng phương thức **remove()** trong giao diện **Iterator**.

(a) Nêu ra điều kiện đầu

* Gọi mỗi lệnh gọi trong đối tượng là c1,c2,... mà mỗi ci là **next()**, **hasNext()**, **remove()**.
* Điều kiện đầu để cn là **remove()** là:

		forall i which ci == next() and forall j which i<j<n that cj is not remove()

(b) Tìm một cách áp dụng **Iterator**

* Mọi áp dụng của giao diện **Collection** đều mang một phương thức **iterator()**