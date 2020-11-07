a. Chính thức hóa điều kiện tiên quyết.

Hành vi của toàn bộ trình vòng lặp, và cụ thể là của `remove()`, 
được xác định bởi liệu máy khách có cố gắng sửa đổi tập hợp cơ bản trong khi trình vòng lặp đang được sử dụng hay không. 

Vì vậy, ví dụ, một cuộc gọi tới ``, theo sau là một sửa đổi của tập hợp cơ bản, theo sau là một lệnh gọi `remove()`, 
trong nhiều triển khai của `Iterator`, sẽ dẫn đến ném ngoại lệ `ConcurrentModificationException`

b. Tìm (hoặc viết) một triển khai của một Iterator. 

Tất cả các triển khai của giao diện là Bộ sưu tập cung cấp một phương thức `iterator()`.
 
c. Thiết kế và chạy kiểm thử CACC về việc triển khai
```java
Set<Integer> s = new HashSet<Integer>(); 
s.add(new Integer(1);
s.add(new Integer(2); 
s.add(new Integer(3); 
Iterator itr = s.iterator();
//a call to itr.remove() here would test case Fx 
itr.next();
//a call to itr.remove() here would test case TT 
itr.remove();
//a call to itr.remove() here would test case TF
```
