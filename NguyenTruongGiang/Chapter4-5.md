- Code gốc:
```java
public class Sum{
   int sum = 0;
   public static int sumArray (int[] a){  
      for (int i = 1; i < a.length; i++){
         sum += x[i];
      }
      return sum;
   }
}
```
- Kiểm thử có lỗi: 
```java
public class SumTest{
   @Test public void sumTest() {
      int arr[] = {0, 1, 2};
      assertEquals(3, Sum.sumArray(arr));
   }
}
```
- Code sau khi đã refactor:
```java
public class Sum{
   int sum = 0;
   public static int sumArray (int[] a){  
      for (int i = 0; i < a.length; i++){
         sum += x[i];
      }
      return sum;
   }
}
```
- KIểm thử không có lỗi:
```java
public class SumTest{
   @Test public void sumTest() {
      int arr[] = {0, 1, 2};
      assertEquals(3, Sum.sumArray(arr));
   }
}
```
