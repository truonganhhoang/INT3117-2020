Đầu tiên xét với GACC và thêm các ràng buộc khác đối với RACC. Sau đó, lặp lại quy trình cho GICC và RICC. 
Chúng ta giả sử *p* là vị ngữ, *ci* là mệnh đề chính,  *cj*,  *j!= i*  là mệnh đề phụ và pci là điều kiện mà *ci* xác định *p*.
Với mỗi *i*, GACC có hai yêu cầu kiểm tra: *ci = T ∧ pci = T* và *ci = F ∧ pci = T*. Lưu ý rằng giá trị của mệnh đề phụ *cj* có thể khác nhau giữa hai bài kiểm tra.
Với mỗi *i*, CACC có hai yêu cầu kiểm tra: *ci = T ∧ pci = T* và *ci = F ∧ pci = T*.
Ngoài ra, giá trị của *p* thu được từ phép thử đầu tiên phải khác với giá trị của *p* thu được từ thứ hai. Lưu ý rằng giá trị của các điều khoản nhỏ *cj* có thể khác nhau giữa hai phép thử.
Với mỗi *i*, RACC có hai yêu cầu kiểm tra:  *ci = T ∧ pci = T*  và *ci = F ∧ pci = T.*
Ngoài ra, *ci* là sự khác biệt duy nhất giữa hai bài kiểm tra. Nghĩa là, giá trị của các mệnh đề phụ *cj* phải giống nhau trong hai bài kiểm tra.
Đối với mỗi *i*, GICC có hai cặp yêu cầu kiểm tra:
Cặp 1: *ci = T ∧ pci = F ∧ p = T. ci = F ∧ pci = F ∧ p = T.*
Cặp 2: *ci = T ∧ pci = F ∧ p = F. ci = F ∧ pci = F ∧ p = F.*
Các điều khoản nhỏ cj có thể khác nhau giữa hai bài kiểm tra. Thông thường, một trong các cặp là không khả thi.
Đối với mỗi i, RICC có hai cặp yêu cầu kiểm tra:
Cặp 1: *ci = T ∧ pci = F ∧ p = T. ci = F ∧ pci = F ∧ p = T.*
Cặp 2: *ci = T ∧ pci = F ∧ p = F. ci = F ∧ pci = F ∧ p = F.*
Ngoài ra, *ci* là sự khác biệt duy nhất giữa hai bài kiểm tra trong Cặp 1 và hai bài kiểm tra trong Cặp 2. Nghĩa là, giá trị của các mệnh đề phụ *cj* phải giống nhau đối với hai bài kiểm tra trong Cặp 1 và giống nhau đối với hai bài kiểm tra trong Cặp 2. Một lần nữa, một trong các cặp thường không khả thi.