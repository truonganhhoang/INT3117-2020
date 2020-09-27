## Question 1:

### Chương trình ban đầu :
```java
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc
{
   static public int add (int a, int b)
   {
      return a + b;
   }
}
```
###  Phép trừ:

+ kiểm tra cho phép trừ :
```java
  @Test public void testSubtract()
   {
      assertTrue ("Incorrect", 1 == Calc.subtract (3, 2));
   }
```
Thêm hàm phép trừ
```java
static public int subtract (int a, int b)
   {
      return a - b;
   }
```
###  Phép trừ:

+ kiểm tra cho phép Nhân :
```java
  @Test public void testMultiply()
   {
      assertTrue ("Incorrect", 6 == Calc.multiply (2, 3));
   }
```
Thêm hàm phép nhân
```java
static public int multiply  (int a, int b)
   {
      return a * b;
   }
```
+ kiểm tra cho phép Chia :

```java
@Test public void testDivide()
   {
      assertTrue ("Incorrect", 2 == Calc.add (4, 2));
   }

```
+ Thêm hàm phép chia
```java
static public int divide(int a, int b) {
    return a / b;
}
```

Vì phép chia có trường hợp là chia cho số 0 nên có ngoại lệ

```java
@Test public void testDivisionByZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(5, 0);
        });
        assertEquals("Cannot division by zero", exception.getMessage());
    }
```
+ chỉnh lại hàm cho phép chia

```java

public int divide(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Cannot division by zero");
    } else {
        return a / b;
    }
}
```