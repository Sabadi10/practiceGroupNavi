package SZahir.Week08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueIntegersThatSumUpToZero {
        public static int[] generateArray(int N) {
           // if (N < 2 || N > 99) {
               // throw new IllegalArgumentException("N should be between 2 and 99");
          //  }

            int[] result = new int[N];
            Set<Integer> uniqueNumbers = new HashSet<>();

            int i = 0;
            while (i < N - 1) {
                int randomNumber = (int) (Math.random() * N);
                if (uniqueNumbers.add(randomNumber)) {
                    result[i] = randomNumber;
                    i++;
                }
            }
            int sum = Arrays.stream(result).sum();
            result[N - 1] = -sum;

            return result;
        }

        public static void main(String[] args) {
            int N = 4;
            Set<Integer> uniqueNumbers = new HashSet<>();
            int[] uniqueIntegers = generateArray(N);
            System.out.println(Arrays.toString(uniqueIntegers));
        }
    }


