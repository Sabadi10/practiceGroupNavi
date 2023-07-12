package Nataliia.week8;

import java.util.Arrays;

public class SumZeroArray {

    public static int[] generateArray(int N) {
        //check if N is in range between 2 and 99
          if (N <=1 || N >= 100) {
            System.out.println("Number should be more then 1 and less then 100");
            System.exit(1);
        }
        int[] result = new int[N];

        int sum = 0;
        for (int i = 0; i < N - 1; i++) {

            result[i] = (int) (Math.random() * (2 * N + 1)) - N;//Math.random() method generates random float numbers between 0 and 1 (exclusive), to get desired range we multiply them on (2 * N + 1) and subtract N. Casting the result to an integer
            sum += result[i];
        }

        result[N - 1] = -sum;

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = generateArray(N);
        System.out.println(Arrays.toString(arr));
    }




}
