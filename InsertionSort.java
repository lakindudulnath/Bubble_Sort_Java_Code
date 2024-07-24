package Insertion_sort_code_Java;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(array);
        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

