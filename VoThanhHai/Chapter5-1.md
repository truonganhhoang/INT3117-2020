# Suppose that coverage criterion C1 subsumes coverage criterion C2. Further suppose that test set T1 satisfies C1 on program P, and test set T2 satisfies C2, also on P.
### (a) Does T1 necessarily satisfy C2? Explain.
### (b) Does T2 necessarily satisfy C1? Explain.
### (c) If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the fault. Explain. <br>

Theo đề bài, độ bao phủ C1 là tập con của độ bao phủ C2, tập kiểm thử T1 thỏa mãn C1, tập kiểm thử T2 thỏa mãn C2, tất cả đều được xét trên cùng một chương trình P. <br> <br>
(a) Theo định nghĩa về tiêu chí tập con liên quan đến độ phủ (criteria subsumption - định nghĩa 5.29 trong sách giáo trình), *C1 thỏa mãn C2 khi và chỉ khi mọi tập kiểm thử thỏa mãn C1 cũng thỏa mãn C2.* Suy ra T1 cũng thỏa mãn C2. <br> <br>
(b) Dựa vào định nghĩa đã nêu ra ở trên, ta có thể khẳng định tập T2 không cần thiết phải thỏa mãn C1. <br> <br>
(c) Sẽ có thể xuất hiện trường hợp T2 có một ca kiểm thử báo lỗi nhưng T1 thì không vì sự phụ thuộc ở đây (C1 và C2) là về các tiêu chí độ phủ, không phải về các tập kiểm thử, cụ thể trong đề bài không nói gì đến việc T2 là tập con của T1.
