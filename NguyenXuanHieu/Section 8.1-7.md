# Section 8.1-7

# Refine the GACC, CACC, RACC, GICC, and RICC coverage criteria so that the constraints on the minor clauses are made more formal.

- Giả sử p là 1 vị từ, ci là 1 mệnh đề chính, cj với j khác i là những mệnh đề phụ và pci là điều kiện để ci xác định p.

- Duyệt từng i, GACC có 2 yêu cầu kiểm tra: ci = T hội với pci = T và ci = F hội với pci = T. Chú ý rằng giá trị của mệnh đề phụ cj có thể khác ở 2 bài kiểm tra.
- Duyệt từng i, CACC có 2 yêu cầu kiểm tra: ci = T hội với pci = T và ci = F hội với pci = T. Thông thường, giá trị của p là kết quả từ những bài kiểm tra đầu phải khác với những giá trị của p là kết quả từ những bài kiểm tra lần 2.
- Duyệt từng i, RACC có 2 yêu cầu kiểm tra: ci = T hội với pci = T và ci = F hội với pci = T. Thông thường ci là sự khác biệt duy nhất của 2 tests. Từ đó, giá trị của những mệnh đề phụ ci phải giống nhau từ 2 bài kiểm tra.
- Duyệt từng i, GICC có 2 phần của yêu cầu kiểm thử
    + Phần 1: ci = T hội với pci = F hội với p = T. ci = F hội với pci = F hội với p = T.
    + Phần 2: ci = T hội với pci = F hội với p = F. ci = F hội với pci = F hội với p = F.
- Mệnh đề phụ cj có thể khác giữa 2 bài kiểm tra. Thông thường 1 trong 2 cặp là không khả thi. Duyệt từng i, RICC có 2 phần của yêu cầu kiểm tra.
    + Phần 1: ci = T hội với pci = F hội với p = T. ci = F hội pci = F hội với p = T.
    + Phần 2: ci = T hội với pci = F hội với p = F. ci = F hội với pci = F hội với pci = F hội với p = F.