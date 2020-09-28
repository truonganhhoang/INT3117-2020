**Các hàm trừ, nhân và chia 2 số nguyên:**

```java
public class Calc {
	static public int subtract (int a, int b)
	   {
	      return a-b;
	   }
	static public int multiply (int a, int b)
	   {
	      return a*b;
	   }
	static public int divide (int a, int b)
	   {
	      return a/b;
	   }
}
```


**Hàm kiểm tra:**

```java
import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest
{
   @Test public void testSubtract()
   {
      assertTrue ("Hieu khong chinh xac",   -2 == Calc.subtract(1, 3));
   }
   @Test public void testMultiply() {
	   assertTrue ("Tich khong chinh xac",   6  == Calc.multiply(3, 2));
   }
   @Test public void testDivide () {
	   assertTrue ("Thuong khong chinh xac", 2  == Calc.divide(6, 3));
   }
}
```
**Test-driven:**
 
```java
public class DataDrivenCalcTest
{
   public int a, b, sum;

   public DataDrivenCalcTest (int a, int b, int subtract)
   {
      this.a = a;
      this.b = b;
      this.subtract = subtractbtract; 
   }
  public static Collection<Object[]> calcValues()
  {
     return Arrays.asList (new Object [][] {{1, 3, 4}, {2, 4, 22}}); 
  }
  public void additionTest()
  {
     assertTrue ("Subtraction Test", subtract == Calc.subtract(a,b));
  }
}
```
 **Tương tự với phép nhân và chia**