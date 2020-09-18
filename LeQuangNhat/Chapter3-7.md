# Reconsider the ```PrimeNumbers``` class from the previous exercise. Normally, this problem is solved with the Sieve of Eratosthenes [Wikipedia, 2015]. The change in algorithm changes the consequences of the fault. Specifically, false positives are now possible in addition to false negatives. Recode the algorithm to use the Sieve approach, but leave the fault. What is the first false positive, and how many “primes” must a test case generate before encountering it? What does this exercise show about the RIPR model?

Hàm ```computePrimes(int n)``` được viết lại bằng cách dùng sàng Eratosthenes, nhưng vẫn để lại lỗi: (File PrimeNumbersSieves.java được để trong thư mục Assets)
```
public void computePrimes (int n)
{
  boolean[] isPrime = new boolean[n + 1];
  for (int i = 2; i < isPrime.length; ++i)
    isPrime[i] = true
  for (int i = 2; i * i < isPrime.length; ++i) {
    if (isPrime[i]) {
      for (int j = i; j * i < isPrime.length; ++j)
        isPrime[j * i] = false;
    }
  
  for (int i = 2; i < isPrime.length; ++i) {
    if (isPrime[i] && i % 10 != 9){
      primes.add(i);
    }
  }
}

```