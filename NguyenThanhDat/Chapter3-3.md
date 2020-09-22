import org.junit.Test;
import static org.junit.Assert.*;

public class BoundedQueueTest
{
    /*
    *   Test case number: 1
    *   Test case values: push 2 and 5 into the queue
    *   Expected output: [2, 5]
    */
    @Test
    public void testEnqueue()
    {
        BoundedQueue q = new BoundedQueue(2);
        q.enqueue(1);
        q.enqueue(2);
        assertEquals("[2, 5]",q.toString());
    }

    /*
    *   Test case number: 2
    *   Test case values: push 1 and 2 into the queue, then pop the first item
    *   Expected output: [2, 3]
    */
    @Test
    public void testDequeue()
    {
        BoundedQueue q = new BoundedQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        assertEquals("[2, 3]",q.toString());
    }

    /*
    *   Test case number: 3
    *   Test case values: push 1, 2 and 3 into a queue with 2 spaces
    *   Expected output: throw IllegalStateException
    */
    @Test 
    public void testDequeue()
    {
        BoundedQueue q = new BoundedQueue(2);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        assertEquals("[2]",q.toString());
    }

    /*
    *   Test case number: 4
    *   Test case values: push null value into the queue
    *   Expected output: throw NullPointerException
    */
    @Test
    public void testNullPointerException()
    {
        BoundedQueue q = new BoundedQueue(2);
        q.enqueue(null);
        assertEquals("[2]",q.toString());
    }

    /*
    *   Test case number: 5
    *   Test case values: push 1 into a queue with 2 spaces, check if the queue is full
    *   Expected output: return false, the queue is not full
    */
    @Test
    public void testIsNotFull()
    {
        BoundedQueue q = new BoundedQueue(2);
        q.enqueue(1);
        assertEquals(false, q.isFull());
    }

    /*
    *   Test case number: 6
    *   Test case values: push 1 into a queue with 2 spaces, check if the queue is empty
    *   Expected output: return false, the queue is not empty
    */
    @Test
    public void testIsNotEmpty()
    {
        BoundedQueue q = new BoundedQueue(2);
        q.enqueue(2);
        assertEquals(false, q.isEmpty());	
    }

    /*
    *   Test case number: 7
    *   Test case values: push 1 and 2 into a queue with 2 spaces, check if the queue is full
    *   Expected output: return true, the queue is full
    */
    @Test
    public void testIsFull()
    {
        BoundedQueue q = new BoundedQueue(2);
        q.enqueue(1);
        q.enqueue(2);
        assertEquals(true, q.isFull());	
    }

    /*
    *   Test case number: 8
    *   Test case values: initialize a new queue, check if the queue is empty
    *   Expected output: return true, the queue is empty
    */
    @Test
    public void testIsEmpty()
    {
        BoundedQueue q = new BoundedQueue(2);
        assertEquals(true, q.isEmpty());	
    }


    /*
    *   Test case number: 9
    *   Test case values: initialize a new queue with negative spaces
    *   Expected output: throw IllegalArgumentException
    */
    @Test
    public void testIllegalArgumentException()
    {
        BoundedQueue q = new BoundedQueue(-3);
        q.enqueue(1);
        q.enqueue(2);
        assertEquals(false, q.isFull());	
    }

    /*
    *   Test case number: 10
    *   Test case values: push 1, 2, 3 into a queue, and pop 3 times, then push 5 into the queue
    *   Expected output: the current first item is 5
    */
    @Test
    public void testCurrentFirstItem()
    {
        BoundedQueue q = new BoundedQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(5);
        assertEquals(5, q.dequeue());
    }

    /*
    *   Test case number: 11
    *   Test case values: push 1, 2, 3, 4 into a queue, and pop 2 times, then push 5, 6 into the queue
    *   Expected output: the current state is [3, 4, 5, 6]
    */
    @Test
    public void testCurrentQueue()
    {
        BoundedQueue q = new BoundedQueue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.dequeue();
        q.enqueue(5);
        q.enqueue(6);
        assertEquals("[3, 4, 5, 6]", q.toString());
    }

    /*
    *   Test case number: 12
    *   Test case values: push 1, 2, 3 into a queue with 2 spaces
    *   Expected output: throw IllegalStateException
    */
    @Test
    public void testIllegalStateException1() 
    {
        BoundedQueue q = new BoundedQueue(2);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        assertEquals("[2, 3]", q.toString());
    }

/*
    *   Test case number: 13
    *   Test case values: push 1,2 into a queue with four spaces, check if empty twice
    *   Expected output: the state is [1, 2]
    */
    @Test 
    public void testEmptyQueue()
    {
        BoundedQueue q = new BoundedQueue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.isEmpty();
        q.isEmpty();
        assertEquals("[1, 2]", q.toString());
    }


    /*
    *   Test case number: 14
    *   Test case values: push 1,2 into a queue with 4 spaces, check if full twice, then add 3, 4
    *   Expected output: the state is [1, 2, 3, 4]
    */
    @Test
    public void testIsFullTwice()
    {
        BoundedQueue q = new BoundedQueue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.isFull();
        q.isFull();
        q.enqueue(3);
        q.enqueue(4);
        assertEquals("[1, 2, 3, 4]", q.toString());
    }

    /*
    *   Test case number: 15
    *   Test case values: push 1, 2, 3, 4 into a queue with 4 spaces, check if full 3 times
    *   Expected output: should return true when calling isFull() every time
    */
    @Test
    public void testIsAlwaysFull()
    {
        BoundedQueue q = new BoundedQueue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        assertEquals(true, q.isFull());
        assertEquals(true, q.isFull());
        assertEquals(true, q.isFull());
    }

}