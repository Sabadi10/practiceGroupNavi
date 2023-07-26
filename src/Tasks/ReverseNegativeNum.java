package Tasks;

import java.util.Scanner;

public class ReverseNegativeNum {
    // Write a method to reverse a negative number
    //I create a method to reverse a negative number
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a negative number" );

        int num = input.nextInt();
        System.out.println(ReverseNum(num));

    }
    public static int ReverseNum(int num){

        if (num >= 0){
            System.out.println(num + " is not a negative number.");
            System.exit(1);
        }else {
            num *= -1;
        }
        return num;
    }

}
  /*     String str = "LARBI java python";
        String[] rev;

        rev = str.split(" ");

        System.out.println(Arrays.toString(rev));
        String[] arr1 = new String[rev.length];

*/

/*
        for (int i = rev.length-1, j = 0  ; i >= 0 ; i--, j++ ) { // i = 2 j = 0
            arr1[j] = rev[i];  //

        }  System.out.println(Arrays.toString(arr1));


      /*  for (int i = 0; i < str.length(); i++) {


        }
*/
//    String [] str = {"EMIR", "JAVA", "Cydeo"};

// String [] arr2= new String[str.length];

//  int i = str.length-1;


//   for (String each : str) { // each = azour

