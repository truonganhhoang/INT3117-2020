>Chapter 3 contained the program Calc.java. It is available on the program listings page on
 the book website.\
 Calc currently implements one function: it adds two integers. Use test-driven design to
 add additional functionality to subtract two integers, multiply two integers, and divide two
 integers. First create a failing test for one of the new functionalities, modify the class until the
 test passes, then perform any refactoring needed. Repeat until all of the required functionality
 has been added to your new version of Calc, and all tests pass.
 Remember that in TDD, the tests determine the requirements. This means you must encode
 decisions such as whether the division method returns an integer or a floating point number
 in automated tests before modifying the software.\
 Submit printouts of all tests, your final version of Calc, and a screen shot showing that
 all tests pass. Most importantly, include a narrative describing each TDD test created, the
 changes needed to make it pass, rnd any refactoring that was necessary.

+ Đầu tiên, ta tạo ra ca kiểm thử các hàm  ```subtract(int a, int b)```, ```divide(int a, int b)``` và ```multiply(int a, int b)```
```Java
class CalcTest {

    @Test
    void add() {
        assertTrue(5 == Calc.add (2, 3), "Calc sum incorrect");
    }

    @Test
    void subtract() {
        assertTrue(-1 == Calc.subtract(2, 3), "Calc substraction incorrect");
    }

    @Test
    void divide() {
        try {
            assertTrue(0.00001 == Calc.divide (1, 100000), "Calc divide incorrect"); //Kỳ vọng: 0.00001 nhưng Giá trị trả về: 0 
        }
        catch(ArithmeticException e) {
            return;
        }
        fail("ArithmeticException expected");
    }

    @Test
    void multiply() {
        assertTrue(6 == Calc.multiply (2, 3), "Calc multiplication incorrect");
    }
}

```
+ Tiếp đó, ta viết thêm các hàm ```subtract(int a, int b)```, ```divide(int a, int b)``` và ```multiply(int a, int b)```
```Java
public class Calc
{
    static public int add (int a, int b)
    {
        return a + b;
    }

    static public int subtract(int a, int b)
    {
        return a - b;
    }

    static public double divide(int a, int b)
    {
        return a / b;
    }

    static public int multiply(int a, int b)
    {
        return a * b;
    }
}
```

+ Tiếp theo, ta chạy ca kiểm thử trên và nhận ra lỗi của hàm ```divide(int a, int b)```
```Java
org.opentest4j.AssertionFailedError: Calc sum incorrect ==> expected: <true> but was: <false>

```

+ Như vậy, ta sửa lại hàm ```divide(int a, int b)```
```Java
static public double divide(int a, int b)
    {
        if(b == 0) throw new ArithmeticException("Calc.divide");
        int c = a / b;
        if(a != 0 && c == 0) throw new ArithmeticException("Calc.divide");

        return c;
    }
```

+ Kết quả là tất cả các ca kiểm thử đều qua
```Java
---- IntelliJ IDEA coverage runner ---- 
sampling ...
include patterns:
Calc\..*
exclude patterns:


Class transformation time: 0.0144739s for 766 classes or 1.8895430809399477E-5s per class

Process finished with exit code 0

```