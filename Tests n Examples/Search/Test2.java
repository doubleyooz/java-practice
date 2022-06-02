import java.util.Random;
import java.util.Arrays;

public class Test2 {
    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static int[] generateArray(int length) {
        int[] numbers = new int[length];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(20);
        return numbers;
    }

    public static void main(String[] args) {
        int[] arr = generateArray(16);
        Search search = new Search();
        printArray(arr);
        System.out.println(search.binarySearch(arr, 5));
        System.out.println(search.sequentialSearch(arr, 5));

    }
}
