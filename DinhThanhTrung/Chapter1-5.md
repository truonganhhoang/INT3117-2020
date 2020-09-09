
# Câu 5 Program 1
- a) Sai ở điều kiện dừng (i > 0), phần tử ở vị trí x[0] sẽ không được duyệt.
- b) Không gây ra lỗi: Testcase x = [2,3,5]; y = 3 //expected 1
- c) Chạy qua lỗi tĩnh nhưng không gây trạng thái lỗi chương trình (error state): x = [2,3,5]; y = 2 //expected result = 1 ; result -1
- d) Gây ra lỗi chương trình (error), không phải lỗi hành vi (failure): x = [2,3,5]; y = 33333333333333
- e) Với testcase được cho (x=[2,3,5]; y=2) lỗi chương trình là: kết quả trả về = -1 vì không thấy phần tử nào = 2 vì vòng for dừng khi i <= 0 nên x[0] = 2 không được duyệt
- f) Sửa điều kiện vòng for thành (int i = x.length-1; i >= 0; i--). Kết quả trả về cho testcase trên là 0

# Câu 6b)
- Trình độ kiểm thử hiện tại của em là: trình độ 1. Chủ yếu em chỉ kiểm thử phần mô-đun mình làm với các ca kiểm thử được thiết kế trước để đảm bảo mô-đun đó chạy đúng theo mô tả.