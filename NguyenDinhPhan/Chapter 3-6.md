
# Chapter 3-6
## Consider the following example class. ```PrimeNumbers``` has three methods. The first, ```computePrimes()```, takes one integer input and computes that many prime numbers. ```iterator()``` returns an Iterator that will iterate through the primes, and ```toString()``` returns a string representation. ```computePrimes()``` has a fault that causes it not to include prime numbers whose last digit is 9 (for example, it omits 19, 29, 59, 79, 89, 109, . ..). If possible, describe five tests. You can describe the tests as sequences of calls to the above methods, or briefly describe them in words. Note that the last two tests require the test oracle to be described.
## (a) A test that does not reach the fault
## (b) A test that reaches the fault, but does not infect
## (c) A test that infects the state, but does not propagate
## (d) A test that propagates, but does not reveal
## (e) A test that reveals the fault
# If a test cannot be created, explain why.



## Nhận thấy lỗi tại:
``` java
...
    if (isPrime && (number % 10 != 9)) //FAULT
    {
        primes.add(number);
        count++
    }
...
```

## (a) A test that does not reach the fault:
- Chạy hàm computePrime() với tham số 0 computePrime(0): do tham số bằng 0 nên vòng lặp while không chạy vậy nên chương trình không chạy tới đoạn gây ra lỗi:
``` java
...
public void computePrimes(int n)
    ...
    int count = 1;
    ...
    while(count<=n)
    {
    ...
...
```
  
## (b) A test that reaches the fault, but does not infect
- Chạy hàm computePrime() với tham số 5 computePrime(5): do tham số bằng 5 nên không gặp số nguyên tố có kết thúc bằng 9. Như vậy có chạy hàm if trên nhưng không gây ra lỗi.
  

## (c) A test that infects the state, but does not propagate
- Chạy hàm computePrime() với tham số 9 computePrime(9): do tham số bằng 11 nên sẽ gặp số 19 là số nguyên tố kết thúc bằng 9 và số 19 này sẽ không được thêm vào. Như vậy đã gặp lỗi nhưng lỗi này không lan truyền vì có thể số nguyên tố thứ 10 là số 29 vẫn sẽ được thêm vào.

## (d) A test that propagates, but does not reveal
- Không thể sinh ra ca kiểm thử tương ứng do mỗi khi gặp lỗi thì lỗi này có thể quan sát được: các số nguyên tố kết thúc bằng 9 đều không có trong kết quả khi chạy toString().

## (e) A test that reveals the fault
- Chạy hàm computePrime() với tham số 11 computePrime(11): do tham số bằng 11 nên sẽ gặp số 19 và số 29 là hai số nguyên tố kết thúc bằng 9 và toString() sẽ không bao gồm hai số này. Như vậy lỗi gặp ở số 19 và vẫn gặp lại ở số 29.
