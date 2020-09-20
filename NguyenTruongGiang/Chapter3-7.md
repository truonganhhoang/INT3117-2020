# 7. Reconsider the PrimeNumbers class from the previous exercise. Normally, this problem is solved with the Sieve of Eratosthenes [Wikipedia, 2015]. The change in algorithm changes the consequences of the fault. Specifically, false positives are now possible in addition to false negatives. Recode the algorithm to use the Sieve approach, but leave the fault. What is the first false positive, and how many “primes” must a test case generate before encountering it? What does this exercise show about the RIPR model?

- Code của bài PrimeNumber với việc sử dụng sàng Eratosthenes và có một lỗi trong chương trình sử dụng sai index:
```java

public class SieveOfEratosthenes {

    public static void findPrimesTillN(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = 1;
        }
        arr[0] = arr[1] = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    arr[i * j] = 0;
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            if (arr[i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Driver Program
    public static void main(String[] args) {
        int n = 100;
        findPrimesTillN(n);
    }
}
```

