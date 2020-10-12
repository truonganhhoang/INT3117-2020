# Section 7.2-6

# Answer questions a{c for the graph in Figure 7.2.

a, List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage
on the graph.

- Bao phủ các Node: 
    T = {1; 2; 3; 4; 5; 6; 7; 8; 9; 10}
- bao phủ đỉnh:
    T = {(1; 4); (1; 5); (2; 5); (3; 6); (3; 7); (4; 8); (5; 8); (5; 9); (6; 2); (6; 10; (7; 10); (9; 6)}
- Đường đi chính: 
    T = {[1; 4; 8]; [1; 5; 8]; [1; 5; 9; 6; 2]; [1; 5; 9; 6; 10]; [2; 5; 9; 6; 2]; [2; 5; 9; 6; 10]; [3; 6; 2; 5; 8]; [3; 6; 2; 5; 9]; [3; 6; 10]; [3; 7; 10]; [5; 9; 6; 2; 5]; [6; 2; 5; 9; 6]; [9; 6; 2; 5; 8]; [9; 6; 2; 5; 9]}


b, List test paths that achieve Node Coverage but not Edge Coverage on the graph.

- Liệt kê các đường đi kiểm tra mà là bao phủ node nhưng không phải bao phủ đỉnh ở trên đồ thị:
    T={[1; 4; 8], [2; 5; 9; 6; 10], [3; 7; 10]}

c, List test paths that achieve Edge Coverage but not Prime Path Coverage on the graph.

- Liệt kê các bài kiểm tra mà thỏa mãn bao phủ đỉnh mà không phải đường đi chính
    T={[1; 4; 8], [2; 5; 9; 6; 10], [3; 7; 10], [3; 6; 2; 5; 8], [1; 5; 8]}