Dùng ví dụ mẫu hình tương ứng của Figure 7.25. Đặt lại mã để đạt được đường đi thực thi trong ví dụ.

![image](https://user-images.githubusercontent.com/48431650/95152005-48196c00-07b6-11eb-8798-4c0c61df955f.png)

* subject = "brown owl" pattern = "wl" expected output = 7
* subject = "brown fox" pattern = "dog" expected output = -1
* subject = "fox" pattern = "brown" expected output = -1

(a) Tìm đường đi thực sự của mỗi kiểm thử.

* t1: java TestPatInstrument "brown owl" wl

        Sâu mẫu bắt đầu từ kí tự thứ 7
        Đường đi là [1, 2, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 5, 6, 7, 8, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 5, 6, 7, 9, 6, 10, 3, 11]

* t2: java TestPatInstrument "brown fox" dog

        Sâu mẫu không là sâu con của sâu cho trước
        Đường đi là [1, 2, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 11]

* t3: java TestPatInstrument "fox" brown

        Sâu mẫu không là sâu con của sâu cho trước
        Đường đi là [1, 2, 3, 11]
(b) Với mỗi đường, tạo một đường đi du-path tour được đường đi ở Section 7.3.
* '+' là tour trực tiếp được
* '-' là không tour được
* '+!' là tour với def-clear sidetrip
* '-!' là tour được nhưng sidetrip có def

Source|du-path|t1|t2|t3
-|-|-|-|-
du(10,iSub)|[10, 3, 4, 5, 6, 7, 9]|+|-|-
 |[10, 3, 4, 5, 6, 10]|+!|-|-
 |[10, 3, 4, 5, 6, 7, 8, 10]|+|-|-
 |[10, 3, 4, 10]|+|+|-
 |[10, 3, 11]|+|+|-
du(2,isPat)|[2, 3, 4]|+|+|-
 |[2, 3, 11]|-!|+!|+
du(5,isPat)|[5, 6, 10, 3, 4]|-|-|-
 |[5, 6, 10, 3, 11]|+!|-|-
du(8,isPat)|[8, 10, 3, 4]|+|-|-
 |[8, 10, 3, 11]-!|-|-

(c) Giải thích tại sao du-path [5,6,10,3,4] không thể tour được bất kì đường đi nào.
* Vì giá trị ***isPat*** được đặt là ***true*** ở nút 5 và không được đặt lại ở [6,10,3], nút tiết theo phải là 11 không phải 4 nên [5,6,10,3,4] không thể được

(d) Chọn kiểm thử ở Section 7.3 để hoàn toàn bao hàm những du-path có thể được

* [10, 3, 4, 5, 6, 10], [5, 6, 10, 3, 11], [8, 10, 3, 11]

(e) Tìm một bộ kiểm thử tối giản đạt được bao hàm toàn def liên quan đến tham số isPat

Source|du-path|t1|t2|t3|(ab, b)|(ab, a)|(ab; ac)
-|-|-|-|-|-|-|-
du(10,iSub)|[10, 3, 4, 5, 6, 7, 9]|+|||||
.|[10, 3, 4, 5, 6, 10]||||+||
.|[10, 3, 4, 5, 6, 7, 8, 10]|+|||||
.|[10, 3, 4, 10]|+|+||||
.|[10, 3, 11]|+|+| |+|+|+
du(2,isPat)|[2, 3, 4]|+|+| |+|+|+
.|[2, 3, 11]|||+|||
du(5,isPat)|[5, 6, 10, 3, 4]||||||
.|[5, 6, 10, 3, 11]||||+|+|
du(8,isPat)|[8, 10, 3, 4]|+|||||
.|[8, 10, 3, 11]||||||+

* {t1, (ab, b)}, {t1, (ab, a)}, {(ab, b), (ab, ac)}, {(ab, a), (ab, ac)}

(f) Tìm một bộ kiểm thử tối giản đạt được bao hàm toàn use liên quan đến tham số isPat

* {t1, t3 (ab, b), (ab, ac)}, {t1, t3 (ab, a), (ab, ac)}

(g) Có sự khác biệt gì giữa bao hàm toàn use và  bao hàm toàn du-path liên quan đến tham số isPat?

* Không có. Yêu cầu kiểm thử như nhau liên quan đến isPat.