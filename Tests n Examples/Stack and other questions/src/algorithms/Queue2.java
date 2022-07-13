package src.algorithms;

import java.util.Arrays;
import src.interfaces.Fila_IF;

public class Queue2 implements Fila_IF {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    private int size = 0;

    public void enqueue(int element) {
        stack1.push(element);
        size++;
    }

    public int dequeue() throws Exception {
        ensureQueue();
       
        int temp = stack2.pop();
        // System.out.printf("%d != %d\n", temp, stack2.top());
        size--;
        return temp;
    }

    @Override
    public int head() throws Exception {
        ensureQueue();
        return stack2.top();
    }

    public int getSize() {
        return size;
    }

    public int[] getArray() throws Exception {
        ensureQueue();
        if (stack2.isEmpty()) 
            return new int[0];        

        return stack2.getArray();

    }

    public int getLast() throws Exception {
        ensureQueue();

        if (stack2.isEmpty()) 
            throw new Exception("Cannot get the last element from an empty queue");

        
        int[] temp = stack2.getArray();
        System.out.println(Arrays.toString(temp));

        return temp[temp.length - 1];

    }

    @Override
    public boolean isEmpty() {
        return stack2.isEmpty() && stack2.isEmpty();
    }

    @Override
    public boolean isFull() {
        return stack1.isFull() || stack2.isFull();
    }

    private void ensureQueue() throws Exception {
        if (!stack1.isEmpty()) {

            while (stack1.getTopIndex() > -1) {

                stack2.push(stack1.pop());

            }
        }
    }
}
