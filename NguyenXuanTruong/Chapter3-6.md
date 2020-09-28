### Exercise 6: 
__a, A test that does not reach the fault:__
```java
@Test
	 void testComputePrimesB() {
	     PrimeNumbers primeNumbers = new PrimeNumbers();
	     primeNumbers.computePrimes(7);
	 
	     assertEquals("[2, 3, 5, 7, 11, 13, 17]",
	          primeNumbers.toString());
	 }
```
__b, A test that reaches the fault, but does not infect:__
```java
@Test
	 void testComputePrimesC() {
	     PrimeNumbers primeNumbers = new PrimeNumbers();
	     primeNumbers.computePrimes(8);
	 
	     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", 
	         primeNumbers.toString());
	     // it is affected because it doesn't include 19
	}
```
__c, A test that infects the state, but does not propagate:__
```java
@Test
	 void testComputePrimesE() {
	     PrimeNumbers primeNumbers = new PrimeNumbers();
	     primeNumbers.computePrimes(8);
	 
	     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
	         primeNumbers.toString());
	 }
```
__d, A test that propagates, but does not reveal:__
- Không thể thực hiện vì lỗi bắt đầu ở số 19 (không xét 9 vì không phải số nguyên tố) tất cả các số kết thúc bằng 9 sau sẽ không có trong giá trị kết quả.

__e, A test that reveals the fault:__
```java
@Test
	 void testComputePrimesE() {
	     PrimeNumbers primeNumbers = new PrimeNumbers();
	     primeNumbers.computePrimes(8);
	 
	     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
	         primeNumbers.toString());
	 }
```
