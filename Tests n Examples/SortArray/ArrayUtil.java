import java.util.Random;
import java.util.Arrays;

public class ArrayUtil {
    public void shuffleArray(int[] arr) {
        Random r = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }

    public int[] generateArray(int length) {
        int[] numbers = new int[length];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(1000);
        return numbers;
    }

    public boolean isSorted(int[] array, int n) {
        if (n == 1 || n == 0)
            return true;
        return array[n - 2] <= array[n - 1] && isSorted(array, n - 1);
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

}
