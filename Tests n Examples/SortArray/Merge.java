import java.util.Arrays;

public class Merge {

    private static void mergeSort (int[] arr){
        int length = arr.length;

        if (length < 2) return;

        int[] left = Arrays.copyOfRange(arr, 0, length/2), right = Arrays.copyOfRange(arr, (length/2), length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i=0, j=0, k=0;

        while (i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }

            k++;

        }

        while(i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static int[] sortArray(int[] arr){
        mergeSort(arr);
        return arr;
    }
}
