# Answer questions a–c for the graph in Figure 7.2.
(a) List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage on the graph.
(b) List test paths that achieve Node Coverage but not Edge Coverage on the graph.
(c) List test paths that achieve Edge Coverage but not Prime Path Coverage on the graph.

# Trả lời:

* (a)
	- Bao phủ nút: TR = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}.
	- Bao phủ cạnh: TR = {(1, 4), (1, 5), (4, 8), (5, 8), (5, 9), (2, 5), (9, 6), (6, 2), (3, 6), (6, 10), (3, 7), (7, 10)}.
	- Bao phủ đường đi chính: TR = {[1, 4, 8], [1, 5, 8], [3, 6, 10], [3, 7, 10], [1, 5, 9, 6, 2], [1, 5, 9, 6, 10], [2, 5, 9, 6, 2], [2, 5, 9, 6, 10], [3, 6, 2, 5, 9], [3, 6, 2, 5, 9], [3, 6, 2, 5, 8], [5, 9, 6, 2, 5], [6, 2, 5, 9, 6], [9, 6, 2, 5, 9], [9, 6, 2, 5, 8].

* (b) Các đường kiểm thử thỏa mãn bao phủ nút nhưng không thỏa mãn bao phủ cạnh là: 
	- p1 = [1, 4, 8].
	- p2 = [1, 5, 9, 6, 2].
	- p3 = [3, 7, 10].

* (c) Các đường kiểm thử thỏa mãn bao phủ cạnh nhưng không thỏa mãn bao phủ đường đi chính là:
	- p1 = [1, 4, 8].
	- p2 = [1, 5, 8].
	- p3 = [2, 5, 9, 6, 2].
	- p4 = [3, 6, 10].
	- p5 = [3, 7, 10].