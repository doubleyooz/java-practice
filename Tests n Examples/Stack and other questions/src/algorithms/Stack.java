package src.algorithms;

import java.util.Arrays;
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

    public int top() throws ArrayIndexOutOfBoundsException {
        return array[top];
    }

    public int getTopIndex() {
        return top;
    }

    public boolean isFull() {
        return top >= array.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int[] getArray() {
        if(top == -1)
            return new int[0];
        
        return Arrays.copyOfRange(array, 0, top+1);
    }

}