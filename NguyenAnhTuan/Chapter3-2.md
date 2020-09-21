# 2. Give a one or two paragraph explanation for how the inheritance hierarchy can affect
controllability and observability.

- Việc có một cây kế thừa của các lớp có thể phức tạp hóa việc kiểm thử, vì các lớp con phụ
thuộc vào cha nó, nghĩa là nếu ta sửa đổi hoặc cập nhật gì đó trong lớp cha, nó sẽ ảnh hưởng
đến tất cả các lớp con tương ứng của nó, có nghĩa là mỗi kiểm thử được sửa đổi phải được cập 
nhật cho lớp con. Do đó, tính kế thừa không đảm bảo rằng một phương thức kiểm thử trong bối 
cảnh của lớp cha sẽ hoạt động chính xác hoặc theo cách tương tự nhe trong ngữ canh của lớp con
hoặc các lớp con. Do đó, điều này ảnh hưởng đến khả năng kiểm soát vì chúng ta cần kiểm soát 
mọi lớp cha và lớp con, nếu chúng ta có một cây kế thừa sâu, nó sẽ rất phức tạp. Mặt khác, nó 
ảnh hưởng đến khả năng quan sát, chúng ta cần quan sát một số lượng lớn các lớp con thực sự 
đang làm việc giống như lớp cha.