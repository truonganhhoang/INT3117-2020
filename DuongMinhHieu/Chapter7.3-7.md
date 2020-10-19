# Use the method `printPrimes()` for questions a–f below. A compilable version is available on the book website in the file PrintPrimes.java. A line-numbered version suitable for this exercise is available on the book website in the file PrintPrimes.num.
* (a) Draw the control flow graph for the `printPrimes()` method.
* (b) Consider test cases t1 = (n = 3) and t2 = (n = 5). Although these tour the same prime paths in `printPrimes()`, they do not necessarily find the same faults. Design a simple fault that t2 would be more likely to discover than t1 would.
* (c) For `printPrimes()`, find a test case such that the corresponding test path visits the edge that connects the beginning of the while statement to the for statement without going through the body of the while loop.
* (d) List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage.
* (e) List test paths that achieve Node Coverage but not Edge Coverage on the graph.
* (f) List test paths that achieve Edge Coverage but not Prime Path Coverage on the graph.


# Trả lời:
* (a) Link đồ thị: <https://github.com/duongminhhieu16/CodeKiemThu>.

* (b) Nếu sau mỗi vòng lặp `while` ta không tăng `curPrime` lên 1 đơn vị thì với t1 = (n = 3) thì vòng lặp for để tìm ra số nguyên tố vẫn chạy bình thường. Tuy vậy đến với t2 = (n = 5), vòng lặp for sẽ không chạy tới số nguyên tố cần tìm mà trả về luôn.

* (c) Ca kiểm thử mà có đường kiểm thử thăm cạnh nối liền phần bắt đầu vòng lặp while và vòng lặp for mà không đi vào trong thân của vòng while là: [1, 2, 3, 8, 9, 2, 10, 11, 12, 11, 13].

* (d) Các yêu cầu kiểm thử cho:
	* Bao phủ nút: TR = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}.
	* Bao phủ cạnh: TR = {(1, 2), (2, 3), (2, 10), (3, 4), (4, 5), (4, 8), (5, 6), (5, 7), (6, 8), (7, 4), (8, 9), (9, 2), (10, 11), (11, 12), (11, 13), (12, 11)}.
	* Bao phủ đường đi chính: TR = {[1, 2, 3, 4, 5, 7], [1, 2, 3, 4, 5, 6, 8, 9], [2, 3, 4, 5, 6, 8, 9, 2], [4, 5, 7, 4], [4, 5, 6, 8, 4], [2, 10, 11, 13], [11, 12, 11], [12, 11, 12]}.

* (e) Các đường kiểm thử thỏa mãn bao phủ nút nhưng không thỏa mãn bao phủ cạnh là:
[1, 2, 3, 4, 5, 7, 4, 5, 6, 8, 9, 2, 10, 11, 12, 11, 13].

* (f) Đường kiểm thử thỏa mãn bảo phủ cạnh nhưng không thỏa mãn đường đi chính là:
[1, 2, 3, 4, 5, 7, 4, 5, 6, 8, 9, 2, 10, 11, 12, 11, 13].
[1, 2, 3, 4, 8, 9, 2, 10, 11, 13].