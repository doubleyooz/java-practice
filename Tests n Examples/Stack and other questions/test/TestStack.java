package test;

import java.util.ArrayList;
import java.util.Arrays;

import src.algorithms.Stack;
import test.utils.Assert;

public class TestStack {

    private static Stack stack;

    private static boolean testPop(int expectedNumber) {
        try {
            Assert.assertEqual(expectedNumber, stack.pop(), "Stack top element");
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public static ArrayList<Boolean> testStackInstance() {

        ArrayList<Boolean> results = new ArrayList<Boolean>();

        stack = new Stack();

        // 0 The stack must have 10 positions
        results.add(Assert.assertEqual(stack.getArray().length, 10, "Stack length"));

        // 1 The stack must have the items [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        results.add(Assert.assertEqual(Arrays.toString(stack.getArray()),
                Arrays.toString(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }), "Stack getArray()"));

        // 2 The can't retrieves elements from an empty stack
        results.add(!testPop(-1));

        // 3 The stack top position must be -1
        results.add(Assert.assertEqual(-1, stack.top(), "Stack top position"));

        // 4 The stack top element must be 42
        stack.push(42);
        results.add(Assert.assertEqual(42, stack.getNext(), "Stack top element"));

        // 5 The stack top element must be 20
        stack.push(20);
        results.add(Assert.assertEqual(20, stack.getNext(), "Stack top element"));

        // 6 The stack top element must be 20
        results.add(Assert.assertEqual(20, stack.getNext(), "Stack top element"));

        // 7 The stack top element must be 20       
        results.add(testPop(20));
     
        // 8 The stack top must be 0
        results.add(Assert.assertEqual(0, stack.top(), "Stack top position"));


        // The stack must have empty positions
        results.add(Assert.assertEqual(false, stack.isFull(), "Stack isFull()"));

        results.add(testPop(42));

        results.add(Assert.assertEqual(-1, stack.top(), "Stack top position"));

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        // The stack top position must be 9
        results.add(Assert.assertEqual(9, stack.top(), "Stack top position"));

        // The stack must be full
        results.add(Assert.assertEqual(true, stack.isFull(), "Stack isFull()"));

        // The stack must have the items [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        results.add(Assert.assertEqual(Arrays.toString(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                Arrays.toString(stack.getArray()), "Stack getArray()"));

        // The stack top must not be 993
        stack.push(993);
        results.add(Assert.assertNotEqual(993, stack.getNext(), "Stack top"));

        return results;

    }
}