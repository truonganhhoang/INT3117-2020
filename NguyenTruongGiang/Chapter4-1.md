# 1. Chapter 3 contained the program Calc.java. It is available on the program listings page on the book website. Calc currently implements one function: it adds two integers. Use test-driven design to add additional functionality to subtract two integers, multiply two integers, and divide two integers. First create a failing test for one of the new functionalities, modify the class until the test passes, then perform any refactoring needed. Repeat until all of the required functionality has been added to your new version of Calc, and all tests pass. Remember that in TDD, the tests determine the requirements. This means you must encode decisions such as whether the division method returns an integer or a floating point number in automated tests before modifying the software.

- Cacl.java:
<br>
   
```
public class Calc {   

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
		int c = a / b;
		if(a != 0 && c == 0) throw new ArithmeticException("Calc.divide");

		return c;
	}
```

- CaclTest.java:
```
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

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


  

 