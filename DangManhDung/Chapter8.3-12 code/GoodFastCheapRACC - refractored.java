///java///

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class GoodFastCheapRACC {

   GoodFastCheap gfc;

   @Before public void setUp() { 
       gfc = new GoodFastCheap();    // 8:  F F F
   }

   @Test public void test1() throws Exception { 
      gfc.makeGood();         // 4: T F F
      gfc.makeFast();         // 2: T T F
	  gfc.makeCheap();        // 1: T T T
      assertTrue(gfc.isSatisfactory());
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
      gfc.makeFast();         // 4: F T F
      gfc.makeCheap();        // 5: F T T
      assertTrue(gfc.isSatisfactory());
   }

   @Test public void test6() throws Exception { 
      gfc.makeFast();         // 6: F T F
      assertFalse(gfc.isSatisfactory());
   }
   @Test public void test7() throws Exception { 
      gfc.makeCheap();         // 7: F F T
      assertFalse(gfc.isSatisfactory());
   }
}
