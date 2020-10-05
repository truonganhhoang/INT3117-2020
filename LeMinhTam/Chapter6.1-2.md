# 2. Người kiểm tra xác định ba đặc điểm dựa trên xe tham số đầu vào: Nơi sản xuất, Nguồn năng lượng và Kích thước. Việc phân vùng sau đây cho những đặc điểm này có ít nhất hai sai lầm. Chỉnh sửa chúng.
- Bảng tổng hợp các đặc tính bài ra như sau

|  | Where Made |  |
|-------|------------|--------|
| North America | Europe | Asia |
|  | **Energy Source** |  |
| gas | electric | hybrid |
|  | **Size** |  |
| 2-door | 4-door | hatch-back |

- Từ bảng này ta có thể nhận thấy một số lỗi sau
  - Cột **Where Made** chưa hoàn thiện do thực tế có nhiều châu lục hơn, muốn bao phủ hết thì nên cho thêm một cột giá trị `Other`.
  - Cột **Size** có sự trùng lặp, `hatch-back` có thể gây trùng lặp với `4-door` và `2-door`, để làm rõ cần xác định cho nó giá trị ví dụ `2-door hatch-back` và `4-door hatch-back`.
  

