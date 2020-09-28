Hàm trừ, nhân và chia 2 số nguyên
```
public class Calc {
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
Hàm kiểm tra:
```
import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest
{
   @Test public void testSubtract()
   {
      assertTrue ("Hiệu không chính xác", -1 == Calc.subtract (2, 3));
   }
   @Test public void testMultiply() {
	   assertTrue ("Tích không chính xác", 6 == Calc.multiply (2, 3));
   }
   @Test public void testDivide () {
	   assertTrue ("Thương không chính xác", 3  == Calc.divide (6, 2));
   }
}
```