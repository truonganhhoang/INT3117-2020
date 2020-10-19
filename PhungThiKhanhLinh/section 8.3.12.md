```GoodFastCheap.java```
```java
import java.util.*;

// GoodFastCheap: Investigating clause testing with an old engineering joke

public final class GoodFastCheap {

    boolean good  = false;
    boolean fast  = false;
    boolean cheap = false;

    public void makeGood () {
       good = true;
       if (fast && cheap) { cheap = false; }
    }

    public void makeFast () {
       fast = true; 
       if (good && cheap) { good = false; }
    }

    public void makeCheap () {
       cheap = true;
       if (fast && good) { fast = false; }
    }

    public void makeBad ()       { good = false; }
    public void makeSlow ()      { fast = false; }
    public void makeExpensive () { cheap = false; }

    public boolean isSatisfactory() {
       if ((good && fast) || (good && cheap) || (fast && cheap)) {
          return true;
       }
       return false;
    }
}
```

```GoodFastCheapMUMCUT.java```
```java
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class GoodFastCheapMUMCUT {

   // This test set achieves MUMCUT on the predicate in the isSatisfactory() 
   // method // inside the GoodFastCheap class.  All other predicates in 
   // GoodFastCheap are ignored by this test set

   // Comments show the test number and the values of good, fast, and cheap 
   // variables.  Test numbers are from the logic coverage tool on the book 
   // web site.   Using the DNF logic coverage tool on the book website, one 
   // can determine that 6 tests are needed to achieve MUMCUT namely, 
   // tests 2, 3, 4, 5, 6, and 7.   (Test 8 is the initial state, and so
   // is always reached, and Test 1 is infeasible - hence the engineering joke.


   GoodFastCheap gfc;

   @Before public void setUp() { 
       gfc = new GoodFastCheap();    // 8:  F F F
   }

   @Test public void test2() throws Exception { 
      gfc.makeGood();         // 4: T F F
      gfc.makeFast();         // 2: T T F
      assertTrue(gfc.isSatisfactory());
   }

   @Test public void test3() throws Exception { 
      gfc.makeGood();         // 4: T F F
      gfc.makeCheap();        // 3: T F T
      assertTrue(gfc.isSatisfactory());
   }

   @Test public void test4() throws Exception { 
      gfc.makeGood();         // 4: T F F
      assertFalse(gfc.isSatisfactory());
   }

   @Test public void test5() throws Exception { 
      gfc.makeFast();          // 6: F T F
      gfc.makeCheap();         // 5: F T T
      assertTrue(gfc.isSatisfactory());
   }

   @Test public void test6() throws Exception { 
      gfc.makeFast();         // 6: F T F
      assertFalse(gfc.isSatisfactory());
   }

   @Test public void test7() throws Exception { 
      gfc.makeCheap();         // 7: F F F
      assertFalse(gfc.isSatisfactory());
   }
}
```

```GoodFastCheapRACC.java```
```java
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class GoodFastCheapRACC {

   // This test set achieves RACC on the predicate in the isSatisfactory() method 
   // inside the GoodFastCheap class.  All other predicates in GoodFastCheap 
   // are ignored by this test set

   // Comments show the test number and the values of good, fast, and cheap 
   // variables.  Test numbers are from the logic coverage tool on the book 
   // web site.   Using the logic coverage tool on the book website, one 
   // can determine that there are various ways to achieve RACC with exactly 
   // four tests.  The tests in this JUnit implement one of these possibilities, 
   // namely, tests 2, 3, 4, 6.   Hence, the tests here are named reach2(), 
   // reach3(), reach4(), and reach6().


   GoodFastCheap gfc;

   @Before public void setUp() { 
       gfc = new GoodFastCheap();    // 8:  F F F
   }

   @Test public void test2() throws Exception { 
      gfc.makeGood();         // 4: T F F
      gfc.makeFast();         // 2: T T F
      assertTrue(gfc.isSatisfactory());
   }

   @Test public void test3() throws Exception { 
      gfc.makeGood();         // 4: T F F
      gfc.makeCheap();        // 3: T F T
      assertTrue(gfc.isSatisfactory());
   }

   @Test public void test4() throws Exception { 
      gfc.makeGood();         // 4: T F F
      assertFalse(gfc.isSatisfactory());
   }

   @Test public void test6() throws Exception { 
      gfc.makeFast();         // 6: F T F
      assertFalse(gfc.isSatisfactory());
   }
}
```

```GoodFastCheapRefactored.java```
```java
import java.util.*;

// GoodFastCheap: Investigating clause testing with an old engineering joke

public final class GoodFastCheapRefactored {

    boolean good  = false;
    boolean fast  = false;
    boolean cheap = false;

    public void makeGood () {
       good = true;
       if (fast && cheap) { cheap = false; }
    }

    public void makeFast () {
       fast = true; 
       if (good && cheap) { good = false; }
    }

    public void makeCheap () {
       cheap = true;
       if (fast && good) { fast = false; }
    }

    public void makeBad ()       { good = false; }
    public void makeSlow ()      { fast = false; }
    public void makeExpensive () { cheap = false; }

    public boolean isSatisfactory() {   // Refactoring here
       if (good && fast)  return true;
       if (good && cheap) return true;
       if (fast && cheap) return true;
       
       return false;
    }
}
```


