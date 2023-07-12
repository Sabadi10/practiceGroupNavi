package week7;
/*
2) Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
 int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */

public class ArraySortAscending {
    public static void main(String[] args) {
        int[] ary = {4, 2, 9, 1, 6};
        int[] sortedArray = sortArray(ary);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArray(int[] array) {
        int n = array.length;
        int[] sortedArray = new int[n];
        System.arraycopy(array, 0, sortedArray, 0, n); // Create a copy of the original array

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    // Swap elements at j and j+1
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}


