# 2.  Trả lời các câu hỏi a-d cho đồ thị được xác định bởi các tập hợp sau:
- `N` = {0, 1, 2}
- `N0` = {0}
- `Nf` = {2}
- `E` = {(0, 1), (0, 2), (1, 0), (1, 2), (2, 0)}
Cũng xem xét các đường dẫn (ứng cử viên) sau:
17

- `p0` = [0, 1, 2, 0]
- `p1` = [0, 2, 0, 1, 2]
- `p2` = [0, 1, 2, 0, 1, 0, 2]
- `p3` = [1, 2, 0, 2]
- `p4` = [0, 1, 2, 1]

a. Đường dẫn nào được liệt kê là đường dẫn kiểm thử? Giải thích.

- `p1` và `p2` là *đường dẫn thử nghiệm.*
- `p0` *không là đường dẫn thử nghiệm* vì nó không kết thúc tại nút cuối cùng. 
- `p3` *không là đường dẫn thử nghiệm* vì không bắt đầu ở nút gốc. 
- `p4` *không là đường dẫn thử nghiệm* vì nó bao gồm một cạnh không tồn tại trong
đồ thị.

b. Liệt kê tám yêu cầu kiểm thử đối với Bao phủ theo Cặp cạnh (chỉ độ dài hai
   đường dẫn con).

Tám cặp ở đây gồm có:
- [n0, n1, n0]
- [n0, n1, n2]
- [n0, n2, n0]
- [n1, n0, n1]
- [n1, n0, n2]
- [n1, n2, n0]
- [n2, n0, n1]
- [n2, n0, n2]

c. Tập hợp các đường dẫn kiểm thử (phần a) ở trên có đáp ứng Edge-Pair Coverage không? Nếu không,
   xác định những gì còn thiếu

- Không. 
- Cả `p1` và `p2` đều không thăm một trong các cặp cạnh sau:
`{[n1, n0, n1], [n2, n0, n2]}`

d. Xét đường đi gốc [n2, n0, n2] và đường đi `p2`. `P2` có thăm đường gốc không?

Không, `p2` không trực tiếp thăm đường dẫn chính. 
Tuy nhiên, p2 có thăm qua đường dẫn chính với sidetrip `[n0, n1, n0]`.