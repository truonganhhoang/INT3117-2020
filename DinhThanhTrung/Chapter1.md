# Câu 1 Để tiến đến Lv4 từ Lv2 trong trình độ test cần:
	- Quan niệm mục đích của kiểm thử chính là tăng chất lượng sản phẩm. 
	- Chính vì mục đích của kiểm thử là để nâng chất lượng sản phẩm nên cần sự phối hợp
	của cả tester và developer chứ không gây căng thẳng, mâu thuẫn trong team
	- Ý thức của việc nâng cao chất lượng phần mềm có trong mọi việc và mọi giai đoạn phát triển
	phần mềm. Từ những việc nhỏ như viết code có bố cục logic, đặt tên biến rõ ràng, quản lí
biến, kiểu dữ liệu ..vv   
# Câu 2 Điểm khác nhau giữa software fault và software failure:
   - Software Fault : Là lỗi tĩnh ở trong chương trình. Những lỗi này có thể là sai sót trong mã nguồn 
hoặc trong mã biên dịch của chương trình 

   - Software Failure : Là những hành vi của chương trình thực hiện không đúng như dự tính, mô tả ban đầu
# Câu 3
   - Khi sử dụng phần mềm có nghĩa là người dùng cũng nhận những rủi ro. Độ rủi ro và thiệt hại tỉ 
lệ thuận với nhau. Có thể ví dụ một số rủi ro : Phần mềm tính toán sai kết quả, không cảnh báo lỗi khi
có failures, cảnh báo không đúng lỗi, bảo mật có lỗ hổng bị khai thác .vv
   - Khả năng giảm rủi ro về 0 là rất hiếm đến mức không thể. Lí do vì phần mềm bản chất là phức tạp, 
trừu tượng. Kiểm thử chỉ là cách để chỉ ra phần mềm có lỗi chứ không chứng minh là hết lỗi. Trong khi
đó lại có rất nhiều yếu tố ảnh hưởng và biến cố có thể xảy ra trong quá trình chạy thực tế khiến pm chạy sai.

# Câu 5
	Program 1
- a) Sai ở điều kiện dừng i>0, phần tử ở vị trí [0] sẽ không được duyệt.
- b) Không gây ra lỗi: Testcase x=[2,3,5]; y=3 //expected 1
- c) Chạy qua fault nhưng không gây error state : x=[2,3,5]; y=2 //expected 1   result -1
- d) Gây ra error, không phải failure: x=[2,3,5]; y=33333333333333
- e) Với testcase được cho (x=[2,3,5]; y=2) error là : kết quả trả về = -1 vì không thấy phần tử nào = 2
vì vòng for dừng khi i<=0 nên x[0]=2 không được duyệt
- f) Sửa điều kiện vòng for thành for(int i=x.length-1;i>=0;i--)
kết quả trả về cho testcase trên là 0

# Câu 6
- b) Level kiểm thử hiện tại của em là : level 1. Chủ yếu các dự án em tham gia đều yêu cầu em làm một phần
nhỏ trong cả dự án lớn, em chỉ test phần module mình làm với các test case được thiết kế trước để đảm bảo 
module chạy đúng theo yêu cầu. 