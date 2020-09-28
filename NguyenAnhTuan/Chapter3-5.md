# 5. The following JUnit test method for the sort() method has a non-syntactic flaw. Find the
flaw and describe it in terms of the RIPR model. Be as precise, specific, and concise as you
can. For full credit, you must use the terminology introduced in the book.

- Việc xác nhận chỉ kiểm tra một phần nhỏ trong trạng thái cuối cùng (phần tử đầu tiên trong danh sách). 
Vì vậy, nếu một kiểm thử làm mỗi lỗi lây nhiễm, và sau đó lan truyền đến một phần khác của trạng thái cuối 
cùng, lỗi sẽ không được tiết lộ. Lời tiên tri kiểm tra cần xem xét toàn bộ danh sách.
