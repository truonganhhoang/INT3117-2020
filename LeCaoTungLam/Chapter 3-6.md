6.	Prime number
a)	A test that does not reach the fault
@Test
 void testComputePrimesA() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(0);
 
     assertEquals("[]", primeNumbers.toString());
     // it never enters the while loop
 }

b)	A test that reaches the fault, but does not infect
@Test
 void testComputePrimesB() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(7);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17]",
          primeNumbers.toString());
 }


c)	A test that infects the state, but does not propagate
@Test
 void testComputePrimesC() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", 
         primeNumbers.toString());
     // it is affected because it doesn't include 19
}

d)	A test that propagates, but does not reveal
-	This test is not possible because the faults starts at the 19 (we’re not taking in consideration 9, because it is not prime), all of subsequent primes that ends in ‘9’ won’t be in the result value.

e)	A test that reveals the fault
@Test
 void testComputePrimesE() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
         primeNumbers.toString());
 }
