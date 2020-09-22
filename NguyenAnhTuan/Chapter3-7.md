# 7. Reconsider the PrimeNumbers class from the previous exercise. Normally, this problem is
solved with the Sieve of Eratosthenes. The change in algorithm changes the consequences of
the fault. Specifically, false positives are now possible in addition to false negatives. Recode
the algorithm to use the Sieve approach, but leave the fault. What is the first false positive,
and how many “primes” must a test case generate before encountering it? What does this
exercise show about the RIPR model?
```
public void computePrimes(int n) {
	boolean[] isPrime = new boolean[n + 1];
	for (int i = 2; i <= n; i++) {
		isPrime[i] = true;
}

for (int factor = 2; factor * factor <= n; factor++) {
	if (isPrime[factor]) {
		for {int j = factor; factor * j <= n; j++) {
			isPrime[factor * j] = false;
		}
	}
}

for (int i=2; i <= n; i++) { 
	if (isPrime[i] && (i % 10 != 9)) {
		primes.add(i);
		}
	}
}
```
- Kết quả giả đầu tiên là 9.
- Để đạt được lỗi, nó phải tính toán 7 số nguyên tố đầu tiên.
- Mô hình RIPR nên được sử dụng để biết liệu có lỗi trong hệ thống hay không.