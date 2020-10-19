# Use predicates (i) through (x) to answer the following questions. Verify your computations with the logic coverage tool on the book website.

### i. p = a ∧ (-b ∨ c)
### ii. p = a ∨ (b ∧ c)
### iii. p = a ∧ b
### iv. p = a → (b → c)
### v. p = a ⊕ b
### vi. p = a ↔ (b ∧ c)
### vii. p = (a ∨ b) ∧ (c ∨ d)
### viii. p = (-a ∧-b) ∨ (a ∧-c) ∨ (-a ∧ c)
### ix. p = a ∨ b ∨ (c ∧ d)
### x. p = (a ∧ b) ∨ (b ∧ c) ∨ (a ∧ c)

#### Sẽ chỉ làm với trường hợp: i. p = a ∧ (-b ∨ c)


### (a) List the clauses that go with predicate p.
Các mệnh đề có trong vị từ P là a, b, c
### (b) Compute (and simplify) the conditions under which each clause determines predicate p.
Các vị từ mà trong đó mệnh đề a, b, c sẽ quyết định tới giá trị của P là:
```
Pa = a ∧ b
Pb = a ∧ ¬c
Pc = ¬b ∨ c
```

### (c) Write the complete truth table for each clause. Label your rowsstarting from 1. Use the format in the example underneath thedefinition of Combinatorial Coverage in Section 8.1.1. That is, row 1 should be all clauses true. You should include columnsfor  the  conditions  under  which  each  clause  determines  thepredicate, and also a column for the value of the predicate itself.

Bảng chân trị theo yêu cầu đề bài:
|   | a | b | c | P | Pa | Pb | Pc |
|---|---|---|---|---|----|----|----|
| 1 | T | T | T | T | T  |    | T  |
| 2 | T | T | F |   | T  | T  |    |
| 3 | T | F | T | T |    |    | T  |
| 4 | F | F | F | T |    | T  | T  |
| 5 | F | T | T |   |    |    | T  |
| 6 | F | T | F |   |    |    |    |
| 7 | F | F | T |   |    |    | T  |
| 8 | F | F | F |   |    |    | T  |

### (d) List all pairs of rows from your table that satisfy General Active Clause Coverage (GACC) with respect to each clause.

Cặp GACC cho mệnh đề a là: (1, 2)

Cặp GACC cho mệnh đề b là: (2, 4)

Cặp GACC cho mệnh đề c là: (1, 3, 4), (5, 7, 8)

### (e) List all  pairs  of  rows  from  your  table  that  satisfy  Correlated Active Clause Coverage (CACC) with respect to each clause.
Cặp CACC cho mệnh đề a là: (1, 2)

Cặp CACC cho mệnh đề b là: (2, 4)

Cặp CACC cho mệnh đề c là: (1, 3, 4), (5, 7, 8)
### (f) List all  pairs  of  rows  from  your  table  that  satisfy  Restricted Active Clause Coverage (RACC) with respect to each clause.
Cặp RACC cho mệnh đề a và b là: (1, 2) và (2, 4)
Cặp RACC cho mệnh đề a và b là: (1,5), (3,7) và (4,8)

### (g) List all  4-tuples  of  rows  from  your  table  that  satisfy General Inactive Clause Coverage (GICC) with respect to each clause. List any infeasible GICC test requirements.
```
GICC cho mệnh đề a là: 
  Với P = F: {5,7} × {6,8}
  Với P = T: (3,4)
GICC cho mệnh đề b là: 
  Với P = F: {5,7} × {6,8}
  Với P = T: (1,3)
GICC cho mệnh đề c là: 
  Với P = F: (2,6)
  Với P = T: không có
```
### (h) List all 4-tuples of rows from your table that satisfy Restricted Inactive Clause Coverage (RICC) with respect to each clause. List any infeasible RICC test requirements.
```
RICC cho mệnh đề a là: 
  Với P = F: (5,7), (6,8)
  Với P = T: (3,4)
RICC cho mệnh đề b là: 
  Với P = F: (5,7), (6,8)
  Với P = T: (1,3)
RICC cho mệnh đề c là: 
  Với P = F: (2,6)
  Với P = T: không có
```