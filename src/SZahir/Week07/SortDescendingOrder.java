package SZahir.Week07;

import java.util.Arrays;

/*
3) Array - Sort Descending
Write a return method that can sort an int array in
descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};

 */
public class SortDescendingOrder {
    public static int[] sortedArray(int[] number) {

        int[] sortedNumber = number.clone(); // Create a copy of the array to
        // avoid modifying the original array
        for (int i = 0; i < sortedNumber.length-1; i++) {
            for (int j = 0; j < sortedNumber.length-1-i; j++) {
                if(sortedNumber[j] < sortedNumber[j+1]) {
                        int temp=sortedNumber[j];
                        sortedNumber[j] =sortedNumber[j+1];
                        sortedNumber[j+1]=temp;

                }

            }

        }
        return sortedNumber;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedArray(new int[] {23,4,5,6,7,90,8})));

    }

}


