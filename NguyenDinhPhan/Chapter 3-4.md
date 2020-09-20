# Chapter 3-4
## Delete the explicit throw of NullPointerException in the Min program (Figure 3.2). Verify that the JUnit test for a list with a single null element now fails.


### Kết quả:

![](images/Chapter%203-4.png)

### File Min.java (từ website của sách):
``` java
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

        //if (result == null) throw new NullPointerException ("Min.min"); //Delete explicit throw of NPE

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
### File MinTest.java (từ website của sách):
```java
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MinTest
{
    private List<String> list;   // Test fixture

    @Before      // Set up - Called before every test method.
    public void setUp()
    {
        list = new ArrayList<String>();
    }

    @After      // Tear down - Called after every test method.
    public void tearDown()
    {
        list = null;  // redundant in this example!
    }

    @Test
    public void testForNullList()
    {
        list = null;
        try {
            Min.min (list);
        } catch (NullPointerException e) {
            return;
        }
        fail ("NullPointerException expected");
    }

    @Test (expected = NullPointerException.class)
    public void testForNullElement()
    {
        list.add (null);
        list.add ("cat");
        Min.min (list);
    }

    @Test (expected = NullPointerException.class)
    public void testForSoloNullElement()
    {
        list.add (null);
        Min.min (list);
    }

    @Test (expected = ClassCastException.class)
    @SuppressWarnings ("unchecked")
    public void testMutuallyIncomparable()
    {
        List list = new ArrayList();
        list.add ("cat");
        list.add ("dog");
        list.add (1);
        Min.min (list);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEmptyList()
    {
        Min.min (list);
    }

    @Test
    public void testSingleElement()
    {
        list.add ("cat");
        Object obj = Min.min (list);
        assertTrue ("Single Element List", obj.equals ("cat"));
    }

    @Test
    public void testDoubleElement()
    {
        list.add ("dog");
        list.add ("cat");
        Object obj = Min.min (list);
        assertTrue ("Double Element List", obj.equals ("cat"));
    }
}
```