Bài 5:

Hình 1:

a) Sửa vòng lặp thành: for (int i = x.length - 1; i >= 0; i--) để nó xét đến phần tử cuối cùng của mảng

b) Khi đầu vào của hàm là mảng null, hàm sẽ chưa chạy được, nó sẽ trả về NullPointerException

    Đầu vào: x = null, y = 1
    Kết quả dự kiến: NullPointerException
    Kết quả thực tế: NullPointerException
    
c) Khi y cần tìm ở sau vị trí đầu tiên thì chương trình không có lỗi.
Hoặc chương trình đầu vào x = []

    Đầu vào: x = [1, 2, 3], y = 2
    Kết quả dự kiến: 1
    Kết quả thực tế: 1
    
d) Khi phần tử cần tìm không trong mảng đầu vào.

    Đầu vào: x = [1, 2, 3], y = 5
    Kết quả dự kiến: -1
    Kết quả thực tế: -1

e) Khi phần tử cần tìm nằm ở vị trí đầu

    Đầu vào: x = [1, 2, 3], y = 1
    Kết quả dự kiến: 0
    Kết quả thực tế: -1
    
f) Tương tự (a)

Hình 2:

a) Sửa vòng lặp thành: for (int i = x.length - 1; i >= 0; i--)

b) Khi đầu vào của hàm là mảng null, hàm chưa chạy được, nó sẽ trả về NullPointerException

    Đầu vào: x = null
    Kết quả dự kiến: NullPointerException
    Kết quả thực tế: NullPointerException
    
c) Khi độ dài của mảng đầu vào là 0 hoặc 1 (phần tử trong mảng khác 0) thì sẽ không có errors

    Đầu vào: x = [2] || x = []
    Kết quả dự kiến: -1
    Kết quả thực tế: -1
    
d) Không có trường hợp xuất hiện error.

e) Khi trong mảng đầu vào của hàm, phần tử với i = 0 có giá trị 0 và trong mảng có cũng có 1 vị trí có giá trị 0, hàm sẽ dừng lại tại vị trí đầu tiên

    Đầu vào: x = [0, 2, 0]
    Kết quả dự kiến: 2
    Kết quả thực tế: 0

f) Tương tự (a)

Hình 3:

a) Điều kiện kiểm tra giá trị dương cần sửa thành: if(xp[i] > 0)

b) Khi đầu vào của hàm là mảng null thì hàm chưa chạy được, nó sẽ trả trả về NullPointerException

    Đầu vào: x = null
    Kết quả dự kiến: NullPointerException
    Kết quả thực tế: NullPointerException
    
c) Nếu trong mảng đầu vào không có giá trị bằng 0

   Đầu vào: x = [1, 2, 3]
   Kết quả dự kiến: 3
   Kết quả thực tế: 3
    
d) Với chương trình đề bài cho thì với mọi giá trị đầu vào thì kết quả có thể xuất hiện error hoặc failure

e) Khi mà trong mảng đầu vào của hàm có 1 phần tử bằng 0

    Đầu vào: x = [0, -2, 3, 2]
    Kết quả dự kiến: 2
    Kết quả thực tế: 3
    
f) Tương tự (a)

Hình 4:

a) Điều kiện kiểm tra giá trị cần xét trường hợp xuất hiện số âm: if (x[i]%2 === - 1 || x[i] > 0)

b) Khi đầu vào của hàm là mảng null, hàm sẽ chưa chạy được, nó sẽ trả về NullPointerException
    Đầu vào: x = null
    Kết quả dự kiến: NullPointerException
    Kết quả thực tế: NullPointerException
    
c) Nếu trong mảng đầu vào không có giá trị nào âm
    Đầu vào: x = [1, 2, 3]
    Kết quả dự kiến: 3
    Kết quả thực tế: 3
    
d) Với chương trình đề bài cho thì mọi giá trị đầu vào thì kết quả có thể là error hoặc failure

e) Khi trong mảng đầu vào của hàm có 1 phần tử với i lẻ và có giá trị âm
    Đầu vào: x = [-1, 0, -2, 3, 2]
    Kết quả dự kiến: 2
    Kết quả thực tế: 1
   
f) Tương tự (a)