package week6;

public class FindMaximum {

    public static int FindMaximum(int numbers[] ) {


        int max = numbers[0];


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }


        return max;
    }

    public static void main(String[] args) {

        System.out.println("Max number is "+ FindMaximum( new int[]{120, -200, -15, 43, -125, 1903}));
    }

    }



/*
 3) Array - Find Maximum
Write a method that can find the maximum number from an int Array
 */

