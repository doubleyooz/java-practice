package src.algorithms;

public class Queue2 {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void enqueue(int element) {
        stack1.push(element);
    }

    public int dequeue() {
        if (stack2.getTop() == -1) {
            if (stack1.getTop() == -1) {
                System.out.println("Cannot dequeue an empty queue");
            } else {
                while (stack1.getTop() > -1) {

                    stack2.push(stack1.getNext());

                    stack1.pop();
                }
            }

        }
        int temp = stack2.getNext();
        stack2.pop();

        return temp;
    }
}
