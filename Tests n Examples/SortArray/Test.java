public class Test {
    private static ArrayUtil array = new ArrayUtil();

    private static void routine(Sorter sorter, int[] numbers) {
        array.printArray(numbers);
        sorter.sortArray(numbers);
        array.printArray(numbers);
        array.shuffleArray(numbers);
    }

    public static void main(String[] args) {

        int[] numbers = array.generateArray(6);
        routine(new Merge(), numbers);
        routine(new Bubble(), numbers);
        routine(new Selection(), numbers);
        //array.printArray(numbers);
    }
}
