package SZahir.Week07;
/*
This is a method that can find the minimum number from an int Array
e.g.new int[]{2,5,6,7,8,-9} // output=-9
 */
public class MinNumber {
    public static void main(String[] args) {

        System.out.println(findMinNumber(new int[]{1,9,-56,78,4}));

    }
    public static int findMinNumber(int[] num) {
        if(num==null || num.length==0){
            throw new IllegalArgumentException("This array is null or empty");
        }

        int min= num[0];
        for (int i = 1; i < num.length; i++) {
            if(num[i]< min){
                min=num[i];
            }

        }
        return min;
    }

}


