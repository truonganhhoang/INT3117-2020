3.
```java
package com.testing.maven.quickstart;

import org.junit.Assert;
import org.junit.Test;

class BoundedQueueTest {

	private BoundedQueue queue;

	@BeforeEach
	public void setUp() {
		this.queue = new BoundedQueue(3);
	}

	@Test
	public void testEmptyQueue() {
		Assert.assertTrue(this.queue.isEmpty());
	}
	
	@Test
	public void testEnqueue() {
		String newElement = "Run tests";
		this.queue.enQueue(newElement);
		Assert.assertFalse(queue.isEmpty());
	}
	
	@Test
	public void testDequeue() {
		String newElement = "Run tests";
		this.queue.enQueue(newElement);
		Assert.assertEquals(newElement, this.queue.deQueue());
	}
	
	@Test
	public void testFullQueue() {
		String el1, el2, el3;
		el1 = "The first test";
		el2 = "The second test";
		el3 = "The third test";
		
		this.queue.enQueue(el1);
		this.queue.enQueue(el2);
		Assert.assertFalse(this.queue.isFull());
		
		this.queue.enQueue(el3);
		Assert.assertTrue(this.queue.isFull());
	}
	
	@Test
	public void testToString() {
		String el1, el2, el3;
		el1 = "The first test";
		el2 = "The second test";
		el3 = "The third test";
		
		this.queue.enQueue(el1);
		this.queue.enQueue(el2);
		this.queue.enQueue(el3);
		
		Assert.assertEquals("[The first test, The second test, The third test]", this.queue.toString());
	}
}
```