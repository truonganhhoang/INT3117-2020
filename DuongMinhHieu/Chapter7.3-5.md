Again consider the pattern matching example in Figure 7.25. Instrument the code to produce the execution paths reported in the text for this example. That is, on a given test execution, your tool should compute and print the corresponding test path. Run the following three test cases and answer questions a-g below:

```subject = “brown owl” pattern = “wl” expected output = 7```
```subject = “brown fox” pattern = “dog” expected output = -1```
```subject = “fox” pattern = “brown” expected output = -1```

* (a) Find the actual path followed by each test case.
* (b) For each path, give the du-paths that the path tours in the table at the end of Section 7.3. To reduce the scope of this exercise, consider only the following du-paths: du (10, iSub), du (2, isPat), du (5, isPat), and du (8, isPat).
* (c) Explain why the du-path [5, 6, 10, 3, 4] cannot be toured by any test path.
(d) Select tests from the table at the end of Section 7.3 to complete coverage of the (feasible) du-paths that are uncovered in question (a).
* (e) From the tests above, find a minimal set of tests that achieves All-Defs Coverage with respect to the variable isPat.
* (f) From the tests above, find a minimal set of tests that achieves All-Uses Coverage with respect to the variable isPat.
* (g) Is there any difference between All-Uses Coverage and all DU-Paths Coverage with respect to the variable isPat in the pat() method?

# Trả lời:
* Code ở link <https://github.com/duongminhhieu16/CodeKiemThu>

* (a) Đường đi thực tương ứng với mỗi trường hợp kiểm thử:
	* t1: [1, 2, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 5, 6, 7, 8, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 5, 6, 7, 9, 6, 10, 3, 11].
	* t2: [1, 2, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 4, 10, 3, 11].
	* t3: [1, 2, 3, 11].

* (b) Trong bài tập này ta xét cả những trường hợp: đi trực tiếp (kí hiệu +), không đi qua (kí hiệu -), đi qua với def-clear sidetrips (kí hiệu +!) và đi qua với non-defclear sidetrips (kí hiệu -!).
| Kí hiệu | du-path | t1 | t2 | t3 |
|---------|---------|----|----|----|
| du(10, iSub) | [10, 3, 4, 5, 6, 7, 9 | + | - | - |
| du(10, iSub) | [10, 3, 4, 5, 6, 10] | +! | - | - |
| du(10, iSub) | [10, 3, 4, 5, 6, 7, 8, 10] | + | - | - |
| du(10, iSub) | [10, 3, 4, 10] | + | + | - |
| du(10, iSub) | [10, 3, 11] | + | + | - |
| du(2, iPat) | [2, 3, 4] | + | + | - |
| du(2, iPat) | [2, 3, 11] | -! | +! | + |
| du(5, iPat) | [5, 6, 10, 3, 4] | - | - | - |
| du(5, iPat) | [5, 6, 10, 3, 11] | +! | - | - |
| du(8, iPat) | [8, 10, 3, 4] | + | - | - |
| du(8, iPat) | [8, 10, 3, 11] | -! | - | - |

* (c) Đường du [5, 6, 10, 3, 4] không được đường kiểm thử nào đi qua vì giá trị `isPat` được gán giá trị `true` tại nút 5 và không được thay đổi về `false` trên đường [6, 10, 3], nút tiếp theo được đi qua bắt buộc phải là nút 11 chứ không phải nút 4.

* (d) Các ca kiểm thử đã cho không đi qua trực tiếp 3 đường du: [10, 3, 4, 5, 6, 10], [5, 6, 10, 3, 11] và [8, 10, 3, 11]. Ta sẽ lấy thêm các test (ab, b), (ab, a) và (ab, ac) (để áp dụng Best Effort Touring).

* (e) Tại đây ta sẽ thêm các ca kiểm thử: (ab, b), (ab, a) và (ab, ac) để bỏ đi các trường hợp đi qua với sidetrips. Ta sẽ có bảng sau:
| Kí hiệu | du-path | t1 | t2 | t3 | (ab, b) | (ab, a) | (ab, ac) |
|---------|---------|----|----|----|---------|---------|----------|
| du(10, iSub) | [10, 3, 4, 5, 6, 7, 9 | + | - | - | - | - | - |
| du(10, iSub) | [10, 3, 4, 5, 6, 10] | - | - | - | + | - | - |
| du(10, iSub) | [10, 3, 4, 5, 6, 7, 8, 10] | + | - | - | - | - | - |
| du(10, iSub) | [10, 3, 4, 10] | + | + | - | - | - | - |
| du(10, iSub) | [10, 3, 11] | + | + | - | + | + | + |
| du(2, iPat) | [2, 3, 4] | + | + | - | + | + | + |
| du(2, iPat) | [2, 3, 11] | - | - | + | - | - | - |
| du(5, iPat) | [5, 6, 10, 3, 4] | - | - | - | - | - | - |
| du(5, iPat) | [5, 6, 10, 3, 11] | - | - | - | + | + | - |
| du(8, iPat) | [8, 10, 3, 4] | + | - | - | - | - | - |
| du(8, iPat) | [8, 10, 3, 11] | - | - | - | - | - | + |

Với bao phủ mọi định nghĩa đối với biến `isPat` ta cần đi qua 3 đường du chứa 3 def tại 2, 5 và 8. Do đó ta có tập kiểm thử nhỏ nhất thỏa mãn là: {t1, (ab, b)}.

* (f) Để thỏa mãn bao phủ tất cả sử dụng (dùng Best Effort Touring), ta có tập kiểm thử nhỏ nhất: {t1, t3, (ab, a), (ab, ac)}.

* (g) Đối với biến `isPat` thì bao phủ tất cả sử dụng và bao phủ tất cả đường du đều như nhau.