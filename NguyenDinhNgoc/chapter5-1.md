**Suppose that coverage criterion C1 subsumes coverage criterion C2.
Further suppose that test set T1 satisfies C1 on program P, and test set
T2 satisfies C2, also on P.**

*a, Does T1 necessarily satisfy C2? Explain.*

    Đúng như vậy vì chúng ta có thể suy ra trực tiếp từ định nghĩa về tiêu chí phụ (subsumption) đó làlà nếu C1 phụ thuộc C2 khi và chỉ khi mọi bài kiểm tra (tests) thỏa mãn tiêu chí C1 và C2.

*b, Does T2 necessarily satisfy C1? Explain.*

    T2 không nhất thiết phải thỏa mãn C1. Bởi vì không có lý do nào để làmlàm cho các bài kiểm tra
    mong muốn (expect test requirements) được tạo ra bởi C1 cần thoả mãn T2.

*c, If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the
fault. Explain.*

    Theo định nghĩa về tiêu chí phụ (subsumption) nói là: nếu C1 phụ thuộc C2 khi và chỉ khi mọi bài kiểm tra thỏa mãn tiêu chí C1 và C2, không có yêu cầu nào quy định bộ kiểm tra T2 là tập con của bộ kiểm tra T1 nnên có thể xảy ra trường hợp T2 chứa 1 bài kiểm thử có lỗi còn T1 thì không có test nào bị lỗi.
