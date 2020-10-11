# Answer the following questions for the method search() below:
###(a) “Location of element in list” fails the disjointness property. Give an example that illustrates this.
   
- Phần tử xuất cả ở đầu lẫn cuối trong mảng. VD: Tìm số 2 trong mảng [2], khi ấy 2 vừa là phần tử đầu, vừa là cuối.

###(b) “Location of element in list” fails the completeness property. Give an example that illustrates this.
   
- Phần tử không có trong mảng. VD: Tìm số 3 trong mảng [2, 2, 2, 2].
###(c) Supply one or more new partitions that capture the intent of “Location of element in list” but do not suffer from completeness or disjointness problems.
- Chia yêu cầu bài toán thành:
    - Phần tử xuất hiện đầu mảng: (True, False).
    - Phần tử xuất hiện cuối mảng: (True, False).
    - Phần tử xuất hiện trong danh sách: (True, False).