# Consider the pattern matching example in Figure 7.25. In particular, consider the final table of tests in Section 7.3. Consider the variable iSub. Number the (unique) test cases, starting at 1, from the top of the iSub part of the table. For example, (ab, c, -1), which appears twice in the iSub portion of the table, should be labeled test t4.
* 1. Give a minimal test set that satisfies all defs coverage. Use the test cases given.
* 2. Give a minimal test set that satisfies all uses coverage.
* 3. Give a minimal test set that satisfies all du-paths coverage.

# Trả lời:
Do chỉ liệt kê các unique test cases nên ta sẽ bỏ qua những tests trùng lặp.
| Test Number | Test |
|-------------|------|
| t1 | (ab, ab, 0) |
| t2 | (ab, a, 0) |
| t3 | (ab, ac, -1) |
| t4 | (ab, c, –1)) |
| t5 | (a, bc, –1) |
| t6 | (abc, bc, 1) |
| t7 | (ab, b, 1) |
| t8 | (abc, ba, –1) |

* 1. Tập kiểm thử thỏa mãn bao phủ toàn bộ định nghĩa gồm t1 và t2.

* 2. Tập kiểm thử thỏa mãn bao phủ toàn bộ định sử dụng gồm t1 và t3.

* 3. Tập kiểm thử thỏa mãn bao phủ tất cả đường du gồm từ t1 tới t8.