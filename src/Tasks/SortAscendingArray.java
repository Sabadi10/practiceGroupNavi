package Tasks;

import java.util.Arrays;
/*    2) Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
int[] arr = {10, 9, 8, 7};
arr = Sort(arr);==>{ 7, 8, 9, 10};*/
public class SortAscendingArray {
    public static void main(String[] args) {
        int arr1[] = {545, 58, 241};
        System.out.println(Arrays.toString(SortAscending(arr1)));
    }

    public static int[] SortAscending(int array[]) {
        int AscendingArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            AscendingArray[i] = array[minIndex];
            array[minIndex] = element;
        }

        return AscendingArray;
    }
}