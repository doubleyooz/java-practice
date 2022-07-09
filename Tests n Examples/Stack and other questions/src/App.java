package src;
import java.util.Arrays;

import src.algorithms.Stack;

public class App {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.pop();

        for(int i = 0; i < 50; i++){
            stack.push(i);
        }

        System.out.println(Arrays.toString(stack.getArray()));
        stack.pop();
        System.out.println(Arrays.toString(stack.getArray()));
       
    }


}