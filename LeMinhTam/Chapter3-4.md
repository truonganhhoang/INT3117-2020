## Xóa bỏ NullPointerException một cách rõ ràng trong chương trình Min (Hình 3.2). Xác minh rằng kiểm tra JUnit cho danh sách có một phần tử null hiện không thành công
```java
public class Min
{
  /**
    * Returns the mininum element in a list
    * @param list Comparable list of elements to search
    * @return the minimum element in the list
    * @throws NullPointerException if list is null or
    *         if any list elements are null
    * @throws ClassCastException if list elements are not mutually comparable
    * @throws IllegalArgumentException if list is empty
    */
    public static <T extends Comparable<? super T>> T min (List<? extends T> list)
    {
       if (list.size() == 0)
       {
          throw new IllegalArgumentException ("Min.min");
       }

       Iterator<? extends T> itr = list.iterator();
       T result = itr.next();

       if (result == null) throw new NullPointerException ("Min.min");

       while (itr.hasNext())
       {   // throws NPE, CCE as needed
           T comp = itr.next();
           if (comp.compareTo (result) < 0)
           {
               result = comp;
           }
       }
       return result;
    }
}
```

+ Nếu ta lựa chọn xóa dòng sau     
```java 
if (result == null) throw new NullPointerException ("Min.min");
```
+ Khi đó ca kiểm thử mang tên `testForSoloNullElement()` sẽ thất bại

```java
public class MinTest {
/**
* Test of min method, of class Min.
*/
    @Test(expected = NullPointerException.class)
    public void testMin() {
        System.out.println("min       List list = new ArrayList();
        list.add(null);
        Object result = Min.min(list);
    }
}
```

