2, What is the difference between software fault and software failure?

Failure là 1 sự kiện bên ngoài không chính xác, Fault là sự cố bên trong code

Xét 1 ví dụ đơn giản: Viết 1 hàm tính giá trị gấp đôi của 1 số cho trước

```java
int double (int num) {
    int result;
    result = num * num;
    return result;
}
```

Gọi hàm double(3) cho kết quả = 9, tuy nhiên kết quả chúng ta mong đợi là 6

Như vậy, kết quả 9 là 1 thất bại (failure)

Nguyên nhân của thất bại (failure) trên là do lỗi (fault) tại dòng 3. result = num * num; thay vì result = num * 2; 
