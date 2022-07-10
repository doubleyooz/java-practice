package test;

import java.util.ArrayList;
import java.util.Arrays;

import src.algorithms.Queue;
import test.utils.Assert;

public class TestQueue {

    private static Queue queue;
    private static ArrayList<Boolean> results = new ArrayList<Boolean>();
    private final static int queueSize = 10;

    private static boolean testGetEmptyQueueHead() {
        try {
            Assert.assertEqual(queue.getNext(), -1, "queue head");
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            return true;
        }
    }

    public static ArrayList<Boolean> testQueueInstance() {

        queue = new Queue();

        // The queue must have 10 positions
        results.add(Assert.assertEqual(10, queue.getArray().length, "queue length"));

        // The queue must have the items [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        results.add(Assert.assertEqual(Arrays.toString(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }),
                Arrays.toString(queue.getArray()), "queue getArray()"));

        // The can't retrieves elements from an empty queue
        results.add(testGetEmptyQueueHead());

        // The queue head position must be -1
        results.add(Assert.assertEqual(-1, queue.getHead(), "queue head position"));

        // The queue tail position must be -1
        results.add(Assert.assertEqual(-1, queue.getTail(), "queue head position"));

        // The queue head element must be 42
        queue.enqueue(42);
        results.add(Assert.assertEqual(42, queue.getNext(), "queue head element"));

        // The queue head and tail must be same
        results.add(Assert.assertEqual(queue.getTail(), queue.getHead(),
                "queue head position should be equal to queue tail position"));

        ensureEnqueue(20);

        // The queue head element must not be 42
        ensureDequeue(20);

        // The queue head must be -1
        ensureDequeue(8978978);

        for (int i = 0; i < queueSize + 2; i++) {
            ensureEnqueue(i);
        }

        // The queue must have the items [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        results.add(Assert.assertEqual(Arrays.toString(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                Arrays.toString(queue.getArray()), "queue getArray()"));

        ensureEnqueue(993);

        dequeueNElements(queueSize);
        enqueueNElements(queueSize);

        dequeueNElements(5);
        enqueueNElements(5);
        dequeueNElements(4);
        enqueueNElements(4);

        System.out.println(Arrays.toString(queue.getArray()));

        return results;

    }

    private static void dequeueNElements(int n) {
        for (int i = 1; i <= n; i++) {
            ensureDequeue(ensureLoop(1 + queue.getHead()));
        }
    }

    private static int ensureLoop(int index) {

        if (index + 1 > queueSize) {
            return index - queueSize;
        }
        return index;
    }

    private static void enqueueNElements(int n) {
        for (int i = 0; i < n; i++) {
            ensureEnqueue(i);
        }
    }

    private static void ensureEnqueue(int newTail) {
        int headPosition = queue.getHead();
        int tailPosition = queue.getTail();
        int queueSize = queue.getSize();
        int previousTail;

        switch (queueSize) {
            case 0:
                queue.enqueue(newTail);

                // The queue tail element must be newTail
                results.add(Assert.assertEqual(newTail, queue.getLast(), "queue tail element"));

                // The queue tail position must not be same as before
                results.add(Assert.assertNotEqual(tailPosition, queue.getTail(), "queue tail position"));

                // The queue head position must not be same as before
                results.add(Assert.assertNotEqual(headPosition, queue.getHead(), "queue head position"));

                // The queue head position must be 0
                results.add(Assert.assertEqual(0, queue.getHead(), "queue head position"));

                break;
            case 10: // queue max size
                previousTail = queue.getLast();
                queue.enqueue(newTail);

                // The queue tail element must not be newTail
                results.add(Assert.assertNotEqual(newTail, queue.getLast(), "queue tail element"));

                // The queue tail element must be previousTail
                results.add(Assert.assertEqual(previousTail, queue.getLast(), "queue tail element"));

                // The queue tail position must be same as before
                results.add(Assert.assertEqual(tailPosition, queue.getTail(), "queue tail position"));

                // The queue head position must be same as before
                results.add(Assert.assertEqual(headPosition, queue.getHead(), "queue head position"));
                break;
            default:
                previousTail = queue.getLast();
                queue.enqueue(newTail);

                // The queue tail element must not be previousTail
                results.add(Assert.assertNotEqual(previousTail, queue.getLast(), "queue tail element"));

                // The queue tail element must be newTail
                results.add(Assert.assertEqual(newTail, queue.getLast(), "queue tail element"));

                // The queue tail position must not be same as before
                results.add(Assert.assertNotEqual(tailPosition, queue.getTail(), "queue tail position"));

                // The queue head position must be same as before
                results.add(Assert.assertEqual(headPosition, queue.getHead(), "queue head position"));

                break;
        }

    }

    private static void ensureDequeue(int nextHead) {
        int headPosition = queue.getHead();
        int tailPosition = queue.getTail();
        int queueSize = queue.getSize();
        int previousHeadElement = queue.getNext();

        switch (queueSize) {
            case 0:
                // The queue head element must not be the previous headElement
                results.add(testGetEmptyQueueHead());

                // The queue tail position must not be same as before
                results.add(Assert.assertNotEqual(tailPosition, queue.getTail(),
                        "queue tail position"));

                // The queue head position must not be same as before
                results.add(Assert.assertNotEqual(headPosition, queue.getHead(),
                        "queue head position"));

                // The queue head position must be -1
                results.add(Assert.assertEqual(-1, queue.getHead(),
                        "queue head position"));

                // The queue tail position must be -1
                results.add(Assert.assertEqual(-1, queue.getTail(),
                        "queue tail position"));

                // The queue must have empty positions
                results.add(Assert.assertEqual(false, queue.isFull(), "queue isFull()"));

                break;
            case 1:
                queue.dequeue();
                // The queue head element must not be the previous headElement
                results.add(testGetEmptyQueueHead());

                // The queue tail position must not be same as before
                results.add(Assert.assertNotEqual(tailPosition, queue.getTail(),
                        "queue tail position"));

                // The queue head position must not be same as before
                results.add(Assert.assertNotEqual(headPosition, queue.getHead(),
                        "queue head position"));

                // The queue head position must be -1
                results.add(Assert.assertEqual(-1, queue.getHead(),
                        "queue head position"));

                // The queue tail position must be -1
                results.add(Assert.assertEqual(-1, queue.getTail(),
                        "queue tail position"));

                // The queue must have empty positions
                results.add(Assert.assertEqual(false, queue.isFull(), "queue isFull()"));

                break;
            default:
                queue.dequeue();
                // The queue head element must not be the previous headElement
                results.add(Assert.assertNotEqual(previousHeadElement, queue.getNext(),
                        "queue head element"));

                // The queue head element must be equal to the nextHead
                results.add(Assert.assertEqual(nextHead, queue.getNext(),
                        "queue head element"));

                // The queue tail position must be same as before
                results.add(Assert.assertEqual(tailPosition, queue.getTail(),
                        "queue tail position"));

                // The queue head position must not be same as before
                results.add(Assert.assertNotEqual(headPosition, queue.getHead(),
                        "queue head position"));

                // The queue must have empty positions
                results.add(Assert.assertEqual(false, queue.isFull(), "queue isFull()"));

                break;
        }

    }

}