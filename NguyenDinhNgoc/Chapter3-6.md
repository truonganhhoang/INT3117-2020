6,
*(a) Bài kiểm tra không đạt lỗi*


```java
void testComputePrimesA() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(0);
 
     assertEquals("[]", primeNumbers.toString());
 }
```


*(b) Một thử nghiệm đạt đến lỗi, nhưng không lây nhiễm*


```java
void testComputePrimesB() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(7);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17]",
          primeNumbers.toString());
 }
```

*(c) Một thử nghiệm lây nhiễm trạng thái, nhưng không lan truyền*


```java
void testComputePrimesC() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", 
         primeNumbers.toString());
}
```
