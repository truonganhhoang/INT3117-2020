#Câu 6:
a) Ca kiểm thử không chạm tới lỗi tĩnh:<br/>
 ```
 @Test
 void testComputePrimesA() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(0);
     assertEquals("[]", primeNumbers.toString());
 }
 ```
Giải thích: vòng while không được đi vào.<br/>
b) Ca kiểm thử chạm đến lỗi tĩnh nhưng không truyền nhiễm lỗi:<br/>
```
@Test
 void testComputePrimesB() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(1);
     assertEquals("[2]", primeNumbers.toString());
 }
 ```
c) Ca kiểm thử truyền nhiễm lỗi nhưng không lan truyền lỗi:<br/>
```
 @Test
 void testComputePrimesC() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", 
         primeNumbers.toString());
}
```
Giải thích: kết quả trả về không có số 19 tuy nhiên không lan truyền vì chỉ có mỗi 1 số 19.<br/>
d) Không thể tìm được ca kiểm thử mà lỗi lan truyền nhưng không biểu lộ vì: Lỗi lan truyền bắt đầu từ số 19, tất cả các số có đuôi là số 9 đều sẽ không có trong kết quả trả về.<br/>
e)  Ca kiểm thử biểu lộ lỗi:<br/>
```
 @Test
 void testComputePrimesC() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", 
         primeNumbers.toString());
}
```
