# Chapter 8.3-4
## 7.Answer the following questions for the program fragments below:

## fragment P:
```java
if (A || B || C)
{ 
m();
} return;
```

## fragment Q:
```java
if(A){
  m();
  return;
}
if (B){
  m();
  return;
}
if(C){
  m();
}
```

## (a) Give a GACC test set for fragment P. (Note that GACC, CACC, and RACC yield identical test sets for this example.)
## (b) Does the GACC test set for fragment P satisfy Edge Coverage on fragment Q?
## (c) Write down an Edge Coverage test set for fragment Q. Make your test set include as few tests from the GACC test set as possible.

## (a): GACC cho P: T<sub>GACC</sub> = {(T,F,F),(F,T,F),(F,F,T),(F,F,F)}
<br>

## (b): Có
<br>

## (c): EC cho Q: T<sub>EC</sub> = {(T,F,T),(F,T,T),(F,F,T),(F,F,F)}


