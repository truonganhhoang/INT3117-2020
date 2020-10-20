Cho phương thức **findVal()**

![image](https://user-images.githubusercontent.com/48431650/96528367-b9741700-12ac-11eb-8e0b-e79678f3d756.png)

(a) Tìm đầu vào kiểm thử không tới được đột biến
* Đột biến luôn tới được

(b) Tìm đầu vào kiểm thử thỏa mãn tính tới được nhưng không lây nhiễm cho đột biến
* Lây nhiễm sẽ luôn xảy ra vì i luôn có giá trị sai khi được khởi tạo trong vòng lặp

(c) Tìm đầu vào kiểm thử thỏa mãn tính tới được, có lây nhiễm nhưng không lan truyền cho đột biến
* (numbers, val) = ([1, 1], 1) || ([-1, 1], 1) || (null, 0)

(d) Tìm đầu vào kiểm thử triệt tiêu được đột biến
* (numbers, val) = ([1, 0], 1)