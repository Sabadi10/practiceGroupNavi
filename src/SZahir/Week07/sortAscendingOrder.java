package SZahir.Week07;

import java.util.Arrays;

/*
2) Array - Sort Ascending
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
 */
public class sortAscendingOrder {

    public static int[] sortArray(int[] num){

            int[] sortedNum = num.clone(); // Create a copy of the array to
            // avoid modifying the original array
        for (int i = 0; i < sortedNum.length-1; i++) {
            for (int j = 0; j < sortedNum.length-1-i; j++) {
                if(sortedNum[j] > sortedNum[j+1]){
                    int temp=sortedNum[j];
                    sortedNum[j]=sortedNum[j+1];
                    sortedNum[j+1]=temp;
                }
            }

        }
        return sortedNum;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[] {9,8,7,6,5,4,3,2,0,-30})));

    }

    }


