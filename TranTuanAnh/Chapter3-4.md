# Delete the explicit throw of NullPointerException in the Min program. Verify that the JUnit test for a list with a single null element now fails.

- Xoá dòng:<br/>
```if (result == null) ném mới NullPointerException ("Min.min");```

- Xác nhận lại bằng JUnit
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
