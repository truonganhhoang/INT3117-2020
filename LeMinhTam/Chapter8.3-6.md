a. Xác định đầu vào kiểm tra cho `twoPred()` đạt được phạm vi điều khoản hoạt động hạn chế (RACC).

Cần ba bài kiểm thử để đảm bảo cho RACC:
- `x < y true`; `x + y == 10 true`.
- `x < y false`; `x + y == 10 true`.
- `x < y true`; `x + y == 10 false`. 

b. Xác định đầu vào kiểm tra cho `twoPred()` đạt được phạm vi điều khoản không hoạt động hạn chế (RICC).

Cần ba bài kiểm thử để đảm bảo cho RICC:

- `x < y false`; `x + y == 10 false`.
- `x < y true`; `x + y == 10 false`.
- `x < y false`; `x + y == 10 true`. 