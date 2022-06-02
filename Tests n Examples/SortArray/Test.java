public class Test {
    private static ArrayUtil array = new ArrayUtil();

    private static void routine(Sorter sorter, int[] numbers) {
        array.printArray(numbers);
        sorter.sortArray(numbers);       
        System.out.print(array.isSorted(numbers, numbers.length) ? "SUCCEED! " : "FAILED! ");
        array.printArray(numbers);
        array.shuffleArray(numbers);
        System.out.println();
    }

    public static void main(String[] args) {

        int[] numbers = array.generateArray(8);
        //routine(new Merge(), numbers);
        //routine(new Bubble(), numbers);
        //routine(new Selection(), numbers);
        //routine(new Quick(), numbers);
        routine(new Counting(), numbers);
        // array.printArray(numbers);
    }
}
