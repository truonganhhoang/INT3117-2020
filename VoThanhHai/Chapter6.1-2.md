A tester defined three characteristics based on the input parameter ```car```: **Where Made**, **Energy Source**, and **Size**. The following partitionings for these characteristics have at least two mistakes. Correct them.

Các lỗi tìm được:
- Phần **Where Made**: Chưa đầy đủ, ngoài các khu vực Bắc Mỹ, Châu Âu và Châu Á, các xe có thể được sản xuất tại nhiều nơi khác trên thế giới. <br>
Sửa lại: Có thể thêm các khu vực khác vào **Where Made** hoặc thêm **"Other"** nếu xe được sản xuất ở nơi khác.<br><br>
- Phần **Energy Source**: Chưa đầy đủ, hiện nay trên thế giới, ngoài gas, điện và kết hợp giữa chúng, ô tô có thể chạy bằng nhiều nguyên liệu khác, ví dụ như năng lượng mặt trời, hydrogen, biodiesel, ethanol, propane. <br>
Sửa lại: Có thể thêm các năng lượng còn thiếu vào **Energy Source** hoặc thêm **"Other"**.<br><br>
- Phần **Size**: Các giá trị chưa hợp lý, loại xe ô tô cửa sập (hatchback) có thể có 2 cửa hoặc 4 cửa, không thể đặt "hatch-back", "2-door" và "4-door" ngang hàng với nhau. <br>
Sửa lại: Trong biến **Size** đổi các thuộc tính thành: **"2-door, hatch-back"**; **"4-door, hatch-back"**; **"2-door, no hatch-back"**; **"4-door, no hatch-back"**.<br><br>
