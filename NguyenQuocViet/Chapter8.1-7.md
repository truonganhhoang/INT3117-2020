**7. Refine the GACC, CACC, RACC, GICC, and RICC coverage criteria so that the constraints on the minor clauses are made more formal.**

Giả sử p là vị từ, c<sub>i</sub> là mệnh đề chính, c<sub>j</sub>, `j != i` là mệnh đề phụ và p<sub>c<sub>i</sub></sub> là điều kiện mà c<sub>i</sub> xác định p. Với mỗi i ta có:

* GACC có hai yêu cầu kiểm thử: c<sub>i</sub> = T ∧ pci = T và c<sub>i</sub> = F ∧ p<sub>c<sub>i</sub></sub> = T

* CACC có hai yêu cầu kiểm thử: c<sub>i</sub> = T ∧ pci = T và c<sub>i</sub> = F ∧ p<sub>c<sub>i</sub></sub> = T.

Ngoài ra, giá trị của p thu được từ lần kiểm thử đầu tiên phải khác với giá trị của p thu được từ lần kiểm thử thứ hai.

* RACC có hai yêu cầu kiểm thử: c<sub>i</sub> = T ∧ p<sub>c<sub>i</sub></sub> = T và c<sub>i</sub> = F ∧ p<sub>c<sub>i</sub></sub> = T.

Ngoài ra, c<sub>i</sub> là sự khác biệt duy nhất giữa hai bài kiểm tra. Nghĩa là, giá trị của các mệnh đề phụ c<sub>j</sub> phải giống nhau trong hai bài kiểm tra.

* GICC có hai cặp yêu cầu kiểm thử:
  - Cặp 1: c<sub>i</sub> = T ∧ p<sub>c<sub>i</sub></sub> = F ∧ p = T. c<sub>i</sub> = F ∧ p<sub>c<sub>i</sub></sub> = F ∧ p = T.
  - Cặp 2: c<sub>i</sub> = T ∧ p<sub>c<sub>i</sub></sub> = F ∧ p = F. c<sub>i</sub> = F ∧ p<sub>c<sub>i</sub></sub> = F ∧ p = F.

Các điều khoản nhỏ c<sub>j</sub> có thể khác nhau giữa hai yêu cầu kiểm thử. Thông thường, một trong các cặp là không khả thi.

* RICC có hai cặp yêu cầu kiểm tra:
  - Cặp 1: c<sub>i</sub> = T ∧ p<sub>c<sub>i</sub></sub> = F ∧ p = T. c<sub>i</sub> = F ∧ p<sub>c<sub>i</sub></sub> = F ∧ p = T.
  - Cặp 2: c<sub>i</sub> = T ∧ p<sub>c<sub>i</sub></sub> = F ∧ p = F. c<sub>i</sub> = F ∧ p<sub>c<sub>i</sub></sub> = F ∧ p = F.

Ngoài ra, c<sub>i</sub> là sự khác biệt duy nhất giữa hai yêu cầu kiểm thử trong Cặp 1 và hai bài kiểm tra trong Cặp 2. Nghĩa là, giá trị của các mệnh đề phụ c<sub>j</sub> phải giống nhau đối với hai bài kiểm tra trong Cặp 1 và giống nhau đối với hai bài kiểm tra trong Cặp 2. Một trong 2 cặp thường không khả thi.
