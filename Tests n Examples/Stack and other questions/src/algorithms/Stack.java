package src.algorithms;

import src.interfaces.Pilha_IF;

public class Stack implements Pilha_IF {

    private int array[] = new int[10];

    // top just refers to index of the top position
    private int top = -1;

    public void push(int element) {
        if (!isFull()) {
            array[++top] = element;
        }
    }

    public int pop() throws Exception {
        if(isEmpty())
            return array[top];
        return array[top--];

    }

    public int getNext() throws ArrayIndexOutOfBoundsException {
        return array[top];
    }

    public int top() {
        return top;
    }

    public boolean isFull() {
        return top >= array.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int[] getArray() {
        return array;
    }

}