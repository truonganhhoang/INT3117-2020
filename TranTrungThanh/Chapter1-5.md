####Code 1:
a)
<p>Hàm cần trả về chữ số yêu cầu cuối cùng; tuy nhiên, hàm duyệt mảng không lấy giá trị đầu tiên của mảng, dẫn đến việc thiếu trường hợp.</p>
Cách giải quyết:

Thay ("for(int i = x.length() - 1; i > 0; --i) ")\
Bằng ("for(int i = x.length() - 1; i >= 0; --i)")

b)
test: x=[]; y = 3; Đáp án: null

c)
test: x = [0;1;2;3;4]; y = 1; Đáp án: 1. \
Đoạn code không chạy phần lỗi vì đã tìm được đáp án

d)
test: x = [0;1;2;3;4]; y = 5; Đáp án: -1. \
Đoạn code chạy phần lỗi nhưng vì không tìm được y nên vẫn trả về giá trị đúng


e)
Trong test đã đưa ra, sau khi duyệt đến địa chỉ x[1] thì bị ngừng và ko duyệt địa chỉ x[0] dẫn đến việc không tìm ra được số y dù trong mảng có tồn tại

####Code 2:
a)
<p>Hàm cần trả về vị trí chữ số 0 cuối cùng; tuy nhiên, hàm duyệt mảng lấy giá trị là vị trí đầu tiên của số 0, dẫn đến việc thiếu trường hợp.</p>
Cách giải quyết:

Thay ("for(int i = 0; i < x.length; i++)")\
Bằng ("for(int i = x.length()-1; i >= 0; i--)")

b)


c)
test: x = [5]; Đáp án: -1. \
Đoạn code không chạy phần lỗi vì đã tìm được đáp án sau

d)
test: x = [1;2;0;3;4]; Đáp án: 2. \
Đoạn code chạy phần lỗi nhưng vì chỉ có 1 số 0 nên dáp án trả về đúng


e)
Trong test đã đưa ra, sau khi duyệt đến địa chỉ x[0] thì ngừng và dẫn đến việc không tìm ra được số 0 cuối dùng;

####Code 3:
a)
<p>Hàm cần trả về số các số dương; tuy nhiên, hàm duyệt mảng lấy giá trị 0 là số dương, dẫn đến việc tính toán sai.</p>
Cách giải quyết:

Thay ("if (x[i] >= 0)")\
Bằng ("if (x[i] > 0)")

b)
test: x=[]; Đáp án: 0

c)
test: x = [1;2;3;4]; Đáp án: 4. \
Đoạn code không chạy phần lỗi vì không dính trường hợp sai

d)
Đoạn code chạy phần lỗi luôn đưa ra kết quả sai

e)
Trong test đã đưa ra, sau khi duyệt đến địa chỉ x[2] thì thực hiện ++count và dẫn đến sai số

####Code 4:
a)
<p>Hàm cần trả về số số dương hoặc chia 2 dư 1; tuy nhiên, hàm tính toán không lấy giá trị số âm chia 2 dư 1, dẫn đến việc thiếu trường hợp.</p>
Cách giải quyết:

Thay ("if (x[i]%2 == 1 || x[i] > 0)")\
Bằng ("if (x[i]%2 == -1 || x[i] > 0)")

b)
test: x=[]; Đáp án: 0

c)
test: x = [1;2;3;4]; Đáp án: 4. \
Đoạn code không chạy phần lỗi vì không dính trường hợp số âm

d)
Đoan code luôn đưa ra kết quả sai khi dính lỗi


e)
Trong test đã đưa ra, vị trí x[0] mặc dù chia 2 dư 1 nhưng không được đếm, dẫn đến sai kết quả.

