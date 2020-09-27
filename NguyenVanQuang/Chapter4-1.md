Bài 1:
- Các hàm của class Calc.java :
	+ Cộng (add())
	+ Trừ (subtract())
	+ Nhân (multiple())
	+ Chia (divide())
```java
public class Calc {
    public static int add (int a, int b) {
        return (a+b);
    }
    public static int subtract (int a, int b) {
        return (a-b);
    }
    public static int multiply (int a, int b) {
        return (a*b);
    }
    public static int divide (int a, int b) {
        return (a/b);
    }
}
```
- Thiết kế bộ kiểm cho Calc.java :
```java
import org.junit.*;
import static org.junit.Assert.*;
public class CalcTest {
	@Test
  	public void testAdd() {
		assertEquals (10, Calc.add(5, 5));
	}  
	@Test 
 	public void testSubtract() {
		assertEquals (5, Calc.subtract(15, 10));
	} 
	@Test 
	public void testMultiply() {
		assertEquals (45, Calc.multiply(5, 9));
	}  
	@Test 
	public void testDivide() {
		assertEquals (2, Calc.divide(18, 9));
	}
}
```
