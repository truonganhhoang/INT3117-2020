Lệnh kiểm thử JUnit cho lệnh *sort()* có một lỗi cú pháp. Tìm ra lỗi và mô tả nó dưới mô hình RIPR

![image](https://user-images.githubusercontent.com/48431650/93707461-00a9a380-fb59-11ea-9ed0-d4208eeafa88.png)

*	Sự kiểm định chỉ kiểm tra một phần nhỏ của trạng thái cuối cùng (phần tử đầu tiên trong danh sách). Vì vậy, nếu một lần kiểm thử khiến cho khiếm khuyết bị lây nhiểm, và sau đó lan truyền đến một phần khác của trạng thái cuối cùng, thì lỗi sẽ không được tiết lộ. Lệnh kiểm thử cần xem xét toàn bộ danh sách.
