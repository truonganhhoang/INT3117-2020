# Chapter 9.1.2-4
## 5. Consider the following BNF:
## P ::= I D Y | I Y D | D I Y | D Y I | Y I D | Y D I
## I ::= "j" | "s"
## D ::= "9" | "21"
## Y ::= "0" | "4"

</br>

## (a) How many nonterminal symbols are in the grammar? 
### Có 4 ký hiệu không kết thúc: P, I, D, Y
## (b) How many terminal symbols are in the grammar? Solution:13
### Có 6 ký hiệu kết thúc
## (c) Write two strings that are valid according to the BNF. 
### 2 xâu: j90, s49

## (d) For each of your two strings, give two valid mutants of the string.
### j90->j210, s49->s09

## (e) For each of your two strings, give two invalid mutants of the string.
### j90->js0, s49-> sj9
