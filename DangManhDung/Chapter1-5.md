Cho 4 chương trình bị lỗi

![Annotation 2020-09-07 110729](https://user-images.githubusercontent.com/48431650/92348022-efde4400-f0fb-11ea-9a21-f3da641a4d2b.png)

a. Phát hiện lỗi của chương trình
  1. Do để *i>0* nên không xét phần tử đầu. Sửa thành: *i>=0*
  2. Do bắt đầu for với *i=0* nên sẽ cho số của phần tử =0 đầu tiên chứ không phải cuối cùng. Sửa thành: *for (int i=x.lenght-1;i>=0;i--)*
  3. 0 không phải số dương nhưng được tính vào do *x[i] >= 0*. Sửa thành: *x[i] > 0*
  4. Khi sử dụng *x[i]%2* với số lẻ âm sẽ cho -1 nên không được tính vào tổng số. Sưa thành: *if(x[i]%2==1||x[i]%2==-1||x[i]>0)*

b. Cho 1 trường hợp mà lỗi không được phát hiện
  1. Khi số cần tìm không phải là số đầu tiên VD: x=[1,2,4,8] y=2 kết quả 1
  2. Khi chỉ có 1 phần tử là 0 VD: *x=[3,5,2,0,5,4]* kết quả 3
  3. Khi không có phần tử bằng 0 VD: *x=[4,-6,2]* kết quả 2
  4. Khi không có phần tử âm  VD: *x=[3,-2,0,1,4]* kết quả 3
