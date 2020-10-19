# 3.Khả năng thay thế có một điểm yếu đáng kể. Giả sử tiêu chí Cstrong phụ thuộc vào tiêu chí Cweak và tập kiểm tra đó Tstrong thỏa mãn Cstrong và tập kiểm tra Tweak thỏa mãn Cweak. Nó là không nhất thiết là trường hợp Tweak là một tập con của Tstrong. Nó cũng không nhất thiết là rường hợp Tstrong tiết lộ lỗi nếu Tweak tiết lộ lỗi. Giải thích những sự thật này.
Vấn đề là sự phụ thuộc *Cweak* của *Cstrong* không bao hàm mối quan hệ tập hợp con
giữa *Tweak* và *Tstrong*. 

Nói chung, có nhiều bài kiểm thử để lựa chọn đáp ứng
một số yêu cầu kiểm thử nhất định. Đưa ra một số yêu cầu kiểm thử chung cho cả *Cweak* và
*Cstrong*, chắc chắn có thể chọn một bài kiểm thử cho *Tweak* và một bài kiểm tra khác cho
*Tstrong*. 

Đặc biệt, một bài kiểm tra tiết lộ lỗi có thể được chọn khi chọn *Tweak*, nhưng
không được chọn khi chọn *Tweak*.