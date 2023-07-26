package SimonaTasks.array_FindMaxNum;

/*
 3) Array - Find Maximum
    Write a method that can find the maximum number from an int Array
 */

public class Array_FindMaxNum {

    public static void main(String[] args) {

        int[] numbers = {2, 5, 10};

        int maxNumber = arrayMaxNumber(numbers);

        System.out.println("Maximum number is: " + maxNumber);
    }


    public static int arrayMaxNumber(int[] array){

        if (array == null || array.length == 0){
            System.err.println("The array is empty or null!");
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;


    }

}
