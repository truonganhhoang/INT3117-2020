# Section 9.1.2-5

`P ::= I D Y | I Y D | D I Y | D Y I | Y I D | Y D I`
<br/>`I ::= "j" | "j"`
<br/>`D ::= "9" | "21"`
<br/>`Y ::= "0" | "4"`

`(a)` **How many nonterminal symbols are in the grammar?**

I, D, Y, không là ký hiệu cuối (nonterminal symbols).

`(b)` **How many terminal symbols are in the grammar**

Có 5 ký hiệu cuối : "j", "9", "21", "0", "4"

`(c)` **Write two strings that are valid according to the BNF.**

-   Chuỗi 1: j 9 4
-   Chuỗi 2: j 21 0

`(d)` **For each of your two strings, give two valid mutants of the string.**

-   Chuỗi 1: 9 4 0
-   Chuỗi 2: 0 21 4

`(e)` **For each of your two strings, give two invalid mutants of the string.**

-   Chuỗi 1: j j 4
-   Chuỗi 2: 21 21 0
