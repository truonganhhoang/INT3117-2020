# Write down all 16 tests to satisfy the Multiple Base Choice Coverage (MBCC) for the second categorization of ```triang()```’s inputs in Table 6.2. Use the values in Table 6.3.

Em sẽ lấy 2 ca kiểm thử gốc (base), đó là (1,2,2) và (2,2,2), theo yêu cầu của đề bài.

### Với gốc (base) là (1,2,2)

|           | (1, 2, 2)  |            |
|-----------|------------|------------|
| (0, 2, 2) | (-1, 2, 2) |            |
| (1, 1, 2) | (1, 0, 2)  | (1, -1, 2) |
| (1, 2, 1) | (1, 2, 0)  | (1, 2, -1) |

### Với gốc (base) là (2,2,2)

|           | (2, 2, 2)  |            |
|-----------|------------|------------|
| (0, 2, 2) | (-1, 2, 2) |            |
| (2, 1, 2) | (2, 0, 2)  | (2, -1, 2) |
| (2, 2, 1) | (2, 2, 0)  | (2, 2, -1) |

### Chú ý: có 2 ca kiểm thử bị trùng lặp: (0,2,2) và (-1,2,2) nên tổng số tất cả các ca kiểm thử chỉ là 16, thoả mãn yêu cầu đề bài.