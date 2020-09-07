# Chapter 1-5

> Below are four faulty programs. Each includes test inputs that result in failure. Answer the following questions about each program.

## (a) Explain what is wrong with the given code. Describe the fault precisely by proposing a modification to the code

* findLast(): vòng lặp để cover hết thì cần phải có i=0

```java
for(int i = x.length-1; i >= 0; i--)
```

* lastZero(): vòng lặp phải chạy từ cuối lên thì mới tìm được phần tử 0 cuối mảng

```java
for(int i = x.length-1; i >= 0; i--)
```

* countPositive(): điều kiện sai vì positive elements chỉ chứa các phần tử có giá trị >0

```java
if(x[i] > 0)
```

* oddOrPos(): điều kiện sai vì số âm chia dư 2 được -1

```java
if(x[i] > 0 || x[i] % 2 == -1)
```

## (b) If possible, give a test case that does not execute the fault. If not, briefly explain why not

* findLast()

```java
//Input:
    x = [1, 2, 3], y = 3
//Expected output:
    2
//Actual output
    2
```

* lastZero()

```java
//Input:
    x = [0]
//Expected output:
    0
//Actual output
    0
```

* countPositive()

```java
//Input:
    x = [3, 4, 5]
//Expected output:
    3
//Actual output
    3
```

* oddOrPos()

```java
//Input:
    x = [3, 5, 7]
//Expected output:
    3
//Actual output
    3
```

## (c) If possible, give a test case that executes the fault, but does not result in an error state. If not, briefly explain why not

* findLast()

```java
//Input:
    x = [0, 2, 3], y = 0
//Expected output:
    0
//Actual output
    -1
```

* lastZero()

```java
//Input:
    x = [0, 1, 0]
//Expected output:
    2
//Actual output
    0
```

* countPositive()

```java
//Input:
    x = [0, 1, 2]
//Expected output:
    2
//Actual output
    3
```

* oddOrPos()

```java
//Input:
    x = [-3, 5, 7]
//Expected output:
    3
//Actual output
    2
```

## (d) If possible give a test case that results in an error, but not a failure. If not, briefly explain why not. Hint: Don’t forget about the program counter

* findLast()

```java
//Input:
    x = [0, 3, 2]; y = 5
//Expected output:
    -1
//Actual output
    -1
```

* lastZero()

```java
//Input:
    x = [0, 1, 2]
//Expected output:
    0
//Actual output
    0
```

* countPositive(): tất cả các trường hợp error đều dẫn đến failure (khi mảng có phần tử 0 thì xảy ra error)

* oddOrPos(): tất cả các trường hợp error đều dẫn đến failure (khi x lẻ và không dương thì x % 2 = -1, không thỏa mãn if condition -> error)

## (e) For the given test case, describe the first error state. Be sure to describe the complete state

* findLast():

```java
//Input
    x = [2, 3, 5]; y = 2
//Expected output
    0
//Actual output
    -1
//First error state
    x = [2, 3, 5]
    y = 2
    i = 0
```

* lastZero()

```java
//Input
    x = [0, 1, 0]
//Expected output
    2
//Actual output
    0
//First error state
    x = [0, 1, 0]
    i = 0
    x[i] = 0
```

* countPositive()

```java
//Input
    x = [-4, 2, 0, 2]
//Expected output
    2
//Actual output
    3
//First error state
    x = [-4, 2, 0, 2]
    count = 2 (counting x[1] = 2 and x[2] = 0)
    i = 2
```

* oddOrPos()

```java
//Input
    x = [-3, -2, 0, 1, 4]
//Expected output
    3
//Actual output
    2
//First error state
    x = [-3, -2, 0, 1, 4]
    count = 0 (not counting x[0] = -3)
    i = 0
```

## (f) Implement your repair and verify that the given test now produces the expected output. Submit a screen printout or other evidence that your new program works

* findLast()

```java
public int findLast (int[] x, int y) {
    for (int i = x.length-1; i >= 0; i--) {
        if (x[i] == y) {
            return i;
        }
    }
    return -1;
}
```

* lastZero()

```java
public static int lastZero (int[] x) {
    for (int i = x.length-1; i >= 0; i--) {
        if (x[i] == 0) {
            return i;
        }
    }
    return -1;
}
```

* countPositive():

```java
public int countPositive (int[] x) {
    for (int i = 0; i < x.length; i++) {
        if (x[i] > 0) {
            count++;
        }
    }
    return count;
}
```

* oddOrPos():

```java
public static int oddOrPos (int[] x) {
    int count = 0;
    for (int i = 0; i < x.length; i++>) {
        if(x[i] > 0 || x[i] % 2 === -1) {
            count++;
        }
    }
    return count;
}
```
