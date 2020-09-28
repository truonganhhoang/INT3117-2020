## Câu 1: Giả sử tiêu chí bao phủ C1 có thể thay thế được C2. Hơn nữa, test T1 thỏa mãn C1 trên chương trình P, và test T2 thỏa mãn C2, cũng trên P.

a, T1 có cần thiết phải thỏa mãn C2 không?

- Có, vì để C1 có thể thay thế được C2 thì C1 phải bao gồm toàn bộ tiêu chí của C2, do đó nếu T1 thỏa mãn được mọi tiêu chí của C1 thì nó phải thỏa mãn được mọi tiêu chí của C2.

b, T2 có cần thiết phải thỏa mãn C1 không?

- Không cần thiết phải thỏa mãn toàn bộ, vì T2 chỉ kiểm thử cho C2 - một bộ tiêu chí không hoàn chỉnh bằng C1, thì không thể chắc chắn được là T2 sẽ thỏa mãn hết mọi tiêu chí của C1.

c, Nếu P có chứa một lỗi, và T2 trả về được lỗi đó, T1 không nhất thiết cũng phải trả về lỗi đó. Giải thích vì sao.

- Chỉ cần ít nhất 1 bộ test có khả năng trả về lỗi đó trong chương trình là đủ
- Vì tiêu chí của C2 ít hơn, test case T2 dựa trên nó có thể sẽ làm chi tiết hơn trong 1 phạm vi nào đó so với T1 nên hoàn toàn có thể xảy ra trường hợp T2 trả về lỗi mà T1 không trả về lỗi.