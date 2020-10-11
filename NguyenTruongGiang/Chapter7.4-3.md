
###(a) Draw the call graph for this program fragment.
- The code show that (2) is final and (6) may be final, nodes (1), (3), (4), (5) are not final. Graph: <br>
(1) --> (2)<br>
(1) --> (3)<br>
(2) --> (3)<br>
(3) --> (4)<br>
(3) --> (5)<br>
(4) --> (6)<br>
(5) --> (6)<br>

###(b) Give the path in the graph followed by each test.
- The path: <br>
t1 : [ f1, f3, f5, f6 ]<br>
t2 : [ f1, f3, f4, f6 ]<br>
t3 : [ f1, f2 ]<br>
t4 : [ f1, f3, f4, f6]<br>
t5 : [ f1, f2, f3, f4, f6]<br>

###(c) Find a minimal test set that achieves Node Coverage.
- 3 minimal test set that achieves "Node Coverage":
    + { t1, t2, t3 }
    + { t1, t3, t4 }
    + { t1, t5 }

###(d) Find a minimal test set that achieves Edge Coverage.
- There is only one minimal test set that achieves "Edge Coverage": {t1,t5}

###(e) Give the prime paths in the graph. Which prime path is not covered by any of the tests above?
- 4 prime paths : {[f1, f2, f3, f4, f6], [f1, f2, f3, f5, f6], [f1, f3, f4, f6], [f1, f3, f5, f6]}
- Prime path isn't covered : [f1, f2, f3, f5, f6]
