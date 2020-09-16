2. Thứ bậc thừa kế có ảnh hưởng tới tính quan sát và điều khiển của phần mềm như thế nào?
- Thay đổi các phương thức ở lớp cha sẽ ảnh hưởng đến những lớp con, vì vậy một lớp có càng nhiều lớp con thì kiểm thử càng phức tạp.
- Một số sự thay đổi có thể không gây lỗi ở lớp cha những vẫn có thể gây lỗi ở lớp con.
=> Điều này ảnh hưởng đến tính điều khiển và quan sát của phần mềm vì chúng ta cần điều khiển các phương thức ở lớp cha và tất cả các lớp con, và chúng ta cũng cần quan sát tất cả các lớp để xem các phương thức có hoạt động theo ý muốn không.
