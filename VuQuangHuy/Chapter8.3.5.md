# 8.3.5.
## a.
```java
public static void checkItExpand(boolean a, boolean b, boolean c) {
  if (a) {
    if (b) {
      System.out.println ("P is true");
      return;
    }
    if (c) {
      System.out.println ("P is true");
      return;
    }
    System.out.println ("P isn’t true");
    return;
  }
  System.out.println ("P isn’t true");
}
```