# Chapter 7.2.2-6

> Answer questions a–c for the graph in Figure 7.2.\
> (a) List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage on the graph.\
> (b) List test paths that achieve Node Coverage but not Edge Coverage on the graph.\
> (c) List test paths that achieve Edge Coverage but not Prime PathCoverage on the graph.

(a)

- TR<sub>NC</sub> = ```{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}```.
- TR<sub>EC</sub> = ```{(1, 4), (1, 5), (2, 5), (3, 6), (3, 7), (4, 8), (5, 8), (5, 9), (6, 2), (6, 10), (7, 10), (9, 6) }```.
- TR<sub>PPC</sub> = ```{ [1, 4, 8], [1, 5, 8], [1, 5, 9, 6, 2], [1, 5, 9, 6, 10], [2, 5, 9, 6, 2], [2, 5, 9, 6, 10], [3, 6, 2, 5, 8], [3, 6, 2, 5, 9], [3, 6, 10], [3, 7, 10], [5, 9, 6, 2, 5], [6, 2, 5, 9, 6], [9, 6, 2, 5, 8], [9, 6, 2, 5, 9]}```.

(b)

- T<sub>NC</sub> = ```{[1, 4, 8], [2, 5, 9, 6, 10], [3, 7, 10]}``` \
- Mặc dù T<sub>NC</sub> truy cập tất cả các nút, nhưng nó không đi qua các cạnh ```(1, 5), (5, 8), (6, 2), (3, 6)```.

(c)

- T<sub>EC</sub> = ```{[1, 4, 8], [2, 5, 9, 6, 10], [3, 7, 10], [1, 5, 8], [3, 6, 2, 5, 8], }```\
