# Chapter 7.2.2-3

> Subsumption has a significant weakness. Suppose criterion C<sub>strong</sub> subsumes criterion C<sub>weak</sub> and that test set T<sub>strong</sub> satisfies C<sub>strong</sub> and test set T<sub>weak</sub> satisfies C<sub>weak</sub>. It is not necessarily the case that T<sub>weak</sub> is a subset of T<sub>strong</sub>. It is also not necessarily the case that T<sub>strong</sub> reveals a fault if Tweak reveals a fault. Explain these facts.

Vấn đề là sự phụ thuộc của C<sub>yếu</sub> bởi C<sub>mạnh</sub> không có nghĩa là có mối quan hệ tập hợp con giữa T<sub>yếu</sub> và T<sub>mạnh</sub>.

Nói chung, có nhiều bài kiểm thử có thể được lựa chọn để đáp ứng một yêu cầu kiểm thử nhất định.

Với một số yêu cầu kiểm thử chung cho cả C<sub>yếu</sub> và C<sub>mạnh</sub>, chắc chắn có thể chọn một bài kiểm tra cho T<sub>weak</sub> và một bài kiểm tra khác cho T<sub>strong</sub>.

Đặc biệt, kiểm thử tìm ra lỗi có thể được sử dụng khi chọn T<sub>yếu</sub>, nhưng không được sử dụng khi chọn T<sub>mạnh</sub>.