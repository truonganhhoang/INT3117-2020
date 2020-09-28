# Câu 1 
Mã nguồn hàm Calc.java:<br/>
```java
public class Calc
{
   static public int add (int a, int b)
   {
      return a + b;
   }
   
   static public int subtract (int a, int b){
       return a - b;
   }
   
   static public double divide(int a, int b){
       if(b == 0){
           throw new IllegalArgumentException("Can't divide by zero");
       }
       return a / b;
   }
   
   static public int multiply (int a, int b){
       return a* b;
   }
}
```
Mã nguồn ca kiểm thử<br/>
```java
import org.junit.Test;
import static org.junit.Assert.*;
public class CalcTest {
    
    public CalcTest() {
    }

    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = Calc.add(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSubtract() {
        int a = 3;
        int b = 2;
        int expResult = 1;
        int result = Calc.subtract(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSubtractNegatives() {
        int a = -2;
        int b = 2;
        int expResult = -4;
        int result = Calc.subtract(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMultiply() {
        int a = 3;
        int b = 2;
        int expResult = 6;
        int result = Calc.multiply(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivide() {
        int a = 12;
        int b = 2;
        double expResult = 6;
        double result = Calc.divide(a, b);
        assertEquals(expResult, result, 1);
    }
    
    @Test
    public void testDivideNonInteger() {
        int a = 7;
        int b = 2;
        double expResult = 7/2;
        double result = Calc.divide(a, b);
        assertEquals(expResult, result, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideZero() {
        int a = 1;
        int b = 0;
        double result = Calc.divide(a, b);
    }
}
```
Ta thiết kế ca kiểm thử trước cho hàm Calc.java<br/>
![ScreenShot](https://github.com/trungdinh2k/INT3117-2020/blob/master/DinhThanhTrung/img0.png)<br/>
Sau khi viết hàm Calc.java và tiến hành kiểm thử<br/>
![Alt text](https://github.com/trungdinh2k/INT3117-2020/blob/master/DinhThanhTrung/img1.png)<br/>