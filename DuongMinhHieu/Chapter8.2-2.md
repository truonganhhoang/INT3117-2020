# Use the following predicates to answer questions (a) through (f).
W = (b & !c & !d)
X = (b & d) | (!b!d)
Y = (a & b)
Z = (!b & d)
* (a) Draw the Karnaugh map for the predicates. Put ab on the top and cd on the side. Label each cell with W, X, Y, and/or Z as appropriate.
* (b) Find the minimal DNF expression that describes all cells that have more than one definition.
* (c) Find the minimal DNF expression that describes all cells that have no definitions.
* (d) Find the minimal DNF expression that describes X ∨ Z.
* (e) Give a test set for X that uses each prime implicant once.
* (f) Give a test set for X that is guaranteed to detect all faults in Figure 8.2.

# Trả lời:
* (a) Biểu đồ Karnaugh cho:
Vị từ W:
| cd\ab | 00 | 01 | 10 | 11 |
|-------|----|----|----|----|
| 00 | 0 | 1 | 0 | 1 |
| 01 | 1 | 0 | 1 | 0 |
| 10 | 1 | 0 | 1 | 0 |
| 11 | 0 | 1 | 0 | 1 |

Vị từ X:

| cd\ab | 00 | 01 | 10 | 11 |
|-------|----|----|----|----|
| 00 | 1 | 0 | 1 | 0 |
| 01 | 0 | 1 | 0 | 1 |
| 10 | 1 | 0 | 1 | 0 |
| 11 | 0 | 1 | 0 | 1 |

Vị từ Y:

| cd\ab | 00 | 01 | 10 | 11 |
|-------|----|----|----|----|
| 00 | 1 | 0 | 0 | 1 |
| 01 | 1 | 0 | 0 | 1 |
| 10 | 1 | 0 | 0 | 1 |
| 11 | 1 | 0 | 0 | 1 |

Vị từ Z:

| cd\ab | 00 | 01 | 10 | 11 |
|-------|----|----|----|----|
| 00 | 0 | 1 | 0 | 1 |
| 01 | 1 | 0 | 1 | 0 |
| 10 | 0 | 1 | 0 | 1 |
| 11 | 1 | 0 | 1 | 0 |

* (b) Biểu thức DNF bé nhất mô tả các ô có >1 định nghĩa là:
	* Với vị từ W: b!c!d.
	* Với vị từ X: bd.
	* Với vị từ Y: ab.
	* Với vị từ Z: !bd.

* (c) Biểu thức DNF bé nhất mô tả các ô không có định nghĩa là (các ô có giá trị 0): 
	* Với vị từ W: !b | c | d.
	* Với vị từ X: !b | d.
	* Với vị từ Y: (!a & b) | (!b & a).
	* Với vị từ Z: (b & d) | (!b & !d).

* (d) Biểu thức DNF bé nhất mô tả X | Z là: T.

* (e) Tập kiểm thử: {xTTx}.