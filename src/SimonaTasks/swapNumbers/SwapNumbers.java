package SimonaTasks.swapNumbers;

// Swap two variable' values without using a third variable

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("\"a\" value before swapping = " + a);
        System.out.println("\"b\" value before swapping = " + b);
        System.out.println("=====================================");


        a = a + b; // (a) 10 + 5 = 15
        b = a - b;// (b) 15 - 5 = 10
        a = a - b;// (a) 15 - 10 = 5

        System.out.println("\"a\" value after swapping = " + a); // 5
        System.out.println("\"b\" value before swapping = " + b); // 10


    }
}
