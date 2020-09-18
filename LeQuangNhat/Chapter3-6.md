# Consider the following example class. ```PrimeNumbers``` has three methods. The first, ```computePrimes()```, takes one integer input and computes that many prime numbers. ```iterator()``` returns an Iterator that will iterate through the primes, and ```toString()``` returns a string representation.
# ```computePrimes()``` has a fault that causes it not to include prime numbers whose last digit is 9 (for example, it omits 19, 29, 59, 79, 89, 109, . ..). If possible, describe five tests. You can describe the tests as sequences of calls to the above methods, or briefly describe them in words. Note that the last two tests require the test oracle to be described.
## (a) A test that does not reach the fault
## (b) A test that reaches the fault, but does not infect
## (c) A test that infects the state, but does not propagate
## (d) A test that propagates, but does not reveal
## (e) A test that reveals the fault
# If a test cannot be created, explain why.

### Tất cả các bộ kiểm thử bên dưới được để trong file PrimeNumbersTest.java ở thư mục Assets

### (a) A test that does not reach the fault

```
  // Với đầu vào là số 0, vòng while chưa bao giờ được chạy
  // Kết quả của test: Passed
 @Test
  public void testComputePrimesA() {
    PrimeNumbers primeNums = new PrimeNumbers();
    primeNums.computePrimes(0);
    assertEquals("[]", primeNums.toString());
  }
```

### (b) A test that reaches the fault, but does not infect

```
  // Đầu vào là 5 số, vòng lặp while bị lỗi đã được chạy, nhưng chưa chạm tới điều kiện lỗi
  // Kết quả test: Passed
  @Test
  public void testComputePrimesB() {
    PrimeNumbers primeNums = new PrimeNumbers();
    primeNums.computePrimes(5);
    assertEquals("[2, 3, 5, 7, 11]", primeNums.toString());
  }
```

### (c) A test that infects the state, but does not propagate

```
  // Bộ test này sẽ cho ra kết quả bị lỗi, nhưng không lan truyền.
  // Kết quả test: Failed
  @Test
  public void testComputePrimesC() {
    PrimeNumbers primeNums = new PrimeNumbers();
    primeNums.computePrimes(8);
    assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNums.toString());
  }
```

### (d) A test that propagates, but does not reveal
Không có bộ kiểm thử nào tương ứng, vì tất cả các bộ kiểm thử thất bại đều có lỗi phơi bày (tất cả các số nguyên tố kết thúc bằng số 9 đều không có trong kết quả trả về)

### (e) A test that reveals the fault

(Giống bộ test ở câu c)