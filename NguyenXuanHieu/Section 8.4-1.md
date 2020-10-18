# Section 8.4-1 

# Consider the remove() method from the Java Iterator interface. The remove() method has a complex precondition on the state of the Iterator, and the programmer can choose to detect violations of the precondition and report them as IllegalStateException.

a, Formalize the precondition.

b, Find (or write) an implementation of an Iterator. The Java Collection classes are a good place to search.

- Tất cả sự cài đặt của giao diện Collection cung cấp 1 hàm con trỏ (iterator())

c, Develop and run CACC tests on the implementation.

```
Set<Interger> s = new HashSet<Integer>();
s.add(new Integer(1));
s.add(new Integer(2));
s.add(new Integer(3));

Iterator itr = s.iterator();
```
a gọi đến itr.remove() ở đây sẽ bài kiểm tra Fx: itr.next();

a gọi đến itr.remove() ở đây bài kiểm tra cho TT: itr.remove();

a gọi đến itr.remove() ở đây bài kiểm tra cho TF: không có gì
