# Chapter 3-5

> The following JUnit test method for the sort() method has a non-syntactic flaw. Find the flaw and describe it in terms of the RIPR model. Be as precise, specific, and concise as you can. For full credit, you must use the terminology introduced in the book.
>
> In the test method, names is an instance of an object that stores strings and has methodsadd(), sort(), and getFirst(), which do exactly what you would expect from their names. You can assume that the object names has been properly instantiated and the add() and getFirst() methods have already been tested and work correctly.

```java
@Test
public void testSort()
{
names.add ("Laura");
{
    names.add ("Han");
    names.add ("Alex");
    names.add ("Ashley");
    names.sort();
    assertTrue ("Sort method", names.getFirst().equals ("Alex"));
}
```

* Assert chỉ kiểm tra phần tử đầu tiên của list, vì vậy nếu nếu một ca kiểm thử làm cho một lỗi lây nhiễm, và sau đó lan truyền đến một phần khác của trạng thái cuối cùng, lỗi sẽ không được hiển thị.
* Test oracle cần xem xét toàn bộ list.
