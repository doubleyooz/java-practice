import java.util.Random;
import java.util.Arrays;

public class Test2 {

    private static Search search = new Search();
    private static long[][] sequencial = new long[3][10];
    private static long[][] binary = new long[3][10];

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static int[] generateArray(int length, int range) {
        int[] numbers = new int[length];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(range);
        return numbers;
    }

    private static long timeSequential(int[] arr, int target) {

        long startTime = System.nanoTime();
        search.sequentialSearch(arr, target);
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    private static long timeBinary(int[] arr, int target) {

        long startTime = System.nanoTime();
        search.binarySearch(arr, target);
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    private static void shuffleArray(int[] arr) {
        Random r = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }

    private static void getResults(int[] list, int index, int target) {
        for (int i = 0; i < 10; i++) {
            shuffleArray(list);
            sequencial[index][i] = timeSequential(list, target);
            binary[index][i] = timeBinary(list, target);
        }
    }

    private static double average(long[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = generateArray(100, 150);
        int[] arr2 = generateArray(1000, 1500);
        int[] arr3 = generateArray(10000, 15000);

        getResults(arr, 0, -5);
        getResults(arr2, 1, -5);
        getResults(arr3, 2, -5);

        System.out.println("Sequential:");

        System.out.println(average(sequencial[0]));
        System.out.println(average(sequencial[1]));
        System.out.println(average(sequencial[2]));

        System.out.println("\nBinary:");
        System.out.println(average(binary[0]));
        System.out.println(average(binary[1]));
        System.out.println(average(binary[2]));

    }
}
