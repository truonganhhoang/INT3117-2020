// Câu 1

- Code Calc.java

```java

public class Calc {
   
   static public int add (int a, int b) {
      return a + b;
   }
   
   static public int subtract (int a, int b) {
      return a - b;
   }
   
   static public int multiply (int a, int b) {
      return a * b;
   }
   
   static public int divide (int a, int b) {
      return a / b;
   }
```

- Test
```java
import org.junit.*;
import static org.junit.Assert.*;
public class CalcTest {

	@Test
  public void testAdd() {
		assertEquals (9, Calc.add(7, 2));
	}
  
	@Test 
  public void testSubtract() {
		assertEquals (4, Calc.subtract(7, 3));
	}
  
	@Test 
  public void testMultiply() {
		assertEquals (24, Calc.multiply(6, 4));
	}
  
	@Test 
  public void testDivide() {
		assertEquals (8, Calc.divide(40, 5));
	}
  
}
```