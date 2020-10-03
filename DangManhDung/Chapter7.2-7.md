Cho một đồ thị với các nút và cạnh sau,
* N = {1, 2, 3}
* N0 = {1}
* Nf = {3}
* E = {(1, 2), (1, 3), (2, 1), (2, 3), (3,1)}

Và cho các đường đi ứng cử,
* p1 = [1, 2, 3, 1]
* p2 = [1, 3, 1, 2, 3]
* p3 = [1, 2, 3, 1, 2, 1, 3]
* p4 = [2, 3, 1, 3]
* p5 = [1, 2, 3, 2, 3]

(a) Đường đi nào là đường đi kiểm thử?
* Đường đi kiểm thử là: p2, p3.
* p1 không phải là đường đi kiểm thử vì nó không kết thúc ở nút cuối cùng.
* p1 không phải là đường đi kiểm thử vì nó không bắt đầu ở nút khởi động.
* p5 không phải là đường đi kiểm thử vì nó có cạnh (3,2) không thuộc bộ các cạnh trong đồ thị.

(b) Liệt kê 8 yêu cầu kiểm thử cho bao hàm cặp cạnh.
* T = {[1, 2, 1], [1, 2, 3], [1, 3, 1], [2, 1, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 1, 3]}

(c) Đường đi kiểm thử ở câu (a) có thỏa mãn bao hàm cặp cạnh không?
* Không. Vì chúng còn thiếu [2,1,2] và [3,1,3]

(d) Cho đường đi nguyên tố [3,1,3] và đường đi p3 = [1, 2, 3, 1, 2, 1, 3]. p3 có tour đường đi nguyên tố không?
* Có. Nhưng mà cần phải có sidetrip. Đường đi nguyên tố với side trip (trong ngoặc) là

    [3,1,(2,1),3]