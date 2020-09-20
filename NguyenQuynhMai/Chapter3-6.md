6.
(a) 
```java
@Test
 void testComputePrimesA() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(0);
 
     assertEquals("[]", primeNumbers.toString());
     // không vào vong lặp while vì count=1 > n=0
 }
```
(b) 
```java
@Test
 void testComputePrimesB() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(5);
 
     assertEquals("[2, 3, 5, 7, 11]",
          primeNumbers.toString());
 } 
```
(c) 
```java
@Test
 void testComputePrimesC() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", 
         primeNumbers.toString());
     // bị ảnh hưởng vì không gồm số 19
}
```
(d) <p>
Kiểm tra trường hợp này không khả thi vì chương trình có lỗi (fault) từ số 19 (số 19 là số nguyên tố) nhưng trong mã nguồn đề bài cho lại có câu lệnh ```if (isPrime && (number%10!=9))``` nên tất cả các số nguyên tố có đuôi là 9 sẽ không có trong kết quả đầu ra chương trình.</p>
(e)
```java
@Test
 void testComputePrimesE() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
         primeNumbers.toString());
 } 
```
