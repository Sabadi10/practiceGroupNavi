package Utility;

public class OddEven {

    public static int oddEven(int num){
        if(num % 2 == 0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
        return num;
    }
}
