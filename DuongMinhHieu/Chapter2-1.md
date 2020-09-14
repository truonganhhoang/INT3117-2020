# How are faults and failure related to testing and debugging?

Đầu tiên chúng ta cần hiểu các khái niệm.

* Khiếm khuyết (faults) là những lỗi ở trong mã nguồn, thường do lập trình viên.

* Lỗi (failures) là những kết quả sai sót bên ngoài gây ra bởi khiếm khuyết.

* Kiểm thử (Testing) là đánh giá phần mềm bằng cách quan sát khi thực thi phần mềm. Đơn giản hơn, kiểm thử là quá trình cố gắng làm hiện ra lỗi (failures) hay thể hiện được rằng lỗi có thể xảy ra.

* Tìm lỗi (Debugging) là quá trình tìm ra và cố gắng sửa các khiếm khuyết (faults) mà gây ra lỗi (failures) đã lộ ra khi kiểm thử.

Từ khái niệm ta đã thấy được rằng Debugging chính là quá trình tìm ra khiếm khuyết và sửa chúng sau khi tìm được lỗi ở quá trình Testing. Testing sẽ được thực hiện trước để thể hiện rằng có (hoặc có thể xảy ra) các lỗi trong chương trình.