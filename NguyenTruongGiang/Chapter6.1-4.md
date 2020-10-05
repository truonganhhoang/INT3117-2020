#Chapter 6.1-4

##### Với ngăn xếp, chúng ta có các tính chất như sau
- Ngăn xếp rỗng
    - Đúng `{}`
    - Sai `{1,2}, {1,2,3}, ...`
- Kích thước ngăn xếp
    - 0 `{}`
    - 1 `{1}` 
    - lớn hơn 1 `{1,2}, {1,2,3}, ...`
- Trong stack có phần tử giá trị `null` 
    - Đúng `{1, null, 2}`
    - Sai `{1,2}, {1,2,3}, ...`

#####Với đối tượng X, chúng ta có tính chất sau
- X là phần tử `null`
    - Đúng `x = null`
    - Sai `x = 1`
    
##### Tính chất kết hợp giữa đối tượng X và trạng thái của ngăn xếp
- X nằm trong ngăn xếp
    - Đúng `({1,2,3}, 1)`
    - Sai `({1,2,3}, 4)`