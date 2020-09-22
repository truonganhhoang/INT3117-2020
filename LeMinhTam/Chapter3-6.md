## 6. Hãy xem xét lớp ví dụ sau. PrimeNumbers có ba phương pháp. Đầu tiên, computePrimes (), nhận một đầu vào số nguyên và tính nhiều số nguyên tố đó. iterator () trả về một Iterator sẽ lặp qua các số nguyên tố và toString () trả về một biểu diễn chuỗi.
```java
public class PrimeNumbers implements Iterable<Integer>
{
   private List<Integer> primes = new ArrayList<Integer>();

   /*
    * creates a list of n prime numbers
    * @param  n - the number of primes to compute
    * silently treats negative arguments as zero
    */
   public void computePrimes (int n)
   {
      int count = 1; // count of primes
      int number = 2; // number tested for primeness
      boolean isPrime; // is this number a prime

      while (count <= n)
      {
         isPrime = true;
         for (int divisor = 2; divisor <= number / 2; divisor++)
         {
            if (number % divisor == 0)
            {
               isPrime = false;
               break; // for loop
            }
         }
         if (isPrime && (number % 10 != 9)) { // THIS IS THE FAULT!!!
            primes.add (number);
            count++;
         }
         number++;
      }
   }

   @Override public Iterator<Integer> iterator() 
   { 
      return primes.iterator(); 
   }

   @Override public String toString() 
   { 
      return primes.toString(); 
   }

   public static void main (String[] argv) 
   {
      PrimeNumbers primes = new PrimeNumbers();
      primes.computePrimes(8);
      System.out.println("Primes: " + primes);

      Iterator<Integer> itr = primes.iterator();
      System.out.println("First prime: " + itr.next());
   }
}
```
* a. Ca kiểm thử không gây trục trặc (fault)
```java
@Test
 void testComputePrimes() {

     PrimeNumbers pArray = new PrimeNumbers();
     pArray.computePrimes(-100);
 
     assertEquals(" ", pArray.toString());
 }
```
* b. Ca kiểm thử gây trục trặc (fault) nhưng không độc hại

```java
//testcase not end with 9
@Test
 void testComputePrimes() {

     PrimeNumbers pArray = new PrimeNumbers();
     pArray.computePrimes(2);
 
     assertEquals("1,3", pArray.toString());
 }
```
* c. Ca kiểm thử gây hại (infect) nhưng không lan truyền

```java
//toString not show up
@Test
 void testComputePrimes() {

     PrimeNumbers pArray = new PrimeNumbers();
     pArray.computePrimes(8);
 
     assertEquals("1,3,5,7,11,13,17,23");
 }
```
* d. Ca kiểm thử lan truyền nhưng không hiển thị lỗi

```java
//toString not show up
@Test
 void testComputePrimes() {

     PrimeNumbers pArray = new PrimeNumbers();
     pArray.computePrimes(8);
 
     assertEquals("1,3,5,7,11,13,17,23", pArray.toString());
 }
```

* e. Sẽ không có ca kiểm thử nào lan truyền hiển thị lỗi, chỉ có người dùng nhận ra bằng cách so sánh kết quả 

