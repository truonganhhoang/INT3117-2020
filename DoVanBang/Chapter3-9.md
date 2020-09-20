# Chapter 3

#### 9
Khi ghi đè phương thức equals (), lập trình viên cũng được yêu cầu ghi đè phương thức hashCode (); nếu không các máy khách không thể lưu trữ các phiên bản của các đối tượng này trong các cấu trúc Collection chung như HashSet. Ví dụ, lớp Point từ Chương 1 bị lỗi về mặt này.

Hashset
```
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2); // note that p1.equals(p2)
Set<Point> s = new HashSet<Point>();
s.add(p1);
boolean b = s.contains(p2); // we really want b to be true!
```

Mặc dù có thể là b đúng, nhưng có nhiều khả năng hai đối tượng Point băm thành
các nhóm khác nhau, trong trường hợp đó b là sai.



```
@Test public void hashConsistentWithEquals() {
Point p1 = new Point(1,2);
Point p2 = new Point(1,2);
assertTrue("Hash codes must match", p1.hashCode() == p2.hashCode());
}
```


```
@Override public int hashCode() {
int result = 17;
result = 31 * result + x;
result = 31 * result + y;
return result;
}
```


```
@Theory public void hashConsistentWithEqualsTheory(Object o1, Object o2) {
assumeTrue(o1 != null);
assumeTrue(o2 != null);
assumeTrue(o1.equals(o2));
assertTrue("Hash codes must match", o1.hashCode() == o2.hashCode());
}
```

```
@DataPoints public static Object[] objects = {
new Point(1,2), new Point(1,2), new Point(1,3), "ant", null
};
```
