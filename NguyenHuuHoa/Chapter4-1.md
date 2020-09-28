Bài 1:

- Hàm `subtract`:

```java_holder_method_tree
static public int subtract(int a, int b) {
    return a - b;
}
```

- Hàm `divide`:

```java_holder_method_tree
static public double divide(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Can't divide by zero");
    }

    return a / b;
}
```

- Hàm `multiply`:

```java_holder_method_tree
static public int multiply(int a, int b) {
    return a * b;
}
```

- Test thất bại cho hàm `subtract`:

![Subtract](https://i.ibb.co/9V1V80m/Screen-Shot-2020-09-26-at-09-36-42.png)

- Test thất bại cho hàm `divide`:

![Divide](https://i.ibb.co/942BtJb/Screen-Shot-2020-09-26-at-09-37-32.png)

- Test thất bại cho hàm `multiply`:

![Multiply](https://i.ibb.co/bBLsJ4r/Screen-Shot-2020-09-26-at-09-37-09.png)

- Test thành công cho tất cả các hàm:

![Success](https://i.ibb.co/1LnR1FZ/Screen-Shot-2020-09-26-at-09-41-20.png)