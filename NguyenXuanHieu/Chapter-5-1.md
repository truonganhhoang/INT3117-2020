# Chapter 5-1

# Suppose that coverage criterion C1 subsumes coverage criterion C2. Further suppose that test set T1 satisfies C1 on program P, and test set T2 satisfies C2, also on P.

a, Does T1 necessarily satisfy C2? Explain.

T1 nhất thiết là phải thỏa mãn C2. Điều này được suy ra trực tiếp từ định nghĩa về
tiêu chí phụ (subsumption). Định nghĩa về tiêu chí phụ (subsumption) là: nếu C1 phụ thuộc C2 khi và
chỉ khi mọi bài kiểm tra (tests) thỏa mãn tiêu chí C1 và C2

b, Does T2 necessarily satisfy C1? Explain.

T2 không nhất thiết phải thỏa mãn C1. Bởi vì không có lý do nào khiến cho các bài kiểm tra
mong muốn (expect test requirements) được tạo ra bởi C1 mà thoả mãn T2 cả

c, If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the
fault. Explain.

Không. Các kiểm thử viên (tester) thường nghĩ rằng nếu các bài kiếm tra (test case) được cài đặt với các
tiêu chí mạnh thì ít nhất cũng sẽ tốt hơn các bài kiểm tra được cài đặt với tiêu chí yếu hơn. Nhưng thực 
chất các tiêu chí phụ (subsumption) thì là quy định về các tiêu chí chứ không phải quy định về các bộ 
kiểm tra (test sets). Định nghĩa về tiêu chí phụ (subsumption) là: nếu C1 phụ thuộc C2 khi và chỉ khi mọi 
bài kiểm tra (tests) thỏa mãn tiêu chí C1 và C2 Hơn nữa, không có yêu cầu nào quy định rằng bộ kiểm tra 
T2 là tập con của bộ kiểm tra T1 cả. Vậy nên có thể xảy ra trường hợp T2 chứa 1 bài kiểm thử (test) có lỗi
còn T1 thì không