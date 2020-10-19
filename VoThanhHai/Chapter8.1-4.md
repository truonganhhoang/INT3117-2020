### i. p = a ∨ (b ∧ c)
#### (a) List the clauses that go with predicate p.
Các mệnh đề gồm: a, b, c.
#### (b) Compute (and simplify) the conditions under which each clause determines predicate p.
p<sub>a</sub> = ¬b ∨ ¬c <br>
p<sub>b</sub> = ¬a ∧ c <br>
p<sub>c</sub> = ¬a ∧ b
#### (c) Write the complete truth table for the predicate. Label your rows starting from 1. Use the format in the example underneath the definition of Combinatorial Coverage in Section 8.1.1.
|   | a | b | c | p | p<sub>a</sub> | p<sub>b</sub> | p<sub>c</sub> |
|---|---|---|---|---|---------------|---------------|---------------|
| 1 | T | T | T | T | F             | F             | F             |
| 2 | T | T | F | T | T             | F             | F             |
| 3 | T | F | T | T | T             | F             | F             |
| 4 | F | T | T | T | F             | T             | T             | 
| 5 | F | F | T | F | T             | T             | F             |
| 6 | T | F | F | T | T             | F             | F             |
| 7 | F | T | F | F | T             | F             | T             |
| 8 | F | F | F | F | T             | F             | F             |
#### (d) List all pairs of rows from your table that satisfy General Active Clause Coverage (GACC) with respect to each clause.
Cặp giá trị thỏa mãn độ phủ GACC cho mệnh đề a: (2,5), (2,7), (2,8), (3,5), (3,7), (3,8), (6,5), (6,7), (6,8) <br>
Cặp giá trị thỏa mãn độ phủ GACC cho mệnh đề b: (4,5) <br>
Cặp giá trị thỏa mãn độ phủ GACC cho mệnh đề c: (4,7) 
#### (e) List all pairs of rows from your table that satisfy Correlated Active Clause Coverage  (CACC) with respect to each clause.
Cặp giá trị thỏa mãn độ phủ CACC cho mệnh đề a: (2,5), (2,7), (2,8), (3,5), (3,7), (3,8), (6,5), (6,7), (6,8) <br>
Cặp giá trị thỏa mãn độ phủ CACC cho mệnh đề b: (4,5) <br>
Cặp giá trị thỏa mãn độ phủ CACC cho mệnh đề c: (4,7) 
#### (f) List all pairs of rows from your table that satisfy Restricted Active Clause Coverage (RACC) with respect to each clause.
Cặp giá trị thỏa mãn độ phủ RACC cho mệnh đề a: (2,5), (3,7), (6,8) <br>
Cặp giá trị thỏa mãn độ phủ RACC cho mệnh đề b: (4,5) <br>
Cặp giá trị thỏa mãn độ phủ RACC cho mệnh đề c: (4,7) 
#### (g) List all 4-tuples of rows from your table that satisfy General Inactive Clause Coverage (GICC) with respect to each clause. List any infeasible GICC test requirements.
- Bộ giá trị thỏa mãn độ phủ GICC cho mệnh đề a:
  + Với p = T: (1,4)
  + Với p = F: không có <br>
- Bộ giá trị thỏa mãn độ phủ GICC cho mệnh đề b:
  + Với p = T: (1,3), (1,6), (2,3), (2,6)
  + Với p = F: (7,8) <br>
- Bộ giá trị thỏa mãn độ phủ GICC cho mệnh đề c:
  + Với p = T: (1,2), (1,6), (3,2), (3,6)
  + Với p = F: (5,8) <br>
#### (h) List all 4-tuples of rows from your table that satisfy Restricted Inactive Clause Coverage (RICC) with respect to each clause. List any infeasible RICC test requirements.
- Bộ giá trị thỏa mãn độ phủ GICC cho mệnh đề a:
  + Với p = T: (1,4)
  + Với p = F: không có <br>
- Bộ giá trị thỏa mãn độ phủ GICC cho mệnh đề b:
  + Với p = T: (1,3), (2,6)
  + Với p = F: (7,8) <br>
- Bộ giá trị thỏa mãn độ phủ GICC cho mệnh đề c:
  + Với p = T: (1,2), (3,6)
  + Với p = F: (5,8) <br>