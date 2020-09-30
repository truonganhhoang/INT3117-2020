# Answer the following questions for the method `intersection()` in the book

* (a) Does the partition “Validity of s1” satisfy the completeness property? If not, give a value for s1 that does not fit in any block.
* (b) Does the partition “Validity of s1” satisfy the disjointness property? If not, give a value for s1 that fits in more than one block.
* (c) Does the partition “Relation between s1 and s2” satisfy the completeness property? If not, give a pair of values for s1 and s2 that does not fit in any block.
* (d) Does the partition “Relation between s1 and s2” satisfy the disjointness property? If not, give a pair of values for s1 and s2 that fits in more than one block.
* (e) If the “Base Choice” criterion were applied to the two partitions (exactly as written), how many test requirements would result? 
* (f) Revise the characteristics to eliminate any problems you found.

# Trả lời:
* (a) Cách phân chia theo tính hợp lệ của s1 đã thỏa mãn tính toàn vẹn.

* (b) Cách phân chia theo tính hợp lệ của s1 đã thỏa mãn tính rời rạc.

* (c) Cách phân chia theo quan hệ giữa s1 và s2 chưa thỏa mãn tính toàn vẹn. Ví dụ như `s1 = {1, 2, 3}` và `s2 = {2, 3, 4}`, ta có `s1` và `s2` đều chứa `{2, 3}` nhưng trong đặc trưng quan hệ trên thì không có khối nào thỏa mãn cả.

* (d) Cách phân chia theo quan hệ giữa s1 và s2 chưa thỏa mãn tính rời rạc. Ví dụ ta có `s1 = {1, 2, 3}` và `s2 = {1, 2, 3}`, khi đó `s1 = s2` và `s1` là tập con của `s2` và ngược lại cũng đúng. Do đó trường hợp này nằm trong cả 3 khối.

* (e) Nếu như áp dụng tiêu chuẩn lựa chọn cơ sở (Base Choice criterion) cho 2 cách phân chia theo đúng cách viết trên thì ta có tất cả 12 ca kiểm thử:
* Ta gọi đặc trưng 1 gồm a1, a2, a3; Đặc trưng 2 gồm b1, b2, b3, b4. 
	- Base 1: (a1, b1). Từ đó có các ca kiểm thử: (a1, b2), (a1, b3), (a1, b4), (a2, b1), (a3, b1).
	- Base 2: (a2, b2). Từ đó có các ca kiểm thử: (a2, b3), (a2, b4), (a3, b2).
	- Base 3: (a3, b3). Từ đó có ca kiểm thử: (a3, b4).

* (f) Để loại bỏ các vấn đề mắc phải, ta sẽ sửa đặc trưng quan hệ giữa s1 và s2 thành các đặc trưng con như sau:
	- s1 và s2 đại diện cho cùng một tập: True và False.
	- s1 là tập con của s2: True và False.
	- s2 là tập con của s1: True và False.
	- s1 và s2 giao nhau: True và False.