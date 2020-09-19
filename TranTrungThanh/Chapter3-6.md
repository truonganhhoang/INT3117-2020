>Consider the following example class. PrimeNumbers has three
 methods. The first, computePrimes(), takes one integer input
 and computes that many prime numbers. iterator() returns an
 Iterator that will iterate through the primes, and toString()
 returns a string representation. \
>```computePrimes()``` has a fault that causes it not to include prime
 numbers whose last digit is 9 (for example, it omits 19, 29, 59, 79,
 89, 109, . ..). If possible, describe five tests. You can describe the
 tests as sequences of calls to the above methods, or briefly describe
 them in words. Note that the last two tests require the test oracle to
 be described.
 (a) A test that does not reach the fault
 (b) A test that reaches the fault, but does not infect
 (c) A test that infects the state, but does not propagate
 (d) A test that propagates, but does not reveal
 (e) A test that reveals the fault
 If a test cannot be created, explain why.

a) Ca kiểm thử không chạm đến fault
```
@Test
 void testComputePrimes() {

     PrimeNumbers primeList = new PrimeNumbers();
     primeList.computePrimes(0);
 
     assertEquals("[]", primeList.toString());
 }
```

b) Ca kiểm thử chạm đến fault, nhưng không bị lây nhiễm lỗi
```
@Test
 void testComputePrimes() {

     PrimeNumbers primeList = new PrimeNumbers();
     primeList.computePrimes(7);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17]", primeList.toString());
 } 
```
c) Ca kiểm thử bị lây nhiễm lỗi, nhưng không phát tán
```
 @Test
 void testComputePrimes() {

     PrimeNumbers primeList = new PrimeNumbers();
     primeList.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeList.toString());
}
```
d) Ca kiểm thử bị phát tán, nhưng không thể hiện được fault
<p>
Không có ca kiểm thử nào bị phát tán mà không thực hiện fault vì khi số nguyên tố 19 không được in ra thì tức là các số nguyên tố tiếp theo đã thể hiện fault.
</p>
e) Ca kiểm thử thể hiện fault
```
@Test
 void testComputePrimes() {

     PrimeNumbers primeList = new PrimeNumbers();
     primeList.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeList.toString());
 } 
```
 