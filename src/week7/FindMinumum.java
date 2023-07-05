package week7;
import week6.FindMaximum;
/*
    1) Array - Find Minimum
            Write a method that can find the maximum number from an int Array

    */
public class FindMinumum {
    public static int FindMinumum (int numbers[] ) {

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        System.out.println("Min number is "+ FindMinumum( new int[]{120, 200, -15, 43, -125, 1903}));
    }

}


