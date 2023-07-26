package anna.week09;

import java.util.Arrays;

public class concatArray {
    public static int[] concatArr (int[] arr1,int[]arr2){
        int[] arr3= new int[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = arr1.length, j=0; i < arr1.length+ arr2.length; i++, j++) {
            arr3[i]=arr2[j];
        }
        return arr3;
    }
}
