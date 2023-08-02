package Larbi.week10;

import java.util.Arrays;

/*
      Write a method that can sort the ArrayList in Ascending order without using the sort method.
        Example:
     int[] = {32, 10, 20, 80, 87};
     int[] = {10, 20, 32, 80, 87};

 */

public class sortArrayAscending {



    public static void main(String[] args) {
        int arr[] = {32, 10, 20, 80, 87};
        System.out.println(Arrays.toString(sortArrAscending(arr)));
    }

    public static int[] sortArrAscending(int array[]) {
        int AscndArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            AscndArray[i] = array[min];
            array[min] = x;
        }

        return AscndArray;
    }
}
