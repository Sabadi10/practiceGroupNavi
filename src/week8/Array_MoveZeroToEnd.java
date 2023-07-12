package week8;

import java.util.Arrays;
/*
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */

public class Array_MoveZeroToEnd {
        public static void main(String[] args) {
            int[] arr = {1,0,2,0,3,0,4,0};
            moveZerosToEnd(arr);
            System.out.println(Arrays.toString(arr));
        }

        public static void moveZerosToEnd(int[] arr) {
            int count = 0; // count of non-zero elements

            // Traverse the array and move non-zero elements to the beginning
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[count] = arr[i];
                    count++;
                }
            }

            // Fill the remaining positions with zeros
            while (count < arr.length) {
                arr[count] = 0;
                count++;
            }
        }
    }


