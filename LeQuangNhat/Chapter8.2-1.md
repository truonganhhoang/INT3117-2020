# Use predicates (i) through (iv) to answer the following questions.
### i.f = ab(-c) + (-a)b(-c)
### ii.f = -(abcd) + abcd
### iii.f = ab + a(-b)c + -(ab)c
### iv.f = -(acd) + (-c)d + bcd

### (a) Draw the Karnaugh maps for f and phủ f.
Biểu đồ Karnaugh cho biểu thức i là:

|   | 00 | 01 | 11 | 10 |
|---|----|----|----|----|
| 0 |    | 1  | 1  |    |
| 1 |    |    |    |    |
### (b) Find the nonredundant prime implicant representation for f and -f.
```
Vị từ đại diện không thừa cho biểu thức i là: 
f = b(-c)
Vị từ đại diện không thừa cho biểu thức -i là: 
-f = (-b) + c
```
### (c) Give a test set that satisfies Implicant Coverage (IC) for f.

Ta chọn các mệnh đề đại diện không thừa cho mỗi Implicant Coverage, bao gồm: b(-c), (-b) và c. Bộ kiểm thử sau đây sẽ thỏa mãn Implicant Coverage, bộ kiểm thử số 2 sẽ thỏa mãn cả 2 mệnh đề b và c:
```
xTF, xFT
```

### (d) Give a test set that satisfies Multiple Unique True Points (MUTP) for f.

### (e) Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for f.

### (f) Give a test set that satisfies Multiple Near False Points (MNFP) for f.

### (g) Give a test set that is guaranteed to detect all faults in figure 8.2.
