a Vẽ đồ thị CFG cho phương thức ```printPrimes()```:
![image](LeQuangPhuoc/images/Chapter7.3-7a.jpg)

b Lỗi đơn giản ```while (numPrimes < 3)```

c Test case cần tìm là ``` n = 1 ```

d Các TR thỏa mãn:
  * Bao phủ node: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}
  * Bao phủ cạnh: {(0, 1) (1, 2), (1, 10), (2, 3), (3, 4), (3, 7), (4, 5), 
                   (4, 6), (6, 3), (5, 7), (7, 8), (7, 9), (8, 9), (9, 1), 
                   (10, 11), (11, 12), (11, 14), (12, 13), (13, 11)}
                   
e Đường đi kiểm thử đạt được bao phủ node nhưng không đạt được bao phủ cạnh: <br>
[0, 1, 2, 3, 4, 6, 3, 4, 5, 7, 8, 9, 1, 10, 11, 12, 13, 11, 14]
