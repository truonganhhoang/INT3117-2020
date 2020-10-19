# Use predicates (i) through (x) to answer the following questions. Verify your computations with the logic coverage tool on the book website.
	* i. P = a & (!b | c)
	* ii. P = a | (b & c)
	* iii. P = a & b
	* iv. P = a -> (b -> c)
	* v. P = a ^ b
	* vi. P = a <-> (b & c)
	* vii. P = (a | b) & (c | d)
	* viii. P = (!a & !b) | (a & !c) | (!a & c)
	* ix. P = a | b | (c & d)
	* x. P = (a & b) | (b & c) | (a & c)

* (a) List the clauses that go with predicate p.
* (b) Compute (and simplify) the conditions under which each clause determines predicate p.
* (c) Write the complete truth table for each clause. Label your rows starting from 1. Use the format in the example underneath the definition of Combinatorial Coverage in Section 8.1.1. That is, row 1 should be all clauses true. You should include columns for the conditions under which each clause determines the predicate, and also a column for the value of the predicate itself.
* (d) List all pairs of rows from your table that satisfy General Active Clause Coverage (GACC) with respect to each clause.
* (e) List all pairs of rows from your table that satisfy Correlated Active Clause Coverage (CACC) with respect to each clause.
* (f) List all pairs of rows from your table that satisfy Restricted Active Clause Coverage (RACC) with respect to each clause.
* (g) List all 4-tuples of rows from your table that satisfy General Inactive Clause Coverage (GICC) with respect to each clause. List any infeasible GICC test requirements.
* (h) List all 4-tuples of rows from your table that satisfy Restricted Inactive Clause Coverage (RICC) with respect to each clause. List any infeasible RICC test requirements.

# Trả lời:
* i. P = a & (!b | c)
(a) Các mệnh đề: a, b, c.

(b) Pa = !b | c; Pb = !c & a; Pc = a & b.

(c) Bảng giá trị thực:
| Row# | a | b | c | P | Pa | Pb | Pc |
|------|---|---|---|---|----|----|----|
| 1 | T | T | T | T | T | F | T |
| 2 | T | T | F | F | F | T | T |
| 3 | T | F | T | T | T | F | F |
| 4 | T | F | F | T | T | T | F |
| 5 | F | T | T | F | T | F | F |
| 6 | F | T | F | F | F | F | F |
| 7 | F | F | T | F | T | F | F |
| 8 | F | F | F | F | T | F | F |

(d) Các cặp thỏa mãn tiêu chuẩn GACC:
* Với mệnh đề a: (1, 5), (1, 7), (1, 8), (3, 5), (3, 7), (3, 8), (4, 5), (4, 7), (4, 8).
* Với mệnh đề b: (2, 4).
* Với mệnh đề c: (1, 2).

(e) Các cặp thỏa mãn tiêu chuẩn CACC:
* Với mệnh đề a: (1, 5), (1, 7), (1, 8), (3, 5), (3, 7), (3, 8), (4, 5), (4, 7), (4, 8).
* Với mệnh đề b: (2, 4).
* Với mệnh đề c: (1, 2).

(f) Các cặp thỏa mãn tiêu chuẩn RACC:
* Với mệnh đề a: (1, 5), (3, 7), (4 ,8).
* Với mệnh đề b: (2, 4).
* Với mệnh đề c: (1, 2).

(g) Các cặp thỏa mãn tiêu chuẩn GICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = T, P = F: (2, 6).
* Với mệnh đề b: P = T: (1, 3); P = F: (5, 7), (5, 8), (6, 7), (6, 8).
* Với mệnh đề c: P = T: (3, 4); P = F: (5, 6), (5, 8), (7, 6), (7, 8).

(h) Các cặp thỏa mãn tiêu chuẩn RICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = T, P = F: (2, 6).
* Với mệnh đề b: P = T: (1, 3); F: (5, 7), (6, 8).
* Với mệnh đề c: P = T: (3, 4); P = F: (5, 6), (7, 8).

* ii. P = a | (b & c)
(a) Các mệnh đề có trong vị từ là: a, b, c.

(b) Pa = !b v !c; Pb = !a & c; Pc = !a & b.

(c) Bảng giá trị thực:
| Row# | a | b | c | P | Pa | Pb | Pc |
|------|---|---|---|---|----|----|----|
| 1 | T | T | T | T | F | F | F |
| 2 | T | T | F | T | T | F | F |
| 3 | T | F | T | T | T | F | F |
| 4 | T | F | F | T | T | F | F |
| 5 | F | T | T | T | F | T | T |
| 6 | F | T | F | F | T | F | T |
| 7 | F | F | T | F | T | T | F |
| 8 | F | F | F | F | T | F | F |

(d) Các cặp thỏa mãn tiêu chuẩn GACC:
* Với mệnh đề a: {2, 3, 4} x {6, 7, 8} (nghĩa là chọn 1 trong mỗi bên).
* Với mệnh đề b: (5, 7).
* Với mệnh đề c: (5, 6).

(e) Các cặp thỏa mãn tiêu chuẩn CACC:
* Với mệnh đề a: {2, 3, 4} x {6, 7, 8} (nghĩa là chọn 1 trong mỗi bên).
* Với mệnh đề b: (5, 7).
* Với mệnh đề c: (5, 6).

(f) Các cặp thỏa mãn tiêu chuẩn RACC:
* Với mệnh đề a: (2, 6), (3, 7), (4, 8).
* Với mệnh đề b: (5, 7).
* Với mệnh đề c: (5, 6).

(g) Các cặp thỏa mãn tiêu chuẩn GICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = F, P = T: (1, 5).
* Với mệnh đề b: P = T: {1, 2} x {3, 4}; P = F: (6, 8).
* Với mệnh đề c: P = T: {1, 3} x {2, 4}; P = F: (7, 8).

(h) Các cặp thỏa mãn tiêu chuẩn RICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = F, P = T: (1, 5).
* Với mệnh đề b: P = T: (1, 3), (2, 4); F: (6, 8).
* Với mệnh đề c: P = T: (1, 2), (3, 4); P = F: (7, 8).

* iii. P = a & b.
(a) Các mệnh đề trong vị từ là a và b.

(b) Pa = b; Pb = a.

(c) Bảng giá trị thực:
| Row# | a | b | P | Pa | Pb |
|------|---|---|---|----|----|
| 1 | T | T | T | T | T |
| 2 | T | F | F | F | T |
| 3 | F | T | F | T | F |
| 4 | F | F | F | F | F |
(d) Các cặp thỏa mãn tiêu chuẩn GACC:
* Với mệnh đề a: (1, 3).
* Với mệnh đề b: (1, 2).

(e) Các cặp thỏa mãn tiêu chuẩn CACC:
* Với mệnh đề a: (1, 3).
* Với mệnh đề b: (1, 2).

(f) Các cặp thỏa mãn tiêu chuẩn RACC:
* Với mệnh đề a: (1, 3).
* Với mệnh đề b: (1, 2).

(g) Các cặp thỏa mãn tiêu chuẩn GICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = T, ca kiểm thử bất khả thi là P = F: (2, 4).
* Với mệnh đề b: Không có ca kiểm thử khả thi cho P = T, ca kiểm thử bất khả thi là P = F: (3, 4).

(h) Các cặp thỏa mãn tiêu chuẩn RICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = T, ca kiểm thử bất khả thi là P = F: (2, 4).
* Với mệnh đề b: Không có ca kiểm thử khả thi cho P = T, ca kiểm thử bất khả thi là P = F: (3, 4).

* iv. P = a -> (b -> c).
(a) Các mệnh đề trong vị từ: a, b, c.

(b) Pa = b & !c; Pb = a & !c; Pc = a & b.

(c) Bảng giá trị thực:
| Row# | a | b | c | P | Pa | Pb | Pc |
|------|---|---|---|---|----|----|----|
| 1 | T | T | T | T | F | F | T |
| 2 | T | T | F | F | T | T | T |
| 3 | T | F | T | T | F | F | F |
| 4 | T | F | F | T | F | T | F |
| 5 | F | T | T | T | F | F | F |
| 6 | F | T | F | F | T | F | F |
| 7 | F | F | T | F | F | F | F |
| 8 | F | F | F | F | F | F | F |

(d) Các cặp thỏa mãn tiêu chuẩn GACC:
* Với mệnh đề a: (2, 6).
* Với mệnh đề b: (2, 4).
* Với mệnh đề c: (1, 2).

(e) Các cặp thỏa mãn tiêu chuẩn CACC:
* Với mệnh đề a: (2, 6).
* Với mệnh đề b: (2, 4).
* Với mệnh đề c: (1, 2).

(f) Các cặp thỏa mãn tiêu chuẩn RACC:
* Với mệnh đề a: (2, 6).
* Với mệnh đề b: (2, 4).
* Với mệnh đề c: (1, 2).

(g) Các cặp thỏa mãn tiêu chuẩn GICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = F, P = T: (1, 5).
* Với mệnh đề b: Không có ca kiểm thử khả thi cho P = F, P = T: {1, 3, 4} x {5, 7, 8}.
* Với mệnh đề c: Không có ca kiểm thử khả thi cho P = F, P = T: {3, 5, 7} x {4, 6, 8}.

(h) Các cặp thỏa mãn tiêu chuẩn RICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = F, P = T: (1, 5), (3, 7), (4, 8).
* Với mệnh đề b: Không có ca kiểm thử khả thi cho P = F, P = T: (1, 3), (5, 7), (6, 8).
* Với mệnh đề c: Không có ca kiểm thử khả thi cho P = F, P = T: (3, 4), (5, 6), (7, 8).

* v. P = a ^ b.
(a) Các mệnh đề có trong vị từ: a, b.

(b) Pa = b; Pb = a.

(c) Bảng giá trị thực:
| Row# | a | b | P | Pa | Pb |
|------|---|---|---|----|----|
| 1 | T | T | F | T | T |
| 2 | T | F | T | T | T |
| 3 | F | T | T | T | T |
| 4 | F | F | F | T | T |
(d) Các cặp thỏa mãn tiêu chuẩn GACC:
* Với mệnh đề a: (1, 3), (1, 4), (2, 3), (2, 4).
* Với mệnh đề b: (1, 2), (1, 4), (3, 2), (3, 4).

(e) Các cặp thỏa mãn tiêu chuẩn CACC:
* Với mệnh đề a: (1, 3), (2, 4).
* Với mệnh đề b: (1, 2), (3, 4).

(f) Các cặp thỏa mãn tiêu chuẩn RACC:
* Với mệnh đề a: (1, 3), (2, 4).
* Với mệnh đề b: (1, 2), (3, 4).

(g) Các cặp thỏa mãn tiêu chuẩn GICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi.
* Với mệnh đề b: Không có ca kiểm thử khả thi.

(h) Các cặp thỏa mãn tiêu chuẩn RICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi.
* Với mệnh đề b: Không có ca kiểm thử khả thi.

* vi. P = a <-> (b & c).
(a) Các mệnh đề có trong vị từ: a, b, c.

(b) Pa = T; Pb = c; Pc = b.

(c) Bảng giá trị thực:
| Row# | a | b | c | P | Pa | Pb | Pc |
|------|---|---|---|---|----|----|----|
| 1 | T | T | T | T | T | T | T |
| 2 | T | T | F | F | T | F | T |
| 3 | T | F | T | F | T | T | F |
| 4 | T | F | F | F | T | F | F |
| 5 | F | T | T | F | T | T | T |
| 6 | F | T | F | T | T | F | T |
| 7 | F | F | T | T | T | T | F |
| 8 | F | F | F | T | T | F | F |

(d) Các cặp thỏa mãn tiêu chuẩn GACC:
* Với mệnh đề a: {1, 2, 3, 4} x {5, 6, 7, 8}.
* Với mệnh đề b: {1, 5} x {3, 7}.
* Với mệnh đề c: {1, 5} x {2, 6}.

(e) Các cặp thỏa mãn tiêu chuẩn CACC:
* Với mệnh đề a: (1, 5) | {2, 3, 4} x {6, 7, 8}.
* Với mệnh đề b: (1, 3), (5, 7).
* Với mệnh đề c: {1, 2} x {5, 6}.

(f) Các cặp thỏa mãn tiêu chuẩn RACC:
* Với mệnh đề a: (1, 5) | {2, 3, 4} x {6, 7, 8}.
* Với mệnh đề b: (1, 3), (5, 7).
* Với mệnh đề c: {1, 2} x {5, 6}.

(g) Các cặp thỏa mãn tiêu chuẩn GICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi.
* Với mệnh đề b: P = F: (2, 4), P = T: (6, 8).
* Với mệnh đề c: P = F: (3, 4), P = T: (7, 8).

(h) Các cặp thỏa mãn tiêu chuẩn RICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi.
* Với mệnh đề b: P = F: (2, 4), P = T: (6, 8).
* Với mệnh đề c: P = F: (3, 4), P = T: (7, 8).

* vii. P = (a | b) & (c | d).
(a) Các mệnh đề có trong vị từ: a, b, c.

(b) Pa = !b & (c | d); Pb = !a & (c | d); Pc = !d & (a | b); Pd = !c & (a | b).

(c) Bảng giá trị thực:
| Row# | a | b | c | d | P | Pa | Pb | Pc | Pd |
|------|---|---|---|---|---|----|----|----|----|
| 1 | T | T | T | T | T | F | F | F | F |
| 2 | T | T | T | F | T | F | F | T | F |
| 3 | T | T | F | T | T | F | F | F | T |
| 4 | T | T | F | F | F | F | F | T | T |
| 5 | T | F | T | T | T | T | F | F | F |
| 6 | T | F | T | F | T | T | F | T | F |
| 7 | T | F | F | T | T | T | F | F | T |
| 8 | T | F | F | F | F | F | F | T | T |
| 9 | F | T | T | T | T | F | T | F | F |
| 10 | F | T | T | F | T | F | T | T | F |
| 11 | F | T | F | T | T | F | T | F | T |
| 12 | F | T | F | F | F | F | F | T | T |
| 13 | F | F | T | T | F | T | T | F | F |
| 14 | F | F | T | F | F | T | T | F | F |
| 15 | F | F | F | T | F | T | T | F | F |
| 16 | F | F | F | F | F | F | F | F | F |

(d) Các cặp thỏa mãn tiêu chuẩn GACC:
* Với mệnh đề a: (6, 14), (6, 15), (6, 16), (7, 14), (7, 15), (7, 16), (8, 14), (8, 15), (8, 16).
* Với mệnh đề b: (10, 14), (10, 15), (10, 16), (11, 14), (11, 15), (11, 16), (12, 14), (12, 15), (12, 16).
* Với mệnh đề c: (13,15).
* Với mệnh đề d: (13,14).

(e) Các cặp thỏa mãn tiêu chuẩn CACC:
* Với mệnh đề a: (6, 14), (6, 15), (6, 16), (7, 14), (7, 15), (7, 16), (8, 14), (8, 15), (8, 16).
* Với mệnh đề b: (10, 14), (10, 15), (10, 16), (11, 14), (11, 15), (11, 16), (12, 14), (12, 15), (12, 16).
* Với mệnh đề c: (13, 15).
* Với mệnh đề d: (13, 14).

(f) Các cặp thỏa mãn tiêu chuẩn RACC:
* Với mệnh đề a: (6, 14), (7, 15), (8, 16).
* Với mệnh đề b: (10, 14), (11, 15), (12, 16).
* Với mệnh đề c: (13, 15).
* Với mệnh đề d: (13, 14).

(g) Các cặp thỏa mãn tiêu chuẩn GICC:
* Với mệnh đề a: P = F: {4, 8} x {12, 16}, P = T: {1, 2, 3} x {9, 10, 11}.
* Với mệnh đề b: P = F: {4, 12} x {8, 16}, P = T: {1, 2, 3} x {5, 6, 7}.
* Với mệnh đề c: P = F: {13, 14} x {12, 16}, P = T: {1, 5, 9} x {3, 7, 11}.
* Với mệnh đề d: P = F: {13, 15} x {14, 16}, P = T: {1, 5, 9} x {2, 6, 10}.

(h) Các cặp thỏa mãn tiêu chuẩn RICC:
* Với mệnh đề a: P = F: (4, 12), (8, 16), (3, 11), P = T: {1, 2, 3, 4.
* Với mệnh đề b: P = F: (4, 8), (12, 16), P = T: (1, 5), (2, 6), (3, 7).
* Với mệnh đề c: P = F: (13, 15), (14, 16), P = T: (1, 3), (5, 7), (9, 11).
* Với mệnh đề d: P = F: (13, 14), (15, 16), P = T: (1, 2), (5, 6), (9, 10).

* viii. P = (!a & !b) | (a & !c) | (!a & c).
(a) Các mệnh đề có trong vị từ: a, b, c.

(b) Pa = b | c; Pb = !a & !c; Bc = a | b.

(c) Bảng giá trị thực:
| Row# | a | b | c | P | Pa | Pb | Pc |
|------|---|---|---|---|----|----|----|
| 1 | T | T | T | F | T | F | T |
| 2 | T | T | F | T | T | F | T |
| 3 | T | F | T | F | T | F | T |
| 4 | T | F | F | T | F | F | T |
| 5 | F | T | T | T | T | F | T |
| 6 | F | T | F | F | T | T | T |
| 7 | F | F | T | T | T | F | F |
| 8 | F | F | F | T | F | T | F |

(d) Các cặp thỏa mãn tiêu chuẩn GACC:
* Với mệnh đề a: {1, 2, 3} x {5, 6, 7}.
* Với mệnh đề b: (6, 8).
* Với mệnh đề c: {1, 3, 5} x {2, 4, 6}.

(e) Các cặp thỏa mãn tiêu chuẩn CACC:
* Với mệnh đề a: (1, 5), (1, 7), (2, 6), (3, 5), (3, 7).
* Với mệnh đề b: (6, 8).
* Với mệnh đề c: (1, 2), (1, 4), (3, 2), (3, 4), (5, 6).

(f) Các cặp thỏa mãn tiêu chuẩn RACC:
* Với mệnh đề a: (1, 5), (2, 6), (3, 7).
* Với mệnh đề b: (6, 8).
* Với mệnh đề c: (1, 2), (3, 4), (5, 6).

(g) Các cặp thỏa mãn tiêu chuẩn GICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = F, P = T: (4, 8).
* Với mệnh đề b: P = F: (1, 3), P = T: (2, 4), (2, 7), (5, 4), (5, 7).
* Với mệnh đề c: Không có ca kiểm thử khả thi cho P = F, P = T: (7, 8).

(h) Các cặp thỏa mãn tiêu chuẩn RICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = F, P = T: (4, 8).
* Với mệnh đề b: P = F: (1, 3), P = T: (2, 4), (5, 7).
* Với mệnh đề c: Không có ca kiểm thử khả thi cho P = F, P = T: (7, 8).

* ix. P = a | b | (c & d).
(a) Các mệnh đề có trong vị từ: a, b, c, d.

(b) Pa = !(b | (c & d)); Pb = !(a | (c & d)); Pc = !a & !b & d; Pd = !a & !b & c.

(c) Bảng giá trị thực:
| Row# | a | b | c | d | P | Pa | Pb | Pc | Pd |
|------|---|---|---|---|---|----|----|----|----|
| 1 | T | T | T | T | T | F | F | F | F |
| 2 | T | T | T | F | T | F | F | F | F |
| 3 | T | T | F | T | T | F | F | F | F |
| 4 | T | T | F | F | T | F | F | F | F |
| 5 | T | F | T | T | T | F | F | F | F |
| 6 | T | F | T | F | T | T | F | F | F |
| 7 | T | F | F | T | T | T | F | F | F |
| 8 | T | F | F | F | T | T | F | F | F |
| 9 | F | T | T | T | T | F | F | F | F |
| 10 | F | T | T | F | T | F | T | F | F |
| 11 | F | T | F | T | T | F | T | F | F |
| 12 | F | T | F | F | T | F | T | F | F |
| 13 | F | F | T | T | T | F | F | T | T |
| 14 | F | F | T | F | F | T | T | F | T |
| 15 | F | F | F | T | F | T | T | T | F |
| 16 | F | F | F | F | F | T | T | F | F |

(d) Các cặp thỏa mãn tiêu chuẩn GACC:
* Với mệnh đề a: {5, 6, 7} x {13, 14, 15}.
* Với mệnh đề b: {9, 10, 11} x {13, 14, 15}.
* Với mệnh đề c: {2, 6, 10} x {4, 8, 12}.
* Với mệnh đề d: {3, 7, 11} x {4, 8, 12}.

(e) Các cặp thỏa mãn tiêu chuẩn CACC:
* Với mệnh đề a: {5, 6, 7} x {13, 14, 15}.
* Với mệnh đề b: {9, 10, 11} x {13, 14, 15}.
* Với mệnh đề c: {2, 6, 10} x {4, 8, 12}.
* Với mệnh đề d: {3, 7, 11} x {4, 8, 12}.

(f) Các cặp thỏa mãn tiêu chuẩn RACC:
* Với mệnh đề a: (5, 13), (6, 14), (7, 15).
* Với mệnh đề b: (9, 13), 10, 14), (11, 15).
* Với mệnh đề c: (2, 4), (6, 8), (10, 12).
* Với mệnh đề d: (3, 4), (7, 8), (11, 12).

(g) Các cặp thỏa mãn tiêu chuẩn GICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = F, P = T: {1, 2, 3, 4, 5} x {9, 10, 11, 12, 13}.
* Với mệnh đề b: Không có ca kiểm thử khả thi cho P = F, P = T: {1, 2, 3, 4, 9} x {5, 6, 7, 8, 13}.
* Với mệnh đề c: P = F: (14, 16), P = T: {1, 2, 5, 6, 9, 10} x {3, 4, 7, 8, 11, 12}.
* Với mệnh đề d: P = F: (15, 16), P = T: {1, 3, 5, 7, 9, 11} x {2, 4, 6, 8, 10, 12}.

(h) Các cặp thỏa mãn tiêu chuẩn RICC:
* Với mệnh đề a: Không có ca kiểm thử khả thi cho P = F, P = T: (1, 9), (2, 10), (3, 11), (4, 12), (5, 13).
* Với mệnh đề b: Không có ca kiểm thử khả thi cho P = F, P = T: (1, 5), (2, 6), (3, 7), (4, 8), (9, 13).
* Với mệnh đề c: P = F: (14, 16), P = T: (1, 3), (2, 4), (5, 7), (6, 8), (9, 11), (10, 12).
* Với mệnh đề d: P = F: (15, 16), P = T: (1, 2), (3, 4), (5, 6), (7, 8), (9, 10), (11, 12).

* x. P = (a & b) | (b & c) | (a & c).
(a) Các mệnh đề có trong vị từ: a, b, c.

(b) (b) Pa = b ^ c; Pb = a ^ c; Pc = a ^ b.

(c) Bảng giá trị thực:
| Row# | a | b | c | P | Pa | Pb | Pc |
|------|---|---|---|---|----|----|----|
| 1 | T | T | T | T | F | F | F |
| 2 | T | T | F | T | T | T | F |
| 3 | T | F | T | T | T | F | T |
| 4 | T | F | F | F | F | T | T |
| 5 | F | T | T | T | F | T | T |
| 6 | F | T | F | F | T | F | T |
| 7 | F | F | T | F | T | T | F |
| 8 | F | F | F | F | F | F | F |

(d) Các cặp thỏa mãn tiêu chuẩn GACC:
* Với mệnh đề a: {2, 3} x {6, 7}.
* Với mệnh đề b: {2, 5} x {4, 7}.
* Với mệnh đề c: {3, 5} x {4, 6}.

(e) Các cặp thỏa mãn tiêu chuẩn CACC:
* Với mệnh đề a: {2, 3} x {6, 7}.
* Với mệnh đề b: {2, 5} x {4, 7}.
* Với mệnh đề c: {3, 5} x {4, 6}.

(f) Các cặp thỏa mãn tiêu chuẩn RACC:
* Với mệnh đề a: (2, 6), (3, 7).
* Với mệnh đề b: (2, 4), (5, 7).
* Với mệnh đề c: (3, 4), (5, 6).

(g) Các cặp thỏa mãn tiêu chuẩn GICC:
* Với mệnh đề a: P = F: (4, 8), P = T: (1, 5).
* Với mệnh đề b: P = F: (6, 8), P = T: (1, 3).
* Với mệnh đề c: P = F: (1, 2), P = T: (7, 8).

(h) Các cặp thỏa mãn tiêu chuẩn RICC:
* Với mệnh đề a: P = F: (4, 8), P = T: (1, 5).
* Với mệnh đề b: P = F: (6, 8), P = T: (1, 3).
* Với mệnh đề c: P = F: (1, 2), P = T: (7, 8).