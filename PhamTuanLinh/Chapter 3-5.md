#Chapter 3-5
+ Trong đoạn mã
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
Test chỉ kiểm tra xem phần tử đầu của dãy có phải là Alex không, tức kiếm tra trạng thái cuối được biểu thị ra bên ngoài của chương trình. Do đó, nếu test kích hoạt lỗi trong đoạn mã mà không được biểu thị thành trạng thái cuối ( ví dụ như phân tử thứ 2, thứ 3 của danh sách ) thì sẽ không phát hiện được lỗi. 
