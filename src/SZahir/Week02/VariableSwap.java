package SZahir.Week02;
/*
Swap two variables without using a third variable
 */
public class VariableSwap {
    public static void main(String[] args) {
        int a=6;
        int b=5;
        System.out.println("original a: "+ a);
        System.out.println("original b: "+ b);


        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("swap a: "+ a);
        System.out.println("swap b: "+ b);


    }
}
