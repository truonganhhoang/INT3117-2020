# Chapter 6.1-2

> A tester defined three characteristics based on the input parameter car: Where Made, Energy Source, and Size. The following partitionings for these characteristics have at least two mistakes. Correct them.

+ Tính chất **Where Made** chưa phủ hết, cần thêm "Others".
+ Tính chất **Size** bị trùng lặp, "hatch back" cũng có thể bao gồm "2-door" hoặc "4-door", cần tách thành 2 tính chất khác nhau là **Number of Doors** (2 hoặc 4) và **Hatch Back** (yes hoặc no).
