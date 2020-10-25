# Refer to the patternIndex() method in the PatternIndex program in Chapter 7. Consider Mutant A and Mutant B given below. Implementations are available on the book website in files.
* (a) If possible, design test inputs that do not reach the mutants.

* (b) If possible, design test inputs that satisfy reachability but not infection for the mutants.

* (c) If possible, design test inputs that satisfy reachability and infection, but not propagation for the mutants.

* (d) If possible, design test inputs that strongly kill the mutants.

# Trả lời:
* (a) Biến dị A: luôn chạm tới. Biến dị B: {subject, pattern} = {'aba', 'aa'}.

* (b) Biến dị A: {'a', 'aa'}. Biến dị B: luôn lây nhiễm vì `isPat = true` nên vòng lặp `while` luôn chạy: {'aba', 'aa'}.

* (c) Biến dị A: {'aa', 'aa'}. Biến dị B: không bao giờ lan truyền vì vòng lặp `while` lặp vĩnh viễn.

* (d) Biến dị A: {'aa', 'aa'}. Biến dị B: không bao giờ loại bỏ được vì đây là biến dị tương đương.