# Answer questions a–d for the graph defined by the following sets:
N = {1, 2, 3, 4}
N0 = {1}
Nf = {4}
E = {(1, 2), (2, 3), (3, 2), (2, 4)}
* (a) Draw the graph.
* (b) If possible, list test paths that achieve Node Coverage, but not Edge Coverage. If not possible, explain why not.
* (c) If possible, list test paths that achieve Edge Coverage, but not Edge-Pair Coverage. If not possible, explain why not.
* (d) List test paths that achieve Edge-Pair Coverage.


# Trả lời:

* (a) Link ảnh đồ thị: <https://github.com/duongminhhieu16/CodeKiemThu.git>.

* (b) Tại đồ thị này ta không thể liệt kê đường kiểm thử mà chỉ thỏa mãn bao phủ nút mà không thỏa mãn bao phủ cạnh vì với bao phủ nút, đường kiểm thử sẽ đi hết các nút 1, 2, 3, 4; nghĩa là đường kiểm thử là 1-2-3-2-4, nó sẽ đi hết các cạnh do đó thỏa mãn bao phủ cạnh luôn.

* (c) T = {[1, 2, 3, 2, 4]} vì thiếu cặp cạnh [3, 2, 3].

* (d) T = {[1, 2, 3, 2, 3, 2, 4], [1, 2, 4]}.