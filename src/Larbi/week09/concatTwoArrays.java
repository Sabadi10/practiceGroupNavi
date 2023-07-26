package Larbi.week09;

import java.util.Arrays;

public class concatTwoArrays {

    /*
            Array_concat2Arrays
                - Write a return method that can concatenate two arrays
     */

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println(Arrays.toString(concatArrays(array1,array2)));
    }

    public static int[] concatArrays(int[] array1, int[] array2){

        int length = array1.length + array2.length; // to get the size of our new array length

        int[] result = new int[length];

        int a = 0;

        for (int each : array1) {
            result[a] = each; // each element will be stored in result
            a++;
        }

        for (int each : array2) {
            result[a] = each; // each element will be stored in result
            a++;
        }

        return result;
    }

}
