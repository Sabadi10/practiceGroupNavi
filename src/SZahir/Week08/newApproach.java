package SZahir.Week08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class newApproach {
    public static int[] generateArray(int N) {
        //if (N > 99) {
           // throw new IllegalArgumentException("N should be between 2 and 99");
       // }
        int[] result=new int[N];
        int sum=0;

        for (int i = 0; i < N-1 ; i++) {
            result[i]= i + 1; // when i[0] result = 0+1=1 ... i[1] result= 1+1 = 2 etc cont to last index
            sum += result[i]; //accumulates the sum of the elements in the result array up to the second-to-last index.

        }
        result[N - 1] = -sum; // the last index stores the sum of the array as a negative number. to ensure we get zero
        // System.out.println("Sum of numbers: " + result[num - 1]);
        return result;

    }




    public static void main(String[] args) {
        int N = 4;
        int[] uniqueIntegers = generateArray(N);
        System.out.println(Arrays.toString(uniqueIntegers));
    }
}
