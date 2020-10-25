Các vị từ trên thể hiện câu yêu cầu "Liệt kê tất cả chuột không dây có giá lớn hơn 100$ mà số lượng còn lại là hơn 20 chiếc. Liệt kê thêm chuột có dây giá bán lẻ trên 50$":

```java
((mouseType = wireless) ∧ ((retail > 100)∨(stock > 20))) ∨ (¬(mouseType = wireless) ∧ (retail > 50))
```