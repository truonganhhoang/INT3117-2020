# **Question:**
Suppose that coverage criterion C1 subsumes coverage criterion C2. Further suppose that test set T1 satisfies C1 on program P, and test set T2 satisfies C2, also on P

(a) Does T1 necessarily satisfy C2? Explain.

(b) Does T2 necessarily satisfy C1? Explain.

(c) If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the fault. Explain?

**<h2>Dịch</h2>**
> Bla bla bla...

# **Answer:**

> a, Does T1 necessarily satisfy C2? Explain.

Có. Theo định nghĩa của tính bao hàm (subsumption): C1 bao hàm C2 khi và chỉ khi tất cả các bộ kiểm thử T1 thoả mãn C1 cũng đều phải thoả mãn C2 (tức là thoả mãn cả 2). Trong trường hợp này thì T1 và T2 đều thoả mãn C1 và C2, mà C1 bao hàm C2 nên T1 nhất định thoả mãn C2.

> (b) Does T2 necessarily satisfy C1? Explain.

Không. T2 không nhất thiết phải thoả mãn C1 vì không có yêu cầu nào ép các bộ kiểm thử từ C2 phải tuân theo tiêu chuẩn C1.

> (c) If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the fault. Explain.

Ý kiến trên sai, vì T2 không nhất thiết là bộ kiểm thử nằm trong T1 (hay nói cách khác: T1 bao hàm T2). Nên có thể rằng T2 có ca kiểm thử mà phát hiện được lỗi của P, mà T1 không có, vì T1 không bao hàm T2.