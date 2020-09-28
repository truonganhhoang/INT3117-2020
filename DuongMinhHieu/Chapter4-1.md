# Chapter 3 contained the program Calc.java. It is available on the program listings page on the book website. Calc currently implements one function: it adds two integers. Use test-driven design to add additional functionality to subtract two integers, multiply two integers, and divide two integers. 
# Submit printouts of all tests, your final version of Calc, and a screenshot showing that all tests pass. Most importantly, include a narrative describing each TDD test created, the changes needed to make it pass, and any refactoring that was necessary.

* Phương thức `substract()` cho hiệu hai số nguyên. Đầu tiên, tạo test:
```java
void testSubstract() {
	Calc cal = new Calc();
	assertTrue("Substraction Test", cal.substract(2, 1) == 1);
}
```
Vì trong đoạn mã, lớp Calc chưa có phương thức `substract()` nên test sẽ sai, ta sẽ refactor đoạn mã bằng cách thêm phương thức `substract()`.
```java
public int substract(int a, int b) {
	return a-b;
}
```
Lúc này, test đã tạo sẽ chạy đúng với kì vọng. Ta thấy rằng phương thức `substract()` có thể khởi tạo static, ta sẽ refactor đoạn mã bằng cách sửa thành 
```java
public static int substract(int a, int b){
	return a-b;
}
```
Tiếp theo, trong test đã tạo ta sẽ gọi thẳng phương thức (không cần khởi tạo `cal` nữa)
```java
void testSubstract() {
	assertTrue("Substraction Test", Calc.substract(2, 1) == 1);
}
```

* Phương thức `multiply()` cho tích hai số nguyên. Đầu tiên tạo test:
```java
void testMultiply() {
	Calc cal = new Calc();
	assertTrue("Multiplication Test", cal.multiply(2, 1) == 1);
}
```
Vì trong đoạn mã, lớp Calc chưa có phương thức `multiply()` nên test sẽ sai, ta sẽ refactor đoạn mã bằng cách thêm phương thức `multiply()`.
```java
public int multiply(int a, int b) {
	return a-b;
}
```
Lúc này, test đã tạo sẽ chạy đúng với kì vọng. Ta thấy rằng phương thức `multiply()` có thể khởi tạo static, ta sẽ refactor đoạn mã bằng cách sửa thành 
```java
public static int multiply(int a, int b){
	return a*b;
}
```
Tiếp theo, trong test đã tạo ta sẽ gọi thẳng phương thức (không cần khởi tạo `cal` nữa)
```java
void testMultiply() {
	assertTrue("Multiplication Test", Calc.multiply(2, 2) == 4);
}
```

* Phương thức `divide()` cho thương hai số nguyên. Đầu tiên tạo test
```java
void testDivide() {
	Calc cal = new Calc();
	assertTrue("Division Test", cal.divide(5, 0) == Integer.MAX_VALUE+1);
}
Vì trong đoạn mã, lớp Calc chưa có phương thức `divide()` nên test sẽ sai, ta sẽ refactor đoạn mã bằng cách thêm phương thức `divide()`.
```java
public int divide(int a, int b) {
	return a/b;
}
```
Ta sẽ lấy phần nguyên của thương hai số nguyên, do đó chỉ sử dụng `a/b` là đủ. Test đã tạo vẫn chạy sai vì ta chưa xét trường hợp chia cho 0 (sẽ ra exception). Do đó, ta sẽ thêm vào đoạn mã khi chia cho 0 thì mặc định trả về giá trị Integer.MAX_VALUE+1 (vì trong máy, không có số nguyên nào chia cho số nguyên nào ra giá trị của kiểu int lớn nhất +1).
```java
public int divide(int a, int b) {
	if(b == 0) return Integer.MAX_VALUE+1;
	else return a/b;
}
Khi đó, test đã tạo sẽ chạy đúng. Giờ ta tạo test mới để xét trường hợp bình thường.
```java
void testDivide() {
	Calc cal = new Calc();
	assertTrue("Division For Zero", cal.divide(5, 0) == Integer.MAX_VALUE+1);
	assertTrue("Division Test 1", cal.divide(5, 1) == 5);
}
```
Ta sẽ thấy chương trình chạy đúng kì vọng. Ta lại thêm test mới
```java
void testDivide() {
	Calc cal = new Calc();
	assertTrue("Division For Zero", cal.divide(5, 0) == Integer.MAX_VALUE+1);
	assertTrue("Division Test 1", cal.divide(5, 1) == 5);
	assertTrue("Division Test 2", cal.divide(5, 2) == 2);
}
```
Khi này, 5 chia 2 không hết nhưng chỉ lấy phần nguyên là ra giá trị 2. Test vẫn passed. Ta thêm test mới
```java
void testDivide() {
	Calc cal = new Calc();
	assertTrue("Division For Zero", cal.divide(5, 0) == Integer.MAX_VALUE+1);
	assertTrue("Division Test 1", cal.divide(5, 1) == 5);
	assertTrue("Division Test 2", cal.divide(5, 2) == 2);
	assertTrue("Division Test 3", cal.divide(6, 2) == 3);
}
```
Trường hợp này, 6 chia hết cho 2 ra giá trị 3, test passed. Ta thêm test cuối cùng
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
Trường hợp này, ta lấy 0 chia cho một số luôn ra giá trị 0. Test passed. Các test đều passed, ta refactor đoạn mã như sau: khai báo `static` cho phương thức `divide()` và gọi thẳng phương thức `divide()` trong test qua lớp `Calc`.
Chương trình hoàn chỉnh ở link github: <https://github.com/duongminhhieu16/CodeKiemThu.git>