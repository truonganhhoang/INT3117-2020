## Consider the following example class. PrimeNumbers has three methods. The first, `computePrimes()`, takes one integer input and computes that many prime numbers. `iterator()` returns an Iterator that will iterate through the primes, and `toString()` returns a string representation...

<hr/>

- Ca kiểm tra không kích hoạt lỗi

```java
@Test
 void testComputePrimesA () {
     PrimeNumbers primeNumbers = new PrimeNumbers ();
     primeNumbers.computePrimes (0);

     Assertions.assertEquals("[]", primeNumbers.toString ());
     // Không bao giờ đi vào vòng lặp while
}
```

- Ca kiểm tra chạm vào lỗi, nhưng không lây nhiễm

```java
@Test
void testComputePrimesB () {
    PrimeNumbers primeNumbers = new PrimeNumbers ();
    primeNumbers.computePrimes (7);

    Assertions.assertEquals("[2, 3, 5, 7, 11, 13, 17]", primeNumbers.toString ());
}
```

- Ca kiểm thử bị lây nhiễm lỗi, nhưng không phát tán

```java
@Test
void testComputePrimesC() {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.computePrimes(8);

    assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNumbers.toString());
    // Số 19 không được in ra
}
```

- Ca kiểm thử phát tán nhưng không thể hiện lỗi

Không có ca kiểm thử nào phát tán nhưng không thể hiện ra lỗi vì khi số nguyên tố 19 không được in ra thì tất cả các số nguyên tố tiếp theo đều thể thiện lỗi.

- Ca kiểm thử thể hiện lỗi

```java
@Test
void testComputePrimesE() {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.computePrimes(8);

    assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
        primeNumbers.toString());
 }
```
