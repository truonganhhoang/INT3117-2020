
9.	When overriding the equals() method, programmers are also required to override the hashCode() method; otherwise clients cannot store instances of these objects in common Collection structures such as HashSet. For example, the Point class from Chapter 1 is defective in this regard.

a.	Demonstrate the problem with Point using a HashSet.
Solution:
	Point p1 = new Point(1, 2);
	Point p2 = new Point(1, 2); // note that p1.equals(p2)
	Set<Point> s = new HashSet<Point>();
	s.add(p1);
	boolean b = s.contains(p2); // we really want b to be true!

-	While it possible that b is true, it is far more likely that the two Point objects hash to
different buckets, in which case b is false.

b.	Write down the mathematical relationship required between equals() and hashCode().

-	For a detailed explanation, see Bloch’s Effective Java, Second edition, Item 9. The relationship is: if two objects are considered equal (as determined by the equals() method), then they must have the same hash codes (as determined by the hashCode() method). Note that the inverse is not true: it is perfectly fine for unequal objects to share a hash code. See Bloch Item 9 for extensive guidance on implementing good hash codes.

c.	Write a simple JUnit test to show that Point objects do not enjoy this property.
Solution:

	@Test public void hashConsistentWithEquals() {
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		assertTrue("Hash codes must match", p1.hashCode() == p2.hashCode());
	} 
d.	Repair the Point class to fix the fault. Solution:

	@Override public int hashCode() {
		int result = 17;
		result = 31 * result + x;
		result = 31 * result + y;
		return result;
	}

e.	Rewrite your JUnit test as an appropriate JUnit theory. Evaluate it with suitable DataPoints. Solution:

	@Theory public void hashConsistentWithEqualsTheory(Object o1, Object o2) {
		assumeTrue(o1 != null);
		assumeTrue(o2 != null);
		assumeTrue(o1.equals(o2));
		assertTrue("Hash codes must match", o1.hashCode() == o2.hashCode());
	}

	@DataPoints public static Object[] objects = {
		new Point(1,2), new Point(1,2), new Point(1,3), "ant", null
	};
