# Chapter 4

#### Cau 1

add
```
static public int add (int a, int b)
{
  return a + b;
}
```
subtract
```

static public int subtract (int a, int b){
   return a - b;
}
```
divide
```
static public double divide(int a, int b){
   if(b == 0){
       throw new IllegalArgumentException("Can't divide by zero");
   }
   return a / b;
}
```
multiply
```
static public int multiply (int a, int b){
   return a* b;
}
```

###### Test

test add
```
@Test
public void testAdd() {
    System.out.println("add");
    int a = 2;
    int b = 3;
    int expResult = 5;
    int result = Calc.add(a, b);
    assertEquals(expResult, result);
}
```

test subtract
```
@Test
public void testSubtract() {
    System.out.println("subtract");
    int a = 3;
    int b = 2;
    int expResult = 1;
    int result = Calc.subtract(a, b);
    assertEquals(expResult, result);
}
```

test subtract negative
```
@Test
public void testSubtractNegatives() {
    System.out.println("subtract negatives");
    int a = -3;
    int b = 2;
    int expResult = -5;
    int result = Calc.subtract(a, b);
    assertEquals(expResult, result);
}
```

test multiply
```
@Test
public void testMultiply() {
    System.out.println("multiply");
    int a = 3;
    int b = 2;
    int expResult = 6;
    int result = Calc.multiply(a, b);
    assertEquals(expResult, result);
}
```

test divide
```
@Test
public void testDivide() {
    System.out.println("divide");
    int a = 10;
    int b = 2;
    double expResult = 5;
    double result = Calc.divide(a, b);
    assertEquals(expResult, result, 1);
}
```
