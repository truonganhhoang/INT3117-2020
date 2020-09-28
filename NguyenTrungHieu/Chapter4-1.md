# Câu 1:
- Đầu tiên, đây là class 'Calc': 
```
public class Calc {    
    static public int add (int a, int b) {
       return a + b;
    }
 } 
```
- Nó chỉ có class 'add'. Do đó,  thực hiện các test không thành công cho hai phương thức: 'mult' và 'div', cho phép nhân và phép chia.
- 'Calc' class:
```
public class Calc {    
    static public int add (int a, int b) {
       return a + b;
    }
    static public int mult (int a, int b) {
       return a * b;
    }
    static public int div (int a, int b) {
       return a / b;
    }
 } 
```
- 'CalcTest' class :
```
public class CalcTest {    
    
    @Test void public testAdd(){
        assertTrue( message: "Calc sum incorrect, condition 5== Cacl.add(a:3, b:2) );
    }
    @Test void public testMult(){
        assertTrue( message: "Calc multiplication incorrect, condition 8== Cacl.mult(a:2, b:4) );
    }
    @Test void public testDiv(){
        assertTrue( message: "Calc divide incorrect, condition 8== Cacl.div(a:32, b:4) );
    }
 } 
```
