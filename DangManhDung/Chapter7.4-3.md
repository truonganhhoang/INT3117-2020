Cho một phần của chương trình

![image](https://user-images.githubusercontent.com/48431650/95308252-de7f8780-08b3-11eb-9d22-39d970c6580c.png)

Và các kiểm thử đầu vào
* t1 = f1 (0, 0)
* t2 = f1 (1, 1)
* t3 = f1 (0, 1)
* t4 = f1 (3, 2)
* t5 = f1 (3, 4)

(a) Vẽ đồ thị cho chương trình

![image](https://user-images.githubusercontent.com/48431650/95308187-c90a5d80-08b3-11eb-9283-e0809fc26410.png)

(b) Tìm đường đi tương ứng với mỗi kiểm thử
* t1: [f1, f3, f5, f6]
* t2: [f1, f3, f4, f6]
* t3: [f1, f2]
* t4: [f1, f3, f4, f6]
* t5: [f1, f2, f3, f4, f6]

(c) Tìm một bộ kiểm thử tối giản đạt được bao hàm toàn nút
* {t1, t2, t3}, {t1, t3, t4}, {t1, t5}

(d) Tìm một bộ kiểm thử tối giản đạt được bao hàm toàn cạnh
* {t1, t5}

(e) Tìm các đường đi nguyên tố trong đồ thị. Đường đi nguyên tố nào không được thông qua bởi các kiểm thử trên?
* { [f1, f2, f3, f4, f6], [f1, f2, f3, f5, f6], [f1, f3, f4, f6], [f1, f3, f5, f6] }
* [f1, f2, f3, f5, f6] không được thông qua bởi các kiểm thử
