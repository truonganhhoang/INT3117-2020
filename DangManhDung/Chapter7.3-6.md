Sử dụng phương thức fmtRewrap()

![image](https://user-images.githubusercontent.com/48431650/95282027-b62b6500-0882-11eb-8903-470599d5acd2.png)

(a) Vẽ đồ thị luồng cho phương thức

![image](https://user-images.githubusercontent.com/48431650/95282100-ec68e480-0882-11eb-9b90-eb426f45c15d.png)

(b) Tìm một ca kiểm thử  mà đường đi kiểm thử tương ứng visit cạnh nối điểm đầu của **while** tới **S = new String(SArr) + CR** mà không đi qua vòng lặp while

* [1,2,19]

(c) Liệt kê các yêu cầu kiểm thử cho bao hàm nút, cạnh, đường đi nguyên tố

* Nút: { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 }
* Cạnh: { (1,2), (2,3), (2,19), (3,4), (3,5), (4,10), (5,6), (5,7), (6,10), (7,8), (7,9), (8,10), (9,10), (10,11), (10,12), (10,13), (10,16), (10,17), (11,18), (12,18), (13,14), (13,15), (14,18), (15,18), (16,17), (17,18), (18,2) }
* Đường đi nguyên tố: Do có rất nhiều yêu cầu kiểm thử nên các yêu cầu được lưu ở "Chapter7.3-6/Prime Path Coverage.html"

(d) Liệt kê các đường đi kiểm thử cho bao hàm nút nhưng không bao hàm cạnh

* Không thể vừa bao hàm nút vừa bao hàm cạnh

(e) Liệt kê các đường đi kiểm thử cho bao hàm cạnh nhưng không bao hàm đường đi nguyên tố

        [1,2,3,4,10,17,18,2,19]
        [1,2,3,5,6,10,17,18,2,19]
        [1,2,3,5,7,9,10,17,18,2,19]
        [1,2,3,5,7,8,10,17,18,2,19]
        [1,2,3,4,10,11,18,2,19]
        [1,2,3,4,10,12,18,2,19]
        [1,2,3,4,10,16,17,18,2,19]
        [1,2,3,4,10,13,15,18,2,19]
        [1,2,3,4,10,13,14,18,2,19]