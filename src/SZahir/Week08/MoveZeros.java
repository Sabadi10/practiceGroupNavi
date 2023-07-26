package SZahir.Week08;

import java.util.Arrays;

/*
This is a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
        input:  {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class MoveZeros {
    public static int[] zeroMover (int[] number){
        int[] result= new int[number.length];
        int index=0;
        for (int num : number) {
            if (num != 0) {
                result[index] = num;
                index++;
            } //
        }

        // Fill the remaining indexes with zeros
        while (index < result.length) {
            result[index] = 0;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroMover(new int[]{-1,0,-6,0,9,8,0,5,6,3})));
    }


    }

