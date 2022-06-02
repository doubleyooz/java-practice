import java.util.*;

//https://thehuxley.com/problem/3903?quizId=7184
public class SelectionSort2 {

    private static int orderMarker = 0, k = 0;

    public static int sumArray(int[] array) {
        int n = 0;
        for (int i = 0; i < k; i++)
            n += array[i];

        return n;
    }

    public static int[] sortArray(int[] array) {
        int n1 = orderMarker, temp = 0;

        while (orderMarker < array.length - 1) {
            for (int i = orderMarker; i < array.length; i++) {
                if (array[n1] < array[i])
                    n1 = i;
            }

            temp = array[orderMarker];
            array[orderMarker] = array[n1];
            array[n1] = temp;
            orderMarker++;

            return sortArray(array);
        }
        return array;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            int[] params = new int[2];
            int i = 0;

            while (lineScanner.hasNextInt()) {
                params[i] = lineScanner.nextInt();
                i++;
            }

            k = params[1];
            orderMarker = 0;
            line = scanner.nextLine();
            int[] numbers = new int[params[0]];
            lineScanner = new Scanner(line);

            i = 0;
            while (lineScanner.hasNextInt()) {
                numbers[i] = lineScanner.nextInt();
                i++;
            }

            numbers = sortArray(numbers);
            System.out.println(sumArray(numbers));
            
        }
        scanner.close();
    }
}