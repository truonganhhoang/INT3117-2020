# Use the class `Watch` in Figures 7.38 and 7.39 in Section 7.5 to answer questions a–d below.
* (a) Draw control flow graphs for the methods in `Watch`.
* (b) List all the call sites.
* (c) List all coupling du-pairs for each call site.
* (d) Create test data to satisfy All-Coupling-Use Coverage for `Watch`.

# Trả lời:
* (a) Too large.

* (b) Call sites:
1. Dòng 62, `Watch::constructor() → Time:constructor();`
2. Dòng 63, `Watch::constructor() → Time:constructor();`
3. Dòng 64, `Watch::constructor() → Time:constructor();`
4. Dòng 69, `Watch::toString() → Time:toString();`
5. Dòng 70, `Watch::toString() → Time:toString();`
6. Dòng 70, `Watch::toString() → Time:toString();`
7. Dòng 82, `Watch::doTransition() → Time:changeTime();`
8. Dòng 88, `Watch::doTransition() → Time:changeTime();`
9. Dòng 94, `Watch::doTransition() → Time:changeTime()`.

* (c) Các cặp đôi du cho mỗi bên gọi:
Với 1, 2, 3 không có.
4+5+6:
`(Watch::toString(), watch, 69) → (Time::toString(), instance, 55);`
`(Watch::toString(), stopwatch, 70) → (Time::toString(), instance, 55);`
`(Watch::toString(), alarm, 71) → (Time::toString(), instance, 55);`
`(Time::toString(), String, 55) → (Watch::toString(), String, 69);`
`(Time::toString(), String, 55) → (Watch::toString(), String, 70);`
`(Time::toString(), String, 55) → (Watch::toString(), String, 71)`.
7+8+9: Do 3 cặp đầu giống nhau nên phân biệt bằng cách gán theo từng bên gọi.
Call site 7: (Watch::doTransition(), button, 74) → (Time::changeTime(), 29);`
Call site 8: (Watch::doTransition(), button, 74) → (Time::changeTime(), 29);`
Call site 9: (Watch::doTransition(), button, 74) → (Time::changeTime(), 29);`
`(Time::changeTime(), instance, 31) → (Watch::doTransition(), watch, 82);`
`(Time::changeTime(), instance, 35) → (Watch::doTransition(), watch, 82);`
`(Time::changeTime(), instance, 37) → (Watch::doTransition(), watch, 82);`
`(Time::changeTime(), instance, 42) → (Watch::doTransition(), watch, 82);`
`(Time::changeTime(), instance, 46) → (Watch::doTransition(), watch, 82);`
`(Time::changeTime(), instance, 48) → (Watch::doTransition(), watch, 82);`
`(Time::changeTime(), instance, 31) → (Watch::doTransition(), stopwatch, 88);`
`(Time::changeTime(), instance, 35) → (Watch::doTransition(), stopwatch, 88);`
`(Time::changeTime(), instance, 37) → (Watch::doTransition(), stopwatch, 88);`
`(Time::changeTime(), instance, 42) → (Watch::doTransition(), stopwatch, 88);`
`(Time::changeTime(), instance, 46) → (Watch::doTransition(), stopwatch, 88);`
`(Time::changeTime(), instance, 48) → (Watch::doTransition(), stopwatch, 88);`
`(Time::changeTime(), instance, 31) → (Watch::doTransition(), alarm, 94);`
`(Time::changeTime(), instance, 35) → (Watch::doTransition(), alarm, 94);`
`(Time::changeTime(), instance, 37) → (Watch::doTransition(), alarm, 94);`
`(Time::changeTime(), instance, 42) → (Watch::doTransition(), alarm, 94);`
`(Time::changeTime(), instance, 46) → (Watch::doTransition(), alarm, 94);`
`(Time::changeTime(), instance, 48) → (Watch::doTransition(), alarm, 94)`.

* (d) 
t1: mode = TIME, button = UP.
t2: mode = TIME, button = UP^60.
t4: mode = TIME, button = DOWN.
t5: mode = TIME, button = DOWN^60.
t6: mode = TIME, button = DOWN^1440.
t7: mode = STOPWATCH, button = UP.
t8: mode = STOPWATCH, button = UP^60.
t9: mode = STOPWATCH, button = UP^1440.
t10: mode = STOPWATCH, button = DOWN.
t11: mode = STOPWATCH, button = DOWN^60.
t12: mode = STOPWATCH, button = DOWN^1440.
t13: mode = ALARM, button = UP.
t14: mode = ALARM, button = UP^60.
t15: mode = ALARM, button = UP^1440.
t16: mode = ALARM, button = DOWN.
t17: mode = ALARM, button = DOWN^60.
t18: mode = ALARM, button = DOWN^1440.