# **Question:** 
How are faults and failures related to testing and debugging?

**Dịch**
> Lỗi tĩnh (fault) và lỗi (failures) liên quan như nào đến quá trình kiểm thử và gỡ lỗi

# **Answer:**
Lướt lại một tí 😗

* Lỗi tĩnh (fault - hay là khiếm khuyết) là lỗi sinh ra trong quá trình viết mã nguồn mà chưa được thể hiện ra bên ngoài
* Lỗi (Failures - hay là thất bại) là các lỗi có thể quan sát được khi thực thi chương trình (executing), do chương trình thể hiện không đúng với đặc tả

Với kiểm thử (testing) là quá trình dò tìm, đánh giá lỗi dựa vào quá trình thực thi chương trình. Người kiểm thử đưa vào các bộ đầu vào nhằm mục đích cho các đầu vào ấy chạy đến đúng lỗi (fault) để nó thể hiện ra ngoài thành lỗi (failure) và bằng mắt thường có thể quan sát được

Với gỡ lỗi (debugging) là quá trình dò tìm khiếm khuyết (fault) trong mã nguồn, thứ gây ra lỗi (failure). Bằng quá trình gỡ lỗi mà tìm ra được các khiếm khuyết ngăn không cho nó thể hiện ra thành lỗi (failures)