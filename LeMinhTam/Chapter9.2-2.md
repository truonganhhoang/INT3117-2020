# Trả lời câu hỏi cho phương thức `findVal`
a. Nếu có thể, hãy chọn đầu vào kiểm tra không có đột biến.
- Luôn đạt được đột biến.
- Ngay cả khi `x` = `null`. 

b. Nếu có thể, hãy chọn đầu vào kiểm tra đáp ứng khả năng phản hồi nhưng không lây nhiễm cho thể đột biến.
- Sự lây nhiễm luôn xảy ra, ngay cả khi `x` = `null`
- Vì luôn có giá trị sai sau khi khởi tạo trong vòng lặp. 

c. Nếu có thể, hãy chọn đầu vào kiểm tra để tránh lây nhiễm, nhưng không lây lan cho thể đột biến.
- Miễn là lần xuất hiện cuối cùng của `val` không phải ở số` [0]`
- Kết quả chính xác sẽ được trả về nếu thỏa mãn điều kiện trên. 

d. Nếu có thể, là một đầu vào thử nghiệm tiêu diệt mạnh m.
- Mọi đầu vào chỉ có `val` trong số `[0]` đều hoạt động. 
- Ví dụ là: `(number, val)` = `([1, 0], 1) `
