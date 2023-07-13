package Tasks;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class ReverseNegativeNum2 {
    public static void main(String[] args) {

        System.out.println(reverseNegativeN());

    }
    public static int reverseNegativeN(){
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the negative number:");
        int Num = Input.nextInt();
        int reversedNum = 0;
        String str = "-";
        if (Num >= 0){
            System.out.println("This is not a Negative Number ");
            System.exit(1);
        }else {
            String numToString = Integer.toString(Num);

            char Array[] = numToString.toCharArray();


            for (int i = Array.length - 1; i > 0; i--) {
                str += Array[i];
            }
             reversedNum = Integer.valueOf(str);
        }
        return reversedNum;

    }
}
