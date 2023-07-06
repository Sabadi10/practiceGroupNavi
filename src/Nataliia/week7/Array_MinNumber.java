package Nataliia.week7;
/*
write a method that can find the minimum number from an int Array
 */
public class Array_MinNumber {

    public static int Array_minNum(int[] numbers) {
        int min = numbers[0];
        for (int each : numbers) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, -5, -1, 5};
        System.out.println(Array_minNum(arr));
    }
}
