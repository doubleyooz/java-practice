package src;

import java.util.Arrays;

import src.algorithms.ChainedList;
import src.algorithms.Queue2;
import src.algorithms.Stack;

public class App {

    public static void main(String[] args) {
        /*
         * Stack stack = new Stack();
         * stack.pop();
         * 
         * for(int i = 0; i < 50; i++){
         * stack.push(i);
         * }
         * 
         * System.out.println(Arrays.toString(stack.getArray()));
         * stack.pop();
         * System.out.println(Arrays.toString(stack.getArray()));
         */

        /*
         * Queue2 queue2 = new Queue2();
         * 
         * for (int i = 0; i < 30; i++) {
         * queue2.enqueue(i);
         * }
         * 
         * for (int i = 0; i < 30; i++) {
         * System.out.println(queue2.dequeue());
         * }
         */

        ChainedList chain = new ChainedList();

        chain.add(12);
        chain.add(56);
        chain.add(3213);

        System.out.println(Arrays.toString(chain.getArray()));

        //chain.addAtBeginning(42);
        chain.addAtPosition(10, 42);

        System.out.println(Arrays.toString(chain.getArray()));
        chain.deleteElement(0);
        System.out.println(Arrays.toString(chain.getArray()));
    }

}