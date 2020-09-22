# Exercises

## 1. Why do testers automate tests? What are the limitations of automation?

Automation testing provide tremendous aids for testers in various domain, the main purpose of automating to avoid having to manually repeat the same testing tasks by delegating them to the computer. The weakness of automation is the limitations of the computer itself, it is not a human, so it can't make creative decision or validate any kind of un-accounted output even if it is reasonable; Such as infeasible paths, test case generation, internal variables, etc..

## 2. Give a one or two paragraph explanation for how the inheritance hierarchy can affect controllability and observability

Testing could become rigid if your system's inheritance hierarchy is too deep, because the sub classes are tied in with its parent, meaning, if the super class is changed, all of its children are affected, which means you have to update all of the affected test of the sub-classes and their sub-classes, and so on.. as well. Therefore, rigid inheritance is condemned because they will affect controllability and observability

##3. Develop JUnit tests for the BoundedQueue class

```java
package com.testing.maven.quickstart;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class BoundedQueueTest {
	
	private BoundedQueue queue;



	@BeforeEach
	public void setUp() {
		this.queue = new BoundedQueue(3);
	}
	
	@Test
	public void testEmptyQueue() {
		Assertions.assertTrue(this.queue.isEmpty());
	}
	
	@Test
	public void testEnqueue() {
		String newElement = "Hi, I am new";
		this.queue.enQueue(newElement);
		Assertions.assertFalse(queue.isEmpty());
	}
	
	@Test
	public void testDequeue() {
		String newElement = "Hi, I am new";
		this.queue.enQueue(newElement);
		Assertions.assertEquals(newElement, this.queue.deQueue());
	}
	
	@Test
	public void testFullQueue() {
		String el1, el2, el3;
		el1 = "I'm first";
		el2 = "I'm second";
		el3 = "I'm third";
		
		this.queue.enQueue(el1);
		this.queue.enQueue(el2);
		Assertions.assertFalse(this.queue.isFull());
		
		this.queue.enQueue(el3);
		Assertions.assertTrue(this.queue.isFull());
	}
	
	@Test
	public void testToString() {
		String el1, el2, el3;
		el1 = "I'm first";
		el2 = "I'm second";
		el3 = "I'm third";
		
		this.queue.enQueue(el1);
		this.queue.enQueue(el2);
		this.queue.enQueue(el3);
		
		Assertions.assertEquals("[I'm first, I'm second, I'm third]", this.queue.toString());
	}
}
```

## 4. Delete the explicit throw of NullPointerException in the Min program. Verify that the JUnit test for a list with a single null element now fails

```java
public class MinTest {
/**
* Test of min method, of class Min.
*/
    @Test(expected = NullPointerException.class)
    public void testMin() {
        System.out.println("min");
        List list = new ArrayList();
        list.add(null);
        Object result = Min.min(list);
    }
}
```

## 6. Prime number

### a. A test that does not reach the fault

```java
@Test
 void testComputePrimesA() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(0);
 
     assertEquals("[]", primeNumbers.toString());
     // it never enters the while loop
 }
```

### b. A test that reaches the fault, but does not infect

```java
@Test
 void testComputePrimesB() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(7);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17]",
          primeNumbers.toString());
 }
```

### c. A test that infects the state, but does not propagate

```java
@Test
 void testComputePrimesC() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", 
         primeNumbers.toString());
     // it is affected because it doesn't include 19
}
```

### d. A test that propagates, but does not reveal

This test is not possible because the faults starts at the 19 (we’re not taking in consideration 9, because it is not prime), all of subsequent primes that ends in ‘9’ won’t be in the result value.

### e. A test that reveals the fault

```java
@Test
 void testComputePrimesE() {
     PrimeNumbers primeNumbers = new PrimeNumbers();
     primeNumbers.computePrimes(8);
 
     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]",
         primeNumbers.toString());
 }
```

## 9. When overriding the equals() method, programmers are also required to override the hashCode() method; otherwise clients cannot store instances of these objects in common Collection structures such as HashSet. For example, the Point class from Chapter 1 is defective in this regard.

### a. Demonstrate the problem with Point using a HashSet.

```java
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2); // note that p1.equals(p2)
Set<Point> s = new HashSet<Point>();
s.add(p1);
boolean b = s.contains(p2); // we want b to be true!
```

While it possible that b is true, it is far more likely that the two Point objects hash to
different buckets, in which case b is false

### b. Write down the mathematical relationship required between equals() and hashCode().

```java
For a detailed explanation, see Bloch’s Effective Java, Second edition, Item 9. The relationship is: if two objects are considered equal (as determined by the equals() method), then they must have the same hash codes (as determined by the hashCode() method). Note that the inverse is not true: it is perfectly fine for unequal objects to share a hash code. See Bloch Item 9 for extensive guidance on implementing good hash codes.
```

### c. Write a simple JUnit test to show that Point objects do not enjoy this property.

```java
@Test public void hashConsistentWithEquals() {
  Point p1 = new Point(1,2);
  Point p2 = new Point(1,2);
assertTrue("Hash codes must match", p1.hashCode() == p2.hashCode());
}
```

### d. Repair the Point class to fix the fault.

```java
@Override public int hashCode() {
  int result = 17;
  result = 31 * result + x;
  result = 31 * result + y;
  return result;
}
```

### e. Rewrite your JUnit test as an appropriate JUnit theory. Evaluate it with suitable DataPoints.

```java
@Theory public void hashConsistentWithEqualsTheory(Object o1, Object o2) {
  assumeTrue(o1 != null);
  assumeTrue(o2 != null);
  assumeTrue(o1.equals(o2));
  assertTrue("Hash codes must match", o1.hashCode() == o2.hashCode());
}
@DataPoints public static Object[] objects = {
  new Point(1,2), new Point(1,2), new Point(1,3), "ant", null
};
```
