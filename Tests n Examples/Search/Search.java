import java.util.Arrays;

public class Search {

    public int sequentialSearch(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target)
                return i;
        }
        return -1;
    }

    public int binarySearch(int[] list, int target) {
        Arrays.sort(list);
        int left = 0, right = list.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (target < list[middle])
                right = middle - 1;
            else if (target > list[middle])
                left = middle + 1;
            else
                return middle;
        }
        return -1;
    }
}
