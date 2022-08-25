package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    // TODO-Lab2.6: create a Queue test fixture reference
    Queue<Customer> queue;
    @Before
    public void setUp() throws Exception {
        // TODO-Lab2.6: instantiate the queue test fixture
        queue = new Queue<>();
        // TODO-Lab2.6: populate with one customer object
        queue.enqueue(new Customer(1, "Ken", 100000));
    }

    // TODO-Lab2.6: design and implement positive and negative tests and give them decent names

    @Test
    public void enqueue() {
        String expected = "Ken";
        String expectedTest = "Eric Flores";

        queue.enqueue(new Customer(2, expectedTest, 1000));
        String actual = queue.dequeue().getName();
        System.out.println(actual);
        assertEquals(expected, actual);
        actual = queue.dequeue().getName();
        System.out.println(actual);
        assertEquals(expectedTest, actual);
    }

    @Test
    public void dequeue() {
    }

    @Test
    public void emptyQueue(){
        queue = null;
        assertNull(queue);
    }
}