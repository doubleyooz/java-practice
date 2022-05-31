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

    public void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

}
