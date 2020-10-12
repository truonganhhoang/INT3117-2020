Bài 5:

- Vẽ đồ thị:
![Graph](https://i.ibb.co/HVY2Zcm/Screen-Shot-2020-10-12-at-00-19-17.png)
- Các yêu cầu kiểm thử cho bao hàm cặp cạnh:
    + {1, 2, 3}
    + {1, 2, 4}
    + {2, 3, 2}
    + {2, 4, 5}
    + {2, 4, 6}
    + {3, 2, 3}
    + {3, 2, 4}
    + {4, 5, 6}
    + {4, 6, 1}
    + {5, 6, 1}
    + {6, 1, 2}
    + {6, 1, 7}
- Không thỏa mãn bao hàm cặp cạnh vì thiếu {3, 2, 3} và {6, 1, 2}.
- Đường đi kiểm thử có đi qua đường đi đơn giản: {3, 2, 4, 6, 1, 2, 4, 5, 6}.
- Các yêu cầu kiểm thử cho bao hàm nút, bao hàm cạnh, bao hàm đường đi nguyên tố:
    + Bao hàm nút: {1, 2, 3, 4, 5, 6, 7}
    + Bao hàm cạnh: {(1, 2), (1, 7), (2, 3), (2, 4), (3, 2), (4, 5), (4, 6), (5, 6), (6, 1)}
    + Bao hàm đường đi nguyên tố: {1, 7}, {2, 3, 2}, {1, 2, 3, 2}, {5, 6, 1, 7}, {1, 2, 4, 6, 1}, {2, 4, 6, 1, 7}, {2, 4, 6, 1, 2}, {1, 2, 4, 5, 6, 1}, {2, 4, 5, 6, 1, 2}, {5, 6, 1, 2, 4, 5}.
- Đường đi kiểm thử bao hàm nút nhưng không bao hàm cạnh: {1, 2, 3, 2, 4, 5, 6, 1, 7}.
- Đường đi kiểm thử bao hàm cạnh nhưng không bao hàm đường đi nguyên tố: {1, 2, 3, 2, 4, 5, 6, 1, 2, 4, 6, 1, 7}.