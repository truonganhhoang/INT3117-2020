## Câu 5

```java
@Test
public void testSort()
{
   names.add ("Laura");
   names.add ("Han");
   names.add ("Alex");
   names.add ("Ashley");
   names.sort();
   assertTrue ("Sort method", names.getFirst().equals ("Alex"));
}
```

Cách viết này không đảm bảo độ chính xác vì có khả năng các phần tử đằng sau `Alex` không được sắp xếp đúng, dẫn đến lỗi không được phát hiện