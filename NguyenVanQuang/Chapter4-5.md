Bài 5:
- Chương trình nhập một số bất kì và tính tổng các chữ số của số đã nhập 
```java
import java.util.Scanner;
public class Main {
    public static int tongChuSo(int n) {
        int T = 1;
        while (n > 0) {
            T += n % 10;
            n /= 10;
        }
        return (T);
    }
}
```
- Kiểm có lỗi :
```java
import java.util.*;
public class test{
  @Test
  public static void test(){
    int n;
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    assertEquals(6, Main.tongChuso(123));
    /// Error: Main.tongChuso(123) = 7 not 6
  }
}  
```
-Sau khi sửa lại code :
```java
import java.util.Scanner;
public class Main {
    public static int tongChuSo(int n) {
        int T = 0;
        while (n > 0) {
            T += n % 10;
            n /= 10;
        }
        return (T);
    }
}
```
-Kiểm không có lỗi :
```java
import java.util.*;
public class test{
  @Test
  public static void test(){
    int n;
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    assertEquals(6, Main.tongChuso(123));
    ///Main.tongChuso(123) = 6
  }
}  
```
