# Chapter 9.1.2-4
## 4. Consider the following BNF:
## A ::= O B | O M | O B M
## O ::= "w" | "x" | "s" | "m"
## B ::= "i" | "f" | "c" | "r"
## M ::= "o" | "t" | "p" | "a" | "h"

</br>

## (a) How many nonterminal symbols are in the grammar? 
### Có 4 ký hiệu không kết thúc: A, O, B, M
## (b) How many terminal symbols are in the grammar? Solution:13
### Có 13 ký hiệu kết thúc: w,x,s,m,i,f,c,r,i,t,p,a,h
## (c) Write two strings that are valid according to the BNF. 
### 2 xâu: wi, wo

## (d) For each of your two strings, give two valid mutants of the string.
### wi -> xi, wo-> wt.

## (e) For each of your two strings, give two invalid mutants of the string.
### wi -> wm, wo -> ho.
