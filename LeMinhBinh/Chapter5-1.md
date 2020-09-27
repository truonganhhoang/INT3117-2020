# Chapter 5-1

> Suppose that coverage criterion C1 subsumes coverage criterion C2. Further suppose that test set T1 satisfies C1 on program P and test set T2 satisfies C2, also on P.
>
**Điều kiện bao phủ C1 bao hàm (*subsumption*) của điều kiện bao phủ C2 nếu và chỉ khi tất cả các yêu cầu kiểm thử của C1 đều khả thi khi áp dụng trong C2**

**Nếu một số yêu cầu kiểm tra trong C1 là không khả thi thì C1 có thể không phải là bao hàm của C2.**

<h1> (a) Does T1 necessarily satisfy C2? Explain. </h1>
Có. Dựa vào định nghĩa criterion subsumption ở trên.

<h1> (b) Does T2 necessarily satisfy C1? Explain. </h1>
Không. T1 phải thỏa mãn C2 nhưng T2 không cần thiết phải thỏa mãn C1 vì C2 không bao hàm C1.

<h1> (c) If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the fault. Explain. </h1>
C1 bao hàm C2, nhưng bộ test T2 không nhất thiết phải là tập con của bộ test T1. Vì vậy, có thể xảy ra trường hợp T2 chứa một thử nghiệm cho thấy lỗi còn T1 thì không.
