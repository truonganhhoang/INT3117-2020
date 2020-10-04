# Chapter 6.1.2
## A tester defined three characteristics based on the input parameter car: Where Made, Energy Source, and Size. The following partitionings for these characteristics have at least two mistakes. Correct them.

<br>

## 
|   Where made  |        |      |
| ------------- | :----: | ---- |
| North America | Europe | Asia |

| Energy Source |          |        |
| ------------- | -------- | ------ |
| gas           | electric | hybrid |

| Size   |        |            |
| ------ | :----: | ---------- |
| 2-door | 4-door | hatch back |
<br>


## Sửa lại:
- `Where made` không đầy đủ, vì không chứa toàn bộ các địa điểm có thể có, cần thêm giá trị `"other places"`.
- Các giá trị trong `Size` có sự trùng lặp, vì `"hatch back"` có thể là 2 cửa hoặc 4 cửa nên phải sửa thành `"hatch back and 2-door"` và `"hatch back and 4-door"` để cụ thể hơn.