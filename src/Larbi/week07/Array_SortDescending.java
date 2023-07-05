package Larbi.week07;

import java.util.Arrays;

public class Array_SortDescending {

    /*
    Write a return method that can sort an int array in Descending order without using the sort method of the Arrays class
            Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {

        int[] xArray = {10, 20, 7, 8, 90};
        System.out.println(Arrays.toString(sortArray(xArray)));

    }

    public static int[] sortArray(int[] lar) {

        for (int i = 0; i < lar.length-1; i++) {
            for (int j = 0; j < lar.length-1; j++) {

                if (lar[j] < lar[j + 1]) {

                    // I used "mm" to go back to this result while looping

                                            // lar[j] = 10
                    int mm = lar[j];        // lar[j] = 10 ,  mm = 10
                    lar[j] = lar[j + 1];    // lar[j+1] = 20 ,  lar[j] = 20
                    lar[j + 1] = mm;        // mm = 10 , lar[j+1] = 10

                                            // lar[j] = 7
                                            // lar[j] = 7 ,  mm = 7
                                            // lar[j+1] = 8 ,  lar[j] = 8
                                            // mmm = 7 , lar[j+1] = 7
                }
            }
        }

        return lar;
    }
}
