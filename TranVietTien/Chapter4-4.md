Bài 4:

Bài kiểm tra chia cho 2 số nguyên:

- Chia 2 số nguyên dương với kết quả là số nguyên hoặc không phải số nguyên

```java_holder_method_tree
@Test
    public void testDivide() {
        assertEquals(2, Calc.divide(4, 2), 0);
        assertEquals(-0.5, Calc.divide(5, -10), 0);
        assertEquals(0.1, Calc.divide(1, 8), 0.025);
    }
```

- Chia 2 số với số bị chia là số 0

```java_holder_method_tree
@Test(expected = IllegalArgumentException.class)
    public void testDivideException() {
        Calc.divide(2, 0);
    }
}
```

- Kết quả kiểm tra:
![Success](https://ibb.co/WPrj3gF)