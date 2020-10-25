### Refer to the patternIndex() method in the PatternIndex program in Chapter 7. Consider Mutant A and Mutant B given below. Implementations are available on the book website in files.
![image](Images/924.png)
#### (a) If possible, design test inputs that do not reach the mutants.
Đầu vào kiểm thử không tới được các đột biến: <br>
A: TestPat X <br>
B: TestPat X X
#### (b) If possible, design test inputs that satisfy reachability but **not infection** for the mutants.
Đầu vào kiểm thử thỏa mãn tính tới được nhưng không lây nhiễm cho các đột biến: <br>
A: TestPat yet yes <br>
B: Không có.
#### (c) If possible, design test inputs that satisfy reachability and infection, but **not propagation** for the mutants.
Đầu vào kiểm thử thỏa mãn tính tới được và lây nhiễm nhưng không lan truyền cho các đột biến: <br>
A: TestPat yet yes <br>
B: TestPat yet yes
#### (d) If possible, design test inputs that **strongly kill** the mutants.
Đầu vào kiểm thử triệt tiêu được các đột biến: <br>
A: TestPat X X <br>
B: TestPat ohyeahyes yes