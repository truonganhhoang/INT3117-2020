> Delete the explicit throw of ```NullPointerException``` in the
  ```Min``` program (Figure 3.2). Verify that the JUnit test for a list with a
  single null element now fails.

Nếu như ta xóa dòng :
```
if (result == null) throw new NullPointerException ("Min.min");
```

Hàm ```testForSoloNullElement()``` sẽ báo lỗi