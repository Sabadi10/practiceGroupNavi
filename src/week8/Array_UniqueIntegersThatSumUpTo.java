package week8;
/*
 Array_UniqueIntegersThatSumUpTo
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */

import java.util.Arrays;

public class Array_UniqueIntegersThatSumUpTo {

    public static int[] ArrayWithZeroSum(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N should be greater than 1 and less than 100.");
        }

        int[] array = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            array[i] = i + 1; // Fill the array with values 1 to N-1
            sum += array[i];
        }

        array[N - 1] = -sum; // Set the last element to the negation of the sum of previous elements
        return array;
    }

    public static void main(String[] args) {
        int N = 10;
        int[] result = ArrayWithZeroSum(N);
        System.out.println(Arrays.toString(result));
    }
}


