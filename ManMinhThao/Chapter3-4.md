## Câu 4: Xóa "NullPoiterExeption" trong figure 3.2. Xác nhận rằng Junit test với bộ test có 1 biến null thì test thất bại

Khi xóa dòng `if (result == null) throw new NullPointerException ("Min.min");` thì mọi lỗi liên quan đến null pointer thay vì bị báo cáo lại cho tester và bỏ qua, giờ nó sẽ báo lỗi và chương trình sẽ crash ngay lập tức.