package Assets;

// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??

import java.util.*;

/*
 * CLASS NAME: PrimesNumbers
 *               Class to compute N prime numbers
 * ORIGINAL AUTHOR: Michael Wilson
 * 
 * NOTE: The class has a fault that results in false negatives: primes ending in 9 are missing
 * 
 */
public class PrimeNumbersSieves implements Iterable<Integer>
{
   private List<Integer> primes = new ArrayList<Integer>();

   /*
    * creates a list of n prime numbers
    * @param  n - the number of primes to compute
    * silently treats negative arguments as zero
    */
   public void computePrimes (int n)
   {
      boolean[] isPrime = new boolean[n + 1];
      for (int i = 2; i < isPrime.length; ++i)
        isPrime[i] = true;

      for (int i = 2; i * i < isPrime.length; ++i) {
        if (isPrime[i]) {
          for (int j = i; j * i < isPrime.length; ++j)
            isPrime[j * i] = false;
        }
      }

      for (int i = 2; i < isPrime.length; ++i) {
        if (isPrime[i] && i % 10 != 9){
          primes.add(i);
        }
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
