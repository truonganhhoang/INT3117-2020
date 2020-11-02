a. Chuyển hàm `checkIt()` thành `checkItExpand()`

```java 
public static void checkItExpand (boolean a, boolean b, boolean c) {
 if (a) {
  if (b) {
   System.out.println ("1: P is true"); 
   } else if (c) 
    {
    // !b System.out.println ("2: P is true"); 
    } else { 
    // !b and !c System.out.println ("3: P isn’t true"); } 
    } else
     { // !a System.out.println ("4: P isn’t true"); }
    }
  } 
```

b. 
- Tập kiểm thử T1 thỏa mãn GACC: {`TTF`, `FTF`, `TFT`}.
- Tập kiểm thử T2 thỏa mãn bao phủ cạnh mà không thỏa mãn GACC: {`TTT`, `FTT`}.
   	
c. Kết quả chạy thử chương trình:
```java
true true true 
checkIt(): 1: P is true 
checkItExpand(): 1: P is true 
true true false 
checkIt(): 1: P is true
checkItExpand(): 1: P is true
true false true 
checkIt(): 1: P is true 
checkItExpand(): 2: P is true 
true false false 
checkIt(): 3: P isn’t true 
checkItExpand(): 3: P isn’t true 
false true true 
checkIt(): 3: P isn’t true 
checkItExpand(): 4: P isn’t true 
```

