# 1. 

a) Tạo test `testSubstract()` cho hiệu 2 số nguyên dương:


```java
voi TestSubstract() {
	Calc cal = new Calc();
	assertTrue("Substraction Test", ca.Substract(2, 1) == 1);
}
```

Việc test chắc chắn sẽ sai vì class của lớp Calc chưa hề có hàm   `Substract()`.Bởi vậy ta sẽ cần  phải refactor lại đoạn mã bằng việc thêm hàm  `Substract()`
```java
public int Substract(int a, int b) {
	return a-b;
}
```

thêm static vào đoạn mã của hàm   `Substract()`

```java
public static int Substract(int a, int b){
	return a-b;
}
```
```java
void TestSubstract() {
	assertTrue("Substraction Test", Calc.Substract(2, 1) == 1);
}
```

b)  `Multiply()` method:

```java
voi TestMultiply() {
	Calc cal = new Calc();
	assertTrue("Multiplication Test", cal.Multiply(2, 1) == 1);
}
```
Việc test chắc chắn sẽ sai vì class của lớp Calc chưa hề có hàm `Multiply()`.Bởi vậy ta sẽ cần  phải refactor lại đoạn mã bằng việc thêm hàm  `Substract()
```java
public int multiply(int a, int b) {
	return a-b;
}
```
thêm static vào đoạn mã của hàm `Multiply()`
```java
public static int Multiply(int a, int b){
	return a*b;
}
```
```java
void testMultiply() {
	assertTrue("Multiplication Test", Calc.Multiply(2, 2) == 4);
}
```

c) `divide()` method:
```java
void TestDivide() {
	Calc cal = new Calc();
	assertTrue("Division Test", cal.divide(5, 0) == Integer.MAX_VALUE+1);
}
```

Việc test chắc chắn sẽ sai vì class của lớp Calc chưa hề có hàm `Divide()`.Bởi vậy ta sẽ cần  phải refactor lại đoạn mã bằng việc thêm hàm  `Substract()

```java
public int  Divide(int a, int b) {
	return a/b;
}
```
Cần phải test trường hợp chia cho 0 và xử lý phần dư.

```java
public int Divide(int a, int b) {
	if(b == 0) return Integer.MAX_VALUE+1;
	else return a/b;
}
```
```java
void TestDivide() {
	Calc cal = new Calc();
	assertTrue("Division For Zero", cal.Divide(5, 0) == Integer.MAX_VALUE+1);
	assertTrue("Division Test 1", cal.Divide(5, 1) == 5);
}
```
```java
void TestDivide() {
	Calc cal = new Calc();
	assertTrue("Division For Zero", cal.Divide(5, 0) == Integer.MAX_VALUE+1);
	assertTrue("Division Test 1", cal.Divide(5, 1) == 5);
	assertTrue("Division Test 2", cal.Divide(5, 2) == 2);
}
```
thêm test mới khi chia k hết 

```java
void TestDivide() {
	Calc cal = new Calc();
	assertTrue("Division For Zero", cal.Divide(5, 0) == Integer.MAX_VALUE+1);
	assertTrue("Division Test 1", cal.Divide(5, 1) == 5);
	assertTrue("Division Test 2", cal.Divide(5, 2) == 2);
	assertTrue("Division Test 3", cal.Divide(6, 2) == 3);
}
```
Trường hợp chia hết

```java
void testDivide() {
	Calc cal = new Calc();
	assertTrue("Division For Zero", cal.divide(5, 0) == Integer.MAX_VALUE+1);
	assertTrue("Division Test 1", cal.divide(5, 1) == 5);
	assertTrue("Division Test 2", cal.divide(5, 2) == 2);
	assertTrue("Division Test 3", cal.divide(6, 2) == 3);
	assertTrue("Division Test 4", cal.divide(0, 2) == 0);
}
```
























