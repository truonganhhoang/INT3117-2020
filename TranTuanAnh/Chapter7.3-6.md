# Chapter 7.3-6
**Use the method `fmtRewrap()` for questions a–e below. A compilable version is available on the book website in the file `FmtRewrap.java`. A line numbered version suitable for this exercise is available on the book website in the file FmtRewrap.num.**

`(a)` **Draw the control flow graph for the `fmtRewrap()` method.**

`(b)` **For `fmtRewrap()`, find a test case such that the corresponding test path visits the edge that connects the beginning of the while statement to the `S = new String(SArr) + CR`; statement without going through the body of the while loop.**

Chỉ có một ca kiểm thử thực hiện được vì xâu `S` rỗng.<br/>
Đường dẫn là `[1, 2, 19]`.

`(c)` **List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage.**

- Node Coverage: <br/>`{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}`.
- Edge Coverage: <br/>
`{(1,2), (2,3), (2,19), (3,4), (3,5), (4,10), (5,6), (5,7), (6,10), (7,8), (7,9), (8,10), (9,10), (10,11), (10,12), (10,13), (10,16), (10,17), (11,18), (12,18), (13,14), (13,15), (14,18), (15,18), (16,17), (17,18), (18,2)}`.

`(d)` **List test paths that achieve Node Coverage but not Edge Coverage on the graph.**

Danh sách kiểm thử bao gồm các test path đi qua tất cả các node và không đi qua cạnh `[10, 17]`

`(e)` **List test paths that achieve Edge Coverage but not Prime Path Coverage on the graph.**
 
Danh sách kiểm thử bao gồm các test path đi qua tất cả các cạnh và không đi qua đường `[1,2,3,5,7,8,10,16,17,18]`