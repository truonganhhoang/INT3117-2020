# Chapter 4-1
## Chapter 3 contained the program Calc.java. It is available on the program listings page on the book website. Calc currently implements one function: it adds two integers. Use test-driven design to add additional functionality to subtract two integers, multiply two integers, and divide two integers. First create a failing test for one of the new functionalities, modify the class until the test passes, then perform any refactoring needed. Repeat until all of the required functionality has been added to your new version of Calc, and all tests pass. Remember that in TDD, the tests determine the requirements. This means you must encode decisions such as whether the division method returns an integer or a floating point number in automated tests before modifying the software. Submit printouts of all tests, your final version of Calc, and a screenshot showing that all tests pass. Most importantly, include a narrative describing each TDD test created, the changes needed to make it pass, and any refactoring that was necessary.  


<br>

# CalcTest.java
```java
public class CalcTest {
    @Test public void testAdd(){
        assertTrue(Calc.add(1,2) == 3);
        assertEquals(9,Calc.add(3.5,5.5),0);
        assertEquals(2.25,Calc.add(-3.25,5.5),0);
    }
    @Test public void testSubtract(){
        assertTrue(Calc.subtract(5,4) == 1);
        assertEquals(2, Calc.subtract(2.5,0.5),0);
        assertEquals(-1, Calc.subtract(2,3),0);
    }
    @Test public void testMultiply() {
        assertTrue(Calc.multiply(5, 2) == 10);
        assertEquals(19.25, Calc.multiply(3.5, 5.5), 0);
        assertEquals(7, Calc.multiply(3.5, 2), 0);
        assertEquals(6, Calc.multiply(-2, -3), 0);
        assertEquals(-6, Calc.multiply(-3, 2), 0);
    }
    @Test public void testDivide(){
        assertTrue(Calc.divide(6,2) == 3);
        assertEquals(1.5,Calc.divide(3,2),0);
        assertEquals(-2, Calc.divide(6, -3), 0);
        assertEquals(2, Calc.divide(-6, -3), 0);
    }
}
```
<br>

## Kết quả:

![](images/Chapter%204-1.png)

## Ban đầu tham số của các hàm đều là int, sau đó qua các test đổi thành double để qua được các test có kết quả và đầu vào là số thực.  
<br>

# Calc.java
```java
public class Calc
{
   public static double add(double a, double b) {
      return a+b;
   }
   public static double subtract(double a, double b) {
      return (a-b);
   }
   public static double divide(double a, double b) {
      return (a/b);
   }
   public static double multiply(double a, double b) {
      return a*b;
   }
}
```


