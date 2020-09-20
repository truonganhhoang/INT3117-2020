---
noteId: "8d8be280fb2811eaa14875aebe349099"
tags: []

---

5. 
assertTrue chỉ kiểm tra một phần nhỏ của trạng thái cuối (thành phần đầu tiên của danh sách, ```names.getFirst()```). Vì vậy nếu một kiểm tra gây ra một lỗi (fault) lây nhiễm (infect), và truyền cho phần khác của trạng thái cuối cùng, sự thất bại (failure) không bị lộ. Và người kiểm thử cần phải nhìn toàn bộ danh sách.