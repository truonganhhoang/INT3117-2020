# **Question:** 
Delete the explicit throw of NullPointerException in the Min program. Verify that the JUnit test for a list with a single null element now fails.

**Dịch**
> Xóa việc ném ngoại lệ NullPointerException trong chương trình Min. Xác minh việc kiểm tra bằng JUnit cho một phần thử null hiện không thành công

# **Answer:**
**File min.java lấy từ website**
```java
package Assets;

// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See MinTest.java for JUnit tests.
// See DataDrivenMinTest.java for JUnit tests. (Instructor only)

import java.util.*;

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

    //    if (result == null) throw new NullPointerException ("Min.min");

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
**File Mintest.java của em**

```java
public class MinTest {
/**
* Test of min method, of class Min.
*/
    @Test(expected = NullPointerException.class)
    public void testMin() {
        System.out.println("min");
        List list = new ArrayList();
        list.add(null);
        Object result = Min.min(list);
    }
}
```