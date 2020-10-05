#### Exercise 5:
- Vấn đề là phải làm gì với các mẫu trống - một trường hợp dễ xảy ra đối với các mô hình miền đầu vào dựa trên giao diện, vì chuỗi rỗng là trường hợp đặc biệt tiêu chuẩn cho các kiểu chuỗi. Như đã viết, đặc tả hoàn toàn không giải quyết các mẫu trống - chúng ở khắp mọi nơi hay không ở đâu?
- Các chủ thể trống là một vấn đề khác - đặc tả có cách diễn giải tự nhiên cho các chủ thể trống trong đó các mẫu không bao giờ được tìm thấy trong các chủ thể trống. Các bài kiểm tra JUnit trong PatternIndexTest.java giải quyết trường hợp của chủ đề trống.
Việc triển khai không đạt yêu cầu như đã viết, vì kết quả là một ngoại lệ phàn nàn về chỉ số nằm ngoài giới hạn, tuy nhiên người gọi không cung cấp bất kỳ chỉ số nào.
- Một giải pháp tốt là sửa đổi thông số kỹ thuật để loại bỏ rõ ràng các mẫu trống với cơ chế ngoại lệ:
```
@throws IllegalArgumentException nếu mẫu trống
```
- Để việc triển khai phù hợp, nó cần kiểm tra rõ ràng cho một mẫu trống, cùng với một mệnh đề ném rõ ràng:
```java
if (patternLen == 0) ném IllegalArgumentException mới ("PatternIndex.patternIndex");
```
- Cuối cùng, một trường hợp thử nghiệm sẽ được thêm vào `PatternIndexTest.java ` gọi     `patternIndex ()`
với một mẫu trống và tìm kiếm ngoại lệ này.
- Là một con trỏ chuyển tiếp, phương thức `patternIndex () `phải chịu sự giám sát đáng kể trong chương kiểm tra đồ thị. Tuy nhiên, các thử nghiệm kết quả không phát hiện ra điều bất thường này.