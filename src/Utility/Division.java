package Utility;

public class Division {

    public static int divide(int x, int y){
        if( y == 0 ){
            throw new ArithmeticException("can not divide by zero");
        }
        int negPoss = ((x < 0) || (y < 0)) ? -1 : 1;

        x = Math.abs(x);
        y = Math.abs(y);

        int count = 0;

        while ( x >= y){
            x -= y;
            count++;
        }
        return  negPoss * count;
    }

    public static void main(String[] args) {
        int x = 34;
        int y = 11;
        System.out.println(divide(x,y));
    }
}
