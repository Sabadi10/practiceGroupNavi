package SZahir.Week07;
/*

This is a method that can find the maximum number from an int Array
e.g.new int[]{2,5,6,7,8,-9} // output=8
 */
public class MaxNumber {
    public static void main(String[] args) {

        System.out.println(findMaxNumber(new int[]{2,5,6,7,8,-9}));

        }
public static int findMaxNumber(int[] numbers) {
        if(numbers==null || numbers.length==0){
            throw new IllegalArgumentException("This array is null or empty");
        }

    int max= numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if(numbers[i]> max){
            max=numbers[i];
        }

        }
    return max;
    }

}
