# 9.When overriding the equals() method, programmers are also required to override the hashCode() method; otherwise clients cannot store instances of these objects in common Collection structures such as HashSet. For example, the Point class from Chapter 1 is defective in this regard.

**(a) Demonstrate the problem with Point using a HashSet.**
```
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2);
Set<Point> s = new HashSet<Point>();
s.add(p1);
boolean b = s.contains(p2); 
```
Có thể b sẽ đúng nhưng cũng có khả năng p1 và p2 sẽ băm(hash) thành các nhóm khác nhau trong trường hợp đó thì b sẽ sai.

**(b) Write down the mathematical relationship required between equals() and hashCode().**

nếu hai đối tượng được coi là bằng nhau (được xác định bằng phương thức equals ()), thì chúng phải có cùng mã băm (như được xác định bởi phương thức hashCode ()). Lưu ý rằng khi các đối tượng không bằng nhau chia sẻ mã bă thì sẽ là sai.
C Write a simple JUnit test to show that Point objects do not
enjoy this property.*

**(c ) Write a simple JUnit test to show that Point objects do not enjoy this property.**

```javascript
@Test public void hashConsistentWithEquals() {
Point p1 = new Point(1,2);
Point p2 = new Point(1,2);
assertTrue("Hash codes must match", p1.hashCode() == p2.hashCode());
}
```


**(d) Repair the Point class to fix the fault.**
```
@Override public int hashCode() {
int result = 17;
result = 31 * result + x;
result = 31 * result + y;
return result;
}
```

**(e) Rewrite your JUnit test as an appropriate JUnit theory. Evaluate it with suitable DataPoints.**

```
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

Có một số điều cần lưu ý về lý thuyết này.
- Đầu tiên, để làm cho lý thuyết càng tổng quát càng tốt và do đó càng hữu ích càng tốt, tester phải luôn chọn các kiểu tham số gần với gốc của hệ thống phân cấp kiểu nhất có thể. Do đó, các tham số của phương pháp lý thuyết có kiểu Object chứ không phải kiểu Point. Điều này là phù hợp vì các phương thức equals () và hashCode () được định nghĩa trong lớp Object. Nói cách khác, mặc dù động lực cho lý thuyết này là các đối tượng Point, kết quả vẫn áp dụng cho tất cả các đối tượng Java! 
- Thứ hai, các giả định về các giá trị không rỗng có nghĩa là lý thuyết này có thể được áp dụng mà không cần lo lắng về việc liệu các DataPoint được liên kết có chứa giá trị rỗng hay không.
- Thứ ba, lý thuyết này được đánh giá dựa trên tích chéo của bộ năm giá trị trong cấu trúc DataPoints với chính nó. 

Trong số 5 * 5 = 25 giá trị này, 5 giá trị không vượt qua điều kiện tiên quyết đầu tiên. Trong số 20 người còn lại, 4 người không vượt qua điều kiện tiên quyết thứ hai. Trong số 16 người còn lại, 6 người vượt qua điều kiện tiên quyết thứ ba. Tất cả 6 điều này đều thỏa mãn điều kiện sau
























