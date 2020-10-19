## Bài 6
- Giả sử:
 * p: thuộc tính
 * ci: mệnh đề chính
 * cj, j != i: mệnh đề phụ
 * p(ci): các điều kiện để ci xác định p.

- Với mỗi i, GACC có 2 yêu cầu kiểm tra: ci = T ∧ pci = T và ci = F ∧ pci = T. Lưu ý các giá trị của mệnh đề phụ cj có thể khác giữa 2 bài kiểm tra.

- Với mỗi i, CACC có 2 yêu cầu kiểm tra: ci = T ∧ pci = T và ci = F ∧ pci = T. Thêm vào đó, p từ bài kiểm tra đầu tiên phải khác p từ bài kiểm tra thứ 2. Lưu ý các giá trị của mệnh đề phụ cj có thể khác giữa 2 bài kiểm tra.

- Với mỗi i, RACC có 2 yêu cầu kiểm tra: ci = T ∧ pci = T và ci = F ∧ pci = T. Thêm vào đó, 2 bài kiểm tra chỉ khác nhau ở ci (các giá trị cj ở 2 bài kiểm tra là như nhau).

- Với mỗi i, GICC có 2 cặp yêu cầu kiểm tra:
 * Cặp 1: ci = T ∧ pci = F ∧ p = T. ci = F ∧ pci = F ∧ p = T.
 * Cặp 2: ci = T ∧ pci = F ∧ p = F. ci = F ∧ pci = F ∧ p = F.
 2 bài kiểm tra có thể khác nhau ở cj, Thường thì 1 trong 2 cặp là không khả thi.
- Với mỗi i, RICC có 2 cặp yêu cầu kiểm tra:
 * Cặp 1: ci = T ∧ pci = F ∧ p = T. ci = F ∧ pci = F ∧ p = T.
 * Cặp 2: ci = T ∧ pci = F ∧ p = F. ci = F ∧ pci = F ∧ p = F.
 Thêm vào đó, 2 bài kiểm tra chỉ khác nhau ở ci trong cả cặp 1 và 2. Nghĩa là, 2 bài kiểm tra phải có chung cj, ở cả  cặp 1 và 2. Thường thì 1 trong 2 cặp là không khả thi. 
