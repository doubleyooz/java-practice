package test;
import java.util.Arrays;
import java.util.Random;
import src.algorithms.BinarySearchTree;

public class TestBst {
    
    public static void main (String[] args){
  
        int[] numbers = new int[] { 49, 40, 26, 13, 2, 49, 934, 695, 344, 300, 4 };
        BinarySearchTree bst = new BinarySearchTree();

        /*
         * 
         *                             49
         *                     40            934         
         *               26         49     695                         
         *           13                   344              
         *        2                      300        
         *            4                                
         *                          
         *                         
         *                     
         *                               
         * 
         */
        
        
        fillBst(bst, numbers);
       
        /*
        System.out.println(Arrays.toString(bst.getArray()));
        
        System.out.println(bst.getHeadValue());
        System.out.println(Arrays.toString(bst.getSortedArray()));
        bst.deleteElement(635);
        System.out.println(Arrays.toString(bst.getSortedArray()));
        */
        emptyBst(bst, false);
        
        
    }

    private static void emptyBst(BinarySearchTree bst, boolean stepByStep){
        int[] numbers = bst.order();
        System.out.println(numbers.length < 100 ? Arrays.toString(numbers) : numbers.length);
        for (int i = 0; i < numbers.length; i++){
           
            bst.deleteElement(numbers[i]);           
            
            if(stepByStep){
                System.out.println(numbers[i]);
                System.out.println(Arrays.toString(bst.getSortedArray()));
            } else {
                if(numbers.length - i != bst.getSize()){
                    if(i == 0){
                        if(bst.countOccurrences(numbers[0]) == 0)
                            System.out.printf("[%d] %d\n", numbers[i], i);
                    }
                    else if(numbers.length - i-1 != bst.getSize())
                            System.out.printf("[%d] - %d=%d - %d\n", numbers[i], numbers.length-i, bst.getSize(), i);
                }
            }
           
        }
    }

    private static void fillBst(BinarySearchTree bst, int[] numbers){
        for (int i = 0; i < numbers.length; i++)
            bst.insert(numbers[i]);

    }
    private static void fillBst(BinarySearchTree bst, int size){
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            bst.insert(rand.nextInt(1000));

    }
}
