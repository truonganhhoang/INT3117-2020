# Chapter 4-1

# Chapter 3 contained the program Calc.java. It is available on the program listings page on the book website. Calc currently implements one function: it adds two integers. Use test-driven design to add additional functionality to subtract two integers, multiply two integers, and divide two integers. First create a failing test for one of the new functionalities, modify the class until the test passes, then perform any refactoring needed. Repeat until all of the required functionality has been added to your new version of Calc, and all tests pass. Remember that in TDD, the tests determine the requirements. This means you must encode decisions such as whether the division method returns an integer or a floating point number in automated tests before modifying the software. Submit printouts of all tests, your final version of Calc, and a screen shot showing that all tests pass. Most importantly, include a narrative describing each TDD test created, the changes needed to make it pass, rnd any refactoring that was necessary.

- Hàm trừ 2 số nguyên, nhân 2 số nguyên và chia 2 số nguyên

```
import java.util.*

public class Calc 

{

	static public int subtract (int a, int b)
    {
	    return a - b;
	}
	static public int multiply (int a, int b)
    {
	    return a * b;
	}
	static public int divide (int a, int b)
    {
	    return a / b;
	}
}
```
- Hàm kiểm tra:
```
import org.junit.*;

import static org.junit.Assert.*;

public class CalcTest
{

   @Test public void testSubtract()
    {
        assertTrue ("Phép trừ sai", -1 == Calc.subtract (2, 3));
    }

   @Test public void testMultiply() 
   {
	   assertTrue ("Phép nhân sai", 6 == Calc.multiply (2, 3));

   }
   @Test public void testDivide () 
   {
	   assertTrue ("Phép chia sai", 3  == Calc.divide (6, 2));

   }

}
```
Kết quả:
```
-1

6

3
```