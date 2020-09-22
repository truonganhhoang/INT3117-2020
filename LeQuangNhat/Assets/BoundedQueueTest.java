package Assets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoundedQueueTest {
  private BoundedQueue queue;

  @Before
  public void setUp() {
    this.queue = new BoundedQueue(5);
  }

  @After
  public void after() {
    queue = null;
  }

  @Test
  public void testEnQueue() {
    String temp = "Test String";
    queue.enQueue(temp);
    assertFalse(queue.isEmpty());
  }

  @Test
  public void testDeQueue() {
    String temp = "Test String";
    queue.enQueue(temp);
    assertEquals(temp, queue.deQueue());
  }

  @Test
  public void testIsEmpty() {
    assertTrue(queue.isEmpty());
  }

  @Test
  public void testIsFull() {
    String temp1 = "Test String 1";
    String temp2 = "Test String 2";
    String temp3 = "Test String 3";
    String temp4 = "Test String 4";
    String temp5 = "Test String 5";

    queue.enQueue(temp1);
    queue.enQueue(temp2);
    queue.enQueue(temp3);
    assertFalse(queue.isFull());
    queue.enQueue(temp4);
    queue.enQueue(temp5);
    assertTrue(queue.isFull());
  }

  @Test
  public void testToString() {
    String eval = "[Test String 1, Test String 2, Test String 3]";
    String temp1 = "Test String 1";
    String temp2 = "Test String 2";
    String temp3 = "Test String 3";
    queue.enQueue(temp1);
    queue.enQueue(temp2);
    queue.enQueue(temp3);
    assertEquals(eval, queue.toString());
  }
}
