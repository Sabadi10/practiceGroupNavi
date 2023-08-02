package SimonaTasks.week10;

/*
ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
 */

import java.util.Arrays;

public class ArrayList_AscendingOrder {

    public static void main(String[] args) {

        int[] arr1 = {3, 4, 1, 3, 8, 5, 0, -1};

        System.out.println(Arrays.toString(sortAscending(arr1)));

    }


    public static int[] sortAscending(int[] arr){

        for (int i = 0; i < arr.length; i++){ // first loop to iterate through the arr
            for (int j = 0; j < arr.length -1; j++){ // The loop variable j is used to access each element of the array.
                if (arr[j] > arr[j+1]){ //  checks if the current element at index j is greater than the next element at index j+1
                   int temp = arr[j]; //temp value to make sure we don't lose any value during the swap after storing of the index 'j'
                    arr[j] = arr[j+1]; // This line swaps the value of the element at index j with the value of the element at index j+1, moving the greater element towards the end of the array
                    arr[j+1] = temp; //  completes the swap by assigning the value stored in the temporary variable temp to the index 'j+1'

                }
            }
        }
     return arr;

    }


}
