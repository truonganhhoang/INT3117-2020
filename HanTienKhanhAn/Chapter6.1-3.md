3.
a) Ví dụ về việc `“Location of element in list”` không thỏa mãn tính rời rạc.

`Search([2,6,2], 2) thì cách phân vùng này không nhận biết được là phần tử 2 năm ở cả đầu và cuối.`


b) Ví dụ về việc `“Location of element in list”` không thỏa mãn tính đầy đủ.

`Search([6,10], 8) thì cách phân vùng này không có `block` tiếp nhận phần tử không có trong danh sách.`
