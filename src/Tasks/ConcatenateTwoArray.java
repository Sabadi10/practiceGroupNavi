package Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
/*  Array_concat2Arrays
Write a return method that can concatenate two arrays*/
public class ConcatenateTwoArray {
    public static void main(String[] args) {


        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println(Arrays.toString(concatArrays(array1, array2)));
    }

    public static int[] concatArrays(int[] array1, int[] array2) {

        int[] result = new int[array1.length + array2.length];

        int a = 0;

        for (int each : array1) {
            result[a] = each;
            a++;
        }

        for (int element : array2) {
            result[a] = element; // each element will be stored in result
            a++;
        }

        return result;
    }
}