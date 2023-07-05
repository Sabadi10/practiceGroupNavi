package Tasks;

import java.util.Arrays;

public class SortAscendingArray {
    public static void main(String[] args) {
        int arr1[] = {545, 58, 241};
        System.out.println(Arrays.toString(SortAscending(arr1)));
    }

    public static int[] SortAscending(int array[]) {
        int AscendingArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            AscendingArray[i] = array[minIndex];
            array[minIndex] = element;
        }

        return AscendingArray;
    }
}