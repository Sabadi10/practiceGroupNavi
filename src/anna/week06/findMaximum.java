package anna.week06;
/*
Array - Find Minimum**
Write a method that can find the maximum number from an int Array
 */
public class findMaximum {

    public static int findMaxElement(int[] arr){
        if(arr.length==0){
            throw new IllegalArgumentException("----- Empty array! -----");
        }
       int max=arr[0];
       for(int each : arr){
           if(each>max){
               max=each;
           }
       }
       return max;
    }

    public static void main(String[] args) {

        System.out.println(findMaxElement( new int[]{1, 4, 8, -22}));
        System.out.println(findMaxElement( new int[]{}));





    }
}
