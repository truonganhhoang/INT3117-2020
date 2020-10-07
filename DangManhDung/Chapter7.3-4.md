Dùng ví dụ mẫu hình tương ứng của Figure 7.25. Đánh số ca kiểm thử từ đầu phần iSub của bảng

![image](https://user-images.githubusercontent.com/48431650/95152005-48196c00-07b6-11eb-8798-4c0c61df955f.png)

Test Number|Test
-|-
t1|(ab, ab, 0)
t2|(ab, a, 0)
t3|(ab, ac, -1)
t4|(ab, c, -1)
t5|(a, bc, -1)
t6|(abc, bc, 1)
t7|(ab, b, 1)
t8|(abc, ba, -1)
-|-
t4|(ab, c, -1)
t2|(ab, a, 0)

(a) Tạo một bộ kiểm thử tối giản thỏa mãn bao hàm toàn bộ defs

* Đường tour trực tiếp được tích bởi dấu +

du-path| t1| t2| t3| t4| t5| t6| t7| t8
-|-|-|-|-|-|-|-|-
[2, 3, 4, 5, 6, 7, 9]| +| | | | | | |
[2, 3, 4, 5, 6, 10]| |+| | | | | |
[2, 3, 4, 5, 6, 7, 8, 10]| | |+| | | | |
[2, 3, 4, 10]| | | |+| |+| +| +
[2, 3, 11]| | | | |+| | |
[10, 3, 4, 5, 6, 7, 9]| | | | | | + | | 
[10, 3, 4, 5, 6, 10]| | | | | | | + | 
[10, 3, 4, 5, 6, 7, 8, 10]| | | | | | | | +
[10, 3, 4, 10]| | | |+| | | |
[10, 3, 11]| +| +| +| +| |+| +| +

* Tất cả các kiểm thử trừ t5 đều thỏa mãn bao hàm toàn bộ defs
(b) Tạo một bộ kiểm thử tối giản thỏa mãn bao hàm toàn bộ uses
* {t1, t4, t5, t6}, {t1, t5, t6, t7}, {t1, t5}

(c) Tạo một bộ kiểm thử tối giản thỏa mãn bao hàm toàn bộ đường đi du-path
* {t1, t2, t3, t4, t5, t6, t7, t8}