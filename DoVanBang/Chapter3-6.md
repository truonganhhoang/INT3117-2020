# Chapter 3

#### 6

##### a)
`
@Test
void testComputePrimesA() {
 PrimeNumbers primeNumbers = new PrimeNumbers();
 primeNumbers.computePrimes(0);
 assertEquals("[]", primeNumbers.toString());
}
`

##### b)
`
@Test
void testComputePrimesB() {
 PrimeNumbers primeNumbers = new PrimeNumbers();
 primeNumbers.computePrimes(7);
 assertEquals("[2, 3, 5, 7, 11, 13, 17]", primeNumbers.toString());
 }
`

##### c)
`
@Test
`
void testComputePrimesC() {
 PrimeNumbers primeNumbers = new PrimeNumbers();
 primeNumbers.computePrimes(8);
 assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNumbers.toString());
}
`

##### d)
-	This test is not possible because the faults starts at the 19 (we’re not taking in consideration 9, because it is not prime), all of subsequent primes that ends in ‘9’ won’t be in the result value.

##### e)
`
@Test
void testComputePrimesE() {
 PrimeNumbers primeNumbers = new PrimeNumbers();
 primeNumbers.computePrimes(8);
 assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNumbers.toString());
}
`