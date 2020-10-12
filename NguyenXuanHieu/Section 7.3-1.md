# Section 7.3-1

# Use the following program fragment for questions a–e below.

a, Draw a control flow graph for this program fragment. Use the
node numbers given above.

b, Which nodes have defs for variable w?

- Node 1, 2, 3 có hàm (have defs) của w


c, Which nodes have uses for variable w?

- Node 2, 3, 7 có sử dụng (have uses) của w

đ, Are there any du-paths with respect to variable w from node 1 to
node 7? If not, explain why not. If any exist, show one.

- Không có đường dẫn def-clear w từ 1 đến 7. Định nghĩa (defs) trên node 2 và 3 chắn định nghĩa (def) trên node 1.

e, List all of the du-paths for variables w and x.

| | | |
|-|-|-|
|i | [1, 2] | w | 
|ii | [1, 3] | w |
|iii | [2, 4, 5, 7] | w|
|iv | [2, 4, 6, 7] | w|
|v | [3, 4, 5, 7] | w|
|vi | [3, 4, 6, 7] | w|
|vii | [5, 7] |x|
|viii | [6, 7] |x|