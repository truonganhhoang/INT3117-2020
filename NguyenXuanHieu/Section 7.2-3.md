# Section 7.2-3

# Subsumption has a significant weakness. Suppose criterion Cstrong subsumes criterion Cweak and that test set Tstrong satisfies Cstrong and test set Tweak satisfies Cweak. It is not necessarily the case that Tweak is a subset of Tstrong. It is also not necessarily the case that T strong reveals a fault if Tweak reveals a fault. Explain these facts.


- Vấn đề là sự phụ thuộc của Cweak vào Cstrong không biểu lộ mối quan hệ giữa Tweak và Tstrong. Tổng quan mà nối, có rất nhiều bài kiểm thử để lựa chọn để đáp ứng 1 bài kiểm thử yêu cầu. Đưa ra 1 vài bài kiểm tra yêu cầu thông thường cho cả Cweak và Cstrong, thì có thể chọn 1 bài kiểm tra cho Tweak và 1 cái khác cho Tstrong. Đặc biệt, kiểm tra tiết lộ lỗi có thể được chọn cho Tweak nhưng không được chọn khhi mà chọn Tweak.