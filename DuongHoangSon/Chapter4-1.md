## Calc.java

```
public class Calc
{
   static public int add (int a, int b)
   {
      return a + b;
   }
   
   static public int subtract (int a, int b){
       return a - b;
   }
   
   static public double divide(int a, int b) throws ArimethicException{
   
       return a / b;
   }
   
   static public int multiply (int a, int b) {
       return a*b;
   }
}
```

## CalcTest.java
```
import org.junit.Test;
import static org.junit.Assert.*;
public class Test {
    
    @Test
    public void testAdd() {
        int a = 5;
        int b = 6;
        double expect = 11;
        double result = Calc.add(a, b);
        assertEquals(expect, result);
    }
    
    @Test
    public void testSubtract() {
        int a = 8;
        int b = 5;
        double expect= 1;
        double result = Calc.subtract(a, b);
        assertEquals(expect, result);
    }
    
    @Test
    public void testMultiply() {
        int a = 3;
        int b = 2;
        double expect = 6;
        double result = Calc.multiply(a, b);
        assertEquals(expect, result);
    }
    
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 10;
        int b = 2;
        double expect = 5;
        double result = Calc.divide(a, b);
        assertEquals(expect, result);
    }
    
}
```