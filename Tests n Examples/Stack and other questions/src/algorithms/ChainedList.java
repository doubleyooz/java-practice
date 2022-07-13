package src.algorithms;

import java.util.NoSuchElementException;
import src.interfaces.ListaEncadeada_IF;

public class ChainedList implements ListaEncadeada_IF {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }
    }

    Node head;
    private int size = 0;

    public ChainedList() {

    }

    public void insert(int value) {
        Node node = new Node(value);

        if (head == null)
            head = node;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;

    }

    public void addAtBeginning(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public void addAtPosition(int index, int value) {
        if (index <= 0)
            addAtBeginning(value);
        else {
            Node node = new Node(value);
            Node temp = head;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }

        // if (index >= size || index < 0)
        // return;

    }

    public int search(int value) throws NoSuchElementException {
        Node temp = head;
        int i = 0;
        while (temp.value != value && temp.next != null) {

            temp = temp.next;
            i++;
        }
        if (temp.value == value)
            return i;
        else
            throw new NoSuchElementException();
    }

    public int getElement(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node temp = head;
        int i = 0;
        while (i < index) {

            temp = temp.next;
            i++;
        }
        return temp.value;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        }

        else {
            if (index >= size)
                index = size - 1;
            Node temp = head;
            Node nextNode;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            nextNode = temp.next;
            temp.next = nextNode.next;

        }
        size--;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void list() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);

    }

    public int[] toArray() {
        Node temp = head;
        int[] array = new int[size];
        int i = 0;
        while (temp.next != null) {
            array[i] = temp.value;
            temp = temp.next;
            i++;
        }
        array[size - 1] = temp.value;
        return array;

    }

}
