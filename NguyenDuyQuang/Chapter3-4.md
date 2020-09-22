## **Question 4: Delete the explicit throw of NullPointerException in the Min program (Figure 3.2). Verify that the JUnit test for a list with a single null element now fails** ##
  Vì chúng ta đã xóa 
 ```
if (result == null) throw new NullPointerException ("Min.min");
```
nên khi chạy test ở dưới mà có phần thử null thì nó sẽ thất bại