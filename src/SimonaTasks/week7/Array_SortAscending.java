package SimonaTasks.week7;

/*
2) Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
 */

import java.util.Arrays;

public class Array_SortAscending {

    public static void main(String[] args) {

        int[] array = {7, 8, 9, 10, 0};

        sortArrayAscending(array);

    }


    public static void sortArrayAscending(int[] array) {
        if (array == null || array.length <= 1) {
            System.out.println("Array is empty or null, nothing to sort."); // No need to sort an empty array or an array with a single element.
            return;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0; //this variable is used for swapping elements
                if (array[i] > array[j]) {
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

    /*
    In this method we will compare the first and second elements beginning with the first index.
    If the first element of the array is greater, then swap the first and second elements.
    We will use bubble sort to arrange the array in this example. As in selection sorting, two loops are used to sort the elements.
    One is for iterating the array until its length, and the second loop is used for checking elements and swapping them based on conditions

     */








