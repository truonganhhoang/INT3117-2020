# Câu 1: Thay đổi miền giá trị đầu vào và áp dụng vào ca kiểm thử JUnit trong IteratorTest.java
```java
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class IteratorTest {
    
    private List<String> list;
    private Iterator<String> itr;
    
    @Before
    public void setUp() {
        list = new ArrayList<String> ();
        
        list.add("cat");
        list.add("dog");
        
        itr = list.iterator();
    }
    @Test 
    public void testHasNext_BaseCase(){
        assertTrue(itr.hasNext());
        }
        
        //Test case for Ex6.4-2
        @Test (expected = ConcurrentModificationException.class)
        public void LesLRemove C5(){
            itr.next();
            list.set(0, "horse");
            itr.remove();
        }
}
```