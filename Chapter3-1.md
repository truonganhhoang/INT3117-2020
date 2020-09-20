# 1. Why do testers automate tests? What are the limitations of automation?

Kiểm thử phần mềm có thể gây tốn kém và tốn nhiều công sức, vì vậy một mục tiêu của kiểm thử phần mềm là tự động hóa càng nhiều càng tốt. Kiểm tra tự động hóa không chỉ giảm chi phí thử nghiệm mà còn giúp giảm thiểu lỗi của con người và giúp kiểm tra hồi quy dễ dàng hơn bằng cách cho phép chạy thử nghiệm nhiều lần chỉ với một nút nhấn.

Nói một cách chi tiết thì tự động hóa các nhiệm vụ đặc biệt phục vụ kỹ sư thử nghiệm theo nhiều cách. Đầu tiên, việc loại bỏ các nhiệm vụ đặc biệt sẽ giúp loại bỏ sự vất vả, do đó làm cho công việc của kỹ sư thử nghiệm hài lòng hơn. Thứ hai, tự động hóa giải phóng thời gian để tập trung vào các phần thú vị và thử thách của thử nghiệm, chẳng hạn như thiết kế thử nghiệm, một nhiệm vụ doanh thu. Thứ ba, tự động hóa cho phép chạy cùng một bài kiểm tra hàng nghìn lần mà không cần nỗ lực thêm trong môi trường mà các bài kiểm tra được chạy hàng ngày hoặc thậm chí hàng giờ. Thứ tư, tự động hóa có thể giúp loại bỏ các lỗi thiếu sót, chẳng hạn như không cập nhật được tất cả các tệp liên quan với tập hợp kết quả mong đợi mới. Thứ năm, tự động hóa loại bỏ một số sai lệch về chất lượng thử nghiệm do sự khác biệt về khả năng của từng cá nhân.

Tự động hóa kiểm thử, mặc dù có thể cải thiện nhiều khía cạnh của phát triển phần mềm, nhưng có những hạn chế cần đặc biệt để tâm tới:<br>
- Mã kiểm thử cần điều chỉnh liên tục. Nếu mã kiểm thử không được điều chỉnh cho phù hợp với các yếu tố mới đã được đưa vào phần mềm, nó có thể dẫn đến kết quả sai, cuối cùng để lại sản phẩm có lỗ hổng và lỗi.
- Không thể được sử dụng để kiểm thử UX vì tự động hóa kiểm thử không thể suy nghĩ như con người, nghĩa là các bài kiểm tra trải nghiệm người dùng sẽ cần được thực hiện thủ công. Sự xuất hiện, tính dễ sử dụng và tính nhất quán không phải là các mục mà tập lệnh kiểm tra tự động có thể đánh giá chính xác.
- Độ tin cậy của tập lệnh phụ thuộc vào người lập trình. Người kiểm thử phải có kinh nghiệm viết các kịch bản kiểm thử tự động. Nếu một kiểm thử viên không thành thạo trong lĩnh vực này, nó có thể dẫn đến sự thất bại của một dự án và không có khả năng sửa các tập lệnh cho các dự án trong tương lai.
- Ngoài ra, tự động hoá luôn gặp phải các vấn đề không thể xác định được, ví dự như đường dẫn không khả thi, tự tạo ra các ca kiểm thử, biến cục bộ,...

