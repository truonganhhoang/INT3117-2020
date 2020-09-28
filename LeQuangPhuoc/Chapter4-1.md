Chương trình "Calc.java" hoàn chỉnh:
```java
public class Calc {
    static public int Add (int a, int b)
    {
        return a + b;
    }
    static public int Subtract (int a, int b)
    {
        return a - b;
    }

    static public double Divide(int a, int b){
        if(b == 0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    static public int Multiply (int a, int b){
        return a * b;
    }
}
```

Các ca kiểm thử cho chương trình "Calc.java":
```java
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void testAdd() {
        int a = 2;
        int b = 1;
        int Result = 3;
        int CalcResult = Calc.Add(a, b);
        assertEquals(Result,CalcResult);
    }

    @Test
    public void testSubtract() {
        int a = 3;
        int b = 2;
        int Result = 1;
        int CalcResult = Calc.Subtract(a, b);
        assertEquals(Result, CalcResult);
    }


    @Test
    public void testMultiply() {
        int a = 3;
        int b = 2;
        int Result = 6;
        int CalCesult = Calc.Multiply(a, b);
        assertEquals(Result, CalCesult);
    }

    @Test
    public void testDivide() {
        int a = 7;
        int b = 3;
        double Result = 7/3;
        double CalcResult = Calc.Divide(a, b);
        assertEquals(Result, CalcResult, 1);
    }


    @Test(expected = ArithmeticException.class)
    public void testDivideZero() {
        int a = 1;
        int b = 0;
        double CalCResult = Calc.Divide(a, b);
    }
}
```

Ca kiểm thử cuối cùng phải xử lí ngoại lệ vì số chia bằng 0, nên refactor bằng cách thêm ``` expected = ArithmeticException.class ```
