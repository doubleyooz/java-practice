package src.algorithms;

public class Stack {

    private int array[] = new int[10];

    // top just refers to index of the top position
    private int top = -1;

    public void push(int element) {
        if (!isFull()) {
            array[++top] = element;
        }
    }

    public void pop() {
        if (top > -1)
            top--;

    }

    public int getNext() throws ArrayIndexOutOfBoundsException {
        return array[top];
    }

    public int getTop(){
        return top;
    }

    public boolean isFull(){
        return top >= array.length - 1;
    }

    public int[] getArray() {
        return array;
    }

}