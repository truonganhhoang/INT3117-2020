Cho một đồ thị với các nút và cạnh sau:
* N = {1, 2, 3, 4}
* N0 = {1}
* Nf = {4}
* E = {(1, 2), (2, 3), (3, 2), (2, 4)}

(a) Vẽ đồ thị đó

![image](https://user-images.githubusercontent.com/48431650/94979903-da6c0680-054f-11eb-80ac-19cc9106a934.png)

(b) Liệt kê các đường đi đạt được bao hàm nút nhưng không bao hàm cạnh nếu có thể.
* Điều này là không thể vì mọi đường đi kiểm thử bắt đầu từ nút, visit nút 2 và kết thúc ở nút 4. Bất kỳ đường đi nào visit nút 3 sẽ visit cả hai cạnh (2, 3) và (3, 2)

(c) Liệt kê các đường đi đạt được bao hàm cạnh nhưng không bao hàm cặp cạnh nếu có thể.
* T={[1,2,3,2,4]}

(d) Liệt kê các đường đi đạt được bao hàm cặp cạnh
* T={[1,2,4],[1,2,3,2,3,2,4]}