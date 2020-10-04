#2. Set up a continuous integration server. Include version control for both source code and tests, and populate both with a simple example. Experiment with “breaking the build,” by either introducing a fault into the source code or adding a failing test case. Restore the build.

- Tạo trên github 1 repository có tên testCI có sẵn 1 file README.md
- Chạy circle CI thấy tất cả đều success.
- Chỉnh sủa làm lỗi file config.yml (breaking the build) sau đó chạy lại thì kết quả hiện failed.
<br>
- Ảnh:
![alt](https://scontent.fhan5-2.fna.fbcdn.net/v/t1.15752-9/120153374_654541351838296_5582189712609743098_n.png?_nc_cat=102&_nc_sid=b96e70&_nc_ohc=GXTZmJwXzY0AX9Oky5i&_nc_ht=scontent.fhan5-2.fna&oh=364c1d43eead84f39bef70134124aec6&oe=5F981B49)