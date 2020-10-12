(a) **Có 4 trạng thái:**

    (1) : (Wake, Low)
    (2) : (Wake, High)
    (3) : (Sleep, Low)
    (4) : (Sleep, High)

(b) **Đồ thị sẽ có 12 cạnh (lấy từ 3 hàm, mỗi hàm có 4 trạng thái).**

Trạng thái khởi tạo là (1):

    1, advance(): (1) --> (3)
    2, advance(): (2) --> (4)
    3, advance(): (3) --> (1)
    4, advance(): (4) --> (2)
    5, up(): (1) --> (2)
    6, up(): (2) --> (2)
    7, up(): (3) --> (4)
    8, up(): (4) --> (4)
    9, down(): (1) --> (1)
    10, down(): (2) --> (1)
    11, down(): (3) --> (3)
    12, down(): (4) --> (3)

(c) Trạng thái ban đầu: (1)

    down()         - cạnh số 9  về trạng thái  (1);
    advance()      - cạnh số 1  về trạng thái  (3);
    down()         - cạnh số 11 về trạng thái  (3);
    up()           - cạnh số 7  về trạng thái  (4);
    up()           - cạnh số 8  về trạng thái  (4);
    advance()      - cạnh số 4  về trạng thái  (2);
    up()           - cạnh số 6  về trạng thái  (2);
    down()         - cạnh số 10 về trạng thái  (1);
    up()           - cạnh số 5  về trạng thái  (2);
    advance()      - cạnh số 2  về trạng thái  (4);
    down()         - cạnh số 12 về trạng thái  (3);
    advance()      - cạnh số 3  về trạng thái  (1).