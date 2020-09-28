# Chapter 3

#### 4
```
public class MinTest {
    @Test(expected = NullPointerException.class)
    public void testMin() {
        System.out.println("Test Min null pointer exception");
        List list = new ArrayList();
        list.add(null);
        Object result = Min.min(list);
    }
}
```
