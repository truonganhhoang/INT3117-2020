# **Answer**
Lần thử thứ 1, không thể chạy được vào vòng ```while``` nơi thực hiện và xác định nơi có lỗi, kết quả ```passed```
```java
 @Test
  public void testComputePrimes() {
    PrimeNumbers prime = new PrimeNumbers();
    prime.computePrimes(0);
    assertEquals("[]", prime.toString());
  }
```
Lần thử thứ 2, nếu gọi hàm ```computePrime()``` với tham số truyền vào là 3 thì chương trình chỉ chạy một đoạn mã nơi có khiếm khuyết (fault). Nhưng vì tham số truyền vào là 3, không kết thúc là 9 nên không gây ra thất bại (failure), kết quả ```passed```

```java
@Test
  public void testComputePrimes() {
    PrimeNumbers prime = new PrimeNumbers();
    prime.computePrimes(1);
    assertEquals("[3]", prime.toString());
  }
```
Lần thử thứ 3, nếu gọi hàm ```computePrime()``` với tham số truyền vào là 19, nó sẽ không thêm số 19 là số ```prime number``` bởi vì khiếm khuyết () của chương trình. Nhưng nếu chúng ta không thực hiện phương thức ```toString()``` cho lớp ```PrimeNumber```, ngay cả khi nó không lây nhiễm nó sẽ không lan truyền đi và người dúng sẽ không nhận ra lỗi, kết quả ```failed```
```java
@Test
  public void testComputePrimes() {
    PrimeNumbers prime = new PrimeNumbers();
    prime.computePrimes(1);
    assertEquals("[19]");
  }
```
Lần thử thứ 4, sẽ giống như lần 3 nhưng sẽ sử dụng thêm phương thức ```toString()``` điều này giúp người dùng nhận ra sai sót trong quá trình thực thi (nếu nó có một số giá trị để so sánh với kết quả hiện tại). Chỉ khi người dùng nhận ra (bằng cách so sánh kết quả thử nghiệm giống nhau) thì mới ở giai đoạn lộ ra, nếu không thì nó mới chỉ ở giai đoạn lan truyền (propagate) mà thôi
```java
@Test
  public void testComputePrimes() {
    PrimeNumbers prime = new PrimeNumbers();
    prime.computePrimes(1);
    assertEquals("[3]", prime.toString());
  }
```