# Chapter 8.1-5
## Show that GACC does not subsume PC when the exclusive or operator is used. Assume p = a xor b.
<br>

| Row# 	|   	| a 	| b 	|   	| P 	|   	| Pa 	| Pb 	|
|:----:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:--:	|:--:	|
| 1    	|   	| T 	| T 	|   	|   	|   	| T  	| T  	|
| 2    	|   	| T 	|   	|   	| T 	|   	| T  	| T  	|
| 3    	|   	|   	| T 	|   	| T 	|   	| T  	| T  	|
| 4    	|   	|   	|   	|   	|   	|   	| T  	| T  	|

### Có GACC của biểu thức trên là:
- a: (1,3), (1,4), (2,3), (2,4)
- b: (1,2), (1,4), (3,2), (3,4)

### Nhận thấy bộ test sẽ chỉ gồm {TT,FF} nên p sẽ có giá trị T với 2 giá trị này nên không bao phủ cả trường hợp p = F.

