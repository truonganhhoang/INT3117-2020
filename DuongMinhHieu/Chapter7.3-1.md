# Use the following program fragment for questions a–e below.
* (a) Draw a control flow graph for this program fragment. Use the node numbers given above.
* (b) Which nodes have defs for variable w?
* (c) Which nodes have uses for variable w?
* (d) Are there any du-paths with respect to variable w from node 1 to
node 7? If not, explain why not. If any exist, show one.
* (e) List all of the du-paths for variables w and x.

# Trả lời:
* (a) Link đồ thị luồng dữ liệu: <https://github.com/duongminhhieu16/CodeKiemThu.git>.

* (b) def(1) = def(2) = def(3) = {w}.

* (c) use(2) = use(3) = use(7) = {w}.

* (d) Không có đường du tương ứng w mà đi từ nút 1 tới nút 7 vì từ nút 1 chỉ có cạnh đi qua nút 2 và nút 3, mà tại nút 2 và nút 3 thì giá trị w thay đổi (w xuất hiện trong def(2) và def(3)) do đó đường đi không def-clear do đó không phải du-path.

* (e) Những đường du tương ứng với biến w:
[1, 2], [1, 3],
[2, 4, 5, 7], [2, 4, 6, 7],
[3, 4, 5, 7], [3, 4, 6, 7].

Những đường du tương ứng với biến x:
[5, 7], [6, 7]