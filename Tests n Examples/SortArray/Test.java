public class Test {
    private static Array array = new Array();

    private static void routine(Sorter sorter, int[] numbers) {
        array.printArray(numbers);
        sorter.sortArray(numbers);
        array.printArray(numbers);
        array.shuffleArray(numbers);
    }

    public static void main(String[] args) {

        int[] numbers = array.generateArray(12);
        routine(new Merge(), numbers);
        routine(new Bubble(), numbers);

        array.printArray(numbers);
    }
}
