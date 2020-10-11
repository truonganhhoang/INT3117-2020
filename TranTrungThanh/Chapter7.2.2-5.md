>Answer questions a–g for the graph defined by the following sets:
>- N = {1, 2, 3, 4, 5, 6, 7}
>- N<sub>0</sub> = {1}
>- N<sub>f</sub> = {7}
>- E = {(1, 2), (1, 7), (2, 3), (2, 4), (3, 2), (4, 5), (4, 6), (5, 6), (6, 1)}
>
> Also consider the following (candidate) test paths:
>- p1 = [1, 2, 4, 5, 6, 1, 7]
>- p2 = [1, 2, 3, 2, 4, 6, 1, 7]
>- p3 = [1, 2, 3, 2, 4, 5, 6, 1, 7]
>
> (a) Draw the graph.\
 (b) List the test requirements for Edge-Pair Coverage. (Hint: You
 should get 12 requirements of length 2.)\
 (c) Does the given set of test paths satisfy Edge-Pair Coverage? If
 not, state what is missing.\
 (d) Consider the simple path [3, 2, 4, 5, 6] and test path [1, 2, 3, 2,
 4, 6, 1, 2, 4, 5, 6, 1, 7]. Does the test path tour the simple path
 directly? With a sidetrip? If so, write down the sidetrip.\
 (e) List the test requirements for Node Coverage, Edge Coverage,
 and Prime Path Coverage on the graph.\
 (f) List test paths from the given set that achieve Node Coverage
 but not Edge Coverage on the graph.\
 (g) List test paths from the given set that achieve Edge Coverage
 but not Prime Path Coverage on the graph.

(b)\
Các cặp cạnh là: ```{[1, 2, 3], [1, 2, 4], [2, 3, 2], [2, 4, 5], [2, 4, 6], [3, 2 , 3],
[3, 2, 4], [4, 5, 6], [4, 6, 1], [5, 6, 1], [6, 1, 2], [6, 1, 7]}```

(c)\
Không. Cả p<sub>1</sub>, p<sub>2</sub> và p<sub>3</sub> đều không xem xét các cặp cạnh sau: ```{[3, 2, 3], [6, 1, 2]}```

(d)\
Không trực tiếp. Có sidetrip ```[4, 6, 1, 2, 4]```.

(e)\
- NC: ```{1, 2, 3, 4, 5, 6, 7}```.
- EC: ```{(1, 2), (1, 7), (2, 3), (2, 4), (3, 2), (4, 5), (4, 6), (6, 1), (5, 6)}```.
- PPC: ```{[1, 2, 4, 5, 6, 1], [1, 2, 4, 6, 1], [2, 4, 6, 1, 2], [2, 4, 5, 6, 1, 2],
[3, 2, 4, 6, 1, 7], [3, 2, 4, 5, 6, 1, 7], [4, 6, 1, 2, 4], [4, 5, 6, 1, 2, 4],
[4, 6, 1, 2, 3], [4, 5, 6, 1, 2, 3], [5, 6, 1, 2, 4, 5], [6, 1, 2, 4, 6], [6, 1, 2, 4, 5, 6],
[3, 2, 3], [2, 3, 2]}```.

(f)\
```[1, 2, 3, 2, 4, 5, 6, 1, 7]``` (không đi qua cạnh ```(4, 6)```)

(g)\
```[1, 2, 3, 2, 4, 5, 6, 1, 7], [1, 2, 4, 6, 1, 7]```


