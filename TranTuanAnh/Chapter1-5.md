> Question: Below are four faulty programs. Each includes test inputs that result in failure. Answer the following questions about each program.

**(a) Explain what is wrong with the given code. Describe the fault precisely by proposing a modification to the code.**

- ```findLast()```: Vòng lặp phải bao gồm ```i = 0```

```java
for(int i = x.length - 1; i >= 0; i--)
```

- ```lastZero()```: Vòng lặp phải duyệt từ cuối của mảng ```x``` lên đầu

```java
for(int i = x.length - 1; i >= 0; i--)
```

- ```countPositive()```: Điều kiện để kiểm tra số dương

```java
if(x[i] > 0)
```

- ```oddOrPos()```: Điều kiện kiểm tra số lẻ hoặc dương không đúng (nêu ```x[i]``` là số âm lẻ thì ```x[i] % 2``` bằng ```-1```).

```java
if(x[i] > 0 || x[i] % 2 === -1)
```

**(b) If possible, give a test case that does not execute the fault. If not, briefly explain why not.**

- ```findLast()```: bộ thử không thực hiện lỗi:

```java
//Input:
    x = null, y = 1
//Expected output:
    NullPointerException
//Actual output
    NullPointerException
```

- ```lastZero()```: bộ thử không thực hiện lỗi:

```java
//Input:
    x = null
//Expected output:
    NullPointerException
//Actual output
    NullPointerException
```

- ```countPositive()```: bộ thử không thực hiện lỗi:

```java
//Input:
    x = []
//Expected output:
    0
//Actual output
    0
```

- ```oddOrPos()```: bộ thử không thực hiện lỗi:

```java
//Input:
    x = []
//Expected output:
    0
//Actual output
    0
```

**(c) If possible, give a test case that executes the fault, but does not result in an error state. If not, briefly explain why not.**

- ```findLast()```:

```java
//Input:
    x = [2, 3, 4]; y = 3
//Expected output:
    1
//Actual output
    1
```

- ```lastZero()```:

```java
//Input:
    x = [1]
//Expected output:
    -1
//Actual output
    -1
```

- ```countPositive()```:

```java
//Input:
    x = [1, 2, 3]
//Expected output:
    3
//Actual output
    3
```

- ```oddOrPos()```:

```java
//Input:
    x = [1, 2, 3]
//Expected output:
    3
//Actual output
    3
```

**(d) If possible give a test case that results in an error, but not a failure. If not, briefly explain why not. Hint: Don’t forget about the program counter.**

- ```findLast()```:

```java
//Input:
    x = [2, 3, 4]; y = 1
//Expected output:
    -1
//Actual output
    -1
```

- ```lastZero()```:

```java
//Input:
    x = [1,0,2]
//Expected output:
    1
//Actual output
    1
```

- ```countPositive()```: tất cả các trường hợp dẫn đến lỗi đều là failure. Vì nếu trong x có số 0 thì tất cả các trạng thái tiếp theo đều là trạng thái lỗi.

- ```oddOrPos()```: tất cả các trường hợp dẫn đến lỗi đều là failure. Vì nếu trong x có lẻ mà < 0 thì tất cả các trạng thái tiếp theo đều là trạng thái lỗi bất kể x chứa gì.

**(e) For the given test case, describe the first error state. Be sure to describe the complete state.**

- ```findLast()```:

```java
//Input
    x = [2, 3, 5]; y = 2
//Expected output
    0
//Actual output
    -1
//First error state, state when just return -1
    x = [2, 3, 5]
    y = 2
    i = 0 (or i undefined)
```

- ```lastZero()```:

```java
//Input
    x = [0, 1, 0]
//Expected output
    2
//Actual output
    0
//First error state, state when after assign i = 0
    x = [0, 1, 0]
    i = 0
```

- ```countPositive()```:

```java
//Input
    x = [-4, 2, 0, 2]
//Expected output
    2
//Actual output
    3
//First error state, state when after execute count++ statement
    x = [-4, 2, 0, 2]
    count = 2
    i = 2
```

- ```oddOrPos()```

```java
//Input
    x = [-3, -2, 0, 1, 4]
//Expected output
    3
//Actual output
    2
//First error state, state when just after end if statement
    x = [-3, -2, 0, 1, 4]
    count = 0
    i = 0
```

**(f) Implement your repair and verify that the given test now produces the expected output. Submit a screen printout or other evidence that your new program works.**

- ```findLast()```:

```java
public static findLast (int[] x, int y) {
    for (int i = x.length-1; i >= 0; i--) {
        if (x[i] == y) {
            return i;
        }
    }
    return -1;
}
```

- ```lastZero()```:

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

- ```countPositive()```:

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

- ```oddOrPos()```:

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
