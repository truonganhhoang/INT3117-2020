# 1. Suppose that coverage criterion C1 subsumes coverage criterion C2. Further suppose that test set T1 satisfies C1 on program P, and test set T2 satisfies C2, also on P.

###a, Does T1 necessarily satisfy C2? Explain.

- T1 sẽ nhất thiết phải thỏa mãn C2 theo tiêu chí phụ thuộc (subsumption), đó là nếu C1 phụ thuộc C2 khi và chỉ khi mọi bài kiểm tra (tests) thỏa mãn tiêu chí C1 và C2
###b, Does T2 necessarily satisfy C1? Explain.
- T2 không nhất thiết phải thỏa mãn C1 vì T2 không có lý do gì để đáp ứng các yêu cầu kiểm tra do C1 tạo ra.
###c, If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the fault. Explain.
- Nếu trong P có chứa lỗi và T2 phát hiện được lỗi đó thì T1 không nhất thiết phải phát hiện được lỗi đó vì T2 không có yêu cầu và cũng không nhất thiết là tập con của T1. Vi vậy hoàn toàn có thể xảy ra trường hợp T1 không phát hiện được một lỗi mà T2 phát hiện ra.