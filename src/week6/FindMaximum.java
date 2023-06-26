package week6;
/*
Write a method that can find the maximum number from an int Array
 */
public class FindMaximum {

    public static int findMaximum(int[] numbers) {
        int max = numbers[0];                           // assume that first element is the maximum number
        for (int i = 1; i < numbers.length; i++) {      // i: 1, 2, 3, 4...
            if (numbers[i] > max) {                     // compares the element of the array with current maximum number
                max = numbers[i];                       // replace the current maximum number
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(findMaximum(new int[]{100, 20, 1000, 40, -10, 30}));
    }
}
