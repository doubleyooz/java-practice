import java.util.Arrays;
import java.util.Random;

public class Test {
    private static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void main (String [] args){
        int[] numbers = new int[10];
        Random rand = new Random();

        for(int i=0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(1000);
            
        printArray(numbers);
        Merge.sortArray(numbers);
        printArray(numbers);
    }
}
