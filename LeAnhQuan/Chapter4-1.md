Câu 1: 
```java
public class Calc{
```
- Tạp hàm add:
 ```java
  static public int add(int x, inty){
    return x+y;
  }
 ```  
- Tạo hàm Subtract:
 ```java
  static public int subtract(int x, int y){
    return x-y;
  }  
  ```
 - Tạo hàm divide:
  ```java
    static publlic int divide(int x, int y){
      return x/y;
   }      
  ```
 - Tạo hàm multiply:
 ```java
      static public int multiply(intx, int y){
        return x*y;
   }  
   ```  
   }
   
   
   - Tạo hàm test:
   ```java 
   public class Calc_test{
   @Test  
   public void test_add(){
    assertEquals(3, Calc.add(1,2));
   }  
   @Test  
   public void test_multiply(){
    assertEquals(4, Calc.mutiply(1,4));
   }  
   @Test  
   public void test_subtract(){
    assertEquals(5, Calc.subtract(10,5));
   }  
   @Test  
   public void test_divide(){
    assertEquals(3, Calc.divide(9,3));
   }  
   }
   ```
