Question
```
(a) Which of the listed paths are test paths? For any path that is not a test path, explain why not.
(b) List the eight test requirements for Edge-Pair Coverage (only the length two subpaths).
(c) Does the set of test paths from part (a) above satisfy Edge-Pair Coverage? If not, state what is missing.
(d) Consider the prime path [3, 1, 3] and path p2. Does p2 tour the prime path directly? With a sidetrip?
```

Answer
```
(a)
- Test paths: p1, p2, p3, p4
- There is no way to reach 2 from 3 directly so that p5 isn't the test path.
```
(b)
|Test Paths|	Test Requirements|
|---|---|
|[1,3,1,2,3]|	[1,3,1], [1,2,3], [3,1,2]|
|[1,2,1,2,3]|	[1,2,3], [1,2,1], [2,1,2]|
|[1,2,3,1,2,3]|	[1,2,3], [2,3,1], [3,1,2]|
|[1,2,1,3]|     [1,2,1], [2,1,3]|
|[1,2,3,1,3]|	[1,2,3], [2,3,1], [3,1,3]|

```
(c)
- Yes and no.
- p1 and p4 is not satisfied.

(d)
- Test path tour the simple path in INDIRECTLY.
- The sidestrip: [3, 1, 2, 1, 3]
```