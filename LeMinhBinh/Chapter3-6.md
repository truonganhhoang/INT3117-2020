# Chapter 3-6

> Consider the following example class. ```PrimeNumbers``` has three methods. The first, ```computerPrimes()```, takes one integer input and computes that many prime numbers. ```iterator()``` returns an Iterator that will iterate through the primes, and ```toString()``` returns a string representation.
>
```java
public class PrimeNumbers implements Iterable<Integer>
{
    private List<Integer> primes = new ArrayList<Integer>();

    public void computePrimes (int n)
    {
        int count = 1;      // count of primes
        int number = 2;     // number tested for primeness
        boolean isPrime;    // is this number a prime
        while (count <= n)
        {
            isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++)
            {
                if (number % divisor = O)
                {
                    isPrime = false;
                    break;  // for loop
                }
            }
        }
        if (isPrime (number % 10 != 9)) // FAULT
        {
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
```

> ```computePrimes()``` has a fault that causes it **not** to include prime numbers whose last digit is 9 (for example, it omits 19, 29, 59, 79, 89, 109, . ..). If possible, describe five tests. You can describe the tests as sequences of calls to the above methods, or briefly describe them in words. Note that the last two tests require the test oracle to be described.

## (a) A test that does not reach the fault

```java
@Test
void testComputePrimesA() {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.computePrimes(0);
 
    assertEquals("[]", primeNumbers.toString());
}
```

## (b) A test that reaches the fault, but does not infect

```java
@Test
void testComputePrimesB() {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.computePrimes(7);
 
    assertEquals("[2, 3, 5, 7, 11, 13, 17]", primeNumbers.toString());
}
```

## (c) A test that infects the state, but does not propagate

```java
@Test
void testComputePrimesC() {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.computePrimes(8);

    assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNumbers.toString());
}
```

## (d) A test that propagates, but does not reveal

Kiểm tra này không thể thực hiện được vì các lỗi bắt đầu ở số 19 (trừ số 9 là số nguyên tố), tất cả các số nguyên tố tiếp theo kết thúc bằng chữ số 9 sẽ không nằm trong kết quả.

## (e) A test that reveals the fault

```java
@Test
void testComputePrimesE() {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.computePrimes(8);

    assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
        primeNumbers.toString());
}
```
