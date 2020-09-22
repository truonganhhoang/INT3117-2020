Câu hỏi:
Theo class mẫu của đề bài, viết test cho các trường hợp tương ứng ?

Trả lời:

a.	Một bài kiểm thử không đạt lỗi:

@Test
void testComputePrimesA() {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.computePrimes(0);

    assertEquals("[]", primeNumbers.toString());
}
 
b.	Một bài kiểm thử đạt lỗi nhưng không lây nhiễm

@Test
void testComputePrimesB() {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.computePrimes(6);

    assertEquals("[2, 3, 5, 7, 11, 13]", primeNumbers.toString());
} 

c.	Một kiểm thử lây nhiễm trạng thái, nhưng không lan truyền

@Test
void testComputePrimesC() {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.computePrimes(8);

    assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNumbers.toString());
}

d.	Một kiểm thử được lan truyền, nhưng k tiết lộ:
- Kiểm tra này không thể thực hiện được vì các lỗi bắt đầu ở số 19 (chúng ta không xem xét số 9 vì nó không phải là số nguyên tố), tất cả các số nguyên tố tiếp theo kết thúc bằng '9' sẽ không nằm trong giá trị kết quả.

e.	Một bài kiểm thử cho thấy lỗi:

@Test
 void testComputePrimesE() {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.computePrimes(8);

    assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNumbers.toString());
} 