package SimonaTasks.week7;

/*
  3) Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
 */

import java.util.Arrays;

public class Array_SortDescending {

    public static void main(String[] args) {

        int[] array = {7, 8, 9, 10, 0};

        sortArrayDescending(array);

    }


    public static void sortArrayDescending(int[] array) {
        if (array == null || array.length <= 1) {
            System.out.println("Array is empty or null, nothing to sort."); // No need to sort an empty array or an array with a single element.
            return;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] < array[j]) {
                    // Swap array[i] and array[j] if they are in the wrong order
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // Print the sorted array
        System.out.println(Arrays.toString(array));

    }
}




