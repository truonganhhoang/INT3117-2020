# How else could we compare test criteria besides subsumption?

Chúng ta có thể so sánh các tiêu chí kiểm thử bằng các cách khác như là
* Xem tập bộ kiểm thử đó có đi qua hết các cạnh đồ thị không, nếu có nghĩa là có đi qua tất cả các đỉnh của đồ thị. Khi đó bộ kiểm thử đó sẽ thỏa mãn đầy đủ tiêu chí nhánh của chương trình P cũng như sự đầy đủ tiêu chí cho các câu lệnh trong cùng chương trình. Ngược lại thì không đúng. Tuy vậy có lúc đi hết các nhánh nhưng vẫn thiếu điều kiện.
* Xét điều kiện: Bao phủ điều kiện phân tích các trường hợp một cách chi tiết hơn.
* Bao phủ đa điều kiện: Bao phủ đa điều kiện của T được tính bằng Cc/(Ce-Ci) với Cc là số tổ hợp bao phủ, Ci là số tổ hợp đơn giản không khả thi, Ce là tổng các tổ hợp trong chương trình.
* MC/DC (Modified condition/decision): Sửa đổi điều kiện/quyết định bao phủ.