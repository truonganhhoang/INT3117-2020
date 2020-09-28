# Câu 7.
 ```public void computePrimes(int n){
    boolean[] isPrime = new boolean[N + 1];
    
    for (int i = 2; i <= N; i++) {
      isPrime[i] = true;
    }
 
    
    for (int i = 2; i*i <= N; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= N; j += i) {
          isPrime[j] = false;
        }
      }
  
  }

    for (int i=2; i<=n; i++){
 	if (isPrime[i] && (i % 10 != 9)){
  		primes.add(i);
	}
    }
}
```
- Lỗi sai xác thực(false positive) đầu tiên là 9.
- Ca kiểm thử phải tạo ra 7 số nguyên tố trước khi gặp nó
- Mô hình RIPR nên được sử dụng để biết được khi có lỗi ở trong hệ thống, và ngược lại, chúng ta có thể nghĩ rằng chương trình của mình đang chạy đúng, nhưng lại có quá nhiều lỗi sai xác thực đang chờ để được lan truyền(propagate) 