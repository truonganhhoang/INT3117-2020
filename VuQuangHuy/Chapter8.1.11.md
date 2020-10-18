# 8.1.11.
Ta giả định p là vị từ, ci là mệnh đề chính, cj là mệnh đề phụ (j != i), và pci là điều kiện mà ci quyết định p.
Với mỗi i, GACC có 2 TR: ci = T ∧ pci = T và ci = F ∧ pci = T. Giá trị của các mệnh đề phụ cj có thể khác giữa 2 test.  
Với mỗi i, CACC có 2 TR: ci = T ∧ pci = T và ci = F ∧ pci = T. Ngoài ra, giá trị của p từ test thứ nhất phải khác với giá trị của p ở cái thứ 2. Giá trị của các mệnh đề phụ cj có thể khác giữa 2 test.    
Với mỗi i, RACC có 2 TR: ci = T ∧ pci = T and ci = F ∧ pci = T. Ngoài ra, ci là khác biệt duy nhất giữa 2 test. Giá trị của mệnh đề phụ cj phải giống nhau ở 2 test.  
Với mỗi i, GICC có 2 cặp TR:  
Cặp 1: ci = T ∧ pci = F ∧ p = T. ci = F ∧ pci = F ∧ p = T.  
Cặp 2: ci = T ∧ pci = F ∧ p = F. ci = F ∧ pci = F ∧ p = F. 
Mệnh đề phụ cj có thể khác giữa 2 test. Thường thì 1 trong 2 cặp sẽ không khả thi.  
Với mỗi i, RICC có 2 cặp TR:  
Cặp 1: ci = T ∧ pci = F ∧ p = T. ci = F ∧ pci = F ∧ p = T.  
Cặp 2: ci = T ∧ pci = F ∧ p = F. ci = F ∧ pci = F ∧ p = F.  
Ngoải ra, ci là khác biệt duy nhất giữa 2 test ở cặp 1 và cặp 2. Giá trị của các mệnh đề phụ cj phải giống nhau cho 2 test ở cặp 1 và 2. Và 1 trong 2 cặp thường sẽ không khả thi.  

