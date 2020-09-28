#  Suppose that coverage criterion C1 subsumes coverage criterion C2. Further suppose that test set T1 satisfies C1 on program P, and test set T2 satisfies C2, also on P.
## (a) Does T1 necessarily satisfy C2? Explain.
## (b) Does T2 necessarily satisfy C1? Explain.
## (c) If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the fault. Explain.

* (a) T1 phải thỏa mãn C2 dựa vào khái niệm chứa (subsumption).
* (b) T2 chưa chắc đã thỏa mãn các yêu cầu kiểm thử được tạo ra từ C1.
* (c) Khái niệm chứa (subsumption) là về các tiêu chí, nghĩa là các tiêu chí của C1 chứa các tiêu chí C2. Điều đs không có nghĩa tập các ca kiểm thử T1 chứa tập T2. Do đó có thể có một ca kiểm thử nào đó của T2 phát hiện ra lỗi (fault) mà T1 lại không có.