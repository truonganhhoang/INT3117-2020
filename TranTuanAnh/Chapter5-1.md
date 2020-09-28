# Suppose that coverage criterion C1 subsumes coverage criterion C2. Further suppose that test set T1 satisfies C1 on program P, and test set T2 satisfies C2, also on P.

**(a) Does T1 necessarily satisfy C2? Explain.**
> T1 phải thỏa mãn C2 vì T1 thỏa mãn C1 mà C1 thay thế được C2.

<br/>

**(b) Does T2 necessarily satisfy C1? Explain.**
> T2 không thỏa mãn C1 vì C1 thay thế được C2 nên T1 bao phủ T2 vì thế T2 không thỏa mãn được C1.

<br/>

**(c) If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the fault. Explain.**
> Do T2 có thể có những bộ kiểm thử khác không thuộc T1 nên T2 có thể phát hiện những lỗi mà T1 vẫn không có lỗi.


