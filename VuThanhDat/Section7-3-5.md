Ex 7.3-5

a. Find the actual path followed by each test case.
t1: java PatternIndexInstrument "brown owl" wl
Pattern string begins at the character 7
Path is [1, 2, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 5, 6, 7, 8, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 5, 6, 7, 9, 6, 10, 3, 11]

t2: java PatternIndexInstrument "brown fox" dog
Pattern string is not a substring of the subject string
Path is [1, 2, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 11]

t3: java PatternIndexInstrument fox brown
Pattern string is not a substring of the subject string
Path is [1, 2, 3, 11] 

b. For each path, give the du-paths that the path tours in the table at the end of Section 7.3. To reduce the scope of this exercise, consider only the following du-paths: du (10, iSub), du (2, isPat), du (5, isPat), and du (8, isPat) .

| Source      | du-path             | t1   | t2   | t3   |
| ----------- | ------------------- | ---- | ---- | ---- |
| du(10,iSub) | [10,3,4,5,6,7,9]    | +    | -    | -    |
|             | [10,3,4,5,6,10]     | +!   | -    | -    |
|             | [10,3,4,5,6,7,8,10] | +    | -    | -    |
|             | [10,3,4,10]         | +    | +    | -    |
|             | [10,3,11]           | +    | +    | -    |
| du(2,isPat) | [2,3,4]             | +    | +    | -    |
|             | [2,3,11]            | -!   | +!   | +    |
| du(5,isPat) | [5,6,10,3,4]        | -    | -    | -    |
|             | [5,6,10,3,11]       | +!   | -    | -    |
| du(8,isPat) | [8,10,3,4]          | +    | -    | -    |
|             | [8,10,3,11]         | -!   | -    | -    |

c. Explain why the du-path [5; 6; 10; 3; 4] cannot be toured by any test path.

Since the value if isPat is set to true in node 5 and not reset on the path [6; 10; 3],
the next node must be 11, not 4. Hence the du path [5; 6; 10; 3; 4] is infeasible.

d. Select tests from the table at the end of Section 7.3 to complete coverage of the (feasible) du-paths that are uncovered in question (a).

The given tests do not directly tour the following 3 (feasible) du-paths: [10, 3, 4, 5, 6, 10], [5, 6, 10, 3, 11], and [8, 10, 3, 11]. According to Table 7.5, tests (ab,b), (ab,a), and (ab,ac) respectively tour these du-paths directly. Note that Best Effort touring requires a direct tour of each feasible du-path.

e. From the tests above, find a minimal set of tests that achieves All-Defs Coverage with respect to the variable isPat.

We need to tour 3 du-paths, starting with, respectively, nodes 2, 5, and 8. Possible minimal sets are: [t1; (ab; b)], [t1; (ab; a)], [(ab; b); (ab; ac)], or [(ab; a); (ab; ac)]. 

f. From the tests above, find a minimal set of tests that achieves All-Uses Coverage with respect to the variable isPat.

For All-Uses (Best Effort Touring) with respect to isPat, we need to tour the 5 feasible du-paths starting with nodes 2, 5, and 8. Tests t1, t3, and (ab; ac) are always needed since they are the only tests that tour [8, 10, 3, 4], [2, 3, 11], and [8, 10, 3, 11], respectively. In addition, we need either (ab; b) or (ab; a) to tour [2, 3, 4] and [5, 6, 10, 3, 11]. Hence there are two possible answers: [t1; t3 (ab; b); (ab; ac)] or [t1; t3 (ab; a); (ab; ac)].

g. Is there any difference between All-Uses Coverage and all-DU-Paths Coverage with respect to the variable isPat in the pat() method?

No. The test requirements are the same with respect to isPat. Note, however, that they are not the same with respect to iSub.