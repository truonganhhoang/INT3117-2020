# Chapter 8.1-4
## Use predicates (i) through (x) to answer the following questions.
## Verify your computations with the logic coverage tool on the book website.
## i. p = a ∧ ( -b ∨ c)
## ii. p = a ∨ (b ∧ c)
## iii. p = a ∧ b
## iv. p = a → (b → c)
## v. p = a ⊕ b
## vi. p = a ↔ (b ∧ c)
## vii. p = (a ∨ b) ∧ (c ∨ d)
## viii. p = ( -a ∧ -b) ∨ (a ∧ c) ∨ ( -a ∧ c)
## ix. p = a ∨ b ∨ (c ∧ d)
## x. p = (a ∧ b) ∨ (b ∧ c) ∨ (a ∧ c)

## (a) List the clauses that go with predicate p.
## (b) Compute (and simplify) the conditions under which each clause determines predicate p.
## (c) Write the complete truth table for each clause. Label your rows starting from 1. Use the format in the example underneath the definition of Combinatorial Coverage in Section 8.1-1. That is, row 1 should be all clauses true. You should include columns for the conditions under which each clause determines the predicate, and also a column for the value of the ## predicate itself.
## (d) List all pairs of rows from your table that satisfy General Active Clause Coverage (GACC) with respect to each clause.
## (e) List all pairs of rows from your table that satisfy Correlated Active Clause Coverage (CACC) with respect to each clause.
## (f) List all pairs of rows from your table that satisfy Restricted Active Clause Coverage (RACC) with respect to each clause.
## (g) List all 4-tuples of rows from your table that satisfy General Inactive Clause Coverage (GICC) with respect to each clause. List any infeasible GICC test requirements.
## (h) List all 4-tuples of rows from your table that satisfy Restricted Inactive Clause Coverage (RICC) with respect to each clause. List any infeasible RICC test requirements.

<br>


## i. p = a ∧ ( -b ∨ c):
### (a): a,b,c.
### (b): 
### - p<sub>a</sub> = -b v c
### - p<sub>b</sub> = a ^ -c
### - p<sub>c</sub> = a ^ c

### (c):
| Row# 	|  	| a 	| b 	| c 	|  	| P 	|  	| Pa 	| Pb 	| Pc 	|
|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|
| 1 	|  	| T 	| T 	| T 	|  	| T 	|  	| T 	|   	| T 	|
| 2 	|  	| T 	| T 	|   	|  	|   	|  	|   	| T 	| T 	|
| 3 	|  	| T 	|   	| T 	|  	| T 	|  	| T 	|   	|   	|
| 4 	|  	| T 	|   	|   	|  	| T 	|  	| T 	| T 	|   	|
| 5 	|  	|   	| T 	| T 	|  	|   	|  	| T 	|   	|   	|
| 6 	|  	|   	| T 	|   	|  	|   	|  	|   	|   	|   	|
| 7 	|  	|   	|   	| T 	|  	|   	|  	| T 	|   	|   	|
| 8 	|  	|   	|   	|   	|  	|   	|  	| T 	|   	| T 	|


### (d): GACC:
- Với a, cặp hàng thoả mãn GACC dựa vào bảng trên là :  (1,5), (1,7), (1,8), (3,5), (3,7), (3,8), (4,5), (4,7), (4,8).
- Với b: (2,4)
- Với c: (1,2)

### (e): CACC
- Với a, cặp hàng thoả mãn CACC dựa vào bảng trên là :  (1,5), (1,7), (1,8), (3,5), (3,7), (3,8), (4,5), (4,7), (4,8).
- Với b: (2,4)
- Với c: (1,2)
### (f): RACC
- Với a: (1,5), (3,7), (4,8)
- Với b: (2,4)
- Với c: (1,2)
### (g): GICC
- Với a: P = F: (2,6). Không có cặp nào với P = T.
- Với b: P = F: (5,7), (5,8), (6,7), (6,8). P = T: (1,3)
- Với c: P = F: (5,6), (5,8), (7,6), (7,8). P = T: (3,4)	
### (h): RICC
- Với a: P = F: (2,6). Không có cặp nào với P = T.
- Với b: P = F: (5,7), (6,8). P = T: (1,3)
- Với c: P = F: (5,6), (7,8). P = T: (3,4)	

<br >

## ii. p = a ∨ (b ∧ c)

### (a): a,b,c.
### (b): 
### - p<sub>a</sub> = -b v -c
### - p<sub>b</sub> = -a ^ -c
### - p<sub>c</sub> = -a ^ b

### (c):
| Row# 	|  	| a 	| b 	| c 	|  	| P 	|  	| Pa 	| Pb 	| Pc 	|
|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|
| 1 	|  	| T 	| T 	| T 	|  	| T 	|  	|   	|   	|   	|
| 2 	|  	| T 	| T 	|   	|  	| T 	|  	| T 	|   	|   	|
| 3 	|  	| T 	|   	| T 	|  	| T 	|  	| T 	|   	|   	|
| 4 	|  	| T 	|   	|   	|  	| T 	|  	| T 	|   	|   	|
| 5 	|  	|   	| T 	| T 	|  	| T 	|  	|   	| T 	| T 	|
| 6 	|  	|   	| T 	|   	|  	|   	|  	| T 	|   	| T 	|
| 7 	|  	|   	|   	| T 	|  	|   	|  	| T 	| T 	|   	|
| 8 	|  	|   	|   	|   	|  	|   	|  	| T 	|   	|  	|

### (d): GACC
- a: (2,6), (2,7), (2,8), (3,6), (3,7), (3,8), (4,6), (4,7), (4,8)
- b: (5,7)
- c: (5,6)

### (e): CACC: như GACC
### (f): RACC
- a: (2,6), (3,7), (4,8)
- b: (5,7)
- c: (5,6)
### (g): GICC
- a:	P = T: (1,5). Không có cặp nào với P = F
- b:	P = T: (1,3), (1,4), (2,3), (2,4).	P = F: (6,8)
- c: 	P = T: (1,2), (1,4), (3,2), (3,4).	P = F: (7,8)
### (h): RICC
- a:	P = T: (1,5). Không có cặp nào với P = F
- b:	P = T: (1,3), (2,4).	P = F: (6,8)
- c:	P = T: (1,2), (3,4). 	P = F: (7,8)



<br>

## iii. p = a ∧ b
### (a): a,b
### (b): 
### - p<sub>a</sub> = b
### - p<sub>b</sub> = a


### (c):
| Row# 	|  	| a 	| b 	|  	| P 	|  	| Pa 	| Pb 	|
|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|
| 1 	|  	| T 	| T 	|  	| T 	|  	| T 	| T 	|
| 2 	|  	| T 	|   	|  	|   	|  	|   	| T 	|
| 3 	|  	|   	| T 	|  	|   	|  	| T 	|   	|
| 4 	|  	|   	|   	|  	|   	|  	|   	|  	|
### (d): GACC
- a: (1,3)
- b: (1,2)

### (e): CACC: như GACC

### (f): RACC: như GACC
### (g): GICC
- a: Không có cặp nào cho P = T.	P = F: (2,4)
- b: Không có cặp nào cho P = T.	P = F: (3,4)

### (h): RICC: Như GICC

<br >

## iv. p = a → (b → c)

### (a): a,b,c
### (b): 
### - p<sub>a</sub> = b ^-c
### - p<sub>b</sub> = a^-c
### - p<sub>c</sub> = a^b

### (c):
| Row# 	|   	| a 	| b 	| c 	|   	| P 	|   	| Pa 	| Pb 	| Pc 	|
|------	|---	|---	|---	|---	|---	|---	|---	|----	|----	|----	|
| 1    	|   	| T 	| T 	| T 	|   	| T 	|   	|    	|    	| T  	|
| 2    	|   	| T 	| T 	|   	|   	|   	|   	| T  	| T  	| T  	|
| 3    	|   	| T 	|   	| T 	|   	| T 	|   	|    	|    	|    	|
| 4    	|   	| T 	|   	|   	|   	| T 	|   	|    	| T  	|    	|
| 5    	|   	|   	| T 	| T 	|   	| T 	|   	|    	|    	|    	|
| 6    	|   	|   	| T 	|   	|   	| T 	|   	| T  	|    	|    	|
| 7    	|   	|   	|   	| T 	|   	| T 	|   	|    	|    	|    	|
| 8    	|   	|   	|   	|   	|   	| T 	|   	|    	|    	|    	|
### (d): GACC
- a: (2,6)
- b: (2,4)
- c: (1,2)

### (e): CACC: như GACC

### (f): RACC: như GACC
### (g): GICC
- a:	P = T: (1,5), (1,7), (1,8), (3,5), (3,7), (3,8), (4,5), (4,7), (4,8). Không có cặp nào với P = F
- b:	P = T: (1,3), (1,7), (1,8), (5,3), (5,7), (5,8), (6,3), (6,7), (6,8). Không có cặp nào với P = F
- c:	P = T: (3,4), (3,6), (3,8), (5,4), (5,6), (5,8), (7,4), (7,6), (7,8). Không có cặp nào với P = F

### (h): RICC
- a:	P = T: (1,5), (3,7), (4,8). Không có cặp nào với P = F
- b:	P = T: (1,3), (5,7), (6,8). Không có cặp nào với P = F
- c:	P = T: (3,4), (5,6), (7,8). Không có cặp nào với P = F

<br >

## v. p = a ⊕ b


### (a): a,b
### (b): 
### - p<sub>a</sub> = T
### - p<sub>b</sub> = T


### (c):
| Row# 	|   	| a 	| b 	|   	| P 	|   	| Pa 	| Pb 	|
|:----:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:--:	|:--:	|
| 1    	|   	| T 	| T 	|   	|   	|   	| T  	| T  	|
| 2    	|   	| T 	|   	|   	| T 	|   	| T  	| T  	|
| 3    	|   	|   	| T 	|   	| T 	|   	| T  	| T  	|
| 4    	|   	|   	|   	|   	|   	|   	| T  	| T  	|
### (d): GACC
- a: (1,3), (1,4), (2,3), (2,4)
- b: (1,2), (1,4), (3,2), (3,4)

### (e): CACC: 
- a: (1,3), (2,4)
- b: (1,2), (3,4)
### (f): RACC
- a: 
- b: 
- c: 
### (g): GICC: Không có

### (h): RICC: Không có

<br>

## viii. p = ( -a ∧ -b) ∨ (a ∧ c) ∨ ( -a ∧ c)

### (a): a,b,c
### (b): 
### - p<sub>a</sub> = b v c
### - p<sub>b</sub> = -a ^ -c
### - p<sub>c</sub> = a v b

### (c):
| Row# 	|   	| a 	| b 	| c 	|   	| P 	|   	| Pa 	| Pb 	| Pc 	|
|:----:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:--:	|:--:	|:--:	|
| 1    	|   	| T 	| T 	| T 	|   	| T 	|   	|    	|    	| T  	|
| 2    	|   	| T 	| T 	|   	|   	|   	|   	|    	|    	| T  	|
| 3    	|   	| T 	|   	| T 	|   	| T 	|   	|    	|    	| T  	|
| 4    	|   	| T 	|   	|   	|   	|   	|   	| T  	|    	| T  	|
| 5    	|   	|   	| T 	| T 	|   	| T 	|   	|    	|    	| T  	|
| 6    	|   	|   	| T 	|   	|   	|   	|   	|    	| T  	| T  	|
| 7    	|   	|   	|   	| T 	|   	| T 	|   	|    	|    	|    	|
| 8    	|   	|   	|   	|   	|   	| T 	|   	| T  	| T  	|    	|
### (d): GACC
- a: (4,8)
- b: (6,8)
- c: (1,2), (1,4), (1,6), (3,2), (3,4), (3,6), (5,2), (5,4), (5,6)

### (e): CACC: như GACC

### (f): RACC
- a: (4,8)
- b: (6,8)
- c: (1,2), (3,4), (5,6)
### (g): GICC
- a:	P = T: (1,5), (1,7), (3,5), (3,7).	P = F: (2,6)
- b:	P = T: (1,3), (1,7), (5,3), (5,7).	P = F: (2,4)
- c:	P = T: (7,8). Không có cặp nào với P = F
### (h): RICC
- a:	P = T: (1,5), (3,7).	P = F: (2,6)
- b:	P = T: (1,3), (5,7).	P = F: (2,4)
- c:	P = T: (7,8). Không có cặp nào với P = F