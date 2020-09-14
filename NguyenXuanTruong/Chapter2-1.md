# Exercises 1:
- Thất bại(Failure) là 1 sự kiện bên ngoài không chính xác, Lỗi (Fault) là sự cố bên trong code
- Xét 1 ví dụ đơn giản: Viết 1 hàm tính giá trị gấp đôi của 1 số cho trước
```
1. int double (int num) {
2.   int result;
3.   result = num * num;
4.   return result;
5. }
```
- Gọi hàm double(3) cho kết quả = 9, tuy nhiên kết quả chúng ta mong đợi là 6
Như vậy, kết quả 9 là 1 thất bại (failure)
Nguyên nhân của thất bại (failure) trên là do lỗi (fault) tại dòng 3. result = num * num; thay vì result = num * 2; 
Testing là quá trình cố gắng tìm và hiển thị ra các thất bại Failure. 
Debugging là quá trình cố gắng tìm ra Fault