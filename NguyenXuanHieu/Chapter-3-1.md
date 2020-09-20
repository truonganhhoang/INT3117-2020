# Why do testers automate tests? What are the limitations of automation?

* Tại sao các kiểm thử viên cần tự động (automate) các bài kiểm thử (tests):
- Kiểm thử tự động thì sẽ giúp tiết kiệm thời gian và tiền bạc.
    + Kiểm thử phần mềm phải được lặp lại trong suốt quá trình xây dựng phần mềm. Mỗi khi mã nguồn thay đổi thì kiểm thử phần mềm cần được lặp lại
    + Dẫn tới việc đó là khi tạo ra được bộ kiểm thử tự động thì sẽ giúp tiết kiệm thời gian và tiền bạc. Chúng nhanh hơn kiểm thử làm bằng tay và lại không tốn chi phí khi xây dựng lại.
- Tăng độ bao phủ của các bản kiểm thử (test):
    + Kiểm thử tự động làm tăng độ sâu và độ rộng của các bản kiểm thử để giúp tăng chất lượng phần mềm.
    + Kiểm thử tự động có thể nhìn sâu vào bên trong ứng dụng và nhìn thầy các bộ nhớ (memory), các bảng dữ liệu (data tables), các tệp nội dung (file content).
- Tăng độ chính xác
    + Các kiểm thử viên rất có thể gặp lỗi khi mà tạo bản kiểm thử bằng tay
    + Kiểm thử tự động thì đều làm mọi bước chính xác mỗi lần kiểm thử thực thi và không bao giờ quên lưu lại kết quả.
- Kiểm thử tự động làm được những việc mà kiểm thử bàng tay không làm được
    + 1 phần mềm lớn và 1 đội ngũ QA cũng có thể không thể kiểm soát nổi lượng người dùng lên đến hàng nghìn truy cập vào 1 trang web.
    + Nhưng kiểm thử tự động có thể mô phỏng hàng trăm nghìn lượng truy cập ảo để có thể giúp đội ngũ phát triển xây dựng trang web đảm bảo chất lượng.
- Kiểm thử tự động giúp đội ngũ phát triển (developer) và đội ngũ kiểm thử (tester)
    + Nhờ việc sử dụng kiểm thử tự động thì đội ngũ phát triển (developer) có thể bắt các vấn đề nhanh hơn trước khi được gửi đến bên QA.
    + Các bài kiểm tra (test) có thể chạy tự động khi mà mã nguồn thay đổi và thông báo cho đội ngũ phát triển rằng họ đã sai ở 1 chu trình nào đó.

* Giới hạn của kiểm thử tự động
- Yêu cầu kỹ năng lập trình tốt
    + Kiểm thử tự động thường yêu cầu hệ thống codes được thục thi để kiểm tra 1 ứng dụng. Cho nên yêu cầu cần có những hiểu biết nhất định về kỹ năng lập trình để xay dựng nên bộ kiểm thử tự động.
- Cần bảo trì của bộ kiểm tra (test case)
- Không phù hợp với nhũng bộ code mà được kế thừa
    + 1 điểm bất lợi của kiểm thự tự động đó là không thể làm việc được với nhũng bộ code mà được kế thừa lại từ 1 chương trình cũ.
    + Áp dụng kiểm thừ tự động cho 1 bộ code được kế thừa thì rất lủng củng
- Không phù hợp với hệ thống và kiểm tra tích hợp
    + Kiểm thừ tự động thương được sử dụng ở mức thấp nhất (unit level).
    + Trong trường hợp hệ thống và kiểm thử tích hợp, kiểm thử tự động thường không có khả năng để tích hợp các bộ kiểm tra và đàu ra của hệ thống kiểm thử hoàn thành và chúng chỉ được giới hạn để kiểm thử ở mức thấp nhất (unit level).
- Yêu cầu công cụ và phần cứng tích hợp thêm
    + 1 bộ kiểm thử tự động làm việc tốt không có ở chợ. Phần lớn các công cụ đều có ở chợ nhưng không đủ cung cấp cho những yêu cầu mới nhất của kiểm thử tự động
    + 1 điểm bất lợi nữa đó là kiểm thử tự động không chạy ở 1 máy đơn lẻ của 1 nhà phát triển (developer) hay 1 kiểm thử viên (tester).

