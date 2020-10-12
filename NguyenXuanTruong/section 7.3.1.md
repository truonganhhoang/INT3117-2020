```Java
w = x; // node 1
if (m > 0)
{
w++; // node 2
}
else
{
w=2*w; // node 3
}
// node 4 (no executable statement)
if (y <= 10)
{
x = 5*y; // node 5
}
else
{
x = 3*y+5; // node 6
}
z = w + x; // node 7
```

a,
Hình vẽ ở link bên dưới:
https://docs.google.com/document/d/1d4TiszqbNo938-ALZtQzR4tgGStyAjdii2wmANW4dhM/edit

b,
Nút (1), (2), (3) có định nghĩa biến 'w'.

c 
Nút (2), (3), (7) dùng cho biến 'w'.

d,
Không có đường dẫn xóa định dạng nào từ nút (1) đến nút (7) đối với biến thể 'w' vì các định tuyến tại nút (2) và (3) nằm trong đường dẫn định hướng trong nút (1).

e,
Đường dẫn DU cho biến 'w':
- [1,2]
- [1,3]
- [2,4,5,7]
- [2,4,6,7]
- [3,4,5,7]
- [3,4,6,7]

Đường dẫn DU cho biến 'x':
- [5,7]
- [6,7]