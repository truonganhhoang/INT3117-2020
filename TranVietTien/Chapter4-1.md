Bài 1:

- Hàm `testSubtract`:

```@Test
    public void testSubtract() {
        assertEquals(10, Calc.subtract(15, 5));
        assertEquals(4, Calc.subtract(1, -3));
        assertEquals(-3, Calc.subtract(8, 11));
    }
```

- Hàm `testMultiply`:

```@Test
    public void testMultiply() {
        assertEquals(2, Calc.multiply(1, 2));
        assertEquals(-48, Calc.multiply(6, -8));
        assertEquals(34, Calc.multiply(-2, -17));
    }
```

- Hàm `testDevide`:

``` @Test
    public void testDivide() {
        assertEquals(2, Calc.divide(4, 2), 0);
        assertEquals(-0.5, Calc.divide(5, -10), 0);
        assertEquals(0.1, Calc.divide(1, 8), 0.025);
    }
```

- Hàm `testDevideException`:

```@Test(expected = IllegalArgumentException.class)
    public void testDivideException() {
        Calc.divide(2, 0);
    }
```

- Tệp Calc.java cuối:

```
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc {
    static public int add(int a, int b) {
        return a + b;
    }

    static public int subtract(int a, int b) {
        return a - b;
    }

    static public int multiply(int a, int b) {
        return a * b;
    }

    static public double divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Invalid Divisor");
        else
            return ((double) a) / b;
    }
}
```

- Kết quả kiểm thử:

![Success](https://ibb.co/WPrj3gF)