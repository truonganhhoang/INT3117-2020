# 1 How are faults and failures related to testing and debugging?

- Lỗi phần mềm (Software Fault): là 1 lỗi 'static' trong phần mềm
- Phần mềm gặp lỗi (Software Failture): là lỗi mà không chính xác đối với yêu cầu hoặc mô tả được đưa ra
- Nói cách khác là Software Fault là 1 lỗi ẩn trong quá trình programing còn Software Failture là sortware không thực hiện đúng những gì mà user yêu cầu
- Fault --> Failture khi mà 'faultly portion' của code được chạy trên CPU hoặc là khi phần mềm được chuyển sang 1 hardware khác hoặc 1 trình biên dịch khác hoặc khi phần mềm được mở rộng
- Lỗi (faults) là những vẫn đề xáy ra trong quá trình xây dựng phần mềm, lỗi hệ thống (failures) là những việc xảy ra không đúng theo mong muốn của khách hàng
- Phụ thuộc vào mức độ kiểm thử theo thang Beizer của nơi bạn làm việc thì kiểm thử (testing) là 1 quá trình để hạn chế xảy ra các lỗi hệ thống (failures) và phải giảm thiểu các lỗi hệ thống (failures) đến mức tối thiểu (khác 0) 
- Ngược lại, tìm lỗi (debugging) là 1 quá trình dò tìm trong chương trình phần mềm để tìm ra failure và từ đó sẽ tìm cách khắc phục và tìm ra các lỗi khác
- Đều khác nhau ở đây giữa kiêm thử (testting) và tìm lỗi (debugging) đó là kiểm thử thì đó là không chạy chương trình mà tìm cách hạn chế lỗi như tạo ra các testcase đủ mạnh, còn tìm lỗi (debugging) đó là từ các lỗi đã phát hiện ở trong phần mềm thì sẽ sửa và từ đó tìm các lỗi khác

