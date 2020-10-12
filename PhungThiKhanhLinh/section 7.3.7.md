
```Java
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 7; page ??
// Can be run from command line
// See PrintPrimes.num for a numbered version.
// No JUnit tests at this time

/** *****************************************************
* Finds and prints n prime integers
* Jeff Offutt, Spring 2003
********************************************************* */
public class PrintPrimes
{

   private static boolean isDivisible (int i, int j)
   {
      if (j%i == 0)
         return true;
      else
         return false;
   }
   private static void printPrimes (int n)
   {
      int curPrime;           // Value currently considered for primeness
      int numPrimes;          // Number of primes found so far.
      boolean isPrime;        // Is curPrime prime?
      int [] primes = new int [100]; // The list of prime numbers.
    
      // Initialize 2 into the list of primes.
      primes [0] = 2;
      numPrimes = 1;
      curPrime  = 2;
      while (numPrimes < n)
      {
         curPrime++;  // next number to consider ...
         isPrime = true;
         for (int i = 0; i <= numPrimes-1; i++)
         {   // for each previous prime.
            if (isDivisible (primes[i], curPrime))
            {  // Found a divisor, curPrime is not prime.
               isPrime = false;
               break; // out of loop through primes.
            }
         }
         if (isPrime)
         {   // save it!
            primes[numPrimes] = curPrime;
            numPrimes++;
         }
      }  // End while
   
      // Print all the primes out.
      for (int i = 0; i <= numPrimes-1; i++)
      {
         System.out.println ("Prime: " + primes[i]);
      }
   }  // end printPrimes
   
   public static void main (String []argv)
   {  // Driver method for printPrimes
      // Read an integer from standard input, call printPrimes()
      int integer = 0;
      if (argv.length != 1)
      {
         System.out.println ("Usage: java PrintPrimes v1 ");
         return;
      }
   
      try
      {
         integer = Integer.parseInt (argv[0]);
      }
      catch (NumberFormatException e)
      {
         System.out.println ("Entry must be a integer, using 1.");
         integer = 1;
      }
   
      printPrimes (integer);
   }
}
```

a, Hình vẽ ở link bên dưới:
https://docs.google.com/document/d/1d4TiszqbNo938-ALZtQzR4tgGStyAjdii2wmANW4dhM/edit

b, 
Xét các trường hợp kiểm tra t1 = (n = 3) và t2 = (n = 5). Mặc dù các đường dẫn này tham quan cùng các đường dẫn chính trong printPrimes (), chúng không nhất thiết phải tìm thấy các lỗi giống nhau. Thiết kế một lỗi đơn giản mà t2 sẽ có nhiều khả năng phát hiện ra hơn t1.

c,
Theo em, cạnh kết nối hai là cạnh (0,1), nơi chương trình quyết định con đường sẽ đi. Trước khi thực hiện vòng lặp *for*, chúng ta vẫn phải chạy phần đầu của vòng lặp *while* để xem *n <numPrimes* hay không. Để không thực thi vòng lặp *while*, **n = 1** sẽ thực hiện công việc.

d,
> Node Coverage: {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14}
> Edge Coverage: {(0,1),(1,2),(1,10),(2,3),(3,4),(3,7),(4,5),(4,6),(5,7),(6,3),(7,8),(7,9),(8,9),(9,1),(10,11),(11,12),(11,14),(12,13),(13,11)}
> Prime Path Coverage: 
- [0, 1, 2, 3, 4, 5, 7, 8, 9]
- [0, 1, 2, 3, 4, 5, 7, 9]
- [0, 1, 2, 3, 4, 6]
- [0, 1, 2, 3, 7, 8, 9]
- [0, 1, 2, 3, 7, 9]
- [0, 1, 10, 11, 12, 13]
- [0, 1, 10, 11, 14]
- [2, 3, 4, 5, 7, 8, 9, 1, 10, 11, 14]
- [2, 3, 4, 5, 7, 8, 9, 1, 10, 11, 12, 13]
- [2, 3, 4, 5, 7, 9, 1, 10, 11, 14]
- [2, 3, 4, 5, 7, 9, 1, 10, 11, 12, 13]
- [2, 3, 7, 8, 9, 1, 10, 11, 14]
- [2, 3, 7, 8, 9, 1, 10, 11, 12, 13]
- [2, 3, 7, 9, 1, 10, 11, 14]
- [2, 3, 7, 9, 1, 10, 11, 12, 13]
- [4, 6, 3, 7, 8, 9, 1, 10, 11, 14]
- [4, 6, 3, 7, 8, 9, 1, 10, 11, 12, 13]
- [4, 6, 3, 7, 9, 1, 10, 11, 14]
- [4, 6, 3, 7, 9, 1, 10, 11, 12, 13]
- [12, 13, 11, 14]
- [1, 2, 3, 4, 5, 7, 8, 9, 1] 
- [1, 2, 3, 4, 5, 7, 9, 1]
- [1, 2, 3, 7, 8, 9, 1]
- [1, 2, 3, 7, 1]
- [3, 4, 6, 3]
- [11, 12, 13, 11]

e,
Tất cả các đường dẫn thử nghiệm khả thi đạt được Node Coverage cũng sẽ đạt được Edge Coverage. 
[0,1,2,3,4,6,3,4,5,7,8,9,1,10,11,12,13,11,14] đạt đượt Edge Coverage nhưng không đạt được Node Coverage. Đường đi này không bao gồm 2 cạnh (3,7) và (7,9); tuy nhiên, con đường này là không khả thi.

f,
[0,1,2,3,4,6,3,7,8,9,1,2,3,4,5,7,9,1,2,3,4,6,3,4,6,3,7,8,9,1,10,11,12,13,11,12,13,11,12,13,11,14]

Đây là đường dẫn kiểm tra khi *n = 3*. Đường dẫn thử nghiệm này bao gồm tất cả các cạnh, nhưng 2 đường dẫn chính [0,1,10,11,14] và [0,1,10,11,12,13] bị thiếu. Vì vậy, đường dẫn này đạt được Mức độ bao phủ cạnh nhưng không đạt được Mức độ bao phủ của đường dẫn chính.