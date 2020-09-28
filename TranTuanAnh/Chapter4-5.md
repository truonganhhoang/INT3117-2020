# Repair a fault in an existing system.

- Mã ban đầu:

```java

public class NumZero {
  int count = 0;
  public static int numZero(int[] x) {
    for (int i = 1; i < x.length; i++) {
      if(x[i] == 0) count++;
    }
    return count;
  }
}
```

- Kiểm thử có lỗi:

```java
public class NumZeroTest{
  @Test public void zeroFirstElement() {
    int arr[] = {0, 1, 2};
    assertEquals("Zero in first element", 1, NumZero.numZero(arr));
  }
}
```

- Mã nguồn sau khi đã sửa:

```java
public class NumZero {
  public static int numZero (int[] x) {
    for (int i = 0; i < x.length; i++) {
      if(x[i] == 0) count++;
    }
    return count;
  }
}
```
