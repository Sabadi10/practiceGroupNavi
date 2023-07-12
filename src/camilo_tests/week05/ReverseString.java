package camilo_tests.week05;

public class ReverseString {

    /*
                2)  String - Reverse
                    Write a return method that can reverse String
                    Ex: Reverse("ABCD"); ==> DCBA (edited)
     */

    public static void reverseString (String word){

        String reverse = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);

        }

    public static void main(String[] args) {
        reverseString("ABCDEFGF");

        }
    }



