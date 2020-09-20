# Chapter 3-7

> Reconsider the PrimeNumbers class from the previous exercise. Normally, this problem is solved with the Sieve of Eratosthenes [Wikipedia, 2015]. The change in algorithm changes the consequences of the fault. Specifically, false positives are now possible in addition to false negatives. Recode the algorithm to use the Sieve approach, but leave the fault. What is the first false positive, and how many “primes” must a test case generate before encountering it? What does this exercise show about the RIPR model?

```java
public void computePrimes(int n) {
    boolean[] isPrime = new boolean[n + 1];
    for (int i=2; i<=n; i++){
        isPrime[t] = true;
    }

    for (int factor = 2; factor * factor <= n; factor++) {
        if (isPrime[factor]) {
            for (int j = factor; factor * j <= n; j++) {
                isPrime[factor * j] = false;
            }
        }
    }
    for (int 2; i <= n; i++){
        if (isPrime[i] && (i % 10 != 9)) {
            primes.add(i);
        }
    }
}
```

* Trường hợp fault đầu tiên xảy ra khi ```n = 9```, khi đó đã tính được 7 số nguyên tố đầu tiên.
* Mô hình RIPR nên được sử dụng để biết liệu có lỗi trong hệ thống hay không, ngược lại, có thể nghĩ rằng chương trình đang chạy chính xác, nhưng có quá nhiều lỗi đang chờ được phát hiện.
