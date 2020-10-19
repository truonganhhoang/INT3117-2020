# Câu 5:

- Các yêu cầu kiểm thử cho bao hàm các cạnh là: ``[1, 2, 3] [1,2,4] [2,3,2] [2,4,5] [2,4, 6] [3,2,3] [3,2,4] [4, 5,6] [4, 6, 1] [5, 6, 1] [6,1,2] [6,1,7]``
- Các đường đi kiểm thử cho sẵn không thỏa mãn bao hàm pair-edges vì chúng còn thiếu ``[3, 2, 3]`` và ``[6,  1,  2]``
- Các đường đi kiểm thử có đi vòng qua đường đơn giản: ``[3,  2,  4,  6,  1,  2,  4,  5,  6]``
- Các yêu cầu kiểm thử cho bao hàm node, bao hàm edge, bao hàm path nguyên tố:
    -   Bao hàm node:  **TR**  = ``{1, 2, 3, 4, 5, 6, 7}``
    -   Bao hàm edge:  **TR**  =``{(`1`, 2), (1, 7), (2, 3), (2, 4), (3, 2), (4, 5), (4, 6), (5, 6), (6, 1)}``
    -   Bao hàm path nguyên tố: ``[1, 7] [2, 3, 2] [1, 2,  3,  2] [5, 6, 1, 7] [1, 2, 4, 6, 1] [2, 4, 6, 1, 7] [2, 4,  6, 1, 2] [1, 2, 4, 5, 6, 1] [2, 4, 5, 6, 1, 2] [2, 4, 5, 6, 1, 7] [5, 6, 1, 2, 4, 5]``
- Liệt kê đường đi kiểm thử đã đạt được bao hàm node nhưng không bao hàm cạnh: ``[1, 2, 3, 2, 4, 5, 6, 1, 7]``
- Liệt kê đường kiểm thử đã đạt được bao hàm cạnh nhưng lại không bao hàm đường nguyên tố: ``[1, 2, 3, 2, 4, 5, 6, 1, 2, 4, 6, 1, 7]``
