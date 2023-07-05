package SimonaTasks.week7;
/*
  1) Array - Find Minimum
     Write a method that can find the minimum number from an int Array
 */

public class Array_findMinimum {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 2,};

        int minNumber = arrayMinNumber(numbers);

        System.out.println("Minimum number is " + minNumber);

    }


    public static int arrayMinNumber(int[] array){

        if (array == null || array.length == 0){
            System.err.println("The array is empty or null!");
        }

        int min = array[0]; //Assume the first element as the minimum


        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i]; // Update min if a smaller element is found
            }
        }

        return min;

    }

    /*
     In this code, the method findMinimum takes an array of int
     as input and iterates through it, keeping track of the minimum value found so far.
     The min variable is initialized with the value of the first element in the array,
     and then the loop compares each element with min and updates min if a smaller element is found.
     */

}
