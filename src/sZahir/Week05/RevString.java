package sZahir.Week05;
/*
This a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

 */
public class RevString {

    public static void reverseString(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) { // length-1 starts at the end of the word..... >=0 ....to the first index
            reverse += word.charAt(i); // storing

        }
        //return reverse;
        System.out.println(reverse);

    }









    public static void main(String[] args) {
        reverseString("ABCD");

    }

}
