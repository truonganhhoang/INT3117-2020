# Use the following characteristics and blocks for the questions below.
| Characteristics | Block 1 | Block 2 | Block 3 | Block 4 |
|-----------------|---------|---------|---------|---------|
| Value 1 | < 0 | 0 | > 0 |  |
| Value 2 | < 0 | 0 | > 0 |  |
| Operation | + | - | x | : |

* (a) Give tests to satisfy the Each Choice criterion.
* (b) Give tests to satisfy the Base Choice criterion. Assume base choices are Value 1 = > 0, Value 2 = > 0, and Operation = +.
* (c) How many tests are needed to satisfy the All Combinations criterion? (Do not list all the tests.)
* (d) Give tests to satisfy the Pair-Wise Coverage criterion.

# Trả lời:
* (a) Ta có 4 ca kiểm thử theo tiêu chuẩn Mỗi lựa chọn (Each Choice criterion)
(-1, -1, +), (0, 0, -), (1, 1, x), (1, 1, :).

* (b) Theo tiêu chuẩn Lựa chọn cơ sở (Base Choice criterion), ta có các ca kiểm thử:
	- Base: (1, 1, +).
	- Ca kiểm thử sinh ra từ Base: (1, 1, -), (1, 1, x), (1, 1, :), (1, 0, +), (1, -1, +)
(0, 1, +), (-1, 1, +).

* (c) Nếu áp dụng tiêu chuẩn Tất cả tổ hợp thì ta cần 3*3*4 = 36 ca kiểm thử.

* (d) Theo tiêu chuẩn bao phủ Pair-Wise, ta có các ca kiểm thử:
(1, 1, +), (1, 0, -), (1, -1, x),
(0, 1, -), (0, 0, x), (0, -1, :),
(-1, 1, x), (-1, 0, :), (-1, -1, +),
(1, 1, :), (1, 0, +), (1, -1, -).