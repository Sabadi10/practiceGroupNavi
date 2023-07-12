package Nataliia.week8;

import java.util.Arrays;

/*
Array_MoveZerosToTheEnd
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class MoveZerosToEnd {

    public static int[] moveZerosToEnd(int[] numbers){

        int[] movedZeros = new int[numbers.length];
        int index = 0; // 1

        for(int eachNumber : numbers){ //  [5, 2, 1, 23, 0, 0, 0, 0]
            if(eachNumber != 0){
                movedZeros [index++] = eachNumber;
            }
        }

        return movedZeros;
    }

    public static void main(String[] args) {
        int[] numbers= {25, 0, 0, 3, 20, 0, 6, 4, 1, 0, 12};
        System.out.println(Arrays.toString(moveZerosToEnd(numbers)));
    }
}
