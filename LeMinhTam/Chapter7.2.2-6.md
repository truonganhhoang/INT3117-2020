# 6.Trả lời câu hỏi a-c cho biểu đồ trong hình 2.2
a. Liệt kê các yêu cầu kiểm thử cho Node Coverage, Edge Coverage và Prime
   Phạm vi đường dẫn trên biểu đồ.
- `TR(NC)` = {n0, n1, n2, n3, n4, n5, n6, n7, n8, n9}
- `TR(EC)` = {(n0, n3), (n0, n4), (n1, n4), (n2, n5), (n2, n6), (n3, n7), (n4, n7), (n4, n8),
   (n5, n1), (n5, n9), (n6, n9), (n8, n5) }
- `TR(PPC)` = { [n0, n3, n7], [n0, n4, n7], [n0, n4, n8, n5, n1], [n0, n4, n8, n5, n9], [n1, n4, n8, n5, n1],
   [n1, n4, n8, n5, n9], [n2, n5, n1, n4, n7], [n2, n5, n1, n4, n8], [n2, n5, n9], [n2, n6, n9], [n4, n8, n5, n1, n4],
   [n5, n1, n4, n8, n5], [n8, n5, n1, n4, n7], [n8, n5, n1, n4, n8] }

b. Liệt kê các đường dẫn kiểm thử đạt được Bao phủ nút nhưng không đạt được Bao phủ cạnh trên đồ thị.

`T(NC)` = {[n0, n3, n7], [n1, n4, n8, n5, n9], [n2, n6, n9]}

c. Liệt kê các đường dẫn kiểm thử đạt được Bao phủ cạnh nhưng không đạt được Bao phủ Đường dẫn chính trên đồ thị.

`T(EC)` = `T(NC)` ∪ {[n0, n4, n7], [n2, n5, n1, n4, n7], } 
Các đường dẫn sau:
- [n0, n4, n8, n5, n1]
- [n1, n4, n8, n5, n1]
- [n2, n5, n1, n4, n8]
- [n2, n5, n9]
- [n4, n8, n5, n1, n4]
- [n5, n1, n4, n8, n5]
- [n8, n5, n1, n4, n7]
- [n8, n5, n1, n4, n8].
