package Nataliia.week9;

import java.util.Arrays;

/*
Array_concat2Arrays
write a return method that can concatenate 2 Arrays
 */
public class Concat2Arrays {

    public static double[] concat2Arrays(double[] arr1, double[] arr2){
        double[] result = Arrays.copyOf(arr1, arr1.length + arr2.length );
        return result;

    }

    public static int[] concat2Arrays(int[] arr1, int[] arr2){
        int[] result =new int[arr1.length +arr2.length];// to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2


        for (int i = 0; i < arr1.length; i++) { //i: for first array's index numbers
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) { //i: for second array's index numbers
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }


    public static char[] concat2Arrays(char[] arr1, char[] arr2){
        char[] result =new char[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};

        char[] array3 = { 'h','e','l','l','o'};
        char[] array4 = { 'w','o','r','l','d'};
        System.out.println(Arrays.toString(concat2Arrays(array1,array2)));

        System.out.println(Arrays.toString(concat2Arrays(array3, array4)));
    }

}
