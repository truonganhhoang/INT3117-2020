Trong thực nghiệm, nếu phần mềm chứa một lỗi, sẽ thường có một bộ đột biến có thể bị triệt tiêu bởi một kiểm thực phát hiện ra lỗi đó.

(a) Giải thích tiền đề cơ bản đó
* Miễn là toán tử đột biến được thiết kế tốt, tiền đề này gần như đúng bởi vì các toán tử đột biến bắt chước các sai lầm của lập trình viên hoặc khuyến khích kiểm thử viên tuân theo các phép kiểm thử thông thường. Do đó, công việc tìm một bộ kiểm thử thích hợp đạt đến ngưỡng tiền xác định về điểm đột biến có thể tìm thấy lỗi trong phần mềm. Tiền đề cũng được hỗ trợ bởi thực tế là rất khó để tìm ra lỗi và một tập hợp các kiểm thử đủ đột biến mà không tìm ra lỗi.

(b) Chối bỏ tiền đề cơ bản đó
* Tiền đề chỉ đúng khi và chỉ khi gọi hàm đột biến được thiết kế tốt. Trong một ứng dụng đa luồng, khó để thiết kế gọi hàm đột biến thể hiện được những sai sót như là loại trừ đột biến, khóa chết, bỏ đói...