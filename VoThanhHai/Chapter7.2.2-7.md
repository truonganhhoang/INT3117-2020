#### N = {1, 2, 3}
#### N0 = {1}
#### Nf = {3}
#### E = {(1, 2), (1, 3), (2, 1), (2, 3), (3, 1)}
#### p1 = [1, 2, 3, 1]
#### p2 = [1, 3, 1, 2, 3]
#### p3 = [1, 2, 3, 1, 2, 1, 3]
#### p4 = [2, 3, 1, 3]
#### p5 = [1, 2, 3, 2, 3]

#### (a) Which of the listed paths are test paths? For any path that is not a test path, explain why not.
Đường dẫn p2 và p3 là đường dẫn kiểm thử. <br>
Đường dẫn p1 không thỏa mãn vì nút kết thúc không thuộc N<sub>f</sub>. <br>
Đường dẫn p4 không thỏa mãn vì nút bắt đầu không thuộc N<sub>0</sub>. <br>
Đường dẫn p5 không thỏa mãn vì có cạnh (3, 2) không thuộc tập E. <br>
#### (b) List the eight test requirements for Edge-Pair Coverage (only the length two subpaths).
Tập các yêu cầu kiểm thử thỏa mãn: {[1, 2, 1], [1, 2, 3], [1, 3, 1], [2, 1, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 1, 3]}.
#### (c) Does the set of test paths from part (a) above satisfy Edge-Pair Coverage? If not, state what is missing.
Cả p2 và p3 đều không thỏa mãn độ phủ cặp cạnh vì thiếu [2, 1, 2] và [3, 1, 3].
#### (d) Consider the prime path [3, 1, 3] and path p3. Does p3 tour the prime path directly? With a sidetrip?
p3 tham quan (tour) đường dẫn nguyên tố. Với sidestrip: [3, 1, (2, 1), 3].
