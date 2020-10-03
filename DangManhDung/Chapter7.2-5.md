Cho một đồ thị với các nút và cạnh sau:
* N = {1,2,3,4,5,6,7}
* N0 = {1}
* Nf = {7}
* E = {(1,2),(1,7),(2,3),(2,4),(3,2),(4,5),(4,6),(5,6),(6,1)}

Và các đường đi kiểm thử được ứng cử:
* p1 = [1,2,4,5,6,1,7]
* p2 = [1,2,3,2,4,6,1,7]
* p3 = [1,2,3,2,4,5,6,1,7]

(a) Vẽ đồ thị đó

![image](https://user-images.githubusercontent.com/48431650/94980216-bdd0ce00-0551-11eb-9285-162fdd1e667d.png)

(b) Liệt kê các yêu cầu kiểm thử cho bao hàm cặp cạnh.
* TR = {[1,2,3],[1,2,4],[2,3,2],[2,4,5],[2,4,6],[3,2,3],[3,2,4],[4,5,6],[4,6,1],[5,6,1],[6,1,2],[6,1,7]}

(c) Đường đi kiểm thử cho sẵn có thỏa mãn bao hàm cặp cạnh không?
* Không. Vì chúng còn thiếu [3,2,3] và [6,1,2]

(d) Cho đường đi đơn giản [3,2,4,5,6] và đường đi kiểm thử [1,2,3,2,4,6,1,2,4,5,6,1,7]. Đường đi kiểm thử có tour đường đi đơn giản không?
* Có, nhưng mà cần phải có sidetrip. Đường đi đơn giản tour được với sidetrip (trong ngoặc) là

    [3,2,4,(6,1,2,4),5,6]

(e) Liệt kê yêu cầu kiểm thử cho bao hàm nút, bao hàm cạnh, bao hàm đường đi nguyên tố
* Bao hàm nút: TR = {1,2,3,4,5,6,7}
* Bao hàm cạnh: TR = {(1,2),(1,7),(2,3),(2,4),(3,2),(4,5),(4,6),(5,6),(6,1)}
* Bao hàm đường đi nguyên tố: TR = {[1,7],[2,3,2],[1,2,3,2],[5,6,1,7],[1,2,4,6,1],[2,4,6,1,7],[2,4,6,1,2],[1,2,4,5,6,1],[2,4,5,6,1,2],[2,4,5,6,1,7],[5,6,1,2,4,5]}

(f) Liệt kê đường đi kiểm thử đạt được bao hàm nút nhưng không bao hàm cạnh
* path(T) = {[1,2,3,2,4,5,6,1,7]}. Ngoài ra còn có vô tận các đường đi đạt được từ vòng lặp [2,3,2] và [1,2,4,5,6,1]

(g) Liệt kê đường đi kiểm thử đạt được bao hàm cạnh nhưng không bao hàm đường di nguyên tố
* path(T) = {[1,2,3,2,4,5,6,1,2,4,6,1,7]}. Ngoài ra còn có vô tận các đường đi đạt được từ vòng lặp [2,3,2], [1,2,4,6,1] và [1,2,4,5,6,1]