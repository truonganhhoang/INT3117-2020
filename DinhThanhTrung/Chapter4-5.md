# Câu 5 Sửa một lỗi tĩnh có trong hệ thống
Ta lấy ví dụ với hàm Calc.java
![ScreenShot](https://github.com/trungdinh2k/INT3117-2020/blob/master/DinhThanhTrung/src1.png)<br/>
Thực hiện kiểm thử cho hàm trên và thấy ca kiểm thử testDivideZero thất bại, vậy lỗi xuất hiện ở hàm divide với lỗi chia một số cho 0.<br/>
![ScreenShot](https://github.com/trungdinh2k/INT3117-2020/blob/master/DinhThanhTrung/test1.png)<br/>
Vì vậy ta sửa lại hại divide bằng cách thêm phần xử lí cho ngoại lệ chia cho 0:<br/>
![ScreenShot](https://github.com/trungdinh2k/INT3117-2020/blob/master/DinhThanhTrung/src2.png)<br/>
Sau đó ta thực hiện kiểm thử lại và tất cả các ca kiểm thử đều thành công.
![ScreenShot](https://github.com/trungdinh2k/INT3117-2020/blob/master/DinhThanhTrung/test2.png)<br/>
