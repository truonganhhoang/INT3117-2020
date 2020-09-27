# Chapter 5-1
## Suppose that coverage criterion C1 subsumes coverage criterion C2. Further suppose that test set T1 satisfies C1 on program P and test set T2 satisfies C2, also on P.
## (a) Does T1 necessarily satisfy C2? Explain.
- ### Có, vì theo T1 thoả mãn C1 mà C2 là tập con của C1 nên T1 cũng thoả mãn C2.
## (b) Does T2 necessarily satisfy C1? Explain.
- ### Không, vì C2 không phải là cha của C1 nên T2 không thoả mãn C1.
## (c) If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the fault. Explain.
- ### C2 là tập con của C1 là xét về mặt tiêu chí chứ không phải về bộ ca kiểm thử. Vì vậy nên T2 chưa chắc đã là tập con của T1 nên nếu T2 phát hiện lỗi thì chưa chắc T1 cũng phát hiện được lỗi.
  
  