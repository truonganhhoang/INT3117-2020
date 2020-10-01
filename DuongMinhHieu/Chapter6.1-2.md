# A tester defined three characteristics based on the input parameter car: Where Made, Energy Source, and Size. The following partitionings for these characteristics have at least two mistakes. Correct them.

* Trong đề bài ta có bảng các đặc trưng và khối như sau:

|a | Where Made |a |
|-------|------------|--------|
| North America | Europe | Asia |
|-------|------------|--------|
| a| Energy Source | a |
|---|---------------|---|
| gas | electric | hybrid |
|-----|---------|---------|
| a | Size | a |
|----------|------|----------|
| 2-door | 4-door | hatch back |

* Những lỗi sai ở sự phân chia trên là:
	- Where Made: Hợp của các khối chưa bao phủ được hết, ta nên thêm khối Others vào (vì có nhiều hơn 3 châu lục đã kể).
	- Size: xe hatch back có thể là 2-door hoặc 4-door. Ta có thể chia đặc trưng này thành 2 đặc trưng riêng. Door: 2-door và 4-door cùng đặc trưng Hatch back: True và False.
