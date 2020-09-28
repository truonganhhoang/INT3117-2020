## Câu 3: Viết hàm JUnit
```java
public class BoundedQueueTest
{

/*
 *   Test case number: 1
 *   Test case values: push 1 and 2 into the queue
 *   Expected output (Post-state): [1, 2]
 */
	@Test
	public void test1()
	{
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(1);
		q.enqueue(2);
		//Object i = q.dequeue();
		assertEquals("[1, 2]",q.toString());
	}

/*
 *   Test case number: 2
 *   Test case values: push 1 and 2 into the queue, then pop the first item
 *   Expected output (Post-state): [2]
 */
	@Test
		public void test2()
	{
		// TODO Auto-generated method stub
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(1);
		q.enqueue(2);
		Object i = q.dequeue();
		assertEquals("[2]",q.toString());
		
	}
	
/*
 *   Test case number: 3
 *   Test case values: push 1, 2 and 3 into a queue with 2 spaces
 *   Expected output (Post-state): throw IllegalStateException
 */
	@Test (expected=IllegalStateException.class)
			public void test3()
	{
		
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		Object i = q.dequeue();
		Object j = q.dequeue();
		Object k = q.dequeue();
		assertEquals("[2]",q.toString());
	}

/*
 *   Test case number: 4
 *   Test case values: push null value into the queue
 *   Expected output (Post-state): throw NullPointerException
 */
	@Test (expected=NullPointerException.class)
	public void test4()
	{
		
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(null);

		assertEquals("[2]",q.toString());
	}
	
/*
 *   Test case number: 5
 *   Test case values: push 1 into a queue with 2 spaces, check if the queue is full
 *   Expected output (Post-state): return false, the queue is not full
 */
	@Test
		public void test5()
	{
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(1);
		assertEquals(false, q.isFull());	
	}
	
/*
 *   Test case number: 6
 *   Test case values: push 1 into a queue with 2 spaces, check if the queue is empty
 *   Expected output (Post-state): return false, the queue is not empty
 */	
	@Test
			public void test6()
	{
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(1);
		assertEquals(false, q.isEmpty());	
	}

	
/*
 *   Test case number: 7
 *   Test case values: initialize a new queue, check if the queue is empty
 *   Expected output (Post-state): return true, the queue is empty
 */	
	@Test
				public void test7()
	{
		BoundedQueue q = new BoundedQueue(2);
		assertEquals(true, q.isEmpty());	
	}

```