# Exercise 8 - Section 3 - Chapter 8

## Question
For the index() program in Chapter 7, complete the test sets for the following coverage criteria by filling in the “don’t care” values. Make sure to ensure reachability. Then derive the expected output. Download the program, compile it, and run it with your resulting test cases to verify correct outputs.

```java
	public static int patternIndex (String subject, String pattern)
   {
      final int NOTFOUND = -1;
      int  iSub = 0, rtnIndex = NOTFOUND;
      boolean isPat  = false;
      int subjectLen = subject.length();
      int patternLen = pattern.length();
   
      while (isPat == false && iSub + patternLen - 1 < subjectLen)
      {
         if (subject.charAt(iSub) == pattern.charAt(0))
         {
            rtnIndex = iSub; // Starting at zero
            isPat = true;
            for (int iPat = 1; iPat < patternLen; iPat ++)
            {
               if (subject.charAt(iSub + iPat) != pattern.charAt(iPat))
               {
                  rtnIndex = NOTFOUND;
                  isPat = false;
                  /* MB: isPat = true; */
                  break;  // out of for loop
               }
            }
         }
         iSub ++;
      }
      return (rtnIndex);
   }
```

## Answer

### Predicate Coverage (PC)
The predicates are:  
- p1: isPat == false && iSub + patternLen - 1 < subjectLen  
- p2: subject.charAt(iSub) == pattern.charAt(0)  
- p3: subject.charAt(iSub + iPat) != pattern.charAt(iPat)  

Tests:
- t1: subject = "lesamis", pattern = "cat"
- t2: subject = "lesamis", pattern = "afdgdfgadg"
- t3: subject = "lesamis", pattern = "l"
- t4: subject = "lesamis", pattern = "e"
- t5: subject = "lesamis", pattern = "e"
- t6: subject = "lesamis", pattern = "y"
