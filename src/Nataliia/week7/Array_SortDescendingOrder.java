package Nataliia.week7;

import java.util.Arrays;

/*Write a method that can sort an int array in Descending order without using the sort method of the Array class
 ex:
 int [] arr={10,20,7,8,90};
 arr =  Sort(arr)  ===>  {90,20,10,8,7};
  */
public class Array_SortDescendingOrder {

    public static int[] sortDescending(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] < arr[j + 1]){ //Swapping " + arr[j] + " and " + arr[j+1])
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={10,20,7,8,90};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }
}
