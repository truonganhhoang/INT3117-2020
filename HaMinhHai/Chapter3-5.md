# 5. JUnit với hàm `sort()` có 1 lỗi cú pháp. Tìm và mô tả lỗi đó theo mô hình RIPR

``` java
@Test
public void testSort()
{
    names.add("Laura");
    names.add("Han");
    names.add("Alex");
    names.add("Ashley");
    names.sort();
    assertTrue("Sort method", name.getFirst().equals("Alex"));
}
```
- Sự kiểm định chỉ kiểm tra 1 phần nhỏ của trạng thái cuối cùng(phần từ đầu tiên trong mảng) nên nếu 1 trường hợp kiểm thử gây ra lỗi và lan sang 1 phần khác của trạng thái cuối, lỗi sẽ không bị tiết lộ. Các bài kiểm thử xác định đầu ra tập trung xem xét toàn bộ mảng.