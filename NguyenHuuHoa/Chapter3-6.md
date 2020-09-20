Bài 6:

a)

```
@Test
 void testComputePrimesA() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(0);
 
     assertEquals("[]", primeNumbers.toString());
}
```

Khi đầu vào là 0 thì hàm computePrimes sẽ không bao giờ đi vào lòng lặp while cho nên không gây ra fault.

b)

```
@Test
 void testComputePrimesB() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(7);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17]",
          primeNumbers.toString());
 } 
```

Khi đầu vào không có kí tự cuối cùng là 9.

c)

```
@Test
 void testComputePrimesC() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", 
         primeNumbers.toString());
}
```

d)

Không thể thực hiện kiểm tra này vì những số 29, 59, 79, 89, ... đều không phải số nguyên tố.


e) 

```
@Test
 void testComputePrimesE() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
         primeNumbers.toString());
 } 
```