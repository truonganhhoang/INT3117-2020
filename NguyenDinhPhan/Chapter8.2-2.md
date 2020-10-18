# Chapter 8.2-2
## Use the following predicates to answer questions (a) through (f).
## - W = (b ^ -c ^ -d)
## - X = (b ^ d) V (-b-d)
## - Y = (a ^ b)
## - Z = (b ^ d)

<br>

## (a) Draw the Karnaugh map for the predicates. Put ab on the top and cd on the side. Label each cell with W, X, Y, and/or Z as appropriate.
## (b) Find the minimal DNF expression that describes all cells that have more than one definition.
## (c) Find the minimal DNF expression that describes all cells that have no definitions.
## (d) Find the minimal DNF expression that describes X ∨ Z.
## (e) Give a test set for X that uses each prime implicant once.

### (a):
### Karnaugh:

| cd\ab 	| 00 	| 01 	| 11 	| 10 	|
|------	|----	|----	|----	|----	|
| 00   	| X  	|  W  	|  WY  	|  X  	|
| 01   	|   Z 	|  X  	|   XY 	|  Z  	|
| 10   	| Z  	|   X 	|  XY 	| Z   	|
| 11   	|   X 	|    	| Y   	| Z   	|

### (b) : ab(-c) + abd
### (c) : (-a)bc(-d)
### (d) : -b + d
### (e) : {(FFFF,X), (FTFT,X)}
