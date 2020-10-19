Cho những yếu tố xác định của máy hữu hạn trạng thái:

![image](https://user-images.githubusercontent.com/48431650/95974041-9b3a9100-0e3e-11eb-8347-d1b38fd07cb2.png)

(a) Vẽ ra máy hữu hạn trạng thái

![image](https://user-images.githubusercontent.com/48431650/95973649-25cec080-0e3e-11eb-9ebd-871c8ca5d463.png)

(b) Nêu ra điều kiện để mỗi trạng thái quay lại trính nó
* Idle: !a ^ !b
* Active: !a ^ b
* WindDown: !a

(c) Tìm kiểm thử CACC cho mỗi chuyển đổi từ trạng thái Active
* Active -> Idle: a ^ b, (a,b) = (T,F),(F,T),(T,F)
* Active -> Idle: !b, (a,b) = (x,T),(x,F)
* Active -> Active: !a ^ b, (a,b) = (F,T),(T,T),(F,F)
