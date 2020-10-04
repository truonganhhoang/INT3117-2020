```java
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class IteratorTest {
	
   private List<String> list;         
   private Iterator<String> itr;       

   @Before public void setUp()         
   {      
      list = new ArrayList<String>();
      list.add ("cat");
      list.add ("dog");
      itr = list.iterator();
   }


   // 3 kiểm tra cho phương thức hasNext()T
   
   // Test 1 kiểm tra hasNext(): testHasNext_BaseCase():  C1-T, C5-T
   @Test public void testHasNext_BaseCase()
   {
      assertTrue (itr.hasNext()); 
   }
   
   // Test 2 kiểm tra hasNext(): testHasNext_C1(): C1-F, C5-T 
   @Test public void testHasNext_C1()
   {
      itr.next(); itr.next();        // consume the cat and the dog
      assertFalse (itr.hasNext());    // now empty
   }
   
   // Test 3 kiểm tra hasNext(): testHasNext_C5(): C1-T, C5-F
   // Kiểm tra này thất bại
   @Test(expected=ConcurrentModificationException.class)
   public void testHasNext_C5() 
   {
      list.add ("elephant");
      itr.hasNext();
   }
   
   
   // 4 kiểm tra sau kiểm tra phương thức next() 
   
   // Test 1 kiểm tra next(): testNext_BaseCase(): C1-T, C2-T, C5-T
   @Test public void testNext_BaseCase()
   {
      assertEquals ("cat", itr.next());
   }
   
   // Test 2 kiểm tra next(): testNext_C1(): C1-F, C2-F, C5-T
   @Test(expected=NoSuchElementException.class)
   public void testNext_C1()
   {
      itr.next(); itr.next();        // consume the cat and the dog
      itr.next();                    // now empty
   }
   
   // Test 3 kiểm tra next(): testNext_C2(): C1-T, C2-F, C5-T
   @Test public void testNext_C2()
   {
      list = new ArrayList<String>();
      list.add (null);
      itr = list.iterator();
      assertNull (itr.next());
   }
   
   // Test 4 kiểm tra next(): testNext_C5(): C1-T, C2-F, C5-F
   @Test(expected=ConcurrentModificationException.class)
   public void testNext_C5()  
   {
      list.add ("elephant");
      itr.next();      
   }
   
   
   // 6 kiểm tra dưới đây kiểm tra phương thức remove() 
  
   // Test 1 kiểm tra remove(): testRemove_BaseCase(): C1-T, C2-T, C3-T, C4-T, C5-T
   @Test public void testRemove_BaseCase()
   {
      itr.next();
      itr.remove();
      assertFalse (list.contains ("cat"));
   }
   
   // Test 2 kiểm tra remove(): testRemove_C1(): C1-F, C2-F, C3-T, C4-T, C5-T
   @Test public void testRemove_C1()
   {
      itr.next(); itr.next();        // consume the cat and the dog
      itr.remove();                  // remove dog from list.
      assertFalse (list.contains ("dog"));
   }
   
   // Test 3 kiểm tra remove(): testRemove_C2(): C1-T, C2-F, C3-T, C4-T, C5-T
   @Test public void testRemove_C2()
   {
      list.add (null);
      list.add ("elephant");
      itr = list.iterator();
      itr.next(); itr.next();        // consume the cat and the dog
      itr.next();        // consume null; iterator not empty
      itr.remove();      // remove null from list
      assertFalse (list.contains (null));
   }
   
   // Test 4 kiểm tra remove(): testRemove_C3(): C1-T, C2-T, C3-F, C4-T, C5-T
   @Test(expected=UnsupportedOperationException.class)
   public void testRemove_C3()
   {
      list = Collections.unmodifiableList (list);
      itr = list.iterator();
      itr.next();   // consume first element to make C4 true
      itr.remove();
   }
   
   // Test 5 kiểm tra remove(): testRemove_C4(): C1-T, C2-T, C3-T, C4-F, C5-T
   @Test (expected=IllegalStateException.class)
   public void testRemove_C4()
   {
      itr.remove();
   }
      
      
   // Test 6 kiểm tra next(): testRemove_C5(): C1-T, C2-T, C3-T, C4-T, C5-F
   @Test (expected=ConcurrentModificationException.class)
   public void testRemove_C5()
   {
      itr.next();
      list.add ("elephant");
      itr.remove();
   }

}