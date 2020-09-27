# 1. Viết thêm các chức năng cộng trừ nhân chia cho hàm Calc, bổ sung các trường hợp kiểm thử tương ứng

- Chức năng trừ
  - Hàm cài đặt
    ```java
    static public int sub (int a, int b)
       {
          return a - b;
       }
    ```
   - Kiểm thử cho chức năng
   ```java
  @Test public void testSub()
        {
           assertTrue ("Calc sub correct", 1 == Calc.sub (3, 2));
        } 
  ```
   
- Chức năng nhân
  - Hàm cài đặt
    ```java
    static public int mul (int a, int b)
       {
          return a * b;
       }
    ```
  - Hàm kiểm thử
  ```java
    @Test public void testMul()
          {
             assertTrue ("Calc mul correct", 6 == Calc.sub (3, 2));
          } 
    ```
  
- Chức năng chia
  - Hàm cài đặt
    ```java
    static public int div (int a, int b)
       {
          if(b==0){
          System.out.println("Error division by zero");
          }
          return a / b;
       }
    ```
  - Hàm kiểm thử
  ```java
    @Test public void testDiv()
          {
             assertTrue ("Normal division", 1 == Calc.sub (3, 3));
             assertTrue ("Remainder division", 1 == Calc.sub (4, 3));
             assertTrue ("Division by zero", "Error division by zero" == Calc.sub (3, 0));
          } 
    ```

