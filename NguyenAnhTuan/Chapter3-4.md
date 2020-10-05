# 4. Delete the explict throw of NullPointerException in the Min program (figure 3.2). Verify that the JUnit test for a list with a single null element now fails.

- Nếu xóa bỏ cú pháp: "if (result == null) throw new NullPointerException ("Min.min");" thì ta sẽ thấy phần "testForSoloNullElement ();" xuất hiện lỗi.
