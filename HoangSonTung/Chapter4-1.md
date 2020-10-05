# Câu 1

* Viết các hàm chức năng cộng, trừ, nhân, chia

```java
public class Calc
{
    static public int add (int a, int b)
    {
        return a + b;
    }
    static public int subtract (int a, int b)
    {
        return a - b;
    }
    static public int divide (int a, int b)
    {
        return a / b;
    }
    static public int multiply (int a, int b)
    {
        return a * b;
    }
}
```

* Ca kiểm thử sai (Lỗi chia cho 0), chương trình chạy lỗi, cách sửa lại:

```java
try {
    return a / b;
} catch (ArithmeticException ae) {
    System.out.println("ArithmeticException occured!");
    return 0;
}
```

Ca kiểm thử lúc này được sửa lại

```java
@Test
public void divideByZero() {
    assertTrue("Calc divide correct", 0 == Calc.divide (4, 0));
}
```