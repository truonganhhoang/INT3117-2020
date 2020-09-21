##Câu 5
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

Cài đặt này chỉ kiểm tra phần tử đầu tiên của mảng sau khi đã sắp xếp, do đó nếu có một lỗi trong các phần tử sau đó thì không thể phát hiện