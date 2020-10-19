# Use the following program fragment for questions a–e below.
Use the following test inputs:
t1 = f1 (0, 0)
t2 = f1 (1, 1)
t3 = f1 (0, 1)
t4 = f1 (3, 2)
t5 = f1 (3, 4)
* (a) Draw the call graph for this program fragment.

* (b) Give the path in the graph followed by each test.

* (c) Find a minimal test set that achieves Node Coverage.

* (d) Find a minimal test set that achieves Edge Coverage.

* (e) Give the prime paths in the graph. Which prime path is not covered by any of the tests above?

# Trả lời:
* (a) Link đồ thị: <https://github.com/duongminhhieu16/CodeKiemThu>.

* (b) Đường đi ứng với mỗi ca kiểm thử:
t1: [f1, f3, f5, f6].
t2: [f1, f3, f4, f6].
t3: [f1, f2].
t4: [f1, f3, f4, f6].
t5: [f1, f2, f3, f4, f6].

* (c) Bao phủ nút: {t1, t2, t3} hoặc {t1, t3, t4} hoặc {t1, t5}.

* (d) Bao phủ cạnh: {t1, t5}.

* (e) Có 4 đường đi chính: {[f1, f2, f3, f4, f6], [f1, f2, f3, f5, f6], [f1, f3, f4, f6], [f1, f3, f5, f6]}. Đường [f1, f2, f3, f5, f6] không được bao phủ bởi các ca kiểm thử dã cho.