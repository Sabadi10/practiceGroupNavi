package anna.week07;

import java.util.Arrays;

public class SortDescemding {
    public static int[] sortDescendingOrder(int[] arr){

        int[] sorted = new int[arr.length];

        for(int i=0; i < arr.length; i++){
            int index = i;
            for(int j = i; j<= arr.length-1; j++) {

                if (arr[j] > arr[index]) {
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
        System.out.println(Arrays.toString(sortDescendingOrder(arr2)));
    }
}

