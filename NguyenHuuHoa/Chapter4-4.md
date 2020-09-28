Bài 4:

Em sẽ xây dựng bài kiểm tra chia cho 2 số nguyên:

- Bài kiểm tra thứ nhất: Chia 2 số nguyên dương

```java_holder_method_tree
public void testDivide() {
    System.out.println("DIVIDE");
    int a = 10;
    int b = 2;
    double expResult = 5;
    double result = Calc.divide(a, b);
    assertEquals(expResult, result, 1);
}
```

- Bài kiểm tra thứ hai: Chia 2 số nguyên dương mà kết quả là không phải là số nguyên

```java_holder_method_tree
public void testDivideNonInteger() {
    System.out.println("DIVIDE NON INTEGER");
    int a = 5;
    int b = 2;
    double expResult = 5/2;
    double result = Calc.divide(a, b);
    assertEquals(expResult, result, 1);
}
```

- Bài kiểm tra thứ ba: Chia 2 số trong đó số bị chia là số 0

```java_holder_method_tree
public void testDivideZero() {
    System.out.println("DIVIDE BY ZERO");
    int a = 10;
    int b = 0;
    double result = Calc.divide(a, b);
}
```

- Kết quả kiểm tra:
![Success](https://i.ibb.co/1LnR1FZ/Screen-Shot-2020-09-26-at-09-41-20.png)