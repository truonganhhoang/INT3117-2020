# A tester defined three characteristics based on the input parameter car: Where Made, Energy Source, and Size. The following partitionings for these characteristics have at least two mistakes. Correct them.
- `Where Made` : Có trường hợp không thuộc cả 3 khu vực (`North America, Europe, Asia`).
<br> => Thêm : `Other`.
- `Energy Source` : Không cần sửa.
- `Size` : giá trị bị trùng lặp, xe có của sau (`hatch-back`) có thể có 2 cửa (`2-door`) hoặc 4 của (`4-door`).
<br> => Thêm `2-door + hatch-back` và `4-door + hatch-back`.