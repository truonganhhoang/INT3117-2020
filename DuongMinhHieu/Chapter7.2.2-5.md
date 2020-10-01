# Answer questions a–g for the graph defined by the following sets:
N = {1, 2, 3, 4, 5, 6, 7}
N0 = {1}
Nf = {7}
E = {(1, 2), (1, 7), (2, 3), (2, 4), (3, 2), (4, 5), (4, 6), (5, 6), (6, 1)}
Also consider the following (candidate) test paths:
p1 = [1, 2, 4, 5, 6, 1, 7]
p2 = [1, 2, 3, 2, 4, 6, 1, 7]
p3 = [1, 2, 3, 2, 4, 5, 6, 1, 7]

* (a) Draw the graph.
* (b) List the test requirements for Edge-Pair Coverage. (Hint: You should get 12 requirements of length 2.)
* (c) Does the given set of test paths satisfy Edge-Pair Coverage? If not, state what is missing.
* (d) Consider the simple path [3, 2, 4, 5, 6] and test path [1, 2, 3, 2,
4, 6, 1, 2, 4, 5, 6, 1, 7]. Does the test path tour the simple path directly? With a sidetrip? If so, write down the sidetrip.
* (e) List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage on the graph.
* (f) List test paths from the given set that achieve Node Coverage but not Edge Coverage on the graph.
* (g) List test paths from the given set that achieve Edge Coverage but not Prime Path Coverage on the graph.


# Trả lời:

* (a) Link ảnh đồ thị: <https://github.com/duongminhhieu16/CodeKiemThu.git>.

* (b) Yêu cầu kiểm thử cho bao phủ cặp cạnh: TR = {[1, 2, 3], [1, 2, 4], [2, 3, 2], [2, 4, 5], [2, 4, 6], [3, 2, 3], [3, 2, 4], [4, 5, 6], [4, 6, 1], [5, 6, 1], [6, 1, 7], [6, 1, 2]}.

* (c) Tập đường kiểm thử đã cho chưa thỏa mãn bao phủ cặp cạnh vì thiếu cặp cạnh [3, 2, 3] và cặp cạnh [6, 1, 2].

* (d) Có đường đi thường [3, 2, 4, 5, 6] và đường kiểm thử [1, 2, 3, 2, 4, 6, 1, 2, 4, 5, 6, 1, 7]. Đường kiểm thử có đi qua đường đi thường với đường phụ là [4, 6, 1, 2, 4].

* (e) Các yêu cầu kiểm thử cho:
	- Bao phủ nút: TR = {1, 2, 3, 4, 5, 6, 7}
	- Bao phủ cạnh: TR = {(1, 2), (1, 7), (2, 3), (2, 4), (3, 2), (4, 5), (4, 6), (5, 6), (6, 1)}.
	- Bao phủ đường đi chính: TR = {[2, 3, 2], [3, 2, 3], [1, 2, 4, 6, 1], [3, 2, 4, 5, 6, 1, 7], [3, 2, 4, 6, 1, 7], [6, 1, 2, 4, 6], [6, 1, 2, 4, 5, 6], [6, 1, 2, 3]}.
* (f) Các đường kiểm thử trong tập đã cho mà thỏa mãn bao phủ nút nhưng không thỏa mãn bao phủ cạnh là: p3 = [1, 2, 3, 2, 4, 5, 6, 1, 7].

* (g) Các đường kiểm thử trong tập đã cho mà thỏa mãn bao phủ cạnh nhưng không thỏa mãn bao phủ đường đi chính là: p1 = [1, 2, 4, 5, 6, 1, 7] và p2 = [1, 2, 3, 2, 4, 6, 1, 7].