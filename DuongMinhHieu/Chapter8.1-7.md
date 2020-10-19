# Refine the GACC, CACC, RACC, GICC, and RICC coverage criteria so that the constraints on the minor clauses are made more formal.

# Trả lời:
* Ta sẽ bắt đầu từ GACC và thêm dần các ràng buộc để được RACC, GICC và RICC. Giả sử ta có vị từ p, ci là mệnh đề chính, cj với j khác i là mệnh đề phụ và Pci là điều kiện để ci quyết định p.
* Với mỗi i, GACC có 2 yêu cầu kiểm thử: ci = T & Pci = T và ci = F & Pci = T. Giá trị của mệnh đề phụ có thể khác nhau ở 2 ca kiểm thử.
* Với mỗi i, CACC có 2 yêu cầu kiểm thử: ci = T & Pci = T và ci = F & Pci = T. Giá trị của mệnh đề phụ có thể khác nhau ở 2 ca kiểm thử. Giá trị của ca kiểm thử 1 phải khác giá trị ca kiểm thử 2.
* Với mỗi i, RACC có 2 ca kiểm thử: ci = T & Pci = T và ci = F & Pci = T. Giá trị của mệnh đề phụ phải giống nhau ở cả 2 ca kiểm thử.
* Với mỗi i, GICC có 2 cặp yêu cầu kiểm thử:
	* Cặp thứ 1: ci = T & Pci = F & p = T. ci = F & Pci = F & p = T.
	* Cặp thứ 2: ci = T & Pci = F & p = F. ci = F & Pci = F & p = F.
Các mệnh đề phụ cj có thể khác nhau. Thường thì có 1 cặp không khả thi.
* Với mỗi i, RICC có 2 cặp yêu cầu kiểm thử:
	* Cặp thứ 1: ci = T & Pci = F & p = T. ci = F & Pci = F & p = T.
	* Cặp thứ 2: ci = T & Pci = F & p = F. ci = F & Pci = F & p = F.
Các mệnh đề phụ cj phải giống nhau. Thường thì có 1 cặp không khả thi.