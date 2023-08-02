package Larbi.week10;

import java.util.Arrays;

public class sortArrayDescending {
    /*
        Write a method that can sort the ArrayList in Descending order without using the sort method.
                Example:
     int[] = {32, 10, 20, 80, 87};
     int[] = {87, 80, 32, 20, 10};
     */

    public static void main(String[] args) {
        int arr[] = {32, 10, 20, 80, 87};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }

    public static int[] sortDescending(int array[]) {
        int[] descndArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            int max = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }

            descndArray[i] = array[max];
            array[max] = x;
        }

        return descndArray;
    }


}
