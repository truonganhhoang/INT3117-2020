package Assets;
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc
{
   static public int add(int a, int b)
   {
      return a + b;
   }
   static public int subtract(int a, int b)
   {
      return a - b;
   }
   static public int multiply(int a, int b)
   {
      return a * b;
   }
   static public int divide(int a, int b)
   {
     if (b == 0) throw new ArithmeticException("/ by zero");
     return a / b;
   }
}