package week7;
import java.util.Arrays;
/*
Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:     int[] arr = {10, 20, 7, 8, 90};
        arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
Bubble sort method - we will compare the first and second elements beginning with the first index.
If the first element of the array is lesser, then swap the first and second elements.
After that, it will perform a comparison between the next two elements.
*/
public class SortDescending {
    public static int[] sortDescending(int... arr){

        // two loops are used to sort the elements: 1 for iterating the array until its length,
        // 2 loop is used for checking elements and swapping them based on conditions:
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDescending(10, 20, 7, 8, 90)));
    }
}