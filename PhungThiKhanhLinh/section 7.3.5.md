a,
t1: java PatternIndexInstrument "brown owl" wl
Chuỗi bắt đầu bằng xâu 7.
Đường dẫn là [1, 2, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 5, 6, 7, 8, 10, 3, 4, 10,
3, 4, 10, 3, 4, 10, 3, 4, 5, 6, 7, 9, 6, 10, 3, 11]
t2: java PatternIndexInstrument "brown fox" dog
Chuỗi mẫu không phải chuỗi con của chuỗi chủ đề.
Đường dẫn là [1, 2, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10,
3, 4, 10, 3, 11]
t3: java PatternIndexInstrument fox brown
Chuỗi mẫu không phải chuỗi con của chuỗi chủ đề.
Đường dẫn là [1, 2, 3, 11]
b,
|Source| du-path| t1| t2| t3|
|------|--------|---|---|---|
|du(10,iSub)| [10, 3, 4, 5, 6, 7, 9]| +| - | -|
|           |[10, 3, 4, 5, 6, 10]   |+!| - |- |
|           |[10, 3, 4, 5, 6, 7, 8, 10]|+|- | - |
|           |[10, 3, 4, 10] |+| +| - |
|           |[10, 3, 11] | + | + | - |
|du(2,isPat)| [2, 3, 4] | + | + | - |
|           | [2, 3, 11] | -! | +! | + |
|du(5,isPat) | [5, 6, 10, 3, 4] | - | - | - |
|            | [5, 6, 10, 3, 11] | +! | - | - |
|du(8,isPat) |[8, 10, 3, 4] | + | - | - |
|            |[8, 10, 3, 11] | -! | - | - |

c,
Vì giá trị nếu isPat được đặt thành true trong nút 5 và không được đặt lại trên đường dẫn [6, 10, 3], nút tiếp theo phải là 11, không phải 4. Do đó đường dẫn du [5, 6, 10, 3, 4 ] là không khả thi.

d,
Các thử nghiệm đã cho không trực tiếp tham quan 3 đường đi (khả thi) sau: [10, 3, 4, 5, 6,10], [5, 6, 10, 3, 11] và [8, 10, 3 , 11]. Theo Bảng 7.5, các phép thử (ab, b), (ab, a), và (ab, ac) tương ứng tham quan trực tiếp các đường đi này. Lưu ý rằng chuyến lưu diễn Best Effort yêu cầu một chuyến tham quan trực tiếp từng con đường khả thi.

e,
|Source |du-path| t1| t2| t3| (ab, b)| (ab, a)| (ab, ac)|
|-------|-------|---|---|---|--------|--------|---------|
|du(10,iSub)| [10, 3, 4, 5, 6, 7, 9]| + | | | |
| |[10, 3, 4, 5, 6, 10] | | | |+|
| |[10, 3, 4, 5, 6, 7, 8, 10] | +|
| |[10, 3, 4, 10] |+| +|
| |[10, 3, 11] |+| +| | +| +| +|
|du(2,isPat) |[2, 3, 4]| +| +| | +| +| +|
| |[2, 3, 11] | | | + |
|du(5,isPat) | [5, 6, 10, 3, 4]|
| |[5, 6, 10, 3, 11] | | | | + | + |
|du(8,isPat)| [8, 10, 3, 4] | +
| |[8, 10, 3, 11] | | | | | | +|

f,
Đối với All-Uses (Best Effort Touring) liên quan đến isPat, chúng ta cần tham quan 5 đường đi khả thi bắt đầu từ các nút 2, 5 và 8. Các thử nghiệm t1, t3 và (ab, ac) luôn cần thiết vì chúng là các bài kiểm tra duy nhất lần lượt xem xét [8, 10, 3, 4], [2, 3, 11] và [8, 10, 3, 11]. Ngoài ra, chúng ta cần (ab, b) hoặc (ab, a) để tham quan [2, 3, 4] và [5, 6, 10, 3, 11]. Do đó, có thể có hai câu trả lời: {t1, t3 (ab, b), (ab, ac)} hoặc {t1, t3 (ab, a), (ab, ac)}.

g,
Không. Các yêu cầu kiểm tra đều giống nhau đối với isPat. Tuy nhiên, chúng không giống nhau đối với iSub.