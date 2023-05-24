package SZahir;

public class VariableSwap {
    public static void main(String[] args) {
        int a=6;
        int b=5;
        System.out.println("original a: "+ a);
        System.out.println("original b: "+ b);

        //cannot create new variable...need to swap
        a= a+b; // add numbers to get sum ..... a= 11
        b=a-b; // therefore b= 11-5 = 6,
        a=a-b; //a=11-6 = 5
        System.out.println("swap a: "+ a);
        System.out.println("swap b: "+ b);


    }
}
/*
Swap two variables without using a third variable
 */