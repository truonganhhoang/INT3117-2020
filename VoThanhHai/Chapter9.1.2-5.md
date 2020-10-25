### Consider the following BNF:
```
P ::= I D Y | I Y D | D I Y |  D Y I | Y I D | Y D I
I ::= "j" | "j" 
D ::= "9" | "21" 
Y ::= "0" | "4" 
```
#### (a) How many nonterminal symbols are in the grammar?
Có 2 ký tự không đầu cuối trong văn phạm.

#### (b) How many terminal symbols are in the grammar?
Có 6 ký tự không đầu cuối trong văn phạm.

#### (c) Write two strings that are valid according to the BNF.
Ví dụ 2 xâu hợp lệ: "j 9 0", "j 4 12".

#### (d) For each of your two strings, give two valid mutants of the string.
+ 2 đột biến hợp lệ cho xâu "j 9 0": "j 9 4", "j 21 0".
+ 2 đột biến hợp lệ cho xâu "j 4 12": "j 0 12", "j 4 9".

#### (e) For each of your two strings, give two invalid mutants of the string.
+ 2 đột biến không hợp lệ cho xâu "j 9 0": "j 9 21", "j 9 j".
+ 2 đột biến không lệ cho xâu "j 4 12": "j 4 0", "j 4 j".