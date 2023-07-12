package Larbi.week08;

import java.util.Arrays;

public class Array_MoveZerrosToTheEnd {

    /*
            Array_MoveZerosToTheEnd
        Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
        input:  {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
     */
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {

                if (arr[j] > arr[j + 1]) {
                    int lar = arr[j]; // lar=5
                    arr[j] = arr[j + 1]; // arr[j]=9
                    arr[j + 1] = lar; // lar=9
                }

            }
        }

        // This part to store zeros from the end
        for (int i = arr.length-1,j=0; i >=0; j++,i--) {
            int result =arr[i];
            System.out.print(result+" ");
        }
    }


}

