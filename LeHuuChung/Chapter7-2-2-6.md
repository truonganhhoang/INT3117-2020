Question
```
(a) List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage on the graph.
(b) List test paths that achieve Node Coverage but not Edge Coverage on the graph.
(c) List test paths that achieve Edge Coverage but not Prime Path Coverage on the graph.
```

Answer
```
(a)
Test Requirements for "Node Coverage": [1] [4] [5] [2] [6] [3] [7] [8] [9] [10]

Test Requirements for "Edge Coverage": [1,4] [1,5] [2,5] [2,6] [3,6] [3,7] [4,8] [5,8] [5,9] [6,9] [6,10] [7,10]

Test Requirements for "Prime Coverage": [2,5,8] [2,5,9] [1,5,9] [1,4,8] [1,5,8] [2,6,9] [3,6,10] [3,7,10] [3,6,9] [2,6,10]

(b)
[1,4,8]
[1,5,9]
[1,5,8]
[2,5,9]
[2,6,10]
[2,6,9]
[2,5,8]
[3,6,10]
[3,7,10]

(c)
[1,4,8]
[1,5,9]
[1,5,8]
[2,5,9]
[2,6,10]
[2,6,9]
[2,5,8]
[3,4,10]
[3,6,10]
[3,7,10]
```