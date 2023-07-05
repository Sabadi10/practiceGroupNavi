package Tasks;

import java.util.Arrays;

public class SortDescending {
  /*    3) Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};*/
    public static void main(String[] args) {
        int arr1[] = {545, 58, 241};
        System.out.println(Arrays.toString(sortDescending(arr1)));
    }

    public static int[] sortDescending(int array[]) {
        int[] descendingArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            int maxIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            descendingArray[i] = array[maxIndex];
            array[maxIndex] = element;
        }

        return descendingArray;
    }
}