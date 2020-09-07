Code 1:
a)
  Hàm cần trả về chỉ số cuối cùng của phần tử y. Do hàm duyệt mảng không lấy giá trị đầu tiên của mảng, dẫn đến việc thiếu trường hợp.
  Sửa code : đổi "for(int i = x.length() - 1; i > 0; --i) " thành "for(int i = x.length() - 1; i >= 0; --i)
  
b) trường hợp thử nghiệm không gây ra lỗi: x=[1,2,3]; y = 3; đáp án:2

c) trường hợp thử nghiệm gây ra lỗi: x = [0;1;2;3;4]; y = 1; Đáp án: 1.
Đoạn code không gây nên lỗi vì vẫn tìm được đáp án đúng

d) test: x = [0;1;2;3;4]; y = 0; Đáp án: -1.
Đoạn code lỗi nhưng vì không tìm được y nên vẫn trả về đáp án đúng

e) Trong test đã đưa ra, sau khi duyệt đến i=1 thì dừng ko duyệt i=0 dẫn đến việc không tìm ra được số y.

Code 2:
a)

  Hàm cần trả về vị trí chữ số 0 cuối cùng;nhưng vòng for chỉ lấy giá trị là vị trí đầu tiên của số 0.

  Sửa code: đổi "for(int i = 0; i < x.length; i++)" thành "for(int i = x.length()-1; i >= 0; i--)"

b)trường hợp thử nghiệm không gây ra lỗi: x=[0,1,2] .Đáp án là 0 vì số 0 chỉ xuất hiện 1 lần.

c) trường hợp thử nghiệm gây ra lỗi: x = [0,5,0]; Đáp án: 0.

d) x = [1,0,3,5]; Đáp án: 1.

e) Trong test đã đưa ra, sau khi duyệt đến vị trí i=0 thì dừng nên không tìm ra được số 0 cuối dùng.

Code 3: 
a)
   Hàm dùng để đếm số các số nguyên dương; nhưng do hàm lấy cả 0 cũng là số dương nên đáp án sai.

   Sửa code: đổi"if (x[i] >= 0)" thành "if (x[i] > 0)"

b) trường hợp thử nghiệm không gây ra lỗi:x=[1,2,3]; Đáp án: 3

c) trường hợp thử nghiệm gây ra lỗi: x = [0,1,2,3]; Đáp án: 4

d) 

e) Trong test đã đưa ra,count tính cả số 0 không phải số nguyên dương nên đáp án sai

Code 4: 
a)
   Hàm cần trả về số số >0 hoặc số chia 2 dư 1;nhưng hàm lại không lấy trường hợp số âm chia 2 dư 1 nên sai đáp án.

   Sửa code:đổi "if (x[i]%2 == 1 || x[i] > 0)" thành "if (x[i]%2 == -1 || x[i] > 0)"

b) trường hợp thử nghiệm không gây ra lỗi: x=[1,2,3],đáp án: 3

c) trường hợp thử nghiệm gây ra lỗi:: x = [-3,0;4], đáp án: 2

d) 

e) trong code 4 tuy -3 chia 2 dư 1 nhưng không được đếm nên đáp án sai
