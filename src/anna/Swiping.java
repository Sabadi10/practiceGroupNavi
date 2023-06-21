package anna;

public class Swiping {
    public static void main(String[] args) {

        int a = 3;
        int b = 8;

        System.out.println("Before swiping: a=" + a + ", b=" + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swiping: a=" + a + ", b=" + b);

    }
}
