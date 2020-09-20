# Consider the following example class. PrimeNumbers has three methods. The first, ```computePrimes()```, takes one integer input and computes that many prime numbers. ```iterator()``` returns an Iterator that will iterate through the primes, and ```toString()``` returns a string representation.

# ```computePrimes()``` has a fault that causes it not to include prime numbers whose last digit is 9 (for example, it omits 19, 29, 59, 79, 89, 109, . ..). If possible, describe five tests. You can describe the tests as sequences of calls to the above methods, or briefly describe them in words. Note that the last two tests require the test oracle to be described.
### (a) A test that does not reach the fault
### (b) A test that reaches the fault, but does not infect
### (c) A test that infects the state, but does not propagate
### (d) A test that propagates, but does not reveal
### (e) A test that reveals the fault
# If a test cannot be created, explain why.

### a, A test that does not reach the fault
Với đầu vào là 0 thì vòng while chưa bao giờ được chạy --> Qua kiểm tra (pass test).
```
@Test
    public void testComputerPrimeA() {
        PrimeNumbers instance = new PrimeNumbers();
        instance.computePrimes(0);
        assertEquals('[]' , instance.toString());
    }
```
### b, A test that reaches the fault, but does not infect
Với đầu vào là 5 số thì vòng lặp while (while loop) bị lỗi đã được chạy, nhưng chưa bị lỗi --> qua kiểm tra (passed Test)
```

@Test
  public void testComputePrimesB() {
    PrimeNumbers instance = new PrimeNumbers();
    instance.computePrimes(5);
    assertEquals("[5, 7, 11, 13, 15]", instance.toString());
  }
```
### c, A test that infects the state, but does not propagate
Kết quả lỗi --> Failed
```
@Test
  public void testComputePrimesC() {
    PrimeNumbers instance = new PrimeNumbers();
    instance.computePrimes(10);
    assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 21, 23]", instance.toString());
  }
```
### d, A test that propagates, but does not reveal
Không có bộ kiểm thử nào thích hợp vì tất cả đều thất bại (fault) đều có lỗi phơi bày