a. Ca kiểm thử cho điều kiện bao phủ `PC`: `{(T,F,F) (F,T,F),(F,F,T),(F,F,F)}`

b. Ca kiểm thử cho điều kiện bao phủ `CC`: `{(T,T,T),(F,T,T),(F,F,T),(F,F,F)} `

c. Ca kiểm thử cho điều kiện bao phủ `CACC`:
- fragment P: 
```java 
if (A || B || C) {
 { m(); 
 } 
 return; 
```
- fragment Q: 
```java 
if (A) {
{ m(); 
return;
} 
if (B) 
{ 
m();
return;
}
if (C) 
{ m(); 
}
 
```