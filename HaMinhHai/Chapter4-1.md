# 1.

- Calc.java

```java
public class Calc {   // Calc program before passing all the tests, remove '1' before running CalcTest.java

    // kiểm tra phép tính cộng
	static public int add (int a, int b)
	{
		return a + b;
	}
	// kiểm tra phép tính trừ
	static public int substract(int a, int b)
	{
		return a - b;
	}
	// kiểm tra phép tính nhân
	static public int multiply(int a, int b) {
		return a * b;
	}
	// kiểm tra phép tính chia
	static public int divide(int a, int b) {
		if (b == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    } else {
        return a / b;
    }
	}
}
```

- CalcTest.java

```java
import org.junit.*;
import static org.junit.Assert.*;

class CalcTest {

	   @Test public void testAdd()
	   {
	      assertTrue ("Calc sum incorrect", 5 == Calc.add (2, 3));
	   }

	   @Test public void testSubstract()
	   {
	      assertTrue ("Calc substraction incorrect", -1 == Calc.substract (2, 3));
	   }

	   @Test public void testMultiply()
	   {
	      assertTrue ("Calc multiplication incorrect", 6 == Calc.multiply (2, 3));
	   }

	   @Test public void testDivide()
	   {
           Throwable exception = assertThrows (ArithmeticException.class, () -> {
            calculator.division(5, 0);
        });
        assertEquals("Calc division incorrect", exception.getMessage());
	   }

}
```
