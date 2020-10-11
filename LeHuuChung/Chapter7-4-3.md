Question
```
Use the following test inputs:
t1 = f1(0, 0)
t2 = f1 (1, 1)
t3 = f1 (0, 1)
t4 = f1 (3, 2)
t5 = f1 (3, 4)
(a) Draw the call graph for this program fragment.
(b) Give the path in the graph followed by each test.
(c) Find a minimal test set that achieves Node Coverage.
(d) Find a minimal test set that achieves Edge Coverage.
(e) Give the prime paths in the graph. Which prime path is not covered by any of the tests above?
```

Answer
```
(a)
- The code show that (2) is final and (6) may be final, nodes (1), (3), (4), (5) are not final. Graph:
(1) --> (2)
(1) --> (3)
(2) --> (3)
(3) --> (4)
(3) --> (5)
(4) --> (6)
(5) --> (6)

(b)
- The path:
t1 : [ f1, f3, f5, f6 ]
t2 : [ f1, f3, f4, f6 ]
t3 : [ f1, f2 ]
t4 : [ f1, f3, f4, f6]
t5 : [ f1, f2, f3, f4, f6]

(c)
- 3 minimal test set that achieves "Node Coverage":
+ { t1, t2, t3 }
+ { t1, t3, t4 }
+ { t1, t5 }

(d)
- There is only one minimal test set that achieves "Edge Coverage": {t1,t5}

(e)
- 4 prime paths : {[f1, f2, f3, f4, f6], [f1, f2, f3, f5, f6], [f1, f3, f4, f6], [f1, f3, f5, f6]}
- Prime path isn't covered : [f1, f2, f3, f5, f6]
```