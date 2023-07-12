package camilo_tests.week08;

/*
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */


import java.util.Arrays;

public class Array_MoveZerosToTheEnd {


        public static int[] moveZeros(int[] numbers){

            int[] moveZeros = new int[numbers.length];
                int index = 0; // 1

            for(int each : numbers){ //  [5, 2, 1, 23, 0, 0, 0, 0]
                if(each != 0){
                    moveZeros [index++] = each;
                }
            }

            return moveZeros;
        }

        public static void main(String[] args) {
            int[] numbers= {25, 11, 0, 3, 2, 0, 8, 4, 1, 0, 20};
                System.out.println(Arrays.toString(moveZeros(numbers)));


        }
    }



