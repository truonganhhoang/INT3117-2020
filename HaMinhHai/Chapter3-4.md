# 4. Xóa cú pháp *throw* của `NullPointerException` trong chương trình `Min`. Kiểm tra rằng kiểm thử JUnit cho 1 mảng chứa 1 phần tử *null* sẽ bị lỗi


``` java
public class MinTest {
    @Test(expected = NullPointerException.class)
    public void testMin() {
        System.out.println("min");
        List list = new ArrayList();
        list.add(null);
        Object result = Min.min(list);
    }
}
```

- Khi đó kết quả sẽ báo lỗi hàm testMin "Failed: Expected exception: java.lang.NullPointerException"