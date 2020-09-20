**7, Reconsider the PrimeNumbers class from the previous exercise. Normally, this problem is solved with the Sieve of Eratosthenes [Wikipedia, 2015]. The change in algorithm changes the consequences of the fault. Specifically, false positives are now possible in addition to false negatives. Recode the algorithm to use the Sieve approach, but leave the fault. What is the first false positive, and how many “primes” must a test case generate before encountering it? What does this exercise show about the RIPR model?**

    ComputePrimes hiện đang sử dụng Sieve of Eratosthenes để tìm các số nguyên tố. Kết quả dương tính giả đầu tiên lại sẽ là 9, nó không in ra, để đạt được lỗi, nó phải tính toán 7 số nguyên tố đầu tiên trước khi gặp 9 (2-8).


