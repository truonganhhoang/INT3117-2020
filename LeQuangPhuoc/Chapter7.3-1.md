a) Vẽ đồ thị CFG <br>
   LeQuangPhuoc/Chapter7.3-1a.jpg
   
b) Các node định nghĩa (def) biến w: <br>
   Node 1, 2, 3
 
c) Các node sử dụng biến w: <br>
   Node 2, 3, 7
   
d) Không có đường def-clear cho biến w từ node 1 đến 7 vì có định nghĩa ở node 2 và 3

e) Các đường du cho biến w, x:
   * Biến w: [1, 2], [1, 3], [2, 4, 5, 7], [2, 4, 6, 7], [3, 4, 5, 7], [3, 4, 6, 7]
   * Biến x: [5, 7], [6, 7]
