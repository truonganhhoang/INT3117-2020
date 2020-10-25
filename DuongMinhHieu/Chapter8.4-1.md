# Consider the `remove()` method from the Java `Iterator` interface. The `remove()` method has a complex precondition on the state of the `Iterator`, and the programmer can choose to detect violations of the precondition and report them as `IllegalStateException`.

* (a) Formalize the precondition.

* (b) Find (or write) an implementation of an `Iterator`. The Java Collection classes are a good place to search.

* (c) Develop and run CACC tests on the implementation.

* (a) Tiền điều kiện: Hàm `next()` phải được gọi trước đó và hàm `remove()` chưa được gọi từ lúc đó, `Iterator` chưa bị thay đổi trong khi duyệt trừ lần gọi tới `remove()`. Nếu `remove()` đã được gọi ngay sau lần cuối của `next()` hoặc chưa gọi `next()` thì `@ throws IllegalStateException`. `@throws UnsupportedOperationException` nếu iterator không cho phép.

* (b) + (c) Link code: <https://github.com/duongminhhieu16/CodeKiemThu>.