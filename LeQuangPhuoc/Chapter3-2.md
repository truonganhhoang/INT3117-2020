Kế thừa là sự liên quan giữa 2 lớp với nhau, trong đó có lớp cha (superclass) và lớp con (subclass). Khi kế thừa
lớp con được hưởng tất cả các phương thức và thuộc tính của lớp cha. Khi ta thay đổi hoặc cập nhật trong lớp cha, 
toàn bộ lớp con của nó sẽ bị ảnh hưởng. Việc kiểm thử sẽ trở nên phức tạp hơn do lớp con phụ thuộc vào lớp cha, 
các ca kiểm thử sẽ phải cập nhật cho các lớp con. Do vậy, tính kế thừa không đảm bảo phương thức hay thuộc tính 
được kiểm thử trong lớp cha sẽ chính xác trong các lớp con. Điều này ảnh hưởng đến khả năng kiểm soát (controllability)
bởi ta phải kiểm soát lớp cha và mọi lớp con kế thừa từ lớp cha. Bên cạnh đó, ta phải quan sát nhiều lớp con đó, nên
tính kế thừa cũng sẽ ảnh hưởng đến tính dễ quan sát (observablity).
