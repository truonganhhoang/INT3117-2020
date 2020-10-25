# Consider the following BNF with start symbol A: 
A ::= B"@"C"."B
B ::= BL | L
C ::= B | B"."B
L ::= "a" | "b" | "c" | ... | "y" | | "z"
and the following six possible test cases:
t1 = a@a.a
t2 = aa.bb@cc.dd
t3 = mm@pp
t4 = aaa@bb.cc.dd
t5 = bill
t6 = @x.y
For each of the six tests, state whether the test sequence is either (1) “in” the BNF, and give a derivation, or (2) sequence as “out” of the BNF, and give a mutant derivation that results in that test. (Use only one mutation per test, and use it only one time per test.)

# Trả lời:
* t1 thuộc (1), dẫn xuất là: A ::= L"@"L"."L

* t2 thuộc (1), dẫn xuất là: A ::= LL"."LL"@"LL"."LL

* t3 thuộc (2), dẫn xuất biến dị là: A ::= B"@"CB

* t4 thuộc (1), dẫn xuất là: A ::= LLL"@"LL"."LL"."LL

* t5 thuộc (2), dẫn xuất biến dị là: A ::= BCB

* t6 thuộc (2), dẫn xuất biến dị là: A ::= "@"C"."B