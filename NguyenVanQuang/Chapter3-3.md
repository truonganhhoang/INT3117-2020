Câu 3 :
package com.testing.maven.quickstart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoundedQueueTest {

    private BoundedQueue queue;

    @BeforeEach
    public void setUp() {
        this.queue = new BoundedQueue(10);
    }

    @Test
    // kiem tra ham them phan tu
    public void testEmptyQueue() {
        Assertions.assertTrue(this.queue.isEmpty());    // khang dinh rang dieu kien duoc cung cap la dung
    }

    @Test
    // kiem tra hàm xoa phan tu
    public void testEnqueue() {
        String newElement = "10";
        this.queue.enQueue(newElement);
        Assertions.assertFalse(queue.isEmpty());    // khang dinh rang dieu kien duoc cung cap la khong dung
    }

    @Test
    public void testDequeue() {
        String newElement = "10";
        this.queue.enQueue(newElement);
        Assertions.assertEquals(newElement, this.queue.deQueue());  // cac canh bao mong doi va thuc te la ngang nhau
    }

    @Test
    public void testFullQueue() {
        String x, y, z;
        x = "10";
        y = "11";
        z = "12";

        this.queue.enQueue(x);
        this.queue.enQueue(y);
        Assertions.assertFalse(this.queue.isFull());

        this.queue.enQueue(z);
        Assertions.assertTrue(this.queue.isFull());
    }

    @Test
    // kiem tra ham toString
    public void testToString() {
        String x, y, z;
        x = "10";
        y = "11";
        z = "12";

        this.queue.enQueue(x);
        this.queue.enQueue(y);
        this.queue.enQueue(z);

        Assertions.assertEquals("[10, 11, 12]", this.queue.toString());
    }
}