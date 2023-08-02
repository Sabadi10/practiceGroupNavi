package Tasks;

public class Array_NuniqueIntegersThatSumUpTo1 {
    /*Array_NuniqueIntegersThatSumUpTo
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/
    public static int[] arrayNUniqueIntegersThatSumUpTo(int N) {
        int[] array = new int[N];

        // Generate the first N-1 positive integers
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            array[i] = i + 1;
            sum += array[i];
        }

        // Calculate the last number needed to sum up to 0
        array[N - 1] = sum;

        return array;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] result = arrayNUniqueIntegersThatSumUpTo(N);


        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
