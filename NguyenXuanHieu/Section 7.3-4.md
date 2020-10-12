# Section 7.3-4

# Consider the pattern matching example in Figure 2.21. In particular, consider the final table of tests in Section 2.3. Consider the variable iSub. Number the (unique) test cases, starting at 1, from the top of the iSub part of the table. For example, (ab; c; −1), which appears twice in the iSub portion of the table, should be labeled test t4.

| | |
|-|-|
|__Test Number__|__Test__|
|t1|(ab, ab, 0)|
|t2|(ab, a, 0)|
|t3|(ab, ac, -1)|
|t4|(ab, c, -1)|
|t5|(a, bc, -1)|
|t6|(abc, bc, 1)|
|t7|(ab, b, 1)|
|t8|(abc, ba, -1)|
|t4|(ab, c, -1)|
|t2|(ab, a, 0)|