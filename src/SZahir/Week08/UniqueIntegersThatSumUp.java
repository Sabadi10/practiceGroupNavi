package SZahir.Week08;

import java.util.Arrays;

/*
This is a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */
public class UniqueIntegersThatSumUp {
    public static int[] uniqueIntegers(int num){

        if(num > 99){
            throw new IllegalArgumentException("num should be less than 99");
        }

        int[] result=new int[num];
        int sum=0;

        for (int i = 0; i < num-1 ; i++) {
            result[i]= i + 1; // when i[0] result = 0+1=1 ... i[1] result= 1+1 = 2 etc cont to last index
            sum += result[i]; //accumulates the sum of the elements in the result array up to the second-to-last index.

        }
         result[num - 1] = -sum; // the last index stores the sum of the array as a negative number. to ensure we get zero
       // System.out.println("Sum of numbers: " + result[num - 1]);
        return result;

    }

    public static void main(String[] args) {

        int[] uniqueIntegers = uniqueIntegers(4);
        System.out.println(Arrays.toString(uniqueIntegers));

    }


        }




