# **Answer**
Chúng ta sẽ không thể chạy được vào vòng while nơi thực hiện và xác định nơi có lỗi, kết quả ```passed```
```java
 @Test
  public void testComputePrimes() {
    PrimeNumbers prime = new PrimeNumbers();
    prime.computePrimes(0);
    assertEquals("[]", prime.toString());
  }
```
Với lần thử thử 2, nếu chúng ta gọi phương thức với một biến truyền vào (parameter) ví dụ là số 3, phương thức sẽ là ```computePrime(3)``` chương trình sẽ chạy một phần của đoạn mã nơi mà sẽ xảy ra lỗi (faults), nhưng vì số đưa vào không kết thúc bằng số 9 cho nên nó không gây ra lỗi (failures), kết quả ```passed```
```java
@Test
  public void testComputePrimes() {
    PrimeNumbers prime = new PrimeNumbers();
    prime.computePrimes(1);
    assertEquals("[3]", prime.toString());
  }
```   

Với lần thử nghiệm thứ 3, nếu gọi phương thức với số 19 nó sẽ không thêm số 19 là số prime number bởi vì lỗi của chương trình. Nhưng nếu chúng ta không thực hiện phương thức ```toString()``` cho lớp ```PrimeNumber```, ngay cả khi nó không lây nhiễm nó sẽ không lan truyền đi và người dúng sẽ không nhận ra lỗi, kết quả ```failed```
```java
@Test
  public void testComputePrimes() {
    PrimeNumbers prime = new PrimeNumbers();
    prime.computePrimes(1);
    assertEquals("[19]");
  }
```
Với lần thử thứ 4, sẽ giống như lần 3 nhưng sẽ sử dụng thêm phương thức ```toString()``` điều này giúp người dùng nhận ra sai sót trong quá trình thực thi (nếu nó có một số giá trị để so sánh với kết quả hiện tại) Chỉ khi người dùng nhận ra (bằng cách so sánh kết quả thử nghiệm giống nhau) thì mới ở giai đoạn lộ ra, nếu không thì nó mới chỉ ở giai đoạn lan truyền (propagate) mà thôi
```java
@Test
  public void testComputePrimes() {
    PrimeNumbers prime = new PrimeNumbers();
    prime.computePrimes(1);
    assertEquals("[3]", prime.toString());
  }
```