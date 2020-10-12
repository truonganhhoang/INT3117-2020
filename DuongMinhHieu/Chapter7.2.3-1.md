# Below are four graphs, each of which is defined by the sets of nodes, initial nodes, final nodes, edges, and defs and uses. Each graph also contains some test paths. Answer the following questions about each graph.

* (a) Draw the graph.

* (b) List all of the du-paths with respect to x. (Note: Include all dupaths, even those that are subpaths of some other du-path).

* (c) Determine which du-paths each test path tours. Write them in a table with test paths in the first column and the du-paths they cover in the second column. For this part of the exercise, you should consider both direct touring and sidetrips.

* (d) List a minimal test set that satisfies all defs coverage with respect to x. (Direct tours only.) If possible, use the given test paths. If not, provide additional test paths to satisfy the criterion.

* (e) List a minimal test set that satisfies all uses coverage with respect to x. (Direct tours only.) If possible, use the given test paths. If not, provide additional test paths to satisfy the criterion.

* (f) List a minimal test set that satisfies all du-paths coverage with respect to x. (Direct tours only.) If possible, use the given test paths. If not, provide additional test paths to satisfy the criterion.


# Đồ thị 1:

* (a) Link đồ thị: <https://cs.gmu.edu:8443/offutt/coverage/DFGraphCoverage?edges=1+2%0D%0A2+3%0D%0A2+8%0D%0A3+4%0D%0A3+5%0D%0A4+3%0D%0A5+6%0D%0A5+7%0D%0A6+7%0D%0A7+2%0D%0A&initialNode=1&endNode=8&defs=x%201%204%0D%0A&uses=x%206%208%0D%0A&action=DU%20Pairs>

* (b) Đường du tương ứng với x: 
[1, 2, 8], 
[1, 2, 3, 5, 6], 
[4, 3, 5, 6], 
[4, 3, 5, 7, 2, 8], 
[4, 3, 5, 6, 7, 2, 8].

* (c)
| Test paths | du-paths |
|------------|----------|
| [1, 2, 8] | [1, 2, 8] |
| [1, 2, 3, 5, 7, 2, 8] | [1, 2, 8] |
| [1, 2, 3, 5, 6, 7, 2, 8] | [1, 2, 8], [1, 2, 3, 5, 6] |
| [1, 2, 3, 4, 3, 5, 7, 2, 8] | [1, 2, 8], [4, 3, 5, 7, 2, 8] |
| [1, 2, 3, 4, 3, 4, 3, 5, 6, 7, 2, 8] | [1, 2, 8], [4, 3, 5, 6], [1, 2, 3, 5, 6], [4, 3, 5, 6, 7, 2, 8] |
| [1, 2, 3, 4, 3, 5, 7, 2, 3, 5, 6, 7, 2, 8] | [1, 2, 8], [4, 3, 5, 6], [1, 2, 3, 5, 6], [4, 3, 5, 6, 7, 2, 8], [4,3,5,6,7,2,8]|

* (d) Tập kiểm thử thỏa mãn bao phủ tất cả định nghĩa: [1,2,8],
[1,2,3,4,3,5,6,7,2,8].

* (e) Tập kiểm thử thỏa mãn bao phủ tất cả sử dụng: 
[1,2,3,5,6,7,2,8],
[1,2,8],
[1,2,3,4,3,5,6,7,2,8],
[1,2,3,4,3,5,7,2,8].

* (f) Tập kiểm thử thỏa mãn bao phủ tất cả đường du: 
[1,2,8],
[1,2,3,5,6,7,2,8],
[1,2,3,4,3,5,6,7,2,8],
[1,2,3,4,3,5,7,2,8].

# Đồ thị 2:

* (a) Link đồ thị: <https://cs.gmu.edu:8443/offutt/coverage/DFGraphCoverage?edges=1+2%0D%0A2+3%0D%0A2+6%0D%0A3+4%0D%0A3+5%0D%0A4+5%0D%0A5+2%0D%0A&initialNode=1&endNode=6&defs=x%201%203%0D%0A&uses=x%203%206%0D%0A&action=DU%20Paths>

* (b) Tất cả đường du tương ứng với x:
[1,2,6],
[1,2,3],
[3,5,2,3],
[3,5,2,6],
[3,4,5,2,3],
[3,4,5,2,6].

* (c) 
| Test paths | du-paths |
|------------|----------|
| [1, 2, 6] | [1, 2, 6] |
| [1, 2, 3, 4, 5, 2, 3, 5, 2, 6] | [1, 2, 6], [1, 2, 3], [3, 5, 2, 6], [3, 4, 5, 2, 3], [3, 4, 5, 2, 6] |
| [1, 2, 3, 5, 2, 3, 4, 5, 2, 6] | [1, 2, 6], [1, 2, 3], [3, 5, 2, 6], [3, 4, 5, 2, 6], [3, 5, 2, 6] |
| [1, 2, 3, 5, 2, 6] | [1, 2, 6], [1, 2, 3], [3, 5, 2, 6] |

* (d) Tập kiểm thử thỏa mãn bao phủ tất cả định nghĩa:
[1,2,6],
[1,2,3,5,2,3,5,2,6].

* (e) Tập kiểm thử thỏa mãn bao phủ tất cả sử dụng:
[1,2,3,5,2,6],
[1,2,6],
[1,2,3,5,2,3,5,2,6].

* (f) Tập kiểm thử thỏa mãn bao phủ tất cả đường du:
[1,2,6],
[1,2,3,5,2,6],
[1,2,3,5,2,3,5,2,6],
[1,2,3,4,5,2,3,5,2,6],
[1,2,3,4,5,2,6].

# Đồ thị 3:

* (a) Link đồ thị: <https://cs.gmu.edu:8443/offutt/coverage/DFGraphCoverage?edges=1+2%0D%0A2+3%0D%0A3+4%0D%0A3+5%0D%0A4+5%0D%0A5+2%0D%0A2+6%0D%0A&initialNode=1&endNode=6&defs=x%201%204%0D%0A&uses=x%203%205%206%0D%0A&action=DU%20Paths>
Căn cứ vào đường kiểm thử đã cho thấy được nút cuối cùng là 6 (vì trong đề không cho Nf = {6} nên phải tự suy ra).

* (b) Tất cả đường du tương ứng với x là:
[1,2,6],
[1,2,3],
[1,2,3,5],
[4,5],
[4,5,2,3],
[4,5,2,6].

* (c)
| Test paths | du-paths |
|------------|----------|
| [1, 2, 3, 5, 2, 6] | [1, 2, 6], [1, 2, 3], [1, 2, 3, 5] |
| [1, 2, 3, 4, 5, 2, 6] | [1, 2, 6], [1, 2, 3], [4, 5], [4, 5, 2, 6] |

* (d) Các tập kiểm thử thỏa mãn bao phủ tất cả định nghĩa là:
[1,2,6],
[1,2,3,4,5,2,6].

* (e) Tập kiểm thử thỏa mãn bao phủ tất cả sử dụng:
[1,2,3,5,2,6],
[1,2,6],
[1,2,3,4,5,2,3,5,2,6],
[1,2,3,4,5,2,6].

* (f) Tập kiểm thử thỏa mãn bao phủ tất cả đường du:
[1,2,6],
[1,2,3,5,2,6],
[1,2,3,4,5,2,6],
[1,2,3,4,5,2,3,5,2,6].

# Đồ thị 4:

(a) Link đồ thị: <https://cs.gmu.edu:8443/offutt/coverage/DFGraphCoverage?edges=1+2%0D%0A2+3%0D%0A2+6%0D%0A3+4%0D%0A3+5%0D%0A4+5%0D%0A5+2%0D%0A&initialNode=1&endNode=6&defs=x%201%205%0D%0A&uses=x%205%206%0D%0A&action=DU%20Paths>

(b) Tất cả đường du tương ứng với x là:
[1,2,6],
[1,2,3,5],
[1,2,3,4,5],
[5,2,6],
[5,2,3,5],
[5,2,3,4,5].

(c)
| Test paths | du-paths |
|------------|----------|
| [1, 2, 6] | [1, 2, 6] |
| [1, 2, 3, 4, 5, 2, 3, 5, 2, 6] | [1, 2, 6], [1, 2, 3, 5], [1, 2, 3, 4, 5], [5, 2, 6], [5, 2, 3, 5] |
| [1, 2, 3, 5, 2, 3, 4, 5, 2, 6] | [1, 2, 6], [1, 2, 3, 5], [1, 2, 3, 4, 5], [5, 2, 6], [5, 2, 3, 4, 5] |

* (d) Các tập kiểm thử thỏa mãn bao phủ tất cả định nghĩa là:
[1,2,6],
[1,2,3,5,2,6].

* (e) Tập kiểm thử thỏa mãn bao phủ tất cả sử dụng:
[1,2,3,5,2,6],
[1,2,6],
[1,2,3,5,2,3,5,2,6].

* (f) Tập kiểm thử thỏa mãn bao phủ tất cả đường du:
[1,2,6],
[1,2,3,5,2,6],
[1,2,3,4,5,2,6],
[1,2,3,5,2,3,5,2,6],
[1,2,3,5,2,3,4,5,2,6].