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
/*
    int[] numbers = {100, 20, 500, 40, -10, 30};

    int max = numbers[0]; // assume that first element is the maximum number

        for (int i = 1; i < numbers.length; i++) { // i: 1, 2, 3, 4...

        if(numbers[i] > max){ // compares the element of the array with current maximum number
        max = numbers[i]; // replace the current maximum number
        }

        }


        System.out.println("max = " + max);
*/
