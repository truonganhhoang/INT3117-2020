# Derive input space partitioning test inputs for the GenericStack class assuming the following method signatures:
```java
public GenericStack ();
public void push (Object X);
public Object pop ();
public boolean isEmpty ();
```
# Assume the usual semantics for the GenericStack. Try to keep your partitioning simple and choose a small number of partitions and blocks.
## (a) List all of the input variables, including the state variables.
## (b) Define characteristics of the input variables. Make sure you cover all input variables.
## (c) Define characteristics of inputs.
## (d) Partition the characteristics into blocks.
## (e) Define values for each block.

# Trả lời:
## (a) Tại đây ta thấy các phương thức `push(Object X)`, `pop()` và `isEmpty()` là các phương thức có thể kiểm thử được. Đầu vào tại đây đầu tiên có object X, tiếp theo là một stack khi kiểm thử các hàm `pop()` và `isEmpty()` bằng cách gọi chúng thông qua lớp `GenericStack`.
## (b)+(c)+(d)+(e) Các đặc trưng của các đầu vào này có thể chia thành các đặc trưng và các khối như sau:
* Stack có trống không: Có, không (True, False).
* Vật thể O có null không: Có, không (True, False).