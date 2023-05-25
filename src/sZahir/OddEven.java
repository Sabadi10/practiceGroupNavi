package sZahir;

public class OddEven {
    public static void main(String[] args) {
        oddEven(9);


    }
    public static int oddEven(int num1){
        if(!( num1 %2==0)) {
            System.out.println(num1 + " is odd");
        } else {
            System.out.println(num1 + " is even");
        }
        return num1;
    }
}

