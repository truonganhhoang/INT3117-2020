# Exercises

## 1. Chapter 3 contained the program Calc.java. It is available on the program listings page on the book website. Calc currently implements one function: it adds two integers. Use test-driven design to add additional functionality to subtract two integers, multiply two integers, and divide two integers. Submit printouts of all tests, your final version of Calc, and a screenshot showing that all tests pass. Most importantly, include a narrative describing each TDD test created, the changes needed to make it pass, and any refactoring that was necessary.



* The method `substract()` yields two primes. First, create test:
```java
void testSubstract() {
	Calc cal = new Calc();
	assertTrue("Substraction Test", cal.substract(2, 1) == 1);
}
```
Since the function `Calc` don't have method `substract()`, the test will fail, refactor by adding `substract()` method.
```java
public int substract(int a, int b) {
	return a-b;
}
```
Now, generated test has run as expected. Observe that `substract()` can be initialized as static, refactor the code to:
```java
public static int substract(int a, int b){
	return a-b;
}
```
Next, in the generated test, directly call the method (skip `cal` initialization)
```java
void testSubstract() {
	assertTrue("Substraction Test", Calc.substract(2, 1) == 1);
}
```

* Method `multiply()` yeild the product of two primes. First, generate test:
```java
void testMultiply() {
	Calc cal = new Calc();
	assertTrue("Multiplication Test", cal.multiply(2, 1) == 1);
}
```
Since the function `Calc` don't have method `multiply()`, the test will fail, refactor by adding `multiply()` method.
```java
public int multiply(int a, int b) {
	return a-b;
}
```
Now, generated test has run as expected. Observe that`multiply()` can be initialized as static, refactor the code to:
```java
public static int multiply(int a, int b){
	return a*b;
}
```
Next, in the generated test, directly call the method (skip `cal` initialization)
```java
void testMultiply() {
	assertTrue("Multiplication Test", Calc.multiply(2, 2) == 4);
}
```

* Method `divide()` yeild quotient of two primes. first generate test:
```java
void testDivide() {
	Calc cal = new Calc();
	assertTrue("Division Test", cal.divide(5, 0) == Integer.MAX_VALUE+1);
}
Since the function `Calc` don't have method `divide()` the test will fail, refactor by adding method `divide()`.
```java
public int divide(int a, int b) {
	return a/b;
}
```
We only take the floor of the quotient of two primes, using `a/b` is sufficient. Generated test is still failing because they are not counting division by zero.
```java
public int divide(int a, int b) {
	if(b == 0) return Integer.MAX_VALUE+1;
	else return a/b;
}
Generated test run properly. Create new test to cover normal scenario:
```java
void testDivide() {
	Calc cal = new Calc();
	assertTrue("Division For Zero", cal.divide(5, 0) == Integer.MAX_VALUE+1);
	assertTrue("Division Test 1", cal.divide(5, 1) == 5);
}
```
Program ran as expected. Add new test:
```java
void testDivide() {
	Calc cal = new Calc();
	assertTrue("Division For Zero", cal.divide(5, 0) == Integer.MAX_VALUE+1);
	assertTrue("Division Test 1", cal.divide(5, 1) == 5);
	assertTrue("Division Test 2", cal.divide(5, 2) == 2);
}
```
Now, 5 divide 2 yeild floor 2. Test is still passed. Add new test
```java
void testDivide() {
	Calc cal = new Calc();
	assertTrue("Division For Zero", cal.divide(5, 0) == Integer.MAX_VALUE+1);
	assertTrue("Division Test 1", cal.divide(5, 1) == 5);
	assertTrue("Division Test 2", cal.divide(5, 2) == 2);
	assertTrue("Division Test 3", cal.divide(6, 2) == 3);
}
```
This scenario 6 is divided by 2 yeild 3, test passed, add last test
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
This scenario, 0 divide to anything yeild 0. Test passed. All tests passed, refactor: declare `static` for method `divide()` directly call `divide()` through `Calc`.

## 2. Set up a continuous integration server. Include version control for both source code and tests, and populate both with a simple example. Experiment with “breaking the build,” by either introducing a fault into the source code or adding a failing test case. Restore the build.

* Installed Cypress, created a website and run test for the website

## 3. Most continuous integration systems offer far more than automated test execution. Extend the prior exercise so that the continuous integration server uses additional verification tools such as a code coverage or static analysis tool.

* Continue using coverage của cypress.
