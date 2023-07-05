package Tasks;

import java.lang.reflect.Array;

public class MinimumNumInArray {
    public static void main(String[] args) {
        // 1) Array - Find Minimum
        //Write a method that can find the maximum number from an int Array

        int[] array = {5, 8, 4, 6, 8, 1, 2, 8, 6, 12};
        System.out.println(MinimumNumber(array));

    }
    public static int MinimumNumber(int array[]){
        int MinNum = 2147483647;
        for (int each : array) {
            if (each < MinNum) {
                MinNum = each;
            }
        }

        return MinNum;
    }
}
