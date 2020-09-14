# (a)    Explain what is wrong with the given code. Describe the fault precisely by proposing a modification to the code.

* findLast(): Miss element at index i = 0.
```java
for (int i = x.length-1; i >= 0; i--)
```

* lastZero(): Last index so we need to loop from the tail.
```java
for (int i = x.length-1; i >= 0; i--)
```

* countPositive(): Count positive number so there is not number 0.
```java
if (x[i] > 0)
```

* oddOrPos(): odd numbers can be negative and positive numbers also include odd positive number, so we need odd negative number % 2 = -1.
```java
if (x[i]%2 == -1 || x[i] > 0)
```

# (b) If possible, give a test case that does not execute the fault. If not, briefly explain why not.

* findLast():
```java
test: x = [3, 2, 5]; y = 2; Expected = 1. Actual = 1.
```

* lastZero():
```java
test: x = [0, 1, 2, 3]; Expected = 0. Actual = 0.
```

* countPositive():
```java
test: x = [1, 2, 3, -1]; Expected = 3. Actual = 3.
```

* oddOrPos():
```java
test: x = [-2, -4, 0, 1, 2]; Expected = 2. Actual = 2.
```

# (c) If possible, give a test case that executes the fault, but does not result in an error state. If not, briefly explain why not.

* findLast:
```java
test: x = [0, 1, 2]; y = 0; Expected = 0. Actual = -1.
```

* lastZero():
```java
test: x = [0, 1, 0]; y = 0; Expected = 2. Actual = 0.
```

* countPositive():
```java
test: x = [0, 1, 2]; Expected = 2. Actual = 3.
```

* oddOrPos():
```java
test: x = [-1, 0, 1, 2]; Expected = 3. Actual = 2.
```

# (d) If possible give a test case that results in an error, but not a
failure. If not, briefly explain why not.

* findLast():
```java
test: x = [0, 1, 2]; y = 3; Expected = -1. Actual = -1.
```

* lastZero():
```java
test: x = [1, 2, 3]; Expected = -1. Actual = -1.
```

* countPositive(): impossible to give a test case that results in an error but not a failure because all if there's an element having value = 0, there's a failure.

* oddOrPos(): impossible to give a test case that results in an error but not a failure because all if there's an element having value < 0 and is odd, there's a failure.

# (e) For the given test case, describe the first error state. Be sure to describe the complete state.

* findLast():
```java
test: x = [2, 3, 5]; y = 2; Expected = 0; Actual = -1.
```
first error state: `i = 1` => `x[i] = 3` => Miss element `x[0] = 2` and there isn't any value = 2 in the array.

* lastZero():
```java
test: x = [0, 1, 0], Expected = 2, Actual = 0.
```
first error state: `i = 0` => `x[i] = 0` => `return 0` (not the last index).

* countPositive():
```java
test: x = [-4, 2, 0, 2]; Expected = 2; Actual = 3.
```
first error state: `i = 2` => `x[i] = 0` => `count++` (0 is not positive).

* oddOrPos():
```java
test: x = [-3, -2, 0, 1, 4]; Expected = 3; Actual = 2.
```
first error state: `i = 0` => `x[i] = -3` => `count not ++` (-3 is an odd number).

# (f) Implement your repair and verify that the given test now produces the expected output.

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
