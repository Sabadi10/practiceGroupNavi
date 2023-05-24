package SimonaTasks.divideWithoutOperator;

public class Division_Method {

    public static void main(String[] args) {


        divide(10,2);

    }

public static void divide (int num1, int num2) {

    int dividend = 0; // deljenik
    int divisor = 0; // delilac
    int result = 0;
    int reminder = 0;

    if (num1 >= num2) {
        divisor = num1;
        dividend = num2;
    } else {
        divisor = num2;
        dividend = num1;
    }
    while (divisor >= dividend) {
        reminder += divisor % dividend;
        divisor -= dividend;
        result++;
    }
    if (reminder == 0) {
        System.out.println("Result = " + result);
    } else {
        System.out.println("Result = " + result + "." + reminder);
    }
}

}













