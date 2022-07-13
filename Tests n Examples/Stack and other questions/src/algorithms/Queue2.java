package src.algorithms;

import src.interfaces.Fila_IF;

public class Queue2 implements Fila_IF{
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void enqueue(int element) {
        stack1.push(element);
    }

    public int dequeue() throws Exception {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Cannot dequeue an empty queue");
            } else {
                while (stack1.top() > -1) {

                    stack2.push(stack1.getNext());

                    stack1.pop();
                }
            }

        }
        int temp = stack2.getNext();
        stack2.pop();

        return temp;
    }

    @Override
    public int head() throws Exception {
        if (stack2.top() == -1)
            return stack1.getNext();
        return stack2.getNext();
    }

    @Override
    public boolean isEmpty() {
        return stack2.isEmpty() && stack2.isEmpty();
    }

    @Override
    public boolean isFull() {
        return stack1.isFull() || stack2.isFull();
    }
}
