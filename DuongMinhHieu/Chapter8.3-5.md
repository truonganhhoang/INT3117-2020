# Answer the following questions for the method checkIt() below:
(a) Transform `checkIt()` to `checkItExpand()`, a method where each if statement tests exactly one boolean variable. Instrument `checkItExpand()` to record which edges are traversed. (“print” statements are fine for this.)
(b) Derive a GACC test set T1 for checkIt(). Derive an Edge Coverage test set T2 for `checkItExpand()`. Build T2 so that it does not satisfy GACC on the predicate in `checkIt()`.
(c) Run both T1 and T2 on both checkIt() and checkItExpand().

# Trả lời:
* (a) Link code: <https://github.com/duongminhhieu16/CodeKiemThu>.

* (b) 
	* Tập kiểm thử T1 thỏa mãn GACC: {TTF, FTF, TFT}.
	* Tập kiểm thử T2 thỏa mãn bao phủ cạnh mà không thỏa mãn GACC: {TTT, FTT}.

* (c) Đã chạy.