# 6. Sử dụng lớp PrimeNumber mô tả 5 trường hợp kiểm thử sử dụng hàm để thể hiện những gì xảy ra tiếp theo:
* a) 1 bài kiểm thử không gặp lỗi
``` java
@Test
 void testComputePrimesA() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(0);
 
     assertEquals("[]", primeNumbers.toString());
 }
```
* - Ta có thể gọi hàm *computePrime()* với biến nhỏ hơn hoặc bằng 0 như *computePrime(0)*. Điều này sẽ không bao giờ cho phép ta nhập thời gian khi thực hiện các hoạt động hiện tại và vị trí lỗi hiện tại.
* b) 1 bài kiểm thử gặp lỗi nhưng không lây lan
```java
@Test
 void testComputePrimesB() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(7);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17]",
          primeNumbers.toString());
 } 
```
* -  Nếu ta gọi hàm với biến có giá trị 3, *computePrime(3)* thì chương trình sẽ chạy phần mã mà lỗi đang ở đó, nhưng vì là con số không kết thúc bằng 9 nên nó không lây lan.
* c) 1 bài kiểm thử lây lan trạng thái nhưng không phát tán
```java
 @Test
 void testComputePrimesC() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", 
         primeNumbers.toString());
     // nó bị lây lan nhưng không bao gồm 19
}
```
* -  Nếu ta gọi hàm với biến có giá trị 19, nó sẽ không coi 19 là 1 số nguyên tố vì lỗi trong chương trình. Nhưng vì ta không thực thi hàm *toString()* cho lớp PrimeNumber, ngay cả khi cả khi nó lây lan, nó sẽ không phát tán và người dùng sẽ không nhận ra, ngay cả khi ta đã có 1 giá trị sai do lỗi.
* d) 1 bài kiểm thử phát tán nhưng không tiết lộ
* -  Nó sẽ giống với trường hợp cuối, nhưng lần này ta sẽ sử dụng hàm *toString()* làm cho người dùng nhận ra có gì sai trong quá trình thực thi(nếu nó có 1 vài giá trị để so sánh với kết quả hiện tại).
* e) 1 bài kiểm thử tiết lộ lỗi
```java
@Test
 void testComputePrimesE() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
         primeNumbers.toString());
 } 
```
* -  Chỉ khi người dùng nhận ra điều này(bằng cách so sánh các kết quả kiểm thử giống nhau) thì mới ở giai đoạn hiển thị, nếu không, nó sẽ ở giai đoạn phát tán.
