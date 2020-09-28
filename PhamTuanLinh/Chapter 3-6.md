# Chapter 3-6

+ Test không chạm đến lỗi trong đoạn mã:
```
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class ComputePrimeTest
{
   @Test
    void PrimeTest1() {
        PrimeNumbers newPrime=new PrimeNumbers();
        newPrime.computePrimes(1);
        assertEqual("[2]", newPrime.toString());
    }
    
```
+ Test chạm được đến lỗi những không kích hoạt:
```
   @Test
    void PrimeTest1() {
        PrimeNumbers newPrime=new PrimeNumbers();
        newPrime.computePrimes(7);
        assertEqual("[2,3,5,7,11,13,17]", newPrime.toString());
    }   
```
+ Test ảnh hưởng đến trạng thái nhưng không lan rộng
```
    @Test
    void PrimeTest2() {
        PrimeNumbers newPrime=new PrimeNumbers();
        newPrime.computePrimes(8);
        assertEqual("[2,3,5,7,11,13,17,19]", newPrime.toString());
    }    
```
+ Test không hiển thị dù lan rộng:
   - Không khả thì vì tất cả các số nguyên tố sau 19 đều bị ảnh hưởng.
+ Test hiển thị lỗi
 ```
     @Test
    void PrimeTest3() {
        PrimeNumbers newPrime=new PrimeNumbers();
        newPrime.computePrimes(10);
        assertEqual("[2,3,5,7,11,13,17,19,24,29]", newPrime.toString());
    }
    
 ```
