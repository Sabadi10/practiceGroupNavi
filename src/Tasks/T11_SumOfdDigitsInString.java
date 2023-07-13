package Tasks;

public class T11_SumOfdDigitsInString {
    public static void main(String[] args) {


       String sum1 = sumInString(12,54);
        System.out.println(sum1);

    }
    public static String sumInString(int num1, int num2){

        int sum = num1 + num2;
        String sumInString = Integer.toString(sum);
        return sumInString;
    }
}
