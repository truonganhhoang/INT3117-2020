# Provide reachability conditions, infection conditions, propagation conditions, and test case values to kill mutants 2, 4, 5, and 6 in Figure 9.1. 

# Trả lời:
* Để loại bỏ biến dị 2:
	* Tính chạm tới: B > A: true.
	* Tính lây nhiễm: true (luôn lây nhiễm vì `minVal` luôn thay đổi).
	* Tính lan truyền: true (vì luôn ra kết quả sai ở đầu ra).
	* Ca kiểm thử: {1, 2}.

* Để loại bỏ biến dị 4:
	* Tính chạm tới: B < A: true.
	* Tính lây nhiễm: true.
	* Tính lan truyền: true (vì luôn trả về exception).
	* Ca kiểm thử: {2, 1}.

* Để loại bỏ biến dị 5:
	* Tính chạm tới: B < A: true.
	* Tính lây nhiễm: true.
	* Tính lan truyền: true (vì output sai).
	* Ca kiểm thử: {2, 1}.

* Để loại bỏ biến dị 6:
	* Tính chạm tới: B < A: true.
	* Tính lây nhiễm: B = 0.
	* Tính lan truyền: true (vì có failure).
	* Ca kiểm thử: {2, 0}.