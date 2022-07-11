package src;

import java.util.Arrays;
import java.util.Random;

import src.algorithms.BinarySearchTree;
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

        /*
         * ChainedList chain = new ChainedList();
         * 
         * chain.add(12);
         * chain.add(56);
         * chain.add(3213);
         * 
         * System.out.println(Arrays.toString(chain.getArray()));
         * 
         * //chain.addAtBeginning(42);
         * chain.addAtPosition(10, 42);
         * 
         * System.out.println(Arrays.toString(chain.getArray()));
         * chain.deleteElement(0);
         * System.out.println(Arrays.toString(chain.getArray()));
         * 
         */

        BinarySearchTree bst = new BinarySearchTree();

        /*
         * 
         *                 5
         *       2                 65
         *         3            50      100
         *                  21       52     174
         *               12    23      
         *                               
         * 
         */

        Random rand = new Random();
        int[] numbers = new int[] { 5, 65, 2, 50, 21, 52, 12, 23, 100, 174, 3 };
        for (int i = 0; i < numbers.length; i++)
            bst.add(numbers[i]);
        
        //for (int i = 0; i < 50; i++)
          //  bst.add(rand.nextInt(1000));



        // bst.list();
        //System.out.println(Arrays.toString(bst.getArray()));
        System.out.println(Arrays.toString(bst.getSortedArray()));
        
        bst.deleteElement(65);
        System.out.println(Arrays.toString(bst.getSortedArray()));
        bst.deleteElement(50);
        System.out.println(Arrays.toString(bst.getSortedArray()));
        
        /*for (int i = 1; i < numbers.length; i++){
            System.out.println(numbers[i]);
            bst.deleteElement(numbers[i]);
            System.out.println(Arrays.toString(bst.getSortedArray()));
        }
        */
    }

}