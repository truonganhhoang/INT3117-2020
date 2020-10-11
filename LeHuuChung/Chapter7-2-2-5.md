Question
```
Answer questions a–g for the graph defined by the following sets:
N = {1, 2, 3, 4, 5, 6, 7}
N0 = {1}
Nf = {7}
E = {(1, 2), (1, 7), (2, 3), (2, 4), (3, 2), (4, 5), (4, 6), (5, 6), (6, 1)
Also consider the following (candidate) test paths:
p1 = [1, 2, 4, 5, 6, 1, 7]
p2 = [1, 2, 3, 2, 4, 6, 1, 7]
p3 = [1, 2, 3, 2, 4, 5, 6, 1, 7]
```

Answer
```
(a)
(1): start
(7): end
Graph:
(1) --> (2)
(2) --> (3)
(3) --> (2)
(2) --> (4)
(4) --> (6)
(4) --> (5)
(5) --> (6)
(6) --> (1)
(1) --> (7)
```


(b)
|Test Paths|    Test Requirements|
|---|---|
|[1,2,4,6,1,7]|	[1,2,4], [1,7], [2,4,6], [4,6,1], [6,1,7]|
|[1,2,4,5,6,1,7]|	[1,2,4], [1,7], [2,4,5], [4,5,6], [5,6,1], [6,1,7]|
|[1,2,3,2,3,2,4,6,1,7]|	[1,2,3], [1,7], [2,3,2], [2,4,6], [3,2,3], [3,2,4], [4,6,1], [6,1,7]|
|[1,2,4,6,1,2,4,6,1,7]|	[1,2,4], [1,7], [2,4,6], [4,6,1], [6,1,2], [6,1,7]|

```
(c)
- It doesn't satisfy Edge-Pair Coverage.
- (6 1 2) is missing.

(d)
- Test path tour the simple path in INDIRECTLY.
- The sidestrip:  [2, 3, 4, 6, 1]

(e)
- Test Requirements for "Node Coverage": [1] [2] [7] [3] [4] [5] [6]
- Test Requirements for "Edge Coverage": [1,2] [1,7] [2,3] [2,4] [3,2] [4,5] [4,6] [5,6] [6,1]
- Test Requirements for "Prime Paths":
[3, 2, 4, 5, 6, 1, 7]
[1, 2, 4, 5, 6, 1]
[2, 4, 5, 6, 1, 2]
[3, 2, 4, 6, 1, 7]
[4, 5, 6, 1, 2, 4]
[4, 5, 6, 1, 2, 3]
[5, 6, 1, 2, 4, 5]
[6, 1, 2, 4, 5, 6]
[1, 2, 4, 6, 1]
[2, 4, 6, 1, 2]
[4, 6, 1, 2, 4]
[4, 6, 1, 2, 3]
[6, 1, 2, 4, 6]
[2, 3, 2]
[3, 2, 3]

(f)
- Test paths achieve "Node Coverage": [1, 2, 3, 2, 4, 5, 6, 1, 7]

(g)
- Test paths achieve "Edge Coverage":
[1, 2, 3, 2, 4, 6, 1, 7]
[1, 2, 4, 5, 6, 1, 7]
```