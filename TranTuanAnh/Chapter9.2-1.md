# Section 9.2-1

**Provide reachability conditions, infection conditions, propagation conditions, and test case values to kill mutants 2, 4, 5, and 6 in Figure 9.1.**

Với `Δ2`: Điều kiện này sẽ luôn được thực thi, và nếu vị từ (`B > A`) cho ra giá trị khác giá trị mong đợi thì đoạn mã bên dưới có thể không được thực thi (tuỳ thuộc vào kết quả của vị từ)

Với `Δ4`: Đoạn mã này sẽ chỉ được chạy nếu vị từ (`B < minVal`) được thoả mãn. Đột biến `Bomb()` sẽ luôn lây nhiễm và lan truyền tới các đoạn mã dưới nó.

Với `Δ5`: Tương tự như `Δ4`, đoạn mã này sẽ chỉ được chạy nếu vị từ (`B < minVal`) được thoả mãn. Nó chỉ lây nhiễm nếu giá trị `minVal` được gán bằng giá trị khác, và nó sẽ luôn lan truyền nếu được gán bằng giá trị khác.

Với `Δ6`: Tương tự như Δ4, đoạn mã này sẽ chỉ được chạy nếu vị từ (`B < minVal`) được thoả mãn. Đột biến sẽ bị lây nhiễm nếu minVal là số `0`, và nếu đã bị đột biến thì nó sẽ lan truyền tới các đoạn mã sau đó.
