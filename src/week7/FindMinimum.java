package week7;
/*
Write a method that can find the minimum number from an int Array
 */
public class FindMinimum {
    public static int findMinimum(int[] numbers) {
        int min = numbers[0];                           // assume that first element is the minimum number
        for (int i = 1; i < numbers.length; i++) {      // i: 1, 2, 3, 4...
            if (numbers[i] < min) {                     // compares the element of the array with current minimum number
                min = numbers[i];                       // replace the current minimum number
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(findMinimum(new int[]{-100, 20, 1000, 40, 0, 30}));
    }
}