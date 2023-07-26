package SimonaTasks.week9;
/*
Array_concat2Arrays
Write a return method that can concatenate two arrays
 */

import java.util.Arrays;

public class concat2Arrays {

    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3};
        int [] arr2 = {4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(concatArrays(arr1,arr2)));

    }


    public static int[] concatArrays(int[] arr1, int[] arr2) {

        //new int array with the lenth equal to the sum of arr1 & arr2
        int[] concatedArrays = new int[arr1.length + arr2.length];
        // i -> added to the concated array, also read from arr1
        // y -> read the elements from the arr2

        for (int i = 0, j = 0; i < concatedArrays.length; i++) {

            //This condition checks if the current index i is less than the length of arr1. If it is, then it means we are still within the bounds of arr1
            if (i < arr1.length) {
                concatedArrays[i] = arr1[i];
            } else {
                concatedArrays[i] = arr2[j++]; // now we need to copy the remaining elements from arr2; read and go to the next element ++
            }
        }
        return concatedArrays;

        /*
        the concatArrays method takes two arrays as input,
        creates a new array with enough space to store both arrays' elements,
        and then iteratively copies the elements from the input arrays into the
        new concatenated array to produce the final result.
         */

    }
}
