##### Chapter 3 contained the program ```Calc.java```. It is available on the program listings page on the book website. ```Calc``` currently implements one function: it adds two integers. Use test-driven design to add additional functionality to subtract two integers, multiply two integers, and divide two integers. First create a failing test for one of the new functionalities, modify the class until the test passes, then perform any refactoring needed. Repeat until all of the required functionality has been added to your new version of ```Calc```, and all tests pass. Remember that in TDD, the tests determine the requirements. This means you must encode decisions such as whether the division method returns an integer or a floating point number in automated tests before modifying the software. Submit printouts of all tests, your final version of ```Calc```, and a screenshot showing that all tests pass. Most importantly, include a narrative describing each TDD test created, the changes needed to make it pass, and any refactoring that was necessary.

- Thiết kế tiếp các hàm cho chương trình ```Calc.java``` bao gồm: Cộng (```add()```), trừ (```subtract()```), nhân (```multiply()```), chia (```divide()```):
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
   
}
```

- Thiết kế các bộ kiểm thử cho các hàm:
```java
import org.junit.*;
import static org.junit.Assert.*;
public class CalcTest {

	@Test
  public void testAdd() {
		assertEquals (8, Calc.add(3, 5));
	}
  
	@Test 
  public void testSubtract() {
		assertEquals (2, Calc.subtract(5, 3));
	}
  
	@Test 
  public void testMultiply() {
		assertEquals (35, Calc.multiply(7, 5));
	}
  
	@Test 
  public void testDivide() {
		assertEquals (8, Calc.divide(80, 10));
	}
  
}
```
