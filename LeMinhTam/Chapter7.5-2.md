a. Có bao nhiêu trạng thái?

Có tất cả **4** trạng thái:
- A: `(Wake, Low)`
- B: `(Wake, High)`
- C: `(Sleep, Low)`
- D: `(Sleep, High)`

b. Vẽ và đặt tên các trạng thái (a) và chuyển động.

Có **12** cạnh, **3** phương pháp trong **4** trạng thái.
Trạng thái khởi điểm là "A".

| STT | Phương pháp | Cạnh |
|---------- | --- | --- | 
| `i` | `advance()` | `A -> C` |
| `ii` | `advance()` | `B -> D` | 
| `iii` | `advance()` | `C -> A` | 
| `iv` | ``advance()`` | `D -> B`| 
| `v` | `up()` | `A -> B` | 
| `vi` | `up()` | `B -> B` | 
| `vii` | `up()` | `C -> D` | 
| `viii` | `up()` |`D -> D`| 
| `ix` | `down()` |`A -> A`| 
| `x` | `down()` |`B -> A`| 
| `xi` | `down()` |`C -> C`| 
| `xii` | `down()` |`D -> C`| 

c. Cung cấp 1 bộ kiểm thử thỏa mãn bao phủ cạnh

Bộ kiểm thử thỏa mãn yêu cầu:
- Bắt đầu từ A
- `down()` – cạnh 9 đến A 
- `advance()` – cạnh 1 đến C 
- `down()` – cạnh 11 đến C 
- `up()` – cạnh 7 đến D 
- `up()` – cạnh 8 đến D 
- `advance()` – cạnh 4 đến B
- ` up()` – cạnh 6 đến B 
- `down()` – cạnh 10 đến A 
- `up()` – cạnh 5 đến B
- `advance()` – cạnh 2 đến D 
- `down()` – cạnh 12 đến C
- `advance()` – cạnh 3 đến A
