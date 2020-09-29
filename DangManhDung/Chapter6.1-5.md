Cho bộ bài toán tìm một sâu mẫu trong một sâu chủ thể. Một cách để triển khai với chỉ dẫn là **PatternIndex.java**. Hãy tìm ra đầu vào có vấn đề, hoàn thiện chỉ dẫn, chỉnh sửa cách triển khai để khớp với chỉ dẫn đã được sửa.

* Phần có vấn đề là phải làm gì với các mẫu trống - một trường hợp dễ xảy ra đối với mô hình miền đầu vào dựa trên giao diện, vì sâu rỗng là trường hợp đặc biệt thường có cho kiểu sâu. Như đã nói, chỉ dẫn hoàn toàn không tính tới các mẫu trống.

   Việc triển khai không đạt yêu cầu như đã viết, vì kết quả là ngoại lệ phát hiện chỉ số nằm ngoài giới hạn, nhưng người gọi không cung cấp bất kỳ chỉ số nào.

   Một cách để sửa chỉ dẫn là loại bỏ rõ ràng các mẫu rỗng với cơ chế ngoại lệ:
   
      @throws IllegalArgumentException if pattern is empty
    
   Để cho cách triển khai được khớp, nó cần kiểm tra rõ ràng các mẫu trống, cung với một lệnh *throw* rõ ràng:
   
      if (patternLen == 0) throw new IllegalArgumentException("PatternIndex.patternIndex");
      
   **PatternIndex.java** nên được thêm một ca kiểm thử là **patternIndex()** với một mẫu rỗng để tìm ngoại lệ này.
