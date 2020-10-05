# Section 6.1-3

# Answer the following questions for the method search() below: 
# Base your answer on the following characteristic partitioning:

a, “Location of element in list” fails the disjointness property. Give
an example that illustrates this.

- Ví dụ cho trường hợp này đó là nếu phần từ của mảng xuất hiện ở cả đầu list và ở cả cuối list. Ví dụ 1 list [1, 1, 1, 1, 1, 1, 1] và mình cần tìm ra số 1 xuất hiện ở đâu trong list.

b, “Location of element in list” fails the completeness property.
Give an example that illustrates this.

- Ví dụ cho trường hợp này đó là nếu phẩn từ cần tìm không có trong mảng. Ví dụ list[0, 1, 2, 3, 4, 5] và phân từ cần tim là 6.

c, Supply one or more new partitions that capture the intent of
“Location of element in list” but do not suffer from
completeness or disjointness problems

- Ở yêu cầu thì mình sẽ chia bài toàn thành:
    
    + Nếu phẩn từ xuất hiện ở đầu list: (True, False)
    + Nếu phẩn từ xuất hiện ở cuối list: (True, False)
    + Nếu phần từ có ở trong list: (True, False)