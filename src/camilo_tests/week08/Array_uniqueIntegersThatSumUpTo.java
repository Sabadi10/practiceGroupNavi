package camilo_tests.week08;




/*
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */

import java.util.Arrays;

public class Array_uniqueIntegersThatSumUpTo {
    public static int[] uniqueIntegers(int num){



        if (num > 99){
            throw new IllegalArgumentException("The number should be less than 99");
        }

        int [] result = new int [num];
            int sum = 0;

        for (int i = 0; i< num-1 ; i++){
            result[i] = i + 1;
                sum += result [i];
        }

        result[num - 1] = -sum;

            return result;
    }


    public static void main (String [] args) {
        int[] uniqueIntegers = uniqueIntegers(4);
            System.out.println(Arrays.toString(uniqueIntegers));

    }

}
