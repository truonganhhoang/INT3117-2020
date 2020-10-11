3. Use the following program fragment for questions a–e below.
Use the following test inputs:
t1 = f1 (0, 0)
t2 = f1 (1, 1)
t3 = f1 (0, 1)
t4 = f1 (3, 2)
t5 = f1 (3, 4)
(a) Draw the call graph for this program fragment.
(b) Give the path in the graph followed by each test.
(c) Find a minimal test set that achieves Node Coverage.
(d) Find a minimal test set that achieves Edge Coverage.
(e) Give the prime paths in the graph. Which prime path is not
covered by any of the tests above?

(a) 
     -----------------
     |               |
     |               v
     1-----> 2 ----> 3 ----> 4
                     |       |
                     |       |
                     v       v
                     5 ----> 6
                     
(b) 
t1 : [1,3,5,6]
t2 : [1,3,4,6]
t3 : [1,2]
t4 : [1,3,4,6]
t5 : [1,2,3,4,6]

(c)
The test set are: t1,t5.

(d)
The test set are: t1,t5.

(e)
The prime paths are:
[1,2,3,4,6], [1,2,3,5,6], [1,3,4,6], [1,3,5,6]
The Prime path is not covered is:[1,2,3,5,6],



