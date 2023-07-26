package week9;
/*
  Array_concat2Arrays
Write a return method that can concatenate two arrays
 */

import java.util.Arrays;

public class Array_concat2arrays {

    public static int[] concatenateArrays(int[] arr, int[] arr1) {
        int[] result = new int[arr.length + arr1.length];

        System.arraycopy(arr, 0, result, 0, arr.length);
        System.arraycopy(arr1, 0, result, arr.length, arr1.length);

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};
        int[] array1 = {2,4,6,8};
        int[] result = concatenateArrays(array, array1);
        System.out.println(Arrays.toString(result)); // Output: [1, 3, 5, 7, 9, 2, 4, 6, 8]
    }
}

