# Chapter 4-1
  + Chương trình Calc.java ở chapter 3 thêm các hàm trừ, nhân chia (đã có sẵn phép cộng): 
  ```
    public class Calc {
      static public int Add(int a, int b) {
            return a+b;
      }
      
      static public int Subtract(int a, int b)  {
            return a-b;
      }
      
      static public int Multiply(int a, int b)  {
            return a*b;
      }
      
      static public int Divide(int a, int b) throws ArimethicException {
           return a/b;
      }
  ```
   +  Calc.Java test:
   ```
      import org.junit.*;
      import static org.junit.Assert.*;
      
      public class CalcTest {
          @Test
          public void testAdd() {
                assertEqual(8, Calc.Add(7,1));
          }
          
          @Test
          public void testSubtract() {
                assertEqual(3, Calc.Subtract(9,6));
          }
          
          @Test
          public void testMultiply() {
                assertEqual(14, Calc.Multiply(7,2));
          }
          
          @Test
          public void testDivide1() {
                assertEqual(8, Calc.Divide(24,3));
          }
          
          @Test (expected=ArimethicException.class)
          public void testDivideByZero() {
               Calc.Divide(5,0);
          }
      }
   ```
