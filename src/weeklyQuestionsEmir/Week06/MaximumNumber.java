package weeklyQuestionsEmir.Week06;

/*
 Array - Find Maximum
This a method that can find the maximum number from an int Array
 */
public class MaximumNumber {

 public static int findMaxNumber(int[] num){
     if(num==null|| num.length==0){
         throw new IllegalArgumentException("This array cannot be empty or null");
     }
     int maxNumber=num[0]; // this is index zero
     for (int i = 1; i < num.length; i++) { // started from 1 since index[0] is already declared
         if(num[i]> maxNumber){
             maxNumber=num[i];
         }

     }
     return maxNumber;


 }

    public static void main(String[] args)
    {
        System.out.println( findMaxNumber(new int[]{11, -2, -3, -4, -5, -6}));
    }



}
