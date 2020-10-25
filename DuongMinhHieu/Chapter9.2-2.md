# Answer questions (a) through (d) for the mutant on line 5 in the method `findVal()`.

* (a) If possible, find test inputs that do not reach the mutant.

* (b) If possible, find test inputs that satisfy reachability but not
infection for the mutant.

* (c) If possible, find test inputs that satisfy infection, but not
propagation for the mutant.

* (d) If possible, find test inputs that strongly kill the mutants.

# Trả lời:
* (a) Biến dị luôn được chạm tới.

* (b) Biến dị luôn lây nhiễm vì `i` luôn sai.

* (c) Ca kiểm thử không lan truyền: {number, val} = {null, 0}.

* (d) Ca kiểm thử loại bỏ mạnh biến dị: {number, val} = {[1, 0], 1}.