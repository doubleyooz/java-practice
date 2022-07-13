package src.algorithms;

import src.interfaces.Fila_IF;

public class Queue implements Fila_IF {

    private int array[] = new int[10];
    private int arraySize = array.length - 1;

    // size just refers to index of the size position
    private int head = -1, tail = -1, size = 0;

    private int ensureLoop(int index) {

        if (index + 1 > array.length) {
            return index - array.length;
        }
        return index;
    }

    public void enqueue(int element) {
        if (!isFull()) {
            tail = ensureLoop(tail + 1);
            head = head == -1 ? ++head : head;

            array[tail] = element;
            size++;
        }
    }

    public int dequeue() {
        if (head == tail) {
            int temp = head;
            head = -1;
            tail = -1;
            size--;
            return array[temp];
        }
        if (head + 1 > arraySize) {
            head = 0;
            size--;
            return array[arraySize];
        }
        size--;
        return array[head++];

    }

    public int getNext() throws ArrayIndexOutOfBoundsException {
        return array[head];
    }

    public int getLast() throws ArrayIndexOutOfBoundsException {

        return array[tail];
    }

    public int head() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    public int getSize(){
        return size;
    }

    public boolean isFull() {
        return size > arraySize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int[] getArray() {
        return array;
    }

}