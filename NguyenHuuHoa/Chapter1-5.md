Bài 5:

Hình 1:

a) Vòng lặp cần phải sửa thành:
for (int i = x.length - 1; i >= 0; i--)

để có thể kiểm tra phần thử cuối cùng của mảng

b) Khi đầu vào của hàm là mảng null => chưa chạy được hàm và trả về NullPointerException

    Input: x = null, y = 1
    Expected: NullPointerException
    Actual: NullPointerException
    
c) Khi mà phần tử y cần tìm kiếm nằm ở sau vị trí đầu tiên thì chương trình không có lỗi.
Hoặc chương trình đầu vào x = []

    Input: x = [1, 2, 3], y = 2
    Expected: 1
    Actual: 1
    
d) Khi mà đầu vào phần tử cần tìm kiếm không nằm trong mảng.

    Input: x = [1, 2, 3], y = 5
    Expected: -1
    Actual: -1

e) Khi mà phần tử cần tìm kiếm nằm ở vị trí đầu tiên

    Input: x = [1, 2, 3], y = 1
    Expected: 0
    Actual: -1
    
f) Giống phần (a)

Hình 2:

a) Vòng lặp cần phải sửa thành:
for (int i = x.length - 1; i >= 0; i--)

b) Khi đầu vào của hàm là mảng null => chưa chạy được hàm và trả về NullPointerException

    Input: x = null
    Expected: NullPointerException
    Actual: NullPointerException
    
c) Khi mà độ dài của mảng đầu vào là 0 hoặc 1 (phần tử trong mảng khác 0) thì sẽ không có error xảy ra

    Input: x = [2] || x = []
    Expected: -1
    Actual: -1
    
d) Em nghĩ không có trường hợp xảy ra error

e) Khi mà trong mảng đầu vào của hàm, phần tử với index = 0 có giá trị bằng 0 và trong mảng có 1 vị trí nữa có giá trị bằng 0. Khi đó hàm sẽ dừng lại ngay tại vị trí đầu tiên

    Input: x = [0, 2, 0]
    Expected: 2
    Actual: 0

f) Giống phần (a)

Hình 3:

a) Điều kiện kiểm tra giá trị dương cần sửa thành:
if(xp[i] > 0)

b) Khi đầu vào của hàm là mảng null => chưa chạy được hàm và trả về NullPointerException

    Input: x = null
    Expected: NullPointerException
    Actual: NullPointerException
    
c) Nếu trong mảng đầu vào không có giá trị nào bằng 0

    Input: x = [1, 2, 3]
    Expected: 3
    Actual: 3
    
d) Với chương trình đề bài cho thì mọi giá trị đầu vào thì kết quả có thể là error hoặc failure

e) Khi mà trong mảng đầu vào của hàm có 1 phần tử bằng 0


    Input: x = [0, -2, 3, 2]
    Expected: 2
    Actual: 3
    
f) Giống phần (a)

Hình 4:

a) Điều kiện kiểm tra giá trị cần phải bổ sung trường hợp số âm
if (x[i]%2 === - 1 || x[i] > 0)

b) Khi đầu vào của hàm là mảng null => chưa chạy được hàm và trả về NullPointerException


    Input: x = null
    Expected: NullPointerException
    Actual: NullPointerException
    
c) Nếu trong mảng đầu vào không có giá trị nào âm


    Input: x = [1, 2, 3]
    Expected: 3
    Actual: 3
    
d) Với chương trình đề bài cho thì mọi giá trị đầu vào thì kết quả có thể là error hoặc failure

e) Khi mà trong mảng đầu vào của hàm có 1 phần tử lẻ và có giá trị âm



    Input: x = [-1, 0, -2, 3, 2]
    Expected: 2
    Actual: 1
   
f) Giống phần (a)