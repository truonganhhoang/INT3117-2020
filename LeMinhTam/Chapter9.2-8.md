# Tiền đề cơ bản được phát biểu là: "Trong thực tế, nếu phần mềm có lỗi, thường sẽ có một tập hợp các đột biến có thể bị giết chỉ bởi một trường hợp thử nghiệm cũng phát hiện ra lỗi đó."
a. Đưa ra một lập luận ngắn gọn ủng hộ tiền đề đột biến cơ bản
- Miễn là các toán tử đột biến được thiết kế tốt, tiền đề này gần như đúng bởi vì các toán tử đột biến như vậy bắt chước các sai lầm điển hình của lập trình viên hoặc khuyến khích người kiểm tra tuân theo các phép thử nghiệm thông thường. 
- Kết quả là, hoạt động để tìm ra một tập hợp các trường hợp thử nghiệm thích hợp đạt đến ngưỡng xác định trước của điểm đột biến có thể là một lỗi trong phần mềm. 
- Tiền đề cũng được hỗ trợ bởi thực tế là rất khó để tìm ra một lỗi và một tập hợp các bài kiểm tra đủ đột biến mà không gây ra lỗi.

b. Đưa ra một lập luận ngắn gọn chống lại tiền đề đột biến cơ bản.
- Mặt khác, tiền đề này chỉ đúng nếu các toán tử đột biến được thiết kế chính xác. 
- Đặc biệt đối với một ứng dụng đa luồng, thật khó để thiết kế các toán tử đột biến hiệu quả có thể gây ra những sai lầm điển hình về các vấn đề đồng thời như loại trừ lẫn nhau,...