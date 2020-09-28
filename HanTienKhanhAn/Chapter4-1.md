1. 
a) ```Calc.java```:

```java
public class Calc {   // Calc program before passing all the tests, remove '1' before running CalcTest.java

	static public int add (int a, int b)
	{
		return a + b;
	}	
	
	static public int substract(int a, int b)
	{
		return a - b;
	}
	
	static public int multiply(int a, int b) {
		return a * b;
	}
	
	static public int divide(int a, int b) {
		if(b == 0) throw new ArithmeticException("Calc.divide");
		return a/b;
	}
}
```

b) `CalcTest.java`:

```java
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
		  try {
			  assertTrue ("Calc sum incorrect", 0.00001 == Calc.divide (1, 100000));  //Causes underflow
		  }
		  catch(ArithmeticException e) {
			  return;
		  }
		  fail("ArithmeticException expected");
	   }

}
```
