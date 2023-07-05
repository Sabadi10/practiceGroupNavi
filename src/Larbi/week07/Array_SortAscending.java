package Larbi.week07;

import java.util.Arrays;

public class Array_SortAscending {

    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {

        int[] xArray = {10, 9, 8, 7};
        System.out.println(Arrays.toString(sortArray(xArray)));

    }

    public static int[] sortArray(int[] lar) {

         for (int i = 0; i < lar.length-1; i++) {
               for (int j = 0; j < lar.length-1; j++) {

                   if (lar[j] > lar[j + 1]) {


                       // I used "mm" to go back to this result while looping

                       //lar[j] = 10
                       int mm = lar[j];        // lar[j] = 10 ,  mm = 10
                       lar[j] = lar[j + 1];    // lar[j+1] = 9 ,  lar[j] = 9
                       lar[j + 1] = mm;        // mm = 10 , lar[j+1] = 10

                                               // lar[j] = 9
                                               // lar[j] = 9 ,  mm = 9
                                               // lar[j+1] = 8 ,  lar[j] = 8
                                               // mmm = 10 , lar[j+1] = 9
                   }
               }
         }


                return lar;
     }
}


