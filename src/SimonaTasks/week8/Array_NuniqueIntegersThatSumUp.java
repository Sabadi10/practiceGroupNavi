package SimonaTasks.week8;

/*
2️⃣  **Array_NuniqueIntegersThatSumUpTo**
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Array_NuniqueIntegersThatSumUp {

    public static int[] generateArray(int N) {
        if (N < 2 || N > 99) {
            throw new IllegalArgumentException("N should be between 2 and 99 (inclusive).");
        }

        int[] array = new int[N];

        //The loop will continue as long as 'i' is less than 'N-1' where N is the size of length
        for (int i = 0; i < N - 1; i++) {
            array[i] = i + 1; //first element of the array will be assigned the value 1, the second element will be assigned the value 2, and so on.
        } //loop continues to iterate until i reaches N - 1,

        array[N - 1] = -(N * (N - 1) / 2); // Calculate the value to make the sum zero
        // 'N' represents the length of array
        return array;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] zeroSumArray  = generateArray(N);


        System.out.println(Arrays.toString(zeroSumArray));
    }


}
