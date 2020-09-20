# 4. Delete the explicit throw of NullPointerException in the Min program (Figure 3.2). Verify that the JUnit test for a list with a single null element now fails.

- Trước tiên xóa dòng: if (result == null) throw new NullPointerException ("Min.min");

- File MinTest.java:
```java
public class MinTest {
    @Test(expected = NullPointerException.class)
    public void testMin() {
        List list = new ArrayList();
        list.add(null);
        Object result = Min.min(list);
    }
}
```


