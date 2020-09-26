1.
- Đầu tiên, viết kiểm tra phép tính cộng: 
```java
@Test public void testAdd()
   {
      assertTrue ("Incorrect", 5 == Calc.add (3, 2));
   }
```
Rồi viết cài đặt:
```java
static public int add (int a, int b)
   {
      return a + b;
   }
```
- Kiểm tra phép tính trừ:
```java
@Test public void testSubtract()
   {
      assertTrue ("Incorrect", 1 == Calc.subtract (3, 2));
   }
```
Sau đó viết cài đặt:
```java
static public int subtract (int a, int b)
   {
      return a - b;
   }
```
- Kiểm tra phép tính nhân:
```java
@Test public void testMultiply()
   {
      assertTrue ("Incorrect", 6 == Calc.multiply (2, 3));
   }
```
Sau đó viết cài đặt:
```java
static public int multiply (int a, int b)
   {
      return a * b;
   }
```
- Với phép tính chia, có lỗi chia cho 0, nên cũng phải kiểm thử trường hợp ngoại lệ này.
```java
@Test public void testDivide()
   {
      assertTrue ("Incorrect", 2 == Calc.add (4, 2));
   }
```
Cài đặt:
```java
static public int divide(int a, int b) {
    return a / b;
}
```
Sau đó, kiểm tra ngoại lệ:
```java
@Test public void testDivisionByZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(5, 0);
        });
        assertEquals("Cannot division by zero", exception.getMessage());
    }
```
Rồi cài đặt:
```java
public int divide(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Cannot division by zero");
    } else {
        return a / b;
    }
}
```
Code :
```java
import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest
{
   @Test public void testAdd()
   {
      assertTrue ("Incorrect", 5 == Calc.add (3, 2));
   }

   @Test public void testSubtract()
   {
      assertTrue ("Incorrect", 1 == Calc.subtract (3, 2));
   }

   @Test public void testMultiply()
   {
      assertTrue ("Incorrect", 6 == Calc.multiply (2, 3));
   }

   @Test public void testDivide()
   {
      assertTrue ("Incorrect", 2 == Calc.add (4, 2));
   }

   @Test public void testDivisionByZero() {
        Throwable exception = assertThrows (IllegalArgumentException.class, () -> {
            calculator.division(5, 0);
        });
        assertEquals("Cannot division by zero", exception.getMessage());
    }
}
```