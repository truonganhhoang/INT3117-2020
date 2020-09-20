### Exercise 4: 
```java
import java.util.*;
import org.junit.*;

public class MinTest {
/**
* Test method min of class Min.
*/
    @Test(expected = NullPointerException.class)
    public void testMin() {
    	List list = new ArrayList();
        list.add(null);
        Object result = Min.min(list);
    }
}
```
