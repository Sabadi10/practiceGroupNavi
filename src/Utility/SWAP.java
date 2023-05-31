package Utility;

public class SWAP {
    /*
    swap two variables without using a third variable
     */
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
