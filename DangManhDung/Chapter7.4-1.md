Cho lớp **Watch** trong figure 7.38 và 7.39 trong Section 7.5

(a) Vẽ đồ thị phân luồng



(b) Liệt kê tất cả vị trí gọi

        i.      Line 62, Watch::constructor()    -> Time:constructor()
        ii.     Line 63, Watch::constructor()    -> Time:constructor()
        iii.    Line 64, Watch::constructor()    -> Time:constructor()
        iv.     Line 69, Watch::toString()       -> Time:toString()
        v.      Line 70, Watch::toString()       -> Time:toString()
        vi.     Line 70, Watch::toString()       -> Time:toString()
        vii.    Line 82, Watch::doTransition()   -> Time:changeTime()
        viii.   Line 88, Watch::doTransition()   -> Time:changeTime()
        ix.     Line 94, Watch::doTransition()   -> Time:changeTime()

(c) Liệt kê mọi du-path phân cặp cho mỗi vị trí gọi

* Vị trí *i, ii, iii* nằm trong phương thức khởi tạo **Watch**. Do *Time* không có phương thức khởi tạo chuẩn xác nên phương thức khởi tạo căn bản

* Vị trí *iv, v, vi* :

        (Watch::toString(), watch, 69) ! (Time::toString(), instance, 55)
        (Watch::toString(), stopwatch, 70) ! (Time::toString(), instance, 55)
        (Watch::toString(), alarm, 71) ! (Time::toString(), instance, 55)
        (Time::toString(), String, 55) ! (Watch::toString(), String, 69)
        (Time::toString(), String, 55) ! (Watch::toString(), String, 70)
        (Time::toString(), String, 55) ! (Watch::toString(), String, 71)

* Vị trí *vii, viii, ix*

        Call site vii: (Watch::doTransition(), button, 74) ! (Time::changeTime(), 29)
        Call site viii: (Watch::doTransition(), button, 74) ! (Time::changeTime(), 29)
        Call site vix: (Watch::doTransition(), button, 74) ! (Time::changeTime(), 29)
        (Time::changeTime(), instance, 31) ! (Watch::doTransition(), watch, 82)
        (Time::changeTime(), instance, 35) ! (Watch::doTransition(), watch, 82)
        (Time::changeTime(), instance, 37) ! (Watch::doTransition(), watch, 82)
        (Time::changeTime(), instance, 42) ! (Watch::doTransition(), watch, 82)
        (Time::changeTime(), instance, 46) ! (Watch::doTransition(), watch, 82)
        (Time::changeTime(), instance, 48) ! (Watch::doTransition(), watch, 82)
        (Time::changeTime(), instance, 31) ! (Watch::doTransition(), stopwatch, 88)
        (Time::changeTime(), instance, 35) ! (Watch::doTransition(), stopwatch, 88)
        (Time::changeTime(), instance, 37) ! (Watch::doTransition(), stopwatch, 88)
        (Time::changeTime(), instance, 42) ! (Watch::doTransition(), stopwatch, 88)
        (Time::changeTime(), instance, 46) ! (Watch::doTransition(), stopwatch, 88)
        (Time::changeTime(), instance, 48) ! (Watch::doTransition(), stopwatch, 88)
        (Time::changeTime(), instance, 31) ! (Watch::doTransition(), alarm, 94)
        (Time::changeTime(), instance, 35) ! (Watch::doTransition(), alarm, 94)
        (Time::changeTime(), instance, 37) ! (Watch::doTransition(), alarm, 94)
        (Time::changeTime(), instance, 42) ! (Watch::doTransition(), alarm, 94)
        (Time::changeTime(), instance, 46) ! (Watch::doTransition(), alarm, 94)
        (Time::changeTime(), instance, 48) ! (Watch::doTransition(), alarm, 94)

(d) Tạo thông số kiểm thử để thỏa mãn bao hàm All-Coupling-Use cho **Watch**

        i.	t1: mode = TIME,	button = UP
        ii.	t2: mode = TIME,	button = UP, UP, ..., UP 60 times (we abbreviate this as UP 60)
        iii.	t3: mode = TIME,	button = UP^1440
        iv.	t4: mode = TIME,	button = DOWN
	v.	t5: mode = TIME,	button = DOWN^60
        vi.	t6: mode = TIME,	button = DOWN^1440
        vii.	t7: mode = STOPWATCH,	button = UP
        viii.	t8: mode = STOPWATCH,	button = UP^60
        ix.	t9: mode = STOPWATCH,	button = UP^1440
        x.	t10: mode = STOPWATCH,	button = DOWN
        xi.	t11: mode = STOPWATCH,	button = DOWN^60
        xii.	t12: mode = STOPWATCH,	button = DOWN^1440
        xiii.	t13: mode = ALARM,	button = UP
        xiv.	t14: mode = ALARM,	button = UP^60
        xv.	t15: mode = ALARM,	button = UP^1440
        xvi.	t16: mode = ALARM,	button = DOWN
        xvii.	t17: mode = ALARM,	button = DOWN^60
        xviii.	t18: mode = ALARM,	button = DOWN^1440
