# Chapter 3-2

> Give a one-to-two paragraph explanation for how the **inheritance** hierarchy can affect controllability and observability.
>

* Việc có một cây kế thừa sâu của các class có thể làm việc kiểm thử trở nên phức tạp hơn, vì các class con phụ thuộc vào cha của nó.
* Điều đó có nghĩa là, nếu chúng ta sửa đổi hoặc cập nhật thứ gì đó trong lớp super, nó sẽ ảnh hưởng đến tất cả các class con tương ứng của nó; có nghĩa là mọi ca kiểm thử bị ảnh hưởng bởi việc sửa đổi phải được cập nhật cho tất cả các class con.
* Do đó, tính kế thừa không đảm bảo rằng một phương thức được kiểm thử trong class cha sẽ hoạt động chính xác hoặc theo cách tương tự như trong các class con. Vì chúng ta sẽ cần phải kiểm soát mọi class cha và các class con của nó, nên nếu chúng ta có một cây kế thừa sâu, việc kiểm soát sẽ rất phức tạp.
* Mặt khác, nó ảnh hưởng đến khả năng quan sát, chúng ta cần quan sát một số lượng lớn các class con trong khi thực tế chúng đang thực hiện công việc giống như class cha.
