Trong đoạn mã JUnit:
```
  @Test
  public void testSort()
  {
    names.add("Laura");
    names.add("Han");
    names.add("Ashley");
    names.add("Alex");
    names.sort();
  assertTrue ("Sort method", names.getFirst().equal("Alex"));
}
```
Câu lệnh "assertTrue" chỉ kiểm tra phần tử đầu tiên của danh sách là "Alex", có nghĩa là chỉ kiểm tra trạng thái cuối (final state).
Vì vậy nếu test kích hoạt lỗi trong đoạn mã (fault), sau đó kiểm tra phần tử khác của trạng thái cuối thì lỗi xảy bên ngoài không hiện.
Do đó mà test oracle phải kiểm tra toàn bộ danh sách.
