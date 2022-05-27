import java.util.Arrays;
import java.util.Random;

public class Test {
    private static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    private static void shuffleArray(int[] arr){
        Random r = new Random();
         
        for (int i = arr.length-1; i > 0; i--) {           
            int j = r.nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }

    public static void main (String [] args){
        int[] numbers = new int[10];
        Random rand = new Random();

        for(int i=0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(1000);
            
        printArray(numbers);
        Bubble.sortArray(numbers);
        printArray(numbers);
        shuffleArray(numbers);
        printArray(numbers);
        Merge.sortArray(numbers);
        printArray(numbers);
    }
}
