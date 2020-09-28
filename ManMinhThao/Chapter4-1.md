## Câu 1: Viết thêm test và hàm cho Calc.java

### 1. Phép trừ
a, Test cases:

```java
    @Test public void testSubtract()
    {
        assertEquals(3, Calc.subtract(5,2));
        assertEquals(-3, Calc.subtract(2,5));
        assertEquals(7, Calc.subtract(5,-2));
    }
```

b, Hàm tính phép trừ:

```java
static public int subtract (int a, int b)
   {
      return a - b;
   }
```
- Chạy test lần 1: Thành công 3/3

### 2. Phép nhân
a, Test cases:

```java
    @Test public void testMultiply()
    {
        assertEquals(10, Calc.multiply(5,2));
        assertEquals(-10, Calc.multiply(-2,5));
        assertEquals(0, Calc.multiply(5,0));
    }
```

b, Hàm tính phép nhân:

```java
static public int multiply (int a, int b)
   {
      return a * b;
   }
```
- Chạy test lần 1: Thành công 3/3

### 3. Phép chia
a, Test cases:

```java
        @Test public void testDivide()
    {
        assertEquals("Cannot division by zero", Calc.divide(5,0));
        assertEquals(2.5, Calc.divide(5,2));
        assertEquals(3, Calc.divide(15,5));
    }
```

b, Hàm tính phép chia:

```java
static public int divide(int a, int b) {
    return a / b;
}
```
- Chạy test lần 1: Thành công 1/3

  > Chưa có Exeption cho chia cho 0

  > Phép chia có thể là số thực

- Sửa lại hàm chia:

```java

public float divide(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Cannot division by zero");
    } else {
        return a / b;
    }
}
```
