a)

```
@Test
 void testComputePrimes1() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(0);
 
     assertEquals("[]", primeNumbers.toString());
}
```

Đầu vào là 0 thì hàm sẽ không bao giờ đi vào lòng lặp while cho nên không gây ra lỗi ngoài (fault).

b)

```
@Test
 void testComputePrimes2() {
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
 void testComputePrimes3() {
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
 void testComputePrimes4() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
         primeNumbers.toString());
 } 
```