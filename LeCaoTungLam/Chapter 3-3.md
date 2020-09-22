3.	Develop JUnit tests for the BoundedQueue class
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
