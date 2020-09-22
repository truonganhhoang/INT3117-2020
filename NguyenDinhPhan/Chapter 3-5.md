# Chapter 3-5
## The following JUnit test method for the ```sort()``` method has a nonsyntactic flaw. Find the flaw and describe it in terms of the RIPR model. Be as precise, specific, and concise as you can. For full credit, you must use the terminology introduced in the book. In the test method, names is an instance of an object that stores strings and has methods ```add()```, ```sort()```, and ```getFirst()```, which do exactly what you would expect from their names. You can assume that the object names has been properly instantiated and the ```add()``` and ```sort()``` methods have already been tested and work correctly.

```java
@Test
public void testSort(){
    names.add("Laura");
    names.add("Han");
    names.add("Alex");
    names.add("Ashley");
    names.sort();
    assertTrue("Sort method",names.getFirst().equals(Alex);
    }
```

### Do chỉ kiểm tra phần tử đầu tiên trong danh sách mà không kiểm tra toàn bộ phần tử nên nếu ca kiểm thử gây ra lỗi và lỗi này lan truyền sang một trạng thái khác thì sẽ không thể quan sát được lỗi.