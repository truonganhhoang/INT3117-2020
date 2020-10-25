### Consider the following BNF:
```
A ::= O B | O M | O B M
O ::= "w" | "x" | "s" | "m"
B ::= "i" | "f" | "c" | "r"
M ::= "o" | "t" | "p" | "a" | "h"
```
#### (a) How many nonterminal symbols are in the grammar?
Có 4 ký tự không đầu cuối trong văn phạm.

#### (b) How many terminal symbols are in the grammar?
Có 13 ký tự không đầu cuối trong văn phạm.

#### (c) Write two strings that are valid according to the BNF.
Ví dụ 2 xâu hợp lệ: "x f t", "s p".

#### (d) For each of your two strings, give two valid mutants of the string.
+ 2 đột biến hợp lệ cho xâu "x f t": "x f o", "s f t".
+ 2 đột biến hợp lệ cho xâu "s p": "m p", "s h".

#### (e) For each of your two strings, give two invalid mutants of the string.
+ 2 đột biến không hợp lệ cho xâu "x f t": "x f w", "o f t".
+ 2 đột biến không lệ cho xâu "s p": "s m", "t p".