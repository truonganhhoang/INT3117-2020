# Chapter 6

#### Câu 5

Vấn đề: Chỉ dẫn hoàn toàn không tính tới các mẫu trống. Sâu rỗng là trường hợp đặc biệt thường có cho kiểu sâu. Việc triển khai không đạt yêu cầu vì kết quả là ngoại lệ phát hiện chỉ số nằm ngoài giới hạn. Một cách để sửa chỉ dẫn là loại bỏ rõ ràng các mẫu rỗng với cơ chế ngoại lệ:

`@throws IllegalArgumentException if pattern is empty`

Kiểm tra rõ ràng các mẫu trống:
`if (patternLen == 0) throw new IllegalArgumentException("PatternIndex.patternIndex");`