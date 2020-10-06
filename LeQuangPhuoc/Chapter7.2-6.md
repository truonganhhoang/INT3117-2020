a)
* Các TR cho bao phủ Node: <br>
   TR = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
* Các TR cho bao phủ cạnh: <br>
   TR = {(1, 4), (1, 5), (2, 5), (6, 2), <br>
         (3, 6), (3, 7), (4, 8), (5, 8), <br>
         (5, 9), (9, 6), (6, 10), (7, 10)} <br>
* Các TR cho bao phủ đường đi chính: <br>
   TR = {[1, 4, 8], [1, 5, 8], [1, 5, 9, 6, 2], [1, 5, 9, 6, 10], <br>
         [2, 5, 9, 6, 2], [2, 5, 9, 6, 10], <br>
         [3, 6, 10], [3, 6, 2, 5, 8], [3, 6, 2, 5, 9], [3, 7, 10], <br>
         [5, 9, 6, 2, 5], <br>
         [6, 2, 5, 9, 6], <br>
         [9, 6, 2, 5, 8], <br>
         [9, 6, 2, 5, 9]} 
         
b) Các đường đi kiểm thử thỏa mãn bao phủ node nhưng không thỏa mãn bao phủ cạnh: <br>
   T1 = {[1, 4, 8], [2, 5, 9, 6, 10], [3, 7, 10]} <br>
   T1 không đi qua các canh (1, 5), (5, 8), (6, 2), (3, 6).
   
c) Các đường đi kiểm thử thỏa mãn bao phủ cạnh nhưng không thỏa mãn bao phủ đường đi chính: <br>
   T2 = T1 ∪ {[1, 5, 8], [3, 6, 2, 5, 8]} 

