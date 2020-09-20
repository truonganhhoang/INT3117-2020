## Exercise 9: 
__a.Trình bay sự cối với Point bằng việc sử dụng hashCode():__
```java
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2); // note that p1.equals(p2) Set<Point> s = new HashSet<Point>();
s.add(p1);
boolean b = s.contains(p2); 
```

__b. Mối quan hệ là:__
- nếu hai đối tượng được coi là bằng nhau (được xác định bằng phương thức equal()),  thì sẽ có mã băm (hashCode) bằng nhau (được xác định bằng phương thức hashCode()).  Còn nếu mã băm (hashCode) bằng nhau thì chưa chắc 2 đối tượng đó đã bằng nhau. Bởi vì phương thức hashCode() trả về của đối tượng người được tạo ra sẽ là mã băm của địa chỉ, như vậy chỉ những đối tượng nào có cùng địa chỉ thì mới có khả năng bằng nhau, còn nếu khác địa chỉ chắc chắn khác nhau.
Ví dụ: 
```java
Nguoi n1 = new Nguoi(“tran van a”, “Ha Noi”);
Nguoi n2 = new Nguoi(“tran van a”, “Ha Noi”);
```
- Khi đó nếu so sánh 
```java
    n1.equals(n2)
```
- Thì sẽ bằng nhau vì n1 và n2 cùng kiểu Người, cùng hashCode (vì có cùng địa chỉ) và có cùng tên.

__c. Viết một bài kiểm tra JUnit đơn giản để chỉ ra rằng các đối tượng Point không được hưởng thuộc tính này:__
```java
@Test public void hashConsistentWithEquals() {
Point p1 = new Point(1,2);
Point p2 = new Point(1,2);
assertTrue("Hash codes must match", p1.hashCode() == p2.hashCode()); 
} 
````
__d.Sửa lớp Point() để sửa lỗi (faults):__
```java
@Override public int hashCode() {
int result = 17;
result = 31 * result + x;
result = 31 * result + y;
 return result; 
} 
```
__e. Viết lại bài kiểm tra JUnit, đánh giá nó bằng DataPoints phù hợp:__
```java
@Theory public void hashConsistentWithEqualsTheory(Object o1, Object o2) {
assumeTrue(o1 != null);
assumeTrue(o2 != null);
assumeTrue(o1.equals(o2)); 
assertTrue("Hash codes must match", o1.hashCode() == o2.hashCode()); 
}
@DataPoints public static Object[] objects = { 
new Point(1,2), new Point(1,2), new Point(1,3), "ant", null
 }; 
 ```
