# Use test-driven design to add additional functionality to subtract two integers, multiply two integers, and divide two integers.

1. Phép cộng:

- Tạo bộ thử cho phép cộng:

```java
@Test public void testAdd() {
	assertEquals(5, Calc.add(3, 2));
}
```

- Cài đặt phương thức `add` cho lớp `Calc`:

```java
public static int add(int a, int b) {
	return a + b;
}
```

2. Phép trừ:

- Tạo bộ thử cho phep trừ:

```java
@Test public void testSubtract() {
  assertEquals(1, Calc.subtract(3, 2));
}
```

- Cài đặt phương thức `subtract` cho lớp `Calc`:

```java
public static int subtract(int a, int b) {
	return a - b;
}
```

3. Phép nhân:

- Tạo bộ thử cho phép nhân:

```java
@Test public void testMultiply() {
	assertEquals(8, Calc.multiply(2, 4));
}
```

- Cài đặt phương thức `mutiply` cho lớp `Calc`:

```java
public static int multiply(int a, int b){
	return a * b;
}
```

4. Phép chia:

- Tạo bộ thử cho phép chia:

```java
@Test public void testDivide() {
  assertEquals(2, Calc.divide(4, 2));
}
@Test public void testDivideByZero() {
  Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
    Calc.divide(5, 0);
  });
  assertEquals("Cannot division by zero", exception.getMessage());
}
```

- Cài đặt phương thức `division` cho lớp `Calc`:

```java
public int divide(int a, int b) {
  if (b == 0) {
    throw new IllegalArgumentException("Cannot division by zero");
  } else {
    return a / b;
  }
}
```

## Đoạn code hoàn chỉnh:

`TestCalc.java`

```java
import org.junit.*;
import static org.junit.Assert.*;
public class TestCalc {

  @Test public void testAdd() {
    assertEquals(5, Calc.add(3, 2));
  }

  @Test public void testSubtract() {
    assertEquals(1, Calc.subtract(3, 2));
  }

  @Test public void testMultiply() {
    assertEquals(8, Calc.multiply(2, 4));
  }

  @Test public void testDivide() {
    assertEquals(2, Calc.divide(4, 2));
  }

  @Test public void testDivideByZero() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
    Calc.divide(5, 0);
    });
    assertEquals("Cannot division by zero", exception.getMessage());
  }

}
```

`Calc.java`

```java
public static int add(int a, int b) {
	return a + b;
}

public static int subtract(int a, int b) {
	return a - b;
}

public static int multiply(int a, int b){
	return a * b;
}

public int divide(int a, int b) {
  if (b == 0) {
    throw new IllegalArgumentException("Cannot division by zero");
  } else {
    return a / b;
  }
}

```
