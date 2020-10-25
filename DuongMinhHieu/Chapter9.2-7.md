# Define 12 mutants for the following method `power()` using the effective mutation operators given previously. Try to use each mutation operator at least once. Approximately how many mutants do you think there would be if all mutants for `power()` were created?

# Trả lời:
* Các biến dị:
	* `rslt = left` đổi thành `rslt -= left`.
	* `rslt = left` đổi thành `rslt += left`.
	* `rslt = left` đổi thành `rslt *= left`.
	* `right == 0` đổi thành `right != 0`.
	* `right == 0` đổi thành `right >= 0`.
	* `rslt = 1` đổi thành `rslt /= 1`.
	* `rslt = 1` đổi thành `rslt leftOp 1`.
	* `int i = 2` đổi thành `int i = 0`.
	* `int i = 2` đổi thành `int i += 0`.
	* `rslt = rslt * left` đổi thành `rslt += rslt * left`.
	* `rslt = rslt * left` đổi thành `rslt = rslt % left`.
	* `rslt = rslt * left` đổi thành `rslt = rslt / left`.

* Để tạo ra tất cả biến dị thì có khoảng 80 biến dị.