Bài 7:
- Sử dụng thuật toán "Cái sàng của Eratosthenes" (Sieve of Eratosthenes) để tìm số nguyên tố:

```
public void computePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int index = 2; index <= n; index++) {
            isPrime[index] = true;
        }
        
        for (int factor = 2; factor * factor <= n; factor ++) {
            if (isPrime[factor]) {
                for (int index1 = factor; factor * index1 <= n; index1++) {
                    isPrime[factor * index1] = false;
                }
            }
        }
        
        for (int index = 2; index <= n; index++) {
            if (isPrime[index] && (index % 10 != 9)) {
                primes.add(index);
            }
        }
    }
```
- Mô hình RIPR được dùng để biết liệu có lỗi trong hệ thống hay không, chương trình có thể chạy được, nhưng có thể tồn tại lỗi ẩn (error).
