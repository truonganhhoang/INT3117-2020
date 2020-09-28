a) Test không chạm đến lỗi trong đoạn mã
```
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class PrimeNumbersTest
{
    @Test
    void testComputePrimesA() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.computePrimes(0);
        assertEquals("[]", primeNumbers.toString());
    }
}
```
b) Test chạm được đến lỗi nhưng không kích hoạt
```
    @Test
    public void testComputePrimesB() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.computePrimes(7);
        assertEquals("[2, 3, 5, 7, 11, 13, 17]",
                primeNumbers.toString());
    }
```
c) Test ảnh hưởng đến trạng thái nhưng không lan rộng
```
   @Test
    public void testComputePrimesB() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.computePrimes(8);
        assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
                primeNumbers.toString());
    }
```
d) Test không hiển thị lỗi dù lan rộng
- Không có Test nào khả thi vì lỗi bắt đầu từ số 19.

e) Test hiển thị lỗi
```
 @Test
    public void testComputePrimesB() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.computePrimes(8);
        assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
                primeNumbers.toString());
    }
```
