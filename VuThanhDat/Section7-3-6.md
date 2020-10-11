Ex 7.3-6

a. Draw the control flow graph for the fmtRewrap() method.

b. For fmtRewrap(), find a test case such that the corresponding test path visits the edge that connects the beginning of the while statement to the S = new String(SArr) + CR; statement without going through the body of the while loop.

There is only one test that does this{the empty string S. It doesn’t matter what N, the 54 output line length, is. The resulting path is [1; 2; 19].

c. List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage.

• Node Coverage: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
• Edge Coverage: [(1,2), (2,3), (2,19), (3,4), (3,5), (4,10), (5,6), (5,7), (6,10),
(7,8), (7,9), (8,10), (9,10), (10,11), (10,12), (10,13), (10,16), (10,17), (11,18),
(12,18), (13,14), (13,15), (14,18), (15,18), (16,17), (17,18), (18,2)]
• Prime Path Coverage: There are 403 prime paths for fmt.

d. List test paths that achieve Node Coverage but not Edge Coverage on the graph.

This is certainly possible. The key is noticing that it is possible to visit nodes 10, 16, and 17 without traversing edge (10,17). Test paths are available online.

e. List test paths that achieve Edge Coverage but not prime Path Coverage on the graph.
