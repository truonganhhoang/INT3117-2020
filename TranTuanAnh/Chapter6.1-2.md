# A tester defined three characteristics based on the input parameter car: Where Made, Energy Source, and Size. The following partitionings for these characteristics have at least two mistakes. Correct them.

- Tham số đầu tiên (`Where made`): Có trường hợp xe không thuộc cả 3 khu vực đã cho (`North America`, `Europe`, `Asia`).
> Sửa lại: thêm `Other`
- Tham số thứ hai (`Energy Source`): Không cần phải chỉnh sửa.

- Tham số thứ ba (`Size`): các giá trị bị trùng lặp, xe có cửa sau (`hatch-back`) có thể có 2 cửa (`2-door`), hoặc có thể có 4 cửa (`4-door`.)
> Sửa lại: Thêm trường hợp `2-door + hatch-back` và `4-door + hatch-back`.