Cho phương thức FSM sau:



(a) Có bao nhiêu trạng thái?
* 4 trạng thái: { A:(Wake, Low), B:(Wake, High), C:(Sleep, Low), D:(Sleep, High) }

(b) Dán nhãn cho các trạng thái

        i. advance(): A -> C
        ii. advance(): B -> D
        iii. advance(): C -> A
        iv. advance(): D -> B
        v. up() : A -> B
        vi. up() : B -> B
        vii. up() : C -> D
        viii. up() : D -> D
        ix. down() : A -> A
        x. down() : B -> A
        xi. down() : C -> C
        xii. down() : D -> C

(c) Thiết lập một bộ kiểm thử đạt được bao hàm cạnh.

        initially in state A
        down() - edge 9 to state A
        advance() - edge 1 to state C
        down() - edge 11 to state C
        up() - edge 7 to state D
        up() - edge 8 to state D
        advance() - edge 4 to state B
        up() - edge 6 to state B
        down() - edge 10 to state A
        up() - edge 5 to state B
        advance() - edge 2 to state D
        down() - edge 12 to state C
        advance() - edge 3 to state A