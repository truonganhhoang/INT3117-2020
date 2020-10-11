- Các đường đi kiểm thử là: ``p2``, ``p3``.
- Đường đi ``p1`` không phải là đường đi kiểm thử vì nó không kết thúc ở nút cuối cùng.
- Đường đi ``p4`` không phải là đường đi kiểm thử vì nó không bắt đầu ở nút khởi động.
- Đường đi ``p5`` không phải là đường đi kiểm thử vì nó có cạnh (``3``, ``2``) là cạnh không tồn tại trong đồ thị.
- Liệt kê tám yêu cầu kiểm thử cho bao hàm cặp cạnh:
    [``1``, ``2``, ``1``]
    [``1``, ``2``, ``3``] 
    [``1``, ``3``, ``1``]
    [``2``, ``1``, ``2``] 
    [``2``, ``1``, ``3``] 
    [``2``, ``3``, ``1``] 
    [``3``, ``1``, ``2``] 
    [``3``, ``1``, ``3``]
- Đường đi kiểm thử ở câu *a* không thỏa mãn bao hàm cặp cạnh vì chúng còn thiếu [``2``, ``1``, ``2``] và [``3``, ``1``, ``3``].
- Đường đi ``p3`` có đi vòng (tour) đường đi nguyên tố: [``3``, ``1``, ``2``, ``1``, ``3``].