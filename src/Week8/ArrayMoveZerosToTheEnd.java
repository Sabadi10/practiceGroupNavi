package Week8;
import java.util.Arrays;

/*  Create a method that will accept an int array and return an array with all the zeros moved to the end
        Ex:             input:  {1, 0, 2, 0, 3, 0, 4, 0};
                        output: [1, 2, 3, 4, 0, 0, 0, 0]
*/
public class ArrayMoveZerosToTheEnd {

        public static void main(String[] args) {
            System.out.println(Arrays.toString(moveZeros(1, 0, 2, 0, 3, 0, 4, 0)));
        }
        public static int[] moveZeros(int... nums){

            int[] moved = new int[nums.length];
            int index = 0; 					// 1

            for(int each : nums){				 //  [1, 2, 3, 4, 0, 0, 0, 0]
                if(each != 0){
                    moved[index++] = each;
                }
            }
            return moved;
        }
    }
