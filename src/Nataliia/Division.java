package Nataliia;

public class Division {
    /*
    Write a method that can divide two numbers without using division operator
     */

        public static int divide(int x, int y){
            if (y == 0) {
                System.out.println("can not divide by zero");
                System.exit(1);
            }

            int count = 0;

            while (x >= y) {
                x -= y;
                count++;
            }
            System.out.println(x + " divide by " + y + " is " + count);


            return count;
        }

    public static void main(String[] args) {


            divide(15,3);
    }
}



