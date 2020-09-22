# 4. Delete the explicit throw of NullPointerException in the Min program (Figure 3.2). Verify that the JUnit test for a list with a single null element now fails.
xóa bỏ dòng code sau đây:
```javascript
if (result == null) throw new NullPointerException ("Min.min");
```
và hàm testForSoloNullElement() sẽ thất bại

