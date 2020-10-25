**Xem xét lại các tiêu chí về phạm vi GACC, CACC, RACC, GICC và RICC để các ràng buộc đối với các điều khoản phụ được thực hiện chính thức hơn**

Giả sử: 
- `p` là vị từ
- ci` là mệnh đề chính
- `cj`, `c` khác `i` là mệnh đề phụ 
- `pci` là điều kiện mà `ci` xác định `p`. 

Với mỗi `i`, GACC có hai yêu cầu kiểm tra: 
- `ci = T ∧pci = T`
- `ci = F ∧pci = T`. 

Với mỗi `i`, CACC có hai yêu cầu kiểm tra: 
- `ci = T ∧pci = T` 
- `ci = F ∧pci = T`. 

Ngoài ra, giá trị của p thu được từ thử nghiệm thứ nhất phải khác giá trị của `p` thu được từ thử nghiệm thứ hai. 

Với mỗi `i`, RACC có hai yêu cầu kiểm tra: 
- `ci = T ∧pci = T`
- `ci = F ∧pci = T`. 

Ngoài ra, `ci` là khoảng cách duy nhất giữa hai kiểm tra. 

Nghĩa là, giá trị của các mệnh đề phụ `cj` phải giống nhau trong hai bài kiểm tra. 

Với mỗi i, GICC có hai cặp yêu cầu kiểm tra: 
- Cặp 1: 
  - `ci = T ∧pci = F ∧p = T`.
  - `ci = F ∧pci = F ∧p = T`. 
- Cặp 2: 
  - `ci = T ∧pci = F ∧ p = F`.
  - `ci = F ∧pci = F ∧p = F`. 

Mệnh đề phụ `cj` có thể khác nhau giữa hai phép thử. 

Với mỗi `i`, RICC có hai cặp yêu cầu kiểm tra: 
- Cặp 1: 
  - `ci = T ∧pci = F ∧p = T`. 
  - `ci = F ∧pci = F ∧p = T`. 
- Cặp 2: 
  - `ci = T ∧pci = F ∧ p = F`. 
  - `ci = F ∧pci = F ∧p = F`. 
