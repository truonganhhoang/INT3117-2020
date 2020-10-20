Cho phương thức **sum()**

![image](https://user-images.githubusercontent.com/48431650/96528954-1fad6980-12ae-11eb-8672-203729a5da98.png)


(a) Tìm đầu vào kiểm thử không tới được đột biến
* x = null || []

(b) Tìm đầu vào kiểm thử thỏa mãn tính tới được nhưng không lây nhiễm cho đột biến
* x = [0] || [0, 0]

(c) Tìm đầu vào kiểm thử thỏa mãn tính tới được, có lây nhiễm nhưng không lan truyền cho đột biến
* x = [1, -1] || [1, -3, 2]

(d) Tìm đầu vào kiểm thử triệt tiêu được đột biến
* x = [1, 2, 3]