1, Đưa ra một bộ kiểm thử tối thiểu đáp ứng tất cả các phạm vi phủ. 
Sử dụng các ca kiểm thử đã cho.

Bảng liệt kê tất cả đường dẫn kiểm thử:

  | Đường dẫn | t1 | t2 | t3 | t4 | t5 | t6 | t7 | t8 |
  | --------- | -- | -- | -- | -- | -- | -- | -- | -- |
  | [2,3,4,5,6,7,9] | + |  |  |  |  |  |  |  |
  | [2,3,4,5,6,10] |  | + |  |  |  |  |  |  |
  | [2,3,4,5,6,7,8,10] |  |  | + |  |  |  |  |  |
  | [2,3,4,10] |  |  |  | + |  | + | + | + |
  | [2,3,11] |  |  |  |  | + |  |  |  |
  | [10,3,4,5,6,7,9] |  |  |  |  |  | + |  |  |
  | [10,3,4,5,6,10] |  |  |  |  |  |  | + |  |
  | [10,3,4,5,6,7,9,10] |  |  |  |  |  |  |  | + |
  | [10,3,4,10] |  |  |  | + |  |  |  |  |
  | [10,3,11] | + | + | + |  |  | + | + | + |

- Đối với bao phủ mọi định nghĩa, chúng ta cần chạy qua một đường dẫn du bắt đầu bằng 2 và một đường dẫn bắt đầu bằng 10.
- Như vậy, có 7 tập bao phủ tối thiếu.

2, Chỉ ra một tập kiểm thử tối thiểu thỏa mãn tất cả bao phủ sử dụng (uses path).

- Để sắp xếp 1 đường dẫn liên kết từ 2 đến 9 ta cần sử dụng `t1`
- Tương tự ta có
  - Đường dẫn với liên kết từ 2 đến 11 cần qua `t5`.
  - Đường dẫn từ 10 đến 9 thì cần kết nối qua `t6`.
- Bộ kiểm thử này cũng hợp lý nếu ta dẫn 2 vs 10 và 10 với 11.
- Liên kết còn thiếu từ 10 đến 10, `w` được dẫn bởi `t4`, `t7`, `t8`.
- Như vậy có 3 đường dẫn tối thiểu là 3 bộ sau: 
  - `{t1, t4, t5, t6}`
  - `{t1, t5, t6, t7}`
  - `{t1, t5, t6, t8}`
  
3, Chỉ ra một tập kiểm thử tối thiểu thỏa mãn tiêu chuẩn phủ tất cả các đường dẫn cạnh (du-paths)

Từ bảng đầu tiên ta có thể thấy, những cao kiểm thử đặc trưng bởi đường dẫn du.
Như vậy, tập ta cần tìm: `{t1, t2, t3, t4, t5, t6, t7, t8}`