a,
Lưu ý rằng mỗi mệnh đề phải đúng với các mệnh đề khác sai và sau đó tất cả các mệnh đề phải sai, do đó tạo ra 4 phép thử (được đánh số 4, 6, 7, 8 trong sơ đồ bảng chân trị thông thường):
+ TGACC = {(T, F, F), (F, T, F), (F, F, T), (F, F, F)}

b,
Đúng.

c,
Có tám câu trả lời có thể tồn tại. Tất cả các câu trả lời phải bao gồm (F, F, F) và (F, F, T), cả hai đều nằm trong các bài kiểm tra GACC. Đầu tiên bỏ lỡ tất cả các cuộc gọi đến m (); và cuộc gọi thứ hai đến cuộc gọi thứ ba. Để đạt được cuộc gọi đầu tiên, A phải là True nhưng B và C có thể có bất kỳ giá trị nào (bốn khả năng). Để đạt được cuộc gọi thứ hai, A phải là Sai và B phải đúng. Với các giá trị “don’tcare”, có thể liệt kê bốn bài kiểm tra là:
TEDGE = {(T, -, -), (F, T, -), (F, F, T), (F, F, F)}
Tất cả các câu trả lời có thể là:
TEDGE:1 = {(T, T, T),(F, T, T),(F, F, T),(F, F, F)}
TEDGE:2 = {(T, T, F),(F, T, T),(F, F, T),(F, F, F)}
TEDGE:3 = {(T, F, T),(F, T, T),(F, F, T),(F, F, F)}
TEDGE:4 = {(T, F, F),(F, T, T),(F, F, T),(F, F, F)} (1 in the GACC test)
TEDGE:5 = {(T, T, T),(F, T, F),(F, F, T),(F, F, F)} (1 in the GACC test)
TEDGE:6 = {(T, T, F),(F, T, F),(F, F, T),(F, F, F)} (1 in the GACC test)
TEDGE:7 = {(T, F, T),(F, T, F),(F, F, T),(F, F, F)} (1 in the GACC test)
TEDGE:8 = {(T, F, F),(F, T, F),(F, F, T),(F, F, F)} (2 in the GACC tests)