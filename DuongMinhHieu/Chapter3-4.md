# Delete the explicit throw of NullPointerException in the Min program. Verify that the JUnit test for a list with a single null element now fails.

``java
public class MinTest {
    //Test of min() method
    @Test(expected = NullPointerException.class)
    public void testMin() {
        System.out.println("min");
        List list = new ArrayList();
        list.add(null);
        Object result = Min.min(list);
    }
}
```
* Kết quả là exception NullPointerException.