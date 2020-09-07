**2. Đâu là điểm khác biệt giữa lỗi phần mềm (software fault) và khuyết điểm phần mềm (software failure)**
#
- Lỗi phần mềm (software fault) là các lỗi tĩnh bên trong chương trình, có thể hiểu như là gốc rễ gây ra việc chương trình chạy sai với mong muốn, là các sai sót trong mã nguồn, hay mã biên dịch của chương trình

- Khuyết điểm phần mềm (Software failure) là lỗi nằm bên ngoài chương trình. Lỗi này xảy ra khi chương trình chạy, kết quả của việc chạy chương trình khác với mô tả ban đầu của người dùng

- Ví dụ:
Ta có đoạn code sau
```
public static int numZero (int[] arr)
{ // Effects: If arr is null throw NullPointerException
// else return the number of occurrences of 0 in arr
int count = 0;
for (int i = 1; i < arr.length; i++)
if (arr[i] == 0)
count++;
return count;
}
```
- Lỗi (Fault): `i = 1` [bắt đầu quá trình tìm kiếm phải bằng 0 chứ không phải bằng 1]
- Khuyết điểm (Failure) Xảy ra khi `arr.length > 0` và `arr[0] = 0` 
