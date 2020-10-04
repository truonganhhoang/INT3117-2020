## Câu 3: Trả lời câu hỏi dựa trên hàm `seach()`:

a, “Location of element in list” không thỏa mãn tính "không giao nhau":
> `search([3, 4, 5, 3], 3)` có giá trị `3` vừa ở vị trí đầu và cuối.

b, “Location of element in list” không thỏa mãn tính "đầy đủ":
> `search([1, 2, 3], 4)` không có giá trị `4` trong danh sách nên nó không phải phần từ đầu tiên, cuối cùng hay các vị trí khác trong danh sách

c, Thêm một vài khối cho ví dụ trên:

    - Block 4: element is not in the list
    - Block 5: element is the first but not the last entry in list
    - Block 6: element is the last but not the first entry in list