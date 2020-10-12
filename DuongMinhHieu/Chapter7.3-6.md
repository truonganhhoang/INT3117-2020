# Use the method `fmtRewrap()` for questions a–e below. A compilable version is available on the book website in the file FmtRewrap.java. A line numbered version suitable for this exercise is available on the book website in the file FmtRewrap.num.
* (a) Draw the control flow graph for the `fmtRewrap()` method.
* (b) For `fmtRewrap()`, find a test case such that the corresponding test path visits the edge that connects the beginning of the while statement to the `S = new String(SArr) + CR`; statement without going through the body of the while loop.
* (c) List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage.
* (d) List test paths that achieve Node Coverage but not Edge Coverage on the graph.
* (e) List test paths that achieve Edge Coverage but not Prime Path Coverage on the graph.

# Trả lời:
* (a) Link đồ thị: <https://github.com/duongminhhieu16/CodeKiemThu>.

* (b) Trường hợp mà `fmtRewrap()` không đi vào trong vòng lặp `while()` là trường hợp chuỗi S rỗng. Khi đó `i = S.length` do đó đi thẳng tới nút 19 luôn. Đường đi là [1, 2, 19].

* (c) Các yêu cầu kiểm thử cho:
	* Bao phủ nút: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}.
	* Bao phủ cạnh: {(1, 2), (2, 3), (2, 19), (3, 4), (3, 5), (4, 10), (5, 6), (5, 7), (6, 10), (7, 8), (7, 9), (8, 10), (9, 10), (10, 11), (10, 12), (10, 13), (10, 16), (10, 17), (11, 18), (12, 18), (13, 14), (13, 15), (14, 18), (15, 18), (16, 17), (17, 18), (18, 2)}.
	* Bao phủ đường đi chính: Có rất nhiều đường đi chính nên em dùng tool để liệt kê ở link: <https://cs.gmu.edu:8443/offutt/coverage/GraphCoverage?edges=1+2%0D%0A2+3%0D%0A2+19%0D%0A3+4%0D%0A3+5%0D%0A4+10%0D%0A5+6%0D%0A5+7%0D%0A6+10%0D%0A7+8%0D%0A7+9%0D%0A8+10%0D%0A9+10%0D%0A10+11%0D%0A10+12%0D%0A10+13%0D%0A10+16%0D%0A10+17%0D%0A11+18%0D%0A12+18%0D%0A13+14%0D%0A13+15%0D%0A14+18%0D%0A15+18%0D%0A16+17%0D%0A17+18%0D%0A18+2%0D%0A&initialNode=1&endNode=19&action=Prime%20Paths>.

* (d) Các đường kiểm thử thỏa mãn bao phủ nút nhưng không thỏa mãn bao phủ cạnh:
[1,2,3,5,6,10,17,18,2,19],
[1,2,3,5,7,9,10,17,18,2,19],
[1,2,3,5,7,8,10,17,18,2,19],
[1,2,3,4,10,11,18,2,19],
[1,2,3,4,10,12,18,2,19],
[1,2,3,4,10,16,17,18,2,19]
[1,2,3,4,10,13,15,18,2,19],
[1,2,3,4,10,13,14,18,2,19].

* (e) Đường kiểm thử thỏa mãn bao phủ cạnh nhưng không thỏa mãn bao phủ đường đi chính là:
[1,2,3,4,10,11,18,2,19],
[1,2,3,5,6,10,17,18,2,19].