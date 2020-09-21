# 6. Consider the following example class. PrimeNumbers has three methods

## (a) A test that does not reach the fault
```
@Test
 void testComputePrimesA() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(0);
 
     assertEquals("[]", primeNumbers.toString());
     
 }
```

## (b) A test that reaches the fault, but does not infect
```
@Test
 void testComputePrimesB() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(7);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17]",
          primeNumbers.toString());
 } 
```
## (c) A test that infects the state, but does not propagate
```
 @Test
 void testComputePrimesC() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", 
         primeNumbers.toString());
     // it is affected because it doesn't include 19
}
```
## (d) A test that propagates, but does not reveal

Kiểm thử này không thể xảy ra vì lỗi bắt đầu ở số 19 (ta không tính số 9 vì nó không phải số nguyên tố), tất cả các số nguyên tố kết thúc bằng "9" sẽ không có trong giá trị kết quả.

## (e) A test that reveals the fault
```
@Test
 void testComputePrimesE() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
         primeNumbers.toString());
 } 
```