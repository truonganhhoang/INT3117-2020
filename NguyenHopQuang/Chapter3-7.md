### Bài 7:

```
public void computePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        for (int factor = 2; factor * factor <= n; factor ++) {
            if (isPrime[factor]) {
                for (int j = factor; factor * j <= n; j++) {
                    isPrime[factor * j] = false;
                }
            }
        }
        
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] && (i % 10 != 9)) {
                primes.add(i);
            }
        }
    }
```

- Mô hình RIPR được sử dụng để biết liệu có lỗi trong hệ thống của chúng ta hay không
