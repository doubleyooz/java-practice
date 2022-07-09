package test;

import java.util.ArrayList;
import java.util.Arrays;

import src.algorithms.Stack;
import test.utils.Assert;

public class TestStack {

    private static Stack stack;

    private static boolean testGetEmptyStackTop() {
        try {
            Assert.assertEqual(stack.getNext(), -1, "Stack top");
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            return true;
        }
    }

    public static String testStackInstance() {

        ArrayList<Boolean> results = new ArrayList<Boolean>();

        stack = new Stack();

        // The stack must have 10 positions
        results.add(Assert.assertEqual(stack.getArray().length, 10, "Stack length"));

        // The stack must have the items [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        results.add(Assert.assertEqual(Arrays.toString(stack.getArray()),
                Arrays.toString(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }), "Stack getArray()"));

        // The can't retrieves elements from an empty stack
        results.add(testGetEmptyStackTop());

        // The stack top position must to be -1
        results.add(Assert.assertEqual(stack.getTop(), -1, "Stack top position"));
        

        // The stack top element must to be 42
        stack.push(42);
        results.add(Assert.assertEqual(stack.getNext(), 42, "Stack top element"));

        // The stack top element must to be 20
        stack.push(20);
        results.add(Assert.assertEqual(stack.getNext(), 20, "Stack top element"));

        // The stack top element must not be 42
        stack.pop();
        results.add(Assert.assertEqual(stack.getNext(), 42, "Stack top element"));

        // The stack top must to be -1
        stack.pop();
        results.add(testGetEmptyStackTop());

        // The stack must have empty positions
        results.add(Assert.assertEqual(stack.isFull(), false, "Stack isFull()"));

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        // The stack top position must to be 9
        results.add(Assert.assertEqual(stack.getTop(), 9, "Stack top position"));
        

        // The stack must be full
        results.add(Assert.assertEqual(stack.isFull(), true, "Stack isFull()"));

        // The stack must have the items [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        results.add(Assert.assertEqual(Arrays.toString(stack.getArray()),
                Arrays.toString(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }), "Stack getArray()"));

        // The stack top must not be 993
        stack.push(993);
        results.add(Assert.assertNotEqual(stack.getNext(), 993, "Stack top"));

        return results.toString();

    }
}