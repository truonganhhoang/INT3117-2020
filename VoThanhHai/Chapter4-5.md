### Repair a fault in an existing system. That is, find the code that needs to change and capture the current behavior with tests. At least one of these tests must fail, thus demonstrating that you found the fault. Repair the fault and check that all of your tests now pass.

Hàm tính trung bình cộng 3 số nhập từ bàn phím ***sai***:
```java
public static int avg (int a, int b, int c) {
	return a + b + c/3;
}
```
Chương trình test ***sai***:
```java
import org.junit.*;
import static org.junit.Assert.*;
public class avgtest { 
	@Test 
	public void testDivide() {
		assertEquals (3, Calc.divide(1, 5, 3));
	} 
}
```
=> **Giá trị nhận được với hàm tính trung bình cộng sai trên đang là 7 khác với kết quả đúng là 3 nên sai.**

Hàm tính trung bình cộng sau khi đã sửa lại:
```java
public static int avg (int a, int b, int c) {
	return (a + b + c)/3;
}
```
=> Với bộ kiểm thử trên hàm cho kết quả 3 là kết quả đúng.
