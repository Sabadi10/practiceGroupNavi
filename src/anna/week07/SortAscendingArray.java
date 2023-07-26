package anna.week07;

import java.util.Arrays;
/*
 Array - Sort Ascending**
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
 int[] arr = {10, 9, 8, 7};
arr = Sort(arr);==>{ 7, 8, 9, 10};
 */
public class SortAscendingArray {
    public static int[] sortAscendingOrder(int[] arr){
        for(int i=0; i < arr.length; i++){
            int index = i;
            for(int j = i; j<=arr.length-1; j++) {

                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr2 = {8, 5, 18, 14};
        System.out.println(Arrays.toString(sortAscendingOrder(arr2)));
    }
}
