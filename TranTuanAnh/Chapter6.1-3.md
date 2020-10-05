# Answer the following questions for the method `search()` below:

**(a) “Location of element in list” fails the disjointness property. Give an example that illustrates this.**

> Phần tử xuất hiện ở cả đầu và cuối danh sách. Ví dụ 1 danh sách: `[1, 1, 1, 1, 1, 1]` và cần tìm số `1` ở trong danh sách đó.

**(b) “Location of element in list” fails the completeness property. Give an example that illustrates this.**

> Phần tử không có trong mảng. Ví dụ danh sách `[1, 2, 3, 4, 5]`, tìm phần tử có giá trị bằng `6`.

**(c) Supply one or more new partitions that capture the intent of “Location of element in list” but do not suffer from completeness or disjointness problems.**

> Chia yêu cần của bài toán thành:
> - Phần tử xuất hiện ở đầu danh sách: `(True,False)`.
> - Phần tử xuất hiện ở cuối danh sách: `(True,False)`.
> - Phần tử xuất hiện ở trong danh sách: `(True,False)`.