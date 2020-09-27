# Chapter 4-5
## Repair a fault in an existing system. That is, find the code that needs to change and capture the current behavior with tests. At least one of these tests must fail, thus demonstrating that you found the fault. Repair the fault and check that all of your tests now pass.
<br>

## Sử dụng lại chương trình từ bài 4-1:
<br>

# Calc.java
```java
public class Calc
{
   public static int add(int a, int b) {
      return a+b;
   }
}
```

# CalcTest.java
```java
public class CalcTest {
    @Test public void testAdd(){
        assertTrue(Calc.add(1,2) == 3);
        assertEquals(9,Calc.add(3.5,5.5),0);
        assertEquals(2.25,Calc.add(-3.25,5.5),0);
    }
}
```
<br>

## Qua test nhận thấy chương trình không cho kết quả đúng với số thực.
<br>

# Calc.java (sau khi sửa)
```java
public class Calc
{
   public static double add(double a, double b) {
      return a+b;
   }
}
```

## Kết quả:

![](images/Chapter%204-5.png)





