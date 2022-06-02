import java.util.*;

public class SelectionSort {

    private static int orderMarker = 0;

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length)
                System.out.printf(" %d |", array[i]);
            else
                System.out.printf(" %d", array[i]);
        }
        System.out.println();
    }

    public static int[] sortArray(int[] array) {
        int n1 = orderMarker, temp = 0;

        while (orderMarker < array.length - 1) {
            for (int i = orderMarker; i < array.length; i++) {
                if (array[n1] > array[i])
                    n1 = i;
            }
            System.out.printf("Menor elemento neste passo: %d\n", array[n1]);

            temp = array[orderMarker];
            array[orderMarker] = array[n1];
            array[n1] = temp;
            orderMarker++;

            System.out.print("Estado Atual:");
            printArray(array);
            System.out.println();

            return sortArray(array);
        }
        return array;
    }

    public static void main(String args[]) {
        // 1 8 9 2 0 4 5 12 5 3 2 1
        Scanner scanner = new Scanner(System.in);

        final String line = scanner.nextLine();
        int[] numbers = new int[line.split(" ").length];
        final Scanner lineScanner = new Scanner(line);

        int i = 0;
        while (lineScanner.hasNextInt()) {
            numbers[i] = lineScanner.nextInt();
            i++;
        }
        numbers = sortArray(numbers);

        System.out.print("Resultado Final:");
        printArray(numbers);
        scanner.close();
        lineScanner.close();
    }
}