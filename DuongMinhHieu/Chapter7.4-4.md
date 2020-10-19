# Use the following methods `trash()` and `takeOut()` to answer questions a–c.
* (a) Give all call sites using the line numbers given.
* (b) Give all pairs of last-def s and first-uses.
* (c) Provide test inputs that satisfy all-coupling-uses (note that `trash()` only has one input).

# Trả lời:
* (a) Các bên gọi (call sites):
	* Dòng 12: `trash()` -> `takeOut()`.

* (b) Các cặp last-defs và first-uses:
	* Dòng 7 và 9 (biến m)
	* Dòng 5 và 11 (biến m).
	* Dòng 9 và 12 (biến n).
	* Dòng 11 và 12 (biến n).
	* Dòng 12 và 13 (biến o).
	* Dòng 19 và 21 (biến d).
	* Dòng 19 và 23 (biến d).
	* Dòng 21 và 24 (biến e).
	* Dòng 23 và 24 (biến e).

* Các đầu vào kiểm thử để thỏa mãn mọi cặp sử dụng là:
	* `x = 6`.
	* `x = -1`.