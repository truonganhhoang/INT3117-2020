>Answer questions a–d for the graph defined by the following sets:
>- N = {1, 2, 3, 4}
>- N<sub>0</sub> = {1}
>- N<sub>f</sub> = {4}
>- E = {(1, 2), (2, 3), (3, 2), (2, 4)}

>(a) Draw the graph.\
 (b) If possible, list test paths that achieve Node Coverage, but not
 Edge Coverage. If not possible, explain why not.\
 (c) If possible, list test paths that achieve Edge Coverage, but not
 Edge-Pair Coverage. If not possible, explain why not.\
 (d) List test paths that achieve Edge-Pair Coverage.

(b) Đối với chương trình này, điều này là không thể. 
Tất cả các đường đi kiểm thử phải bắt đầu tại nút 1, truy cập nút 2 và cuối cùng kết thúc tại nút 4. 
Bất kỳ đường dẫn kiểm tra nào truy cập vào nút 3 cũng truy cập cả cạnh (2, 3) và cạnh (3, 2).
\
(c) T = ```{[1, 2, 3, 2, 4]}```.\
Cặp cạnh ```[3, 2, 3]``` không được tham quan theo đường đi kiểm thử duy nhất đã cho.
\
(d) T = ```{[1, 2, 4], [1, 2, 3, 2, 3, 2, 4]}```
