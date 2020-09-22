# Câu 6
## (a) A test that does not reach the fault

 ```
 @Test
 void testComputePrimesA() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(0);
 
     assertEquals("[]", primeNumbers.toString());
     // it never enters the while loop
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

- Không thể thực hiện kiểm tra này vì các lỗi bắt đầu ở số 19 (chúng tôi không xem xét đến số 9, vì nó không phải là số nguyên tố), tất cả các số nguyên tố tiếp theo kết thúc bằng '9' sẽ không nằm trong giá trị kết quả.
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