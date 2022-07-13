package src.utils;

public class CustomArray {
    private int size = 0;
    private Integer[] arr;

    public CustomArray(int size) {
        arr = new Integer[size];
        this.size = size - 1;
    }

    public CustomArray() {
        arr = new Integer[0];
    }

    public void add(int n) {
        if (isFull())
            doubleSize();

        arr[size] = n;
        size++;
    }

    public int get(int n) {
        if (n > size || n < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[n];
    }

    public boolean isFull() {
        return arr.length == size;
    }

    public int[] getIntArray(){
        int[] newArr = new int[size];
        for (int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public Integer[] getArray() {
        return arr;
    }

    private void doubleSize() {
        Integer[] newArr = new Integer[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }


}