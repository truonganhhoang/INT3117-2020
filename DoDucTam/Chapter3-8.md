## **Question 8: Develop a set of data-driven JUnit tests for the Min program. These tests should be for normal, not exceptional, returns. Make your @Parameters method produce both String and Integer values.** ##

```
 Min.java ------------------------------------------

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
public static > T min (List list)
{
    if (list.size() == 0)
    {
       throw new IllegalArgumentException ("Min.min");
    }

    Iterator itr = list.iterator();
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

Here is ------------data-driven JUnit tests--------------------------------------

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class DataDrivenMinTest {
    //TODO

}
```
