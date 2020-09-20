## **Question 4: Delete the explicit throw of NullPointerException in the Min program (Figure 3.2). Verify that the JUnit test for a list with a single null element now fails** ##

```
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
