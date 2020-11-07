- **Cài đặt** [mã nguồn chương trình Pattern Index Instrument](https://cs.gmu.edu/~offutt/softwaretest/java/PatternIndexInstrument.java):

``` java
import java.util.*;

public class PatternIndexInstrument
{
  static Path p = new Path();  // INSTRUMENT

  public static void main (String[] argv)
  {
    if (argv.length != 2)
    {
      System.out.println ("java PatternInstrument Subject Pattern");
      return;
    }
    String subject = argv[0];
    String pattern = argv[1];
    int n = patternIndex (subject, pattern);

    if (n == -1)
    {
      System.out.println ("Pattern string is not a substring of the subject string");
      System.out.println ("Path is " + p);  // INSTRUMENT
       
    }
    else
    {
      System.out.println
      ("Pattern string begins at character " + n);
      System.out.println ("Path is " + p);  // INSTRUMENT
    }
  }

  /**
    * Find index of pattern in subject string
    * 
    * @param subject String to search
    * @param pattern String to find
    * @return index (zero-based) of first occurrence of pattern in subject; -1 if not found
    * @throws NullPointerException if subject or pattern is null
    */
   public static int patternIndex (String subject, String pattern)
   {
      final int NOTFOUND = -1;
      int  iSub = 0, rtnIndex = NOTFOUND;
      boolean isPat  = false;
      int subjectLen = subject.length();
      int patternLen = pattern.length();

    p.addNode (1);    // INSTRUMENT
    p.addNode (2);    // INSTRUMENT

    while (isPat == false && iSub + patternLen - 1 < subjectLen)
    // Mutant A changes this to    "patternLen - 0"
    {
      p.addNode (3);    // INSTRUMENT
      p.addNode (4);    // INSTRUMENT
      if (subject.charAt (iSub) == pattern.charAt (0))
      {
        p.addNode (5);    // INSTRUMENT
        p.addNode (6);    // INSTRUMENT
        rtnIndex = iSub; // Starting at zero
        isPat = true;
        for (int iPat = 1; iPat < patternLen; iPat ++,
          p.addNode (6)    // INSTRUMENT
          )
	{
          p.addNode (7);    // INSTRUMENT
          if (subject.charAt (iSub + iPat) != pattern.charAt (iPat))
	  {
            rtnIndex = NOTFOUND;
            isPat = false; // Mutant B changes this to isPat = true
            p.addNode (8);    // INSTRUMENT
            break;  // out of for loop
          }
          p.addNode (9);    // INSTRUMENT
        }
      }
      p.addNode (10);    // INSTRUMENT
      iSub ++;
    }
    p.addNode (3);    // INSTRUMENT
    p.addNode (11);    // INSTRUMENT
    return (rtnIndex);
  }
}

/* Class to accumulate the path that was executed. */
/* Use addNode (x) to add node x to the path, in order. */
/* toString() simply prints the Vector, which prints */
/* with square brackets: [1, 2, ...] */
class Path
{  
   List<Integer> p;
   public Path ()
   {
      p = new ArrayList<Integer>();
   }

   public void addNode (int i)
   {
      p.add (i);
   }

   public String toString()
   {
      return p.toString();
   }
}
```

- **Kết quả**: Đạt được các đường dẫn kiểm thử như mong muốn của đề bài.
