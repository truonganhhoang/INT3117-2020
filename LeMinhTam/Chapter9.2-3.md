# Trả lời câu hỏi cho phương thức `sum`

a. Nếu có thể, hãy chọn đầu vào kiểm tra không có đột biến.
- Nếu x là `null` hoặc mảng trống
- Ví dụ `x` = `null` hoặc `[]`, thì không có đột biến.

b. Nếu có thể, hãy chọn đầu vào kiểm tra đáp ứng khả năng phản hồi nhưng không lây nhiễm cho thể đột biến.
- Bất kỳ đầu vào nào có tất cả các số 0 sẽ đạt nhưng không bị nhiễm.

c. Nếu có thể, hãy chọn đầu vào kiểm tra để tránh lây nhiễm, nhưng không lây lan cho thể đột biến.
- Bất kỳ đầu vào nào có các mục khác không, nhưng có tổng bằng 0, là trạng thái kết thúc.

d. Nếu có thể, là một đầu vào thử nghiệm tiêu diệt mạnh m.
- Bất kỳ đầu vào nào có tổng khác đều hoạt động. 
- Ví dụ là: `x` =` [1, 2, 3]`