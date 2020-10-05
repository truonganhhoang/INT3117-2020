#### Exercise 3:
Đề bài gợi ý cả hai lựa chọn cơ sở ‘2’ và ‘1’ cho bên 1. (Các bên khác vẫn có 1 lựa chọn cơ sở là ‘2’). Điều này đưa ra hai phép thử cơ bản: (2, 2, 2) và (1, 2, 2). Theo công thức đưa ra trong đề bài, có thể có 2 (cơ số) + 4 + 6 + 6 = 18 bài kiểm tra. Tuy nhiên, 2 trong số này là thừa nên kết quả là 16. Để làm rõ, em liệt kê tất cả 18 bài kiểm tra, được tạo theo công thức:
```
{(2,2,2),  <!-- Thử nghiệm cơ sở đầu tiên -->
(0, 2, 2), (−1, 2, 2),  <!-- Thay đổi đặc điểm đầu tiên -->
(2, 1, 2), (2, 0, 2), (2, −1, 2), <!-- Thay đổi đặc điểm thứ 2-->
(2, 2, 1), (2, 2, 0), (2, 2, −1)} <!-- Thay đổi đặc điểm thứ 3 -->
```
```
{(1, 2, 2), <!-- Thử nghiệm cơ sở thứ 2 -->
(0, 2, 2), (−1, 2, 2), <!-- Thay đổi đặc điểm đầu tiên -->
(1, 1, 2), (1, 0, 2), (1, −1, 2), <!-- Thay đổi đặc điểm thứ 2-->
(1, 2, 1), (1, 2, 0), (1, 2, −1), } <!-- Thay đổi đặc điểm thứ 3 -->
```
- Dưới đây là 16 bài kiểm tra không dư thừa:
```
{(2, 2, 2),
(0, 2, 2), (−1, 2, 2),
(2, 1, 2), (2, 0, 2), (2, −1, 2),
(2, 2, 1), (2, 2, 0), (2, 2, −1), 
(1, 2, 2),
(1, 1, 2), (1, 0, 2), (1, −1, 2), 
(1,2,1),(1,2,0),(1,2,−1)
```