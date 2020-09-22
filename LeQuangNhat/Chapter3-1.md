# Why do testers automate tests? What are the limitations of automation?

- Tự động hoá công việc kiểm thử là một cách hiệu quả để giảm bớt khối lượng công việc sinh bộ kiểm thử cho kiểm thử viên. Trường hợp hữu ích nhất của công việc tự động hoá kiểm thử là kiểm thử viên có thể sinh nhiều bộ kiểm thử mà có các khuôn mẫu, cấu trúc giống nhau. Ngoài ra, kiểm thử một cách tự động hoá có thể đánh giá sơ qua chất lượng của phần mềm bằng cách sinh các bộ kiểm thử (như đã nói ở trên) và kiểm tra hành vi của phần mềm thông qua kết quả của các bài kiểm thử, thông số trạng thái của hệ thống kiểm thử (như bộ nhớ, thời gian thực thi, hiệu năng, ...) để đánh giá tính chính xác của chương trình đó.

- Tuy nhiên, công việc tự động hoá kiểm thử không phải không có giới hạn:

  - Một trong những giới hạn lớn nhất của công việc kiểm thử tự động chính là công việc sinh bộ kiểm thử không "nghĩ" được như con người, không tự sáng tạo ra bộ kiểm thử mới được mà chỉ luôn theo một khuôn mẫu đã định.
  - Chất lượng của bộ kiểm thử được sinh ra một cách tự động phụ thuộc rất nhiều vào chất lượng của đoạn mã (script) mà người kiểm thử viên viết ra.
  - Tự động hoá kiểm thử không thể đánh giá được chất lượng của những thành phần mà cần sự can thiệp của người dùng để đánh giá (như trải nghiệm người dùng, độ hoàn thiện của giao diện, ...)