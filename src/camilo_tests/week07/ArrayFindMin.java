package camilo_tests.week07;

import java.util.Arrays;
public class ArrayFindMin {


    /*
        1) Array - Find Minimum
        Write a method that can find the maximum number from an int Array
    */


        public static void main(String[] args) {
            int[] intArr = {0,5,19,29,53,183,-2};

            System.out.println(minNumber(intArr));

        }

        public static int minNumber(int[] intArr){

            int max = intArr[0];

            for (int i = 0; i < intArr.length; i++) {
                if(intArr[i]>max){
                    max=intArr[i];
                }
            }

            return max;

        }
    }
