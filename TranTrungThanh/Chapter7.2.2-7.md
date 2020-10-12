>Answer questions a–d for the graph defined by the following sets:
>- N = {1, 2, 3}
>- N<sub>0</sub> = {1}
>- N<sub>f</sub> = {3}
>- E = {(1, 2), (1, 3), (2, 1), (2, 3), (3, 1)}

>Also consider the following (candidate) paths:
>- p<sub>1</sub> = [1, 2, 3, 1]
>- p<sub>2</sub> = [1, 3, 1, 2, 3]
>- p<sub>3</sub> = [1, 2, 3, 1, 2, 1, 3]
>- p<sub>4</sub> = [2, 3, 1, 3]
>- p<sub>5</sub> = [1, 2, 3, 2, 3]
>
>(a) Which of the listed paths are test paths? For any path that is not
 a test path, explain why not.\
 (b) List the eight test requirements for Edge-Pair Coverage (only
 the length two subpaths).\
 (c) Does the set of test paths from part (a) above satisfy Edge-Pair
 Coverage? If not, state what is missing.\
 (d) Consider the prime path [3, 1, 3] and path p2. Does p2 tour the
 prime path directly? With a sidetrip?
>

(a)
- p<sub>2</sub> và p<sub>3</sub> là đường dẫn thử nghiệm. 
- p<sub>1</sub> không kết thúc tại nút cuối cùng. 
- p<sub>4</sub> không bắt đầu tại nút ban đầu. 
- p<sub>5</sub> bao gồm một cạnh không tồn tại trong đồ thị (3, 2).

(b)
Các cặp cạnh là:
```{[1, 2, 1], [1, 2, 3], [1, 3, 1], [2, 1, 2], [2, 1, 3], [2, 3, 1], [ 3, 1, 2], [3, 1, 3]}```

(c)
Không. Cả p<sub>2</sub> và p<sub>3</sub> đều không tham quan một trong các cặp cạnh sau: ```{[2, 1, 2], [3, 1, 3]}```

(d)
p<sub>3</sub> không tham quan trực tiếp đường dẫn chính. Tuy nhiên, p3 thực hiện tham quan đường dẫn chính với đường phụ ```[1, 2, 1]```.


