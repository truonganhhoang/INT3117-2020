- Code Calc.java

```java
public class Calc {
	static public int add(int a, int b){
		return a+b;
	}
	static public int subtract(int a, int b){
		return a-b;
	}
	static public int multiply(int a, int b){
		return a*b;
	}
	static public double divide(int a, int b){
		return a/b;
	}
}
```

- Test
```java
import org.junit.*;
import static org.junit.Assert.*;
public class CalcTest {
	@Test public void testAdd(){
		assertEquals (5,Calc.add(2,3));
	}
	@Test public void testSubtract(){
		assertEquals (1,Calc.subtract(2,1));
	}
	@Test public void testMultiply(){
		assertEquals (0,Calc.multiply(0,4));
	}
	@Test public void testDivide(){
		assertEquals (4,Calc.divide(8, 2));
	}
}
```

