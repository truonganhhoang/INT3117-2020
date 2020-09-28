# The restriction on interleaving next() and remove() calls is quite complex. The JUnit tests in IteratorTest.java only devote one test for this situation, which may not be enough. Refine the input domain model with one or more additional characteristics to probe this behavior, and implement these tests in JUnit.

```java
// Test remove(): testRemove_C2(): C1-F, C2-T, C3-T, C4-T, C5-T
@Test 
public void testRemove_C2()
{
   list.add(null);
   list.add(pig);
   itr = list.iterator();
   itr.next(); // consume the cat
   itr.remove(); // remove cat from list
   itr.next(); // consume null
   itr.remove(); // remove null from list; list is not empty
   assertFalse (list.contains (null));
}
```