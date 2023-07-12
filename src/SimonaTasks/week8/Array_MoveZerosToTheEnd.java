package SimonaTasks.week8;

/*
1️⃣  **Array_MoveZerosToTheEnd**
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]

 */

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {

    public static void main(String[] args) {

        int[] array = {1,0,2,0,3,0,4,0};
        System.out.println("Original Array: " + Arrays.toString(array));

        moveZerosToEnd(array);
        System.out.println("Modified Array: " + Arrays.toString(array));


    }


        public static void moveZerosToEnd(int[] array) {

            int count = 0; // Count of non-zero elements

            // Loop will iterate over each element of the array, starting from index 0 and contin until 'i' reaches the length of the array
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) { // this line checks if the 'i' not equal to zero
                    array[count] = array[i]; //it moves non-zero elements to the current position indicate by 'count'
                    count++; //This line increments the value of count by 1, of non-zero elements
                }
            }
      /*
      By using this for loop, the code processes each element of the array
      and moves non-zero elements towards the beginning of the array,
      while keeping track of the count of non-zero elements in the count variable.
      Any remaining elements beyond the first count elements will not be modified.
       */

            // Fill the remaining indexes with zeros
            while (count < array.length) {
                array[count] = 0;
                count++;
            }
        }

}

/*
Code initializes a variable count to 0 and then checks if the element at index i in the array
 is not equal to 0. If the condition is true, it performs the following steps:

1. It assigns the value of array[i] to the element at index count in the array.
2. It increments the value of count by 1.

This code appears to be filtering out the zeros from the array.
By moving non-zero elements towards the beginning of the array,
it effectively removes the zeros and maintains the relative order of the non-zero elements.
 */